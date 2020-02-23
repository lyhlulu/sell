package com.lyh.sell.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 跨域配置
 * @author 刘元辉
 * @date 2020/2/23 0:28
 */
@Configuration
@Slf4j
public class CorsConfig {

    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*"); // 1允许所域名
        corsConfiguration.addAllowedHeader("*"); // 2允许所请求头
        corsConfiguration.addAllowedMethod("*"); // 3允许所方法
        log.info("调用了config跨域请求");
        return corsConfiguration;

    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        /*Map<String,CorsConfiguration> corsConfigurationMap = new HashMap<>();
        corsConfigurationMap.put("/login",buildConfig());
        corsConfigurationMap.put("/index",buildConfig());
        corsConfigurationMap.put("/xxx",buildConfig());
        corsConfigurationMap.put("/yyy",buildConfig());
        source.setCorsConfigurations(corsConfigurationMap);*///允许部分地址访问
        source.registerCorsConfiguration("/**", buildConfig()); //4允许所地址
        return new CorsFilter(source);
    }
}
