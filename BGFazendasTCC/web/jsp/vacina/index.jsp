<%@ page contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="/WEB-INF/lib/mentawai.jar" prefix="mtw" %>

<html>
	<head>
		<title>
		
		</title>
	</head>
	<%@ include file = "/web/jsp/topo/Topo.jsp"%>
	<body>
		<table width = "1024" height = "540"  border = "1" align = "center" valign = "top" cellspacing = "0" cellpadding = "0">
			<tr>
				<td valign = "top">
					<table width = "90%" border = "0">
						<tr>
							<td >
								Vacina
							</td>
						</tr>
						<tr>
							<td>
								&nbsp;
							</td>
						</tr>
						<tr>
							<td>
								<table>
									<tr>
										<td valign = "top">
											<fieldset>
												<legend>
													Cadastro de Vacina
												</legend>
												<table width = "220">
													<tr>
														<td>
															<a href = "/BGFazendas/web/jsp/vacina/Cadastro.jsp">
																<img src = "/BGFazendas/web/imagem/vacina/cadastroVacina.png" width = "100" height = "80" border = "0">
															</a>
														</td>
														<td valign = "top">
															Sistema para cadastrar vacinas
														</td>
													</tr>
												</table>
											</fieldset>
										</td>
										<td valign = "top">
											<fieldset>
												<legend>
													Associação Vacina X Animal
												</legend>
												<table width = "220">
													<tr>
														<td>
															<img src = "/BGFazendas/web/imagem/vacina/vacinaAssociacao.jpg" width = "100" height = "80">
														</td>
														<td valign = "top">
															Sistema para associar vacina a um animal
														</td>
													</tr>
												</table>
											</fieldset>
										</td>
										<td valign = "top">
											<fieldset>
												<legend>
													Associação Vacina X Lote
												</legend>
												<table width = "220">
													<tr>
														<td>
															<img src = "/BGFazendas/web/imagem/vacina/vacinaAssociacao.jpg" width = "100" height = "80">
														</td>
														<td valign = "top">
															Sistema para associar vacina a um lote
														</td>
													</tr>
												</table>
											</fieldset>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>

				</td>
			</tr>					
		</table>
	</body>
	<%@ include file = "/web/jsp/rodape/Rodape.jsp"%>
</html>
