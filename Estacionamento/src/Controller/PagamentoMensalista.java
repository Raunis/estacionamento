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
@Table(name="pagamento_mensalista")

public class PagamentoMensalista {
	
	
	@Id
	@JoinColumn(name = "ID_PAGAMENTO")
	private Integer id;
	
	
	@Column
	private String mesRef;
	@Column
	private String dtVencimento;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMesRef() {
		return mesRef;
	}
	public void setMesRef(String mesRef) {
		this.mesRef = mesRef;
	}
	public String getDtVencimento() {
		return dtVencimento;
	}
	public void setDtVencimento(String dtVencimento) {
		this.dtVencimento = dtVencimento;
	}
	public PagamentoMensalista(Integer id, String mesRef, String dtVencimento) {
		super();
		this.id = id;
		this.mesRef = mesRef;
		this.dtVencimento = dtVencimento;
	}
	
	
	

}
