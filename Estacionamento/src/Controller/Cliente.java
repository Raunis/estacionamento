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
	@Table(name="cliente")
	public class Cliente {
		
		
		@Id
		@Column(name = "CNH")
		private String cnh;
		
		
		@Column
		private String nome;
		@Column
		private int telefone;
		@Column
		private String dt_vencimento;
		public String getCnh() {
			return cnh;
		}
		public void setCnh(String cnh) {
			this.cnh = cnh;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		public String getDt_vencimento() {
			return dt_vencimento;
		}
		public void setDt_vencimento(String dt_vencimento) {
			this.dt_vencimento = dt_vencimento;
		}
		public Cliente(String cnh, String nome, int telefone,
				String dt_vencimento) {
			super();
			this.cnh = cnh;
			this.nome = nome;
			this.telefone = telefone;
			this.dt_vencimento = dt_vencimento;
		}
	
		
		
	}

