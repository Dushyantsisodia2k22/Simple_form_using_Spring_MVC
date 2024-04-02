package com.AppConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class dispatcher extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] ConfigClasses = {AppConfig.class};
        return ConfigClasses;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
