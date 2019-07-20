package com.lyf.starter.autoconfiguration;

import com.lyf.starter.FormatTemplate;
import com.lyf.starter.format.FormatProcessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(FormatAutoConfiguration.class)
@EnableConfigurationProperties(FormatProperties.class)
public class HelloAutoConfiguration {

    @Bean
    public FormatTemplate formatTemplate(FormatProcessor formatProcessor,FormatProperties formatProperties){
        return new FormatTemplate(formatProcessor,formatProperties);
    }
}
