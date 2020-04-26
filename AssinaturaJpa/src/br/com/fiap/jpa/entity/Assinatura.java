package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_ASSINATURA")
@SequenceGenerator(name="assinatura", sequenceName = "SQ_TB_ASSINATURA", allocationSize = 1)
public class Assinatura {
	
	@Id
	@Column(name="cd_assinatura", length = 2)
	@GeneratedValue(generator = "assinatura", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="tp_assinatura", nullable = false, length = 20)
	private String assinatura;
	
	@Column(name="cd_usuario", nullable = false, length = 2)
	private int codigoUsuario;

	public Assinatura() {
		super();
	}

	public Assinatura(String assinatura, int codigoUsuario) {
		super();
		this.assinatura = assinatura;
		this.codigoUsuario = codigoUsuario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(String assinatura) {
		this.assinatura = assinatura;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	
}
