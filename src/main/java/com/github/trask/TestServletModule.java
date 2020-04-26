package com.github.trask;

import com.google.inject.servlet.ServletModule;

public class TestServletModule extends ServletModule {
    @Override
    protected void configureServlets() {
        bind(TestServlet.class);
        serve("/test").with(TestServlet.class);
    }
}
