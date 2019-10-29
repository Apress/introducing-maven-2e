#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/status")
public class AppStatusServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
 
        PrintWriter writer = response.getWriter();
        writer.println("OK");
        response.setStatus(response.SC_OK);
    }

}
