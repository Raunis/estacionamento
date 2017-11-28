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
	@Table(name="veiculo")
	public class Veiculo {
		
		
		@Id
		@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
		private String id;
		
		
		@Column(name = "PLACA")
		private String placa;
		
		@JoinColumn(name = "CNH")
		private String cnh;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		public String getCnh() {
			return cnh;
		}
		public void setCnh(String cnh) {
			this.cnh = cnh;
		}
		public Veiculo(String id, String placa, String cnh) {
			super();
			this.id = id;
			this.placa = placa;
			this.cnh = cnh;
		}
		
		
		


}
