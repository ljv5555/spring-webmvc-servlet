package com.khs.sample.spring.servlet.springwebmvcservlet;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class MainServlet{
    @GetMapping
    public void getHandler(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        response.setHeader("content-type","text/plain");
        response.getWriter().append("Get endpoint.");
    }

}
