package br.com.cesrc.seusuas.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

public class AlimentoConf {

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("GET", "PUT", "POST", "DELETE")
                .allowedOriginPatterns("*");
    }
}
