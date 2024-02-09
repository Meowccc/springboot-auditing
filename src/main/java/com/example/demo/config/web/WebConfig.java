package com.example.demo.config.web;

import com.example.demo.config.web.converter.IntegerEnumConverterFactory;
import com.example.demo.config.web.converter.StringToEnumConverterFactory;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author meow
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addFormatters(FormatterRegistry registry) {
        ApplicationConversionService.configure(registry);
        registry.addConverterFactory(new StringToEnumConverterFactory());
        registry.addConverterFactory(new IntegerEnumConverterFactory());
    }
}
