package org.example.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
public class BeanConfiguration {
    @Bean
    public ModelMapper makeModelMapperObject(){
        return new ModelMapper();
    }


}