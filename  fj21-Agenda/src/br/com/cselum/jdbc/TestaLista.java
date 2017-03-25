package br.com.cselum.jdbc;

import java.util.List;

public class TestaLista {
public static void main (String [] args){
	
	ContatoDao dao = new ContatoDao ();
	List<Contato> contatos = dao.getLista();
	
	For (Contato contato : contatos){
		System.out.println("Nome:" + contato.getName());
		System.out.println("Nome:" + contato.getName());
		System.out.println("Nome:" + contato.getName());
		System.out.println("Nome:" + contato.getName());
	}
	
}


}


