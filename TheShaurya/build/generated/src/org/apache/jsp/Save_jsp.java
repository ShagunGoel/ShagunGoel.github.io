package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.InputStream;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class Save_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>save Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");
     
       
        try {
             String s1 = request.getParameter("title");
         Part part=request.getPart("images");
           
                 Class.forName("com.mysql.jdbc.Driver");
              //  out.println("driver loaded");
        Connection         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Shaurya_booking?useSSL=false","root" ,"IDPIndia123!");
              //  out.println("connection done");
                String query="insert into images(title,images)"+"values(?,?)";
             PreparedStatement     psmt=con.prepareStatement(query);
                InputStream is=part.getInputStream();
                
      out.write("\n");
      out.write("                ");

               
                
                psmt.setString(1,s1);
                psmt.setBlob(2, is);
               
               
                
            int result= psmt.executeUpdate();
                
            if(result>0)
            {
                out.println("Image Uploaded successfully"); 
            }
              
               
      out.write("\n");
      out.write("            \n");
      out.write("        ");

            }
          catch(  HeadlessException | SQLException | ClassNotFoundException e1)
          {
            out.println(e1);
          }
       
       
       
      out.write(" \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
