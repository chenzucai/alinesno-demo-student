package com.alinesno.cloud.alinesno.student.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import com.alinesno.cloud.common.web.enable.EnableLogin;

/**
 * 启动入口
 *
 * @author ${author}
 * @since 2021-03-01 16:03:832
 */
@EnableJpaAuditing
@SpringBootApplication
@EnableLogin
public class AlinesnoStudentDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AlinesnoStudentDemoApplication.class, args);
	}
}

