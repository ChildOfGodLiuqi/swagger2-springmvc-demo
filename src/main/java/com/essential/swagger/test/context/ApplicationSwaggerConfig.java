package com.essential.swagger.test.context;

import com.google.common.collect.Sets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import springfox.documentation.spi.DocumentationType;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableSwagger2
public class ApplicationSwaggerConfig {

    //group:default
    @Bean
    public Docket configSpringfoxDocketForAll() {
        return new Docket(DocumentationType.SWAGGER_2)
                .produces(Sets.newHashSet("application/json"))
                .consumes(Sets.newHashSet("application/json"))
                .protocols(Sets.newHashSet("http", "https"))
                .forCodeGeneration(true)
                .select().paths(regex(".*"))
                .build()
                .apiInfo(apiInfo());
    }
    //group:moment
    @Bean
    public Docket configSpringfoxDocketForMoment() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("moment")
                .produces(Sets.newHashSet("application/json"))
                .consumes(Sets.newHashSet("application/json"))
                .protocols(Sets.newHashSet("http", "https"))
                .forCodeGeneration(true)
                .select().paths(regex(".*moment.*"))
                .build()
                .apiInfo(apiInfo());
    }

    //group:venue
    @Bean
    public Docket configSpringfoxDocketForVenue() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("venue")
                .produces(Sets.newHashSet("application/json"))
                .consumes(Sets.newHashSet("application/json"))
                .protocols(Sets.newHashSet("http", "https"))
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                .select().paths(regex(".*venue.*"))
                .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "API Document",
                "API Document with swagger",
                "1.0.0",
                null,
                "group@essential.cc",
                null,
                null
        );

        return apiInfo;
    }
}
