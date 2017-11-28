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
@Table(name="valores")
public class Valores{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idvalores")
	private Integer idvalores;
	
	
	@Column (name = "horista")
	private int horista;
	@Column (name = "mensalista")
	private int mensalista;
	
	public Valores(int newHorista, int newMensalista){
		this.horista = newHorista;
		this.mensalista = newMensalista;
	}
	
	public Valores(int id, int newHorista, int newMensalista){
		this.horista = newHorista;
		this.mensalista = newMensalista;
		this.idvalores=id;
	}
	
	public Valores(int id){
		this.idvalores=id;
	}
	
	public Valores(){
		
	}
	
	public float getMensalista(){
		return this.mensalista;
	}
	
	public float getHorista(){
		return this.horista;
	}
	
	public int getIdvalores() {
		return this.idvalores;
	}
	
	
	public void setMensalista(int newMensalista){
		this.mensalista = newMensalista;
	}

	public void setHorista(int newHorista){
		this.horista = newHorista;
	}	
}