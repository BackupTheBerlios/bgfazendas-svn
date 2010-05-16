package org.apache.jsp.web.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Topo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<table width = \"1024\" height = \"768\" border = \"1\" align = \"center\" cellspacing = \"0\" cellpadding = \"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td valign = \"top\">\r\n");
      out.write("\t\t \t<table cellpadding = \"0\" cellspacing = \"0\">\r\n");
      out.write("\t\t \t\t<tr width = \"220\"> \r\n");
      out.write("\t\t \t\t\t<td width = \"100%\" style =\"background-image: url('/BGFazendas/web/imagem/topo/bambu.jpg');\"></td>\r\n");
      out.write("\t\t \t\t\t<td style =\"background-image: url('/BGFazendas/web/imagem/topo/bambu.jpg');\" valign = \"bottom\" width = \"220\">\r\n");
      out.write("\t\t\t\t\t\t<img src = \"/BGFazendas/web/imagem/topo/vacaTopo1.png\" width = \"220\" height = \"180\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width = \"100%\"><a href = \"/bgfazenda/action/vacina.cadastrar.mtw\">CADASTRO</a> | AGENDA | VACINA | LOGOUT</td>\r\n");
      out.write("\t\t\t\t\t<td  valign = \"top\" width = \"220\">\r\n");
      out.write("\t\t\t\t\t\t<img src = \"/BGFazendas/web/imagem/topo/vacaTopo2.png\" width = \"220\" height = \"48\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
