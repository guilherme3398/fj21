package br.com.cselum.jdbc;

import java.sql.SQLException;
import java.util.Calendar;

public class TestaInsere {
	public static void main (String [] args) throws SQLException {
		//pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R.Vergueiro 3185 cj57"); 
		contato.setDataNascimento(Calendar.getInstance());
		
		//grave nessa conexão
		ContatoDao dao = new ContatoDao ();
		
		//metodo elegante
		dao.adciona(contato);
		
		System.out.println("Gravado!");
	}
	
}

