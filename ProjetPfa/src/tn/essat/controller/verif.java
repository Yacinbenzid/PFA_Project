package tn.essat.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essat.dao.GestionDaoImp;
import tn.essat.dao.IGestionDao;
import tn.essat.model.Compte;

/**
 * Servlet implementation class verif
 */
public class verif extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public verif() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		IGestionDao dao = new GestionDaoImp();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String pass =dao.decrypt( password);
		
		Compte compte=dao.verif(email, pass);
		if(compte==null) {
			response.sendRedirect("course-single.jsp");
		}else {
			response.sendRedirect("index.jsp");
		}
	}

}
