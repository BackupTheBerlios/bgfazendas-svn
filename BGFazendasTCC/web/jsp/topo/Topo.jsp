<%@ page contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="/WEB-INF/lib/mentawai.jar" prefix="mtw" %>
<script language = "javaScript">
	function montarMenu()
	{
		var data = new Date();
		AjaxRequestMontarMenu();
		if(!AjaxMontarMenu){
			alert("Erro no AJAX");
			return;
		}			
		AjaxMontarMenu.onreadystatechange = mostrarMenu;
		AjaxMontarMenu.open('POST',"/BGFazendas/Topo.abrirMenu.mtw?data="+data.getMilliseconds(), true);
		AjaxMontarMenu.send(null);
	}
	
	function AjaxRequestMontarMenu(){
		AjaxMontarMenu = false;
		if(window.XMLHttpRequest){//Mozilla,Firefox
			AjaxMontarMenu = new XMLHttpRequest();
		}else if(window.ActiveXObject){//IE
			try{
				AjaxMontarMenu = new ActiveXObject("Msxm12.XMLHTTP");
			}
			catch(e){
				try{
					AjaxMontarMenu = new ActiveXObject("Microsoft.XMLHTTP");
				}catch(e){}
			}
		}
	}
	
	function mostrarMenu()
	{
		
		if(AjaxMontarMenu.readyState == 4)
		{
			if(AjaxMontarMenu.status == 200)
			{	
				document.getElementById('menu').innerHTML = AjaxMontarMenu.responseText;
			}
			else
			{
				
			}
		}
	}
</script>

<table width = "1024" border = "1" align = "center" cellspacing = "0" cellpadding = "0">
	<tr>
		<td valign = "top">
		 	<table cellpadding = "0" cellspacing = "0">
		 		<tr width = "220"> 
		 			<td width = "100%" style ="background-image: url('/BGFazendas/web/imagem/topo/bambu.jpg');"></td>
		 			<td style ="background-image: url('/BGFazendas/web/imagem/topo/bambu.jpg');" valign = "bottom" width = "220">
						<img src = "/BGFazendas/web/imagem/topo/vacaTopo1.png" width = "220" height = "180">
					</td>
				</tr>
				<tr>
					<td width = "100%" id = "menu">
						
					</td>
					<td  valign = "top" width = "220">
						<img src = "/BGFazendas/web/imagem/topo/vacaTopo2.png" width = "220" height = "48">
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
<script>
	montarMenu();
</script>
