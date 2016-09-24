package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer idPessoa;
	@Column
	private String nome;
	@Column
	private String email;
	@Column
	private String telefone;
	@Column
	private String sexo;
	public Pessoa(Integer idPessoa, String nome, String email, String telefone,
			String sexo) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.sexo = sexo;
	}
	public Pessoa() {
		super();
	}
	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
}
