package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap-theme.min.css\">\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>DQM</title>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container \">\n");
      out.write("        <div class=\"row well\" id=\"parent\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <form role=\"normalize\" action=\"response.jsp\">\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\">Name</div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <input type=\"text\" class=\"form-control input-sm\" placeholder=\"Type name...\" name=\"name\" id=\"name\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-heading\">Phone</div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <input type=\"text\" class=\"form-control input-sm\" placeholder=\"Type phone...\" name=\"phone\" id=\"phone\">\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"panel-heading\">Address</div>\n");
      out.write("                   \n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <input type=\"text\" class=\"form-control input-sm\" placeholder=\"Type Address\" name=\"address\" id=\"address\">\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"panel-heading\">Email</div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <input type=\"text\" class=\"form-control input-sm\" placeholder=\"Type Email\" name=\"email\" id=\"email\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"btn btn-default pull-right\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>");
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
