package com.github.mybatisall.swagger.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties("spring.swagger")
public class SwaggerProperties {
	
	private static final String DEFAULT_NULL = "";
	/**
     * swagger会解析的包路径
     */
    private String basePackage = DEFAULT_NULL;
    
    /**
     * 标题
     */
    private String title = DEFAULT_NULL;
    
    /**
     * 版本
     */
    private String version = DEFAULT_NULL;
    
    /**
     * 服务条款URL
     */
    private String termsOfServiceUrl = DEFAULT_NULL;
    
    /**
     * 描述
     */
    private String description = DEFAULT_NULL;
    
    /**
     * 是否使用
     */
    private boolean enabled = false;
}
