<%@ taglib uri="../WEB-INF/lib/mentawai.jar" prefix="mtw" %>

<form action="Login.mtw" method="post">
<table width = "1024" height = "768" border = "1" align = "center" cellspacing = "0" cellpadding = "0">
	<tr>
		<td><%@ include file="cabecalho.html" %></td>
	<tr>
	<tr>
		<td>
			<table width="100%" align = "center" cellspacing = "0" cellpadding = "0">
				<tr>
					<td align = "rigth">Usu&aacute;rio</td>
					<td align = "left"><input type="text" name="usuario" id="usuario" size="10"></td>
				</tr>
				<tr>
					<td align = "rigth">Senha</td>
					<td align = "left"><input type="text" name="usuario" id="usuario" size="10"></td>
				</tr>
				<tr>
					<td align = "rigth">&nbsp;</td>
					<td align = "left"><input type="submit"></td>
				</tr>
			</table>
		</td>
	<tr>
	<tr>
		<td><%@ include file="rodape.html" %></td>
	<tr>
</table>
</form>
<script language="JavaScript">
  document.getElementById('usuario').focus();
 </script>	