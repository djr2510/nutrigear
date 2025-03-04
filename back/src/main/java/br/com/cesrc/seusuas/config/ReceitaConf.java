package br.com.cesrc.seusuas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuração CORS para permitir requisições de diferentes origens para receitas.
 *
 * Esta classe configura o CORS (Cross-Origin Resource Sharing) para permitir
 * que o frontend, que pode estar em um domínio diferente, faça requisições
 * para os endpoints relacionados a receitas.
 */
@Configuration
public class ReceitaConf implements WebMvcConfigurer {

    /**
     * Configura o CORS para permitir requisições de todas as origens.
     *
     * @param registry Registro CORS para configurar os mapeamentos.
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("GET", "PUT", "POST", "DELETE")
                .allowedOriginPatterns("*");
    }
}