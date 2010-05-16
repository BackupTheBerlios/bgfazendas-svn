package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/web/jsp/Topo.jsp");
    _jspx_dependants.add("/web/jsp/Rodape.jsp");
  }

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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language = \"javaScript\">\r\n");
      out.write("\tfunction montarMenu()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tAjaxRequestMontarMenu();\r\n");
      out.write("\t\tif(!AjaxMontarMenu){\r\n");
      out.write("\t\t\talert(\"Erro no AJAX\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\t\t\t\r\n");
      out.write("\t\tAjaxMontarMenu.onreadystatechange = mostrarMenu;\r\n");
      out.write("\t\tAjaxMontarMenu.open('POST',\"Topo.abrirMenu.mtw\", true);\r\n");
      out.write("\t\tAjaxMontarMenu.send(null);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction AjaxRequestMontarMenu(){\r\n");
      out.write("\t\tAjaxMontarMenu = false;\r\n");
      out.write("\t\tif(window.XMLHttpRequest){//Mozilla,Firefox\r\n");
      out.write("\t\t\tAjaxMontarMenu = new XMLHttpRequest();\r\n");
      out.write("\t\t}else if(window.ActiveXObject){//IE\r\n");
      out.write("\t\t\ttry{\r\n");
      out.write("\t\t\t\tAjaxMontarMenu = new ActiveXObject(\"Msxm12.XMLHTTP\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tcatch(e){\r\n");
      out.write("\t\t\t\ttry{\r\n");
      out.write("\t\t\t\t\tAjaxMontarMenu = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t\t\t}catch(e){}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction mostrarMenu()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(AjaxMontarMenu.readyState == 4)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif(AjaxMontarMenu.status == 200)\r\n");
      out.write("\t\t\t{\t\r\n");
      out.write("\t\t\t\tdocument.getElementById('menu').innerHTML = AjaxMontarMenu.responseText;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t\t\t<td width = \"100%\" id = \"menu\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td  valign = \"top\" width = \"220\">\r\n");
      out.write("\t\t\t\t\t\t<img src = \"/BGFazendas/web/imagem/topo/vacaTopo2.png\" width = \"220\" height = \"48\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<script>\r\n");
      out.write("\t\tmontarMenu();\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width = \"1024\" align = \"center\" style = \"border-top:2px;border-bottom:0px; border-left:0px; border-right:0px; border-style:dotted;border-color: 660033;\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align = \"center\">\r\n");
      out.write("\t\t\tBGFazendas - Todos os direitos reservados.\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
