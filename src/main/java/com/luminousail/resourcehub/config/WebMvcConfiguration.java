package com.luminousail.resourcehub.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/image/**").addResourceLocations("file:D://images/superdebaters/");
        registry.addResourceHandler("/video/**").addResourceLocations("file:D://images//superdebaters//video/");
        super.addResourceHandlers(registry);
    }
}
