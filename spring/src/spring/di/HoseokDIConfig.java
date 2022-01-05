package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.HoseokExam;

//<context:component-scan base-package="spring.di.ui, spring.di.entity"/>
@ComponentScan("spring.di.ui")
@Configuration
public class HoseokDIConfig {
	// public 메소드를 하나 만듬 하지만 함수명이 곧 bean의 id값
	@Bean
	public Exam exam() {
		return new HoseokExam();
	}
}
