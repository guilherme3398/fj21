package br.com.caelum.agenda.filtro;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.com.caelum.agenda.ConnectionFactory;

@WebFilter("/*")

public class FiltroConexao{

public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws IOException,ServletException{

try{
	Connection connection=new ConnectionFactory().getConnection();

// pendurando a connection na requisiçao
req.setAttribute("conexao",connection);

chain.doFilter(req,res);connection.close();}catch(SQLException e){throw new ServletException(e);

}

}
}

