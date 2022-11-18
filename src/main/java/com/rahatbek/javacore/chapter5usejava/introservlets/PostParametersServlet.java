package com.rahatbek.javacore.chapter5usejava.introservlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class PostParametersServlet extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        Enumeration e = request.getParameterNames();

        while (e.hasMoreElements()) {
            String pName = (String) e.nextElement();
            pw.print(pName + " = ");
            String pValue = request.getParameter(pName);
            pw.println(pValue);
        }
        pw.close();
    }
}
