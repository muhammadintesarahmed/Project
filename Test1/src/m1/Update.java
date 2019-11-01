package m1;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;

/**
 * Servlet implementation class Update
 */
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  public void service(HttpServletRequest req,HttpServletResponse res) {
		  String name = req.getParameter("name");
			String cid = req.getParameter("cid");
		  Connection con=DAO.getConnection();
		  Model m=new Model();
		  m.setName(name);
		  m.setCid(cid);
		  boolean status=m.update();
		 
		  if(status==true){
			  try {
				res.sendRedirect("updateSuccess.jsp");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  } else{
			try {
				res.sendRedirect("updateFailure.jsp");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
	  }
}
