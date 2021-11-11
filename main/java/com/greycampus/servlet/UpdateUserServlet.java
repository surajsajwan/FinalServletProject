package com.greycampus.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.greycampus.getset.GetterSetter;
import com.greycampus.serviceclass.AddDataServiceClass;

@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String neno = request.getParameter("neno");
		String ename = request.getParameter("ename");
		String esalary = request.getParameter("esalary");
		String eno = request.getParameter("eno");
		try {
			GetterSetter getterSetter = new GetterSetter();
			getterSetter.setEno(Integer.parseInt(neno));
			getterSetter.setName(ename);
			getterSetter.setSalary(Double.parseDouble(esalary));
			AddDataServiceClass addDataServiceClass = new AddDataServiceClass();
			int update = addDataServiceClass.update(getterSetter, eno);
			if (update>0) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("checkupdate.jsp");
				requestDispatcher.forward(request, response);
			} 
			else {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("notupdated.jsp");
				requestDispatcher.forward(request, response);
			}
		} catch (Exception e) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("validupdate.jsp");
			requestDispatcher.forward(request, response);
		}
		
	}

}
