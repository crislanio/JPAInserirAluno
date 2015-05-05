<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Inserir Aluno</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<h1>Inserir Aluno</h1>
	<form id="formInserir" action="adicionarAluno" method="post">
		
		<input type="hidden" name="classe" value="InserirAlunoServlet">
	
		Matricula: <input type="text" name="matricula" /> <br />
		Nome: <input type="text" name="nome" /> <br />
		<form:errors cssStyle="color:red" path="aluno.nome"/> <br />
		Data de Nascimento: <input type="date" id="nascimento" name="nascimento"><br />
		<form:errors cssStyle="color:red" path="aluno.nascimento"/> <br />
		E-mail: <input type="text" name="email" /> <br />
		<input class="button" type="submit" value="Inserir" /> <br />
	</form>
	 <a href="index.jsp">Página principal</a>
	<footer> <c:import url="rodape.jsp" /> </footer>	
</body>
</html>