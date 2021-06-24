package com.inforcap.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String favoriteLanguage = request.getParameter("favoriteLanguage");
		String homeTown = request.getParameter("homeTown");
		String valorPorDefecto = "Unknow";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if (firstName == null || lastName == null) {
			out.write("<h1>Welcome,  "+ valorPorDefecto +"</h1>");
		} else {
			out.write("<h1>Welcome, "+ firstName+" "+lastName + "</h1>");
		}
		if (favoriteLanguage == null) {
			out.write("<h3>Your favorite language is: "+ valorPorDefecto +"</h3>");
		} else {
			out.write("<h3>Your favorite language is: "+ favoriteLanguage + "</h3>");
		}
		if (homeTown == null) {
			out.write("<h3>Your hometown is: "+ valorPorDefecto +"</h3>");
		} else {
			out.write("<h3>Your hometown is: "+ homeTown + "</h3>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
