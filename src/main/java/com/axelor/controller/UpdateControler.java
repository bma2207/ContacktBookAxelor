package com.axelor.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.axelor.domains.ManageAddress;
import com.axelor.service.AddressImp;
import com.axelor.service.ContactServiceImpl;

@WebServlet("/update")
public class UpdateControler extends HttpServlet {
	AddressImp addressservice = new AddressImp();
	ContactServiceImpl contactService = new ContactServiceImpl();
	// private static String Address_page="/AddNewAddress.jsp";
	private static String INSERT_OR_EDIT = "/index.jsp";
	private static String LIST_USER = "/contactlist.jsp";
	private static String Address = "/AddNewAddress.jsp";
	private static String Save = "/SaveAddress.jsp";
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		ManageAddress mngadd = new ManageAddress();

		String id = request.getParameter("AddId");
		int cid = Integer.parseInt(id);
		String Addresss = request.getParameter("Add");

		 if (id != null) {
			
			addressservice.updateAddress(cid, Addresss);
		}

		RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
		request.setAttribute("list", contactService.getAllcontacts());

		view.forward(request, response);

	}
}
