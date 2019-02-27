/**
 * 
 */
package com.redhat.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.redhat.model.BeerExpert;

/**
 * @author roribeir
 *
 */
public class BeerSelect extends HttpServlet{
	public void doPost(HttpServletRequest request, 
					HttpServletResponse response)
					throws IOException, ServletException{
		String c = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);
		
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}
}
