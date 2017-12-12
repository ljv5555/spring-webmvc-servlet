package com.khs.sample.spring.servlet.springwebmvcservlet;




import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@RestController
public class MainServlet{
    @GetMapping
    public void getHandler(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        response.setHeader("content-type","text/plain");
        PrintWriter pw = response.getWriter();
        pw.println("--- get endpoint ---");
        JSONObject sp = new JSONObject(System.getProperties());
        pw.println(sp.toJSONString());
    }

}
