package com.isos.lss.app.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import com.isos.lss.app.batch.model.recipient.LenguaSordoRecipient;
import com.isos.lss.app.batch.processor.LssItemProcessor;
import com.isos.lss.app.batch.writer.LssItemWriter;
import com.isos.lss.app.model.category.LenguaSordo;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	
	@Autowired
	public JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	public StepBuilderFactory stepBuilderFactory;
	/*
	@Value("batch.headers")
	String headers;
	*/
	@Bean
	public FlatFileItemReader<LenguaSordoRecipient> reader(){
		return new FlatFileItemReaderBuilder<LenguaSordoRecipient>()
			   .name("personaItemReader")
			   .resource(new FileSystemResource("src/main/resources/LssFileLoadData.csv"))
			   .linesToSkip(1)
			   .delimited()
			   .delimiter("|")
			   .names(new String[] {"id", "name", "short_description","long_description","image","category","sub_category"})
//			   .names(returnHeaders())
			   .fieldSetMapper(new BeanWrapperFieldSetMapper<LenguaSordoRecipient>() {{
				   setTargetType(LenguaSordoRecipient.class);
			   }})
			   .build();
	}
	
	@Bean
	public LssItemProcessor processor() {
		return new LssItemProcessor();
	}
	
	@Bean
	public LssItemWriter writer() {
		return new LssItemWriter();
	}
	@Bean
	public Job importPersonaJob(Step step1) {
		return jobBuilderFactory.get("ETL-Load")
				.incrementer(new RunIdIncrementer())
				//.listener(listener)
				.flow(step1)
				.end()
				.build();
	}
	
	@Bean
	public Step step1() {
		return stepBuilderFactory.get("ETL-file-load")
				.<LenguaSordoRecipient, LenguaSordo> chunk(4)
				.reader(reader())
				.processor(processor())
				.writer(writer())
				.build();
	}
/*
	public String getHeaders() {
		return headers;
	}
	
	public String[] returnHeaders() {
		return headers.split(",");
	}
	*/
}
