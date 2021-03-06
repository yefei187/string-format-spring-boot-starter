package com.lyf.starter.autoconfiguration;

import com.lyf.starter.format.FormatProcessor;
import com.lyf.starter.format.JsonFormatProcessor;
import com.lyf.starter.format.StringFormatProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class FormatAutoConfiguration {

    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    @Bean
    @Primary
    public FormatProcessor stringFormat(){
        return new StringFormatProcessor();
    }

    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
    @Bean
    public FormatProcessor jsonFormat(){
        return new JsonFormatProcessor();
    }

//    @Bean
//    public FormatTemplate formatTemplate(FormatProcessor formatProcessor){
//        return new FormatTemplate(formatProcessor);
//    }
}
