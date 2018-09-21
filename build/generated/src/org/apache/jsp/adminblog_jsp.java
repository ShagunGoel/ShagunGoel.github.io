package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminblog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        <title> blog </title>\n");
      out.write("    </head>\n");
      out.write("   <body style=\"background-color: buttonhighlight\">\n");
      out.write("        <div style=\"border: blue solid 2px ;background-color:aliceblue  \" >\n");
      out.write("       \n");
      out.write("<div>\n");
      out.write("    <fieldset >\n");
      out.write("        <legend> Blogs</legend>\n");
      out.write("            <div  style=\"margin-left: 238px; margin-top: 0px;\">\n");
      out.write("                <h1 style=\"color:  #ffffff; margin-left: 80px;\">Hotel Events</h1> <br>\n");
      out.write("            \n");
      out.write("        <form method=\"post\" action=\"adminblog\" enctype=\"multipart/form-data\">\n");
      out.write("            \n");
      out.write("             Room Type \n");
      out.write("        <input type=\"radio\" name=\"Room_Type\" value=\"superdelux\" checked >\n");
      out.write("              Super Delux: <br>\n");
      out.write("        <input type=\"radio\" name=\"Room_Type\" value=\"Delux\"  >\n");
      out.write("              Delux: <br>\n");
      out.write("        <input type=\"radio\" name=\"Room_Type\" value=\"Presidential Suite\"  >\n");
      out.write("              Presidential Suite: <br>\n");
      out.write("        <input type=\"radio\" name=\"Room_Type\" value=\"Business Suite\"  >\n");
      out.write("        Business Suite:<br><br>\n");
      out.write("        \n");
      out.write("              \n");
      out.write("            Services offered \n");
      out.write("        <input type=\"text\" name=\"Services_offered\"  /><br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("             Discounts\n");
      out.write("        <input type=\"text\" name=\"Discounts\"  /><br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("          Contact us at: \n");
      out.write("        <input type=\"text\" name=\"Contact\"  /><br>\n");
      out.write("        \n");
      out.write("            Offer Valid from:\n");
      out.write("        <input type=\"date\" name=\"Date_Start\"  /><br>\n");
      out.write("        \n");
      out.write("          Offer Valid to:\n");
      out.write("        <input type=\"date\" name=\"Date_End\"  /><br>\n");
      out.write("     \n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Image Description: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"title\" size=\"50\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Portrait Photo: </td>\n");
      out.write("                    <td><input type=\"file\" name=\"images\" size=\"50\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <input type=\"submit\" value=\"Save\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("            </div>\n");
      out.write("            </fieldset>\n");
      out.write("               </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("    \n");
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
