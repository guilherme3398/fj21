<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<%@page import="java.util.*,
br.com.caelum.agenda.dao.*,
br.com.caelum.agenda.modelo.*" %>

<body>
<table>
<%ContatoDao dao = new ContatoDao ();
List<Contato> contatos =dao.getLista();

for (Contato contato : contatos){
%>

<tr>
<td><%=contato.getNome() %></td>
<td><%=contato.getEmail() %></td>
<td><%=contato.getEndereco() %></td>
<td><%=contato.getDataNascimento().getTime() %></td>
</tr>
<%} %>

</table>

<!-- codigo omitido -->
<c:forEach var="contato" items="${da.lista}">
<tr>
<!-- codigo omitido -->
<td>
<a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Remover</a>
</td>
</tr>
</c:forEach>
</body>
</html>




