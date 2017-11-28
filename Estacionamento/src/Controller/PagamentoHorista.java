package Controller;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="pagamento_horista")

public class PagamentoHorista {
	
	
	@Id
	@JoinColumn(name = "ID_PAGAMENTO")
	private Integer id;
	
	
	@Column
	private String entrada;
	@Column
	private String saida;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	public String getSaida() {
		return saida;
	}
	public void setSaida(String saida) {
		this.saida = saida;
	}
	public PagamentoHorista(Integer id, String entrada, String saida) {
		super();
		this.id = id;
		this.entrada = entrada;
		this.saida = saida;
	}
	

	



}
