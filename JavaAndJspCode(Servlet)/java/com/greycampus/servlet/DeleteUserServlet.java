package com.greycampus.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.greycampus.serviceclass.AddDataServiceClass;
@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eno = request.getParameter("eno");
		AddDataServiceClass addDataServiceClass = new AddDataServiceClass();
		int delete = addDataServiceClass.delete(eno);
		if (delete>0) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("displaydelete.jsp");
			requestDispatcher.forward(request, response);
		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("notdeleted.jsp");
			requestDispatcher.forward(request, response);
		}
	}
}
