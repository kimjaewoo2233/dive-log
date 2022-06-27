package com.example.divelog;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.boot.web.context.WebServerPortFileWriter;

@SpringBootApplication
public class DiveLogApplication {
	//console 에서 실행하기 명령어 입력  ./gradlew bootRun --args="app.name=dive-log-cmd"
	public static void main(String[] args) {
	//	SpringApplication.run(DiveLogApplication.class, args);
		SpringApplication application = new SpringApplication(DiveLogApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.addListeners(
				new ApplicationPidFileWriter(),//실행하면 프로젝트 안에 pid파일을 만든다
				new WebServerPortFileWriter()	//port번호를 기록한다
				);
		application.run(args);
		//banner를 끄는 방법은 yml에 spring.main.banner-mode:off 쳐도 가능함
		//아래 방법도 가능하다 --위에 코드를 builder형식을 바꾼 코드임
		//new SpringApplicationBuilder()
		// .bannerMode(Banner.Mode.OFF).listeners(
		// 	new ApplicationPidFileWriter(),
		//  new WebServerPortFileWriter()
		// ).build().run(args);	//bulid가 반환하는건 SpringApplication이다
		//@Service,@Component,@Repository,@Controller,@Configuration	Bean등록 애노테이션
		//SpringApplication 이 안에 ComponentScan이 있고 이게 속한 곳을 읽는다
	}

}
