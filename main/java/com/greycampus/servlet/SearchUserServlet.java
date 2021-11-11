package com.greycampus.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.greycampus.getset.GetterSetter;
import com.greycampus.serviceclass.AddDataServiceClass;

/**
 * Servlet implementation class SearchUserServlet
 */
@WebServlet("/SearchUserServlet")
public class SearchUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eno = request.getParameter("eno");
		try {
			AddDataServiceClass addDataServiceClass = new AddDataServiceClass();
			ArrayList<GetterSetter> search = addDataServiceClass.search(eno);
			request.setAttribute("arl", search);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("fetchsearcheduserrecord.jsp");
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("enoincorrect.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}
