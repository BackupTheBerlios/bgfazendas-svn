package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class erro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/jsp/cabecalho.html");
    _jspx_dependants.add("/jsp/rodape.html");
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<table width = \"1024\" height = \"768\" border = \"1\" align = \"center\" cellspacing = \"0\" cellpadding = \"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>");
      out.write("<table width = \"100%\" border = \"0\" align = \"center\" cellspacing = \"0\" cellpadding = \"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td valign = \"top\">\r\n");
      out.write("\t\t \t<table cellpadding = \"0\" cellspacing = \"0\">\r\n");
      out.write("\t\t \t\t<tr width = \"220\"> \r\n");
      out.write("\t\t \t\t\t<td width = \"100%\" style =\"background-image: url('../imagem/bambu.jpg');\"></td>\r\n");
      out.write("\t\t \t\t\t<td style =\"background-image: url('../imagem/bambu.jpg');\" valign = \"bottom\" width = \"220\">\r\n");
      out.write("\t\t\t\t\t\t<img src = \"../imagem/vacaTopo1.png\" width = \"220\" height = \"180\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width = \"100%\">\r\n");
      out.write("\t\t \t\t\t\t<!--MENU-->\r\n");
      out.write("\t\t\t\t\t\tCADASTRO | AGENDA | LOGOUT\t\t\t\t \t\t\t\t\t\r\n");
      out.write("\t\t \t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td  valign = \"top\" width = \"220\">\r\n");
      out.write("\t\t\t\t\t\t<img src = \"../imagem/vacaTopo2.png\" width = \"220\" height = \"48\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>");
      out.write("</td>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<BR/><center><BR/><HR>\r\n");
      out.write("\t\t\t\t<h2>Erro interno!</h2>\r\n");
      out.write("\t\t\t<BR/></center><BR/>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>");
      out.write("<table width = \"100%\" style = \"border-top:2px;border-bottom:0px; border-left:0px; border-right:0px; border-style:dotted;border-color: 660033;\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align = \"center\">BGFazendas - Todos os direitos reservados.\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>");
      out.write("</td>\r\n");
      out.write("\t<tr>\r\n");
      out.write("</table>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
