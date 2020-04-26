package br.com.fiap.jpa.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.dao.AssinaturaDAO;
import br.com.fiap.jpa.dao.impl.AssinaturaDAOImpl;
import br.com.fiap.jpa.entity.Assinatura;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.NoDataException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class View {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		AssinaturaDAO dao = new AssinaturaDAOImpl(em);
		
		//Cadastrar uma assinatura
		Assinatura assinatura = new Assinatura("Familia", 1);
		
		dao.cadastrar(assinatura);
		try {
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Atualização
		Assinatura assinatura2 = new Assinatura("Solo", 1);
		assinatura2.setCodigo(assinatura.getCodigo());
		
		dao.atualizar(assinatura2);
		try {
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		//Busca
		Assinatura busca = dao.pesquisar(assinatura.getCodigo());
		System.out.println(busca.getAssinatura());
		
		//Remoção
		try {
			dao.remover(assinatura.getCodigo());
			dao.commit();
		} catch (NoDataException | CommitException e) {
			e.printStackTrace();
		}
		
		
		em.close();
		fabrica.close();
	}

}
