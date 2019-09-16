package com.lkx.union.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @ClassName: SwaggerConfig
 * @Author: KunxianLi
 * @Description: swagger2配置类
 * @Date: 2019/9/12 9:11
 * @Version: 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(Environment env){
        //通过enable可以在不同环境中配置是否启用swagger
        Profiles profiles = Profiles.of(new String[]{"dev","default"});
        boolean flag = env.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2).
                apiInfo(apiInfo())
                //是否启用
                .enable(flag)
                //RequestHandlerSelectors  配置要扫描的接口的方式
                //RequestHandlerSelectors.basePackage():扫描指定包
                //RequestHandlerSelectors.any():扫描所有包
                //RequestHandlerSelectors.none():不扫描
                //RequestHandlerSelectors.withClassAnnotation():扫描类上指定的注解
                //RequestHandlerSelectors.withMethodAnnotation()：扫描方法上指定的注解
                .select().apis(RequestHandlerSelectors.basePackage("com.lkx.union.controller"))
                //指定扫描指定的路径,注意这里是请求的路径
                //PathSelectors.ant("/*"): 指定的路径规则
                .paths(PathSelectors.any())
                .build();

    }

    /**
     * 配置文档标题等信息部分
     * @Author KunxianLi
     * @param
     * @return springfox.documentation.service.ApiInfo
     * @throws
     * @Date 2019/9/12 10:22
     */
    private ApiInfo apiInfo(){
        //作者信息
        Contact myContact = new Contact(
                "likunxian", "http://lkx.com", "1582097104@qq.com");
        return new ApiInfo("技术大全接口文档",
                "包含所有混合技术的接口信息",
                "V1.0",
                //服务条款url
                "urn:tos",
                 myContact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                //服务商扩展参数
                new ArrayList<VendorExtension>());

    }
}
