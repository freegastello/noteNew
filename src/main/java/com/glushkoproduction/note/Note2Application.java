package com.glushkoproduction.note;

import com.glushkoproduction.note.config.InitData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Note2Application {
	public static void main(String[] args) {
		SpringApplication.run(Note2Application.class, args);
	}
	@Bean(initMethod = "initData")
	public InitData initialData() {
		return new InitData();
	}
}
