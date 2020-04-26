package com.github.trask;

import java.util.EnumSet;

import javax.servlet.DispatcherType;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

import com.google.inject.Guice;
import com.google.inject.servlet.GuiceFilter;

public class Main {

    public static void main(String[] args) throws Exception {

        Guice.createInjector(new TestServletModule());

        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();
        handler.addFilter(GuiceFilter.class, "/*", EnumSet.of(DispatcherType.REQUEST));
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
