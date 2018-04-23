package com.bec.security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author suruiliang
 * @version 创建时间：2018年4月12日 下午1:08:29
 * @ClassName 类名称
 * @Description 类描述
 */
@SpringBootApplication(scanBasePackages="com.bec")
@RestController
@EnableSwagger2
@EnableAutoConfiguration
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
