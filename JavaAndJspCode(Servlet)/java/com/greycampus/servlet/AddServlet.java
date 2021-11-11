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

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String eno = request.getParameter("eno");
		String ename = request.getParameter("ename");
		String salary = request.getParameter("esalary");
		try {
			GetterSetter getterSetter = new GetterSetter();
			getterSetter.setEno(Integer.parseInt(eno));
			getterSetter.setName(ename);
			getterSetter.setSalary(Double.parseDouble(salary));
			AddDataServiceClass addDataServiceClass = new AddDataServiceClass();
			addDataServiceClass.adduser(getterSetter);
			request.setAttribute("eno", eno);
			request.setAttribute("ename", ename);
			request.setAttribute("salary", salary);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("displaydata.jsp");
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("addvalidrecords.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}
