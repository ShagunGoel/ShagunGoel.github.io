package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class discount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("           <h1>hotel details....</h1>\n");
      out.write("            ");

try{
        Class.forName("com.mysql.jdbc.Driver");
      
     Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Shaurya_booking?useSSL=false","root" ,"IDPIndia123!");
      //  out.println("Connect");
      PreparedStatement  st =con.prepareStatement("select * from Admin_Blog ");
       //   out.println("conncetion successfull");
         
       ResultSet rs = st.executeQuery();
      out.write("\n");
      out.write("         \n");
      out.write("            \n");
      out.write("        ");
    while(rs.next()){
            
            
            String s1  = rs.getString("Room_Type");
            String s2  = rs.getString("Services_offered");
            String s3  = rs.getString("Discounts");
            String s4  = rs.getString("Contact");
            String s5  = rs.getString("Date_Start");
            String s6  = rs.getString("Date_End");
             int s7=rs.getInt("id");
            
      out.write(" <br> \n");
      out.write("  \n");
      out.write("            <div >\n");
      out.write("            <div style=\"background-color: aliceblue\">\n");
      out.write("            <fieldset>\n");
      out.write("                 <h2>");
out.println(s1);
      out.write("</h2>\n");
      out.write("                 <h2>Contact Info.      ");
out.println(s4);
      out.write("</h2>\n");
      out.write("                 <h2>SERVICES OFFERED:: ");
out.println(s2);
      out.write("</h2>\n");
      out.write("                 <h2>Discounts -->");
out.println(s4);
      out.write(" </h2>\n");
      out.write("                 <h2>Discounts start from-->");
out.println(s5);
      out.write("</h2>\n");
      out.write("                 <h2>lasts upto -->");
out.println(s6);
      out.write(" </h2>\n");
      out.write("            \n");
      out.write("                 <form action=\"deleteOffer\" onsubmit=\"return confirm('Are you sure you want to delete room ?');\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" name=\"abc\" value=\"");
      out.print(s7);
      out.write("\"> \n");
      out.write("                <input type=\"submit\" value=\"Delete\" name=\"delete\" />\n");
      out.write("            </form>\n");
      out.write("                \n");
      out.write("            <form action=\"Update_Admin_Blog.jsp\"  method=\"post\">\n");
      out.write("                 <input type=\"hidden\" name=\"abc\" value=\"");
      out.print(s7);
      out.write("\"> \n");
      out.write("                 <input type=\"submit\" value=\"update\" name=\"update\" />\n");
      out.write("            </form>\n");
      out.write("                 \n");
      out.write("            </fieldset>\n");
      out.write("            </div>\n");
      out.write("            </div> \n");
      out.write("          \n");
      out.write("          ");
 } 
}
            catch (Exception ex) {
      out.println(ex);
        
            out.close();
} 
            
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
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
