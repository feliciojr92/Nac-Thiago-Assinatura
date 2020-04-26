package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.AssinaturaDAO;
import br.com.fiap.jpa.entity.Assinatura;

public class AssinaturaDAOImpl extends GenericDAOImpl<Assinatura, Integer> implements AssinaturaDAO {

	public AssinaturaDAOImpl(EntityManager em) {
		super(em);
	}
	
	

}
