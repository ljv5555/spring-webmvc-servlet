# spring-webmvc-servlet
<b>simple spring boot servlet</b>

to run:

<code>mvn spring-boot:run -Drun.arguments="--server.port=9876"</code>

or

<code>mvn package && java -jar target/spring-webmvc-servlet-0.0.1-SNAPSHOT.jar --server.port=9876</code>



<code>
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
</code>
