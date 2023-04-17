package com.psa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyServlet extends HttpServlet {
	
   public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	   
	  PrintWriter out=res.getWriter();
	  out.print("hi  ");
	  
	  ServletContext ctx=getServletContext();
	  String str=ctx.getInitParameter("name");
	  out.print(str+" "); 
	  String str1=ctx.getInitParameter("phone");
	  out.println(str1);
	  
	  ServletConfig ct=getServletConfig();
	  String st=ctx.getInitParameter("name");
	  out.print(st+" "); 
	    
   }
}
