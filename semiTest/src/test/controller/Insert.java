package test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.model.sevice.InsertService;
import test.model.vo.Member;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			System.out.println("servlet");
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			int phone = Integer.parseInt(request.getParameter("phone"));
			
			InsertService iService = new InsertService();
			
			Member m = new Member(id, password, phone);
			int result = iService.insert(m);
			if(result > 0)
			{
				System.out.println("페이지 이동");
				HttpSession session = request.getSession();
				session.setAttribute("member",m);
				
				response.sendRedirect("views/member/second.jsp");
			}
			
			else
			{
				
			}
		}
		catch (NumberFormatException e)
		{
			
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
