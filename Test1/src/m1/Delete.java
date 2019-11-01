package m1;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;

/**
 * Servlet implementation class Delete
 */
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 public void service(HttpServletRequest req,HttpServletResponse res){
		  
		 String cid = req.getParameter("cid");
		 Connection con=DAO.getConnection();
		  
		  Model m=new Model();
		  m.setCid(cid);
		  boolean status=m.delete();
		  if(status==true){
			  try {
				res.sendRedirect("deleteSuccess.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  } else
			try {
				res.sendRedirect("deleteFailure.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
}
