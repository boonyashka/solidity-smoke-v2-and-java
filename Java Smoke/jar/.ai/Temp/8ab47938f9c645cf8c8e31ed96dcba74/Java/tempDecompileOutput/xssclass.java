package com.xsssample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
   urlPatterns = {"/xss"}
)
public class xssclass extends HttpServlet {
   public void doGet(HttpServletRequest var1, HttpServletResponse var2) throws IOException, ServletException {
      var2.setContentType("text/html");
      PrintWriter var3 = var2.getWriter();
      String var4 = var1.getParameter("name");
      if (var4 != null && !"".equals(var4)) {
         var3.print(var4);
      } else {
         var3.print("no name");
      }

   }
}
