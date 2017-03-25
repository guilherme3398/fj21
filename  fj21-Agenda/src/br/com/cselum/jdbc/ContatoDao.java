package br.com.cselum.jdbc;

import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ContatoDao {
	//conexão com banco de dados;
private Connection connection ;


public ContatoDao (){
	this.connection = new ConnectionFactory().getConnection();
}

public void adciona (Contato contato) throws SQLException {
	String sql = "insert into contatos" + 
"(nome,email,endereco,dataNascimento) values(?,?,?,?) ";
	PreparedStatement stmt = connection.prepareStatement(sql);
	try { 
		stmt.setString(1,contato.getNome());
		stmt.setString(2,contato.getEmail());
		stmt.setString(3,contato.getEndereco());
		stmt.setDate(4,new Date (contato.getDataNascimento().getTimeInMillis()));
		
		
		//executa;
		stmt.execute();
		stmt.close();
	}catch (SQLException e) {
		throw new RuntimeException(e);
	
	}	
	
}
public List <Contato> getLista(){
	try {
	List <Contato>	contatos = new ArrayList<Contato>();
PreparedStatement stmt = this.connection.prepareStatement("Select * from contatos");
ResultSet rs = stmt.executeQuery();

while (rs.next()) {
	//criando objeto;
	Contato contato = new Contato ();
	
	contato.setId(rs.getLong("id"));
	contato.setNome(rs.getString("nome"));
	contato.setEmail("email");
	contato.setEndereco(rs.getString("endereco"));
	//montando a data através do Calendar;
	Calendar data = Calendar.getInstance();
	data.setTime(rs.getDate("dataNascimento"));
	contato.setDataNascimento(data);
	
	//adicionando o objeto à lista;
	contatos.add(contato);
}
rs.close();
	stmt.close();
	return contatos;
	}catch (SQLException e) {
		throw new RuntimeException (e);
	}
}
	
	
	
	
}
}
