package com.example.demo.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
//@WebFilter(filterName = "filter1",urlPatterns = "/second")
public class Fiter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("enter filter!");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("quit filter");
    }
}
