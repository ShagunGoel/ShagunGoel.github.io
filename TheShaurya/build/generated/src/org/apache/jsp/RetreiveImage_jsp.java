package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.*;
import java.io.*;

public final class RetreiveImage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>RETREIVE IMAGE</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Connection connection = null;
    //login is the name of the database
    String connectionURL = "jdbc:mysql://localhost:3306/Shaurya_booking";
     
    ResultSet rs = null;
     
    PreparedStatement psmnt = null;
     
    InputStream sImage;
    try
    {
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    connection = DriverManager.getConnection(connectionURL, "root", "IDPIndia123!");
    //Student is the table name
    psmnt = connection.prepareStatement("SELECT images FROM images WHERE id = ?");
    //In id "6" i have the image.
    psmnt.setString(1, "1");
    rs = psmnt.executeQuery();
    if(rs.next())
    {
    byte[] bytearray = new byte[1048576];
    int size=0;
    sImage = rs.getBinaryStream(1);
    response.reset();
  response.setContentType("image/jpeg");
    while((size=sImage.read(bytearray))!= -1 )
    {
    response.getOutputStream().write(bytearray,0,size);
    }
    response.flushBuffer();
    sImage.close();
    rs.close();
     
    }
    }
    catch(Exception ex)
    {
    out.println(ex);
    }
     
     
    psmnt.close();
    connection.close();

      out.write("\n");
      out.write("  </body>\n");
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
