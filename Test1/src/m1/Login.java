package m1;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) {
		String cid = req.getParameter("cid");
		String cpass = req.getParameter("cpass");
		
		Connection con=DAO.getConnection();
		System.out.println(con+"connection*****************");
		
		
		
		
		
		
		Model m = new Model();
		m.setCid(cid);
		System.out.println(m.getCid());
		m.setCpass(cpass);
		boolean status = m.login();
		if (status == true) {
			HttpSession session = req.getSession(true);
			String cid1 = m.getCid();
			session.setAttribute("cid", cid1);
			try {
				res.sendRedirect("crud.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else
			try {
				res.sendRedirect("loginFailure.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
