package com.git.hui.boot.web.servlet.servlet;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by @author yihui in 19:32 19/11/21.
 */
@Order(-10000)
@Component
public class BeanServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        PrintWriter writer = resp.getWriter();
        writer.write("[BeanServlet1] welcome " + name);
        writer.flush();
        writer.close();
    }

}
