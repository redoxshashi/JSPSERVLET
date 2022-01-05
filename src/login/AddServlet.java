package login;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
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
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
public void service(HttpServletRequest req,HttpServletResponse res ) throws IOException, ServletException {
	int i=Integer.parseInt(req.getParameter("num1"));
	int j=Integer.parseInt(req.getParameter("num2"));
	int k=i+j;
//	ServletContext ct=getServletContext();
//	ServletConfig cf=getServletConfig();
//	String str=cf.getInitParameter("name");
	PrintWriter out= res.getWriter();
	out.println("Output is : "+k);
	System.out.println(k);
//	//cookie
//	Cookie cookie=new Cookie("k",k+"");
//	res.addCookie(cookie);
//	res.sendRedirect("sq");
//	//cookie
	
	//HTTPSESSION
//	HttpSession session=req.getSession();
//	session.setAttribute("k", k);
//	res.sendRedirect("sq");
	//HTTPSESSION
	
	//sendredirect
//	res.sendRedirect("sq?k="+k);//url rewriting
//	
	//sendredirect
	//RequestDispatcher
//	req.setAttribute("k", k);
//	RequestDispatcher rd=req.getRequestDispatcher("sq");
//	rd.forward(req, res);
	
	//RequestDispatcher
//	PrintWriter out= res.getWriter();
//	out.println("Output is : "+k);
}
}

