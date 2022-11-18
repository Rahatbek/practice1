package com.rahatbek.javacore.chapter5usejava.introservlets;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends GenericServlet{
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<B>Hello!");
        pw.close();
    }
}
