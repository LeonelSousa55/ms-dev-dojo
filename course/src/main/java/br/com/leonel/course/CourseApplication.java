package br.com.leonel.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.leonel.core.property.JwtConfiguration;

@SpringBootApplication
@EntityScan({"br.com.leonel.core.model"})
@EnableJpaRepositories({"br.com.leonel.core.repository"})
@EnableConfigurationProperties(value = JwtConfiguration.class)
@ComponentScan("br.com.leonel")
public class CourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

}
