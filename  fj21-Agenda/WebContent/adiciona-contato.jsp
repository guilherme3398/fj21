<!DOCTYPE html>
<html>
<head>
<link href="css/jquery.css" rel="stylesheet">
<script src="js/jquery.js"></script>
<script src="js/jquery-ui.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>

</head>
<body>

	<c:import url="cabecalho.jsp" />

	<h1>Adiciona Contatos</h1>
	<hr />
	<form action="adicionaContato">
		<b>Nome:</b><input type="text" name="nome" /> 
		<b>E-mail: <input type="text"
			name="email" /><h3>Endereço:</h3> 
			<input type="text" name="endereco" /> 
			<h3>Data Nascimento:</h3> <caelum:campoData id="dataNascimento" /><br />
			 <input type="submit" value="Gravar" />

	</form>

</body>
</html>