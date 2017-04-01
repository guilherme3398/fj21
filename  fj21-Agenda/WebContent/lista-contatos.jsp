
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<style>
table, tr, td {border: 1px solid black;}
</style>

	<!--cria o DAO -->


	<table>
		<!--  percorre contatos montando lista -->
		<c:forEach var="contato" items="${contatos}">

				<tr>
					<td>${contato.nome}</td>
					<td>
					<c:choose>
					<c:when test="${not empty contato.email}">
							<a href="mailto:${contato.email}">${contato.email}</a>
							<td>${contato.endereco }</td>
						</c:when> <c:otherwise>
					<td>email não informado</td>
					</c:otherwise>
					</c:choose>
			<td> Data de Nascimento 
			<fmt:formatDate value="${contato.dataNascimento.time}"
			pattern="dd/MM/yyyy" />
			</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>