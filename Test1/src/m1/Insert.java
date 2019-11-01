package m1;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;

/**
 * Servlet implementation class Insert
 */
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public void service(HttpServletRequest req,HttpServletResponse res){
	   String name=req.getParameter("name");
	   String cid=req.getParameter("cid");
	   String cpass=req.getParameter("cpass");
	   Connection con=DAO.getConnection();
	   Model m=new Model();
	   m.setName(name);
	   m.setCid(cid);
	   m.setCpass(cpass);
	   boolean status=m.insert();
	   if(status==true)
	   {  
		   try {
			res.sendRedirect("insertSuccess.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   } else
		try {
			res.sendRedirect("insertFailure.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }

}
