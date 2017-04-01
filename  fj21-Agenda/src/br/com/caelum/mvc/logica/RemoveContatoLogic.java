package br.com.caelum.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.cselum.jdbc.Contato;

public class RemoveContatoLogic implements Logica {

	public String executa(HttpServletRequest req , HttpServletResponse res)
		throws Exception {
			
			long id = Long.parseLong (req.getParameter("id"));
					
			Contato contato = new Contato ();
			contato.setId(id);
			Connection connection;
			ContatoDao dao = new ContatoDao(connection);
			Connection connection = (Connection) req.getAttribute("conexao")
			
			
			System.out.println("Excluindo contato...");
			//return"lista-contatos.jsp";
				return "mvc?logica=ListaContatosLogic";		
		}
	}

	


