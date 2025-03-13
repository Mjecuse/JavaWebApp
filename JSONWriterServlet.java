import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


public class JSONWriterServlet extends HttpServlet {
	

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     String data = request.getParameter("data");
     

     JSONWriter.writeToJsonFile("output.json", data);
}
/**

 * Servlet implementation class JSONWriterServlet
 * Problem was needed to skip the nesting. revised the recursion powerpoint sent and fixed it.

 */
public class JSONWriterServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
 /**

 * Default constructor. 
 */

 public JSONWriterServlet(int i) { 
	 if(i <= 1) {
		 return;
	 }
	 JSONWriter(i - 1);
	 
	 
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
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
		 throws ServletException, IOException {

 // TODO Auto-generated method stub
 doGet(request, response);
 }
}

}