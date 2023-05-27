package com.AppServ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
    PrintWriter pw=res.getWriter();
    res.setContentType("text/html");
    String user=req.getParameter("userName");
    String pass=req.getParameter("userPassword");
    pw.println("Login Looding...!");
    if(user.equals("paolo") && pass.equals("russo"))
    pw.println("Login Success...!");
    else
    pw.println("Login Failed...!");
    pw.close();
    }
    }
