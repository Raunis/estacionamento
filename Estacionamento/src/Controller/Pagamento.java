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
@Table(name="pagamento")
public class Pagamento {
	
	
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "ID_PAGAMENTO")
	private Integer id;
	
	
	@Column
	private int tipo;
	@JoinColumn(name = "CNH")
	private int cnh;
	@JoinColumn(name = "PLACA")
	private int placa;
	 @JoinColumn(name = "ID_VALORES")
	private int id_valor;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getCnh() {
		return cnh;
	}
	public void setCnh(int cnh) {
		this.cnh = cnh;
	}
	public int getPlaca() {
		return placa;
	}
	public void setPlaca(int placa) {
		this.placa = placa;
	}
	public int getId_valor() {
		return id_valor;
	}
	public void setId_valor(int id_valor) {
		this.id_valor = id_valor;
	}
	public Pagamento(Integer id, int tipo, int cnh, int placa, int id_valor) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.cnh = cnh;
		this.placa = placa;
		this.id_valor = id_valor;
	}
	 
	 
	 
	
	
	
	


}
