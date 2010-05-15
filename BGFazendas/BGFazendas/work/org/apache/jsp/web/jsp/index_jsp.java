package org.apache.jsp.web.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>\r\n");
      out.write("\t\t</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<table width = \"1024\" height = \"768\" border = \"1\" align = \"center\" cellspacing = \"0\" cellpadding = \"0\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td valign = \"top\">\r\n");
      out.write("\t\t\t\t \t<table cellpadding = \"0\" cellspacing = \"0\">\r\n");
      out.write("\t\t\t\t \t\t<tr width = \"220\"> \r\n");
      out.write("\t\t\t\t \t\t\t<td width = \"100%\" style =\"background-image: url('/BGFazendas/web/imagem/cabecalho/bambu.jpg');\">\r\n");
      out.write("\t\t\t\t \t\t\t\r\n");
      out.write("\t\t\t\t \t\t\t</td>\r\n");
      out.write("\t\t\t\t \t\t\t<td style =\"background-image: url('/BGFazendas/web/imagem/cabecalho/bambu.jpg');\" valign = \"bottom\" width = \"220\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src = \"/BGFazendas/web/imagem/cabecalho/vacaTopo1.png\" width = \"220\" height = \"180\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width = \"100%\">\r\n");
      out.write("\t\t\t\t \t\t\t\t<!--MENU-->\r\n");
      out.write("\t\t\t\t\t\t\t\tCADASTRO | AGENDA | VACINA | LOGOUT\r\n");
      out.write("\t\t\t\t \t\t\t\t\t\r\n");
      out.write("\t\t\t\t \t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td  valign = \"top\" width = \"220\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src = \"/BGFazendas/web/imagem/cabecalho/vacaTopo2.png\" width = \"220\" height = \"48\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width = \"100%\" height = \"100%\" align = \"center\" valign = \"top\">\r\n");
      out.write("\t\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t<table width = \"90%\" border = \"0\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t\t\t\tVacina\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td valign = \"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<legend>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tCadastro de Vacina\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</legend>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<table width = \"220\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src = \"/BGFazendas/web/imagem/vacina/cadastroVacina.png\" width = \"100\" height = \"80\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign = \"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSistema para cadastrar vacinas\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td valign = \"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<legend>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tAssociação Vacina X Animal\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</legend>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<table width = \"220\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src = \"/BGFazendas/web/imagem/vacina/vacinaAssociacao.jpg\" width = \"100\" height = \"80\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign = \"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSistema para associar vacina a um animal\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td valign = \"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<legend>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tAssociação Vacina X Lote\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</legend>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<table width = \"220\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src = \"/BGFazendas/web/imagem/vacina/vacinaAssociacao.jpg\" width = \"100\" height = \"80\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign = \"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSistema para associar vacina a um lote\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td valign = \"top\">\r\n");
      out.write("\t\t\t\t\t<table width = \"100%\" style = \"border-top:2px;border-bottom:0px; border-left:0px; border-right:0px; border-style:dotted;border-color: 660033;\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align = \"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\tBGFazendas - Todos os direitos reservados.\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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
