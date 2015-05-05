
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listar Alunos</title>
<link rel="stylesheet" type="text/css" href="../../css/style.css">
</head>
<body>

	<c:import url="cabecalho.jsp" />
	<div>
		<br /> <a href="index.jsp">Página principal</a> <br /> <a
			href="#fim"> Ir para o final</a> <br />
	</div>
	<h1 id="topo">
		Listar Alunos: <b>${qtd}</b>
	</h1>

	<table align="center" border="1px" width="80%">
		<thead>
			<tr>
				<th>Matricula</th>
				<th>Nome</th>
				<th>Nascimento</th>
				<th>Email</th>
				<th>Excluir</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="aluno" items="${alunos}">
				<tr ng-repeat="aluno in alunos">

					<td>${aluno.matricula }</td>

					<td>${aluno.nome}</td>

					<td><f:formatDate value="${aluno.nascimento}"
							pattern="dd/MM/yyyy" /></td>

					<c:choose>
						<c:when test="${not empty aluno.email}">
							<td>${aluno.email}</td>
						</c:when>
						<c:otherwise>
							<td><b>Email Não Cadastrado</b></td>

						</c:otherwise>
					</c:choose>
					<td><a href="deletarAluno?id=${aluno.id}"> Excluir </a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<h2>Index</h2>
	<div>
		<a href="index.jsp">Página principal</a> <br /> <a id="fim"
			href="#topo">ir para o topo</a> <br />
	</div>
	<footer> <c:import url="rodape.jsp" /> </footer>

</body>
</html>