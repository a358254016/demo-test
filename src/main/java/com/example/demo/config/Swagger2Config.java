package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @program: demo-test
 * @description:
 * @author: 哲渊
 * @create: 2019-12-03 17:12
 **/
@Configuration
public class Swagger2Config {
    @Bean
    Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(new ApiInfoBuilder()
                            .description("这是我的阿皮文档网站描述")
                            .title("这是我的api文档")
                            .version("v1.0")
                            .contact(new Contact("zzy","www.zzy.org","1234@qq.com"))
                            .build());

    }

}
