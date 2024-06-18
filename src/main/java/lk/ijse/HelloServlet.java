package lk.ijse;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     /*   System.out.println("incoming request" +req.getRemoteAddr());
        resp.getWriter().println("<h1>Hello World</h1>");
        ServletConfig config =getServletConfig();
        String city = config.getInitParameter("city");
//        System.out.println( "hello servlet :"+city);

        ServletContext context =getServletContext();
        String country =context.getInitParameter("country");
//        System.out.println("hello servlet : "+country);*/
        resp.getWriter().write("doGet method is invoked");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("doGet method is invoked");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("doGet method is invoked");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("doGet method is invoked");

    }

}