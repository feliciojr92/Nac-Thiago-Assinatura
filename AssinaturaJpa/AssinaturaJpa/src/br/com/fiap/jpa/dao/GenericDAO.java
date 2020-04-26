package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.NoDataException;

public interface GenericDAO<T,K> {
	
	void cadastrar(T entidade);
	
	void atualizar (T entidade);
	
	T pesquisar(K codigo);
	
	void remover(K codigo) throws NoDataException;
	
	void commit() throws CommitException ;

}
