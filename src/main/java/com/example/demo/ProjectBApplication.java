package com.example.demo;

// @SpringBootApplication
// Security 로그인 페이지 비활성화 처리 해줬습니다.
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ProjectBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectBApplication.class, args);
	}

}
