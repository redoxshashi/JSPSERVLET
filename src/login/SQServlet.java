package login;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class addservlet
 */
@WebServlet("/SQServlet")
public class SQServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
public void service(HttpServletRequest req,HttpServletResponse res ) throws IOException {
//	int i=Integer.parseInt(req.getParameter("k"));
//	HttpSession session=req.getSession();
//	int i=(int)session.getAttribute("k");
	int i=0;
	Cookie cookies[]=req.getCookies();
	for(Cookie c : cookies) {
		if(c.getName().equals("k")) {
			i=Integer.parseInt(c.getValue());
		}
	}
	int k=i*i;
	System.out.println(k);
	PrintWriter out= res.getWriter();
	out.println("Output is : "+k);
}
}