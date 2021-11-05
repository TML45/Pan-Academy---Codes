package model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document() // registro de um colecao
public class Consulta implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	@DBRef // referencia de collection dentro de outra
	private Medico medico;
	private String prescricoes;
	private String exames;
	private String prontuario;
	private String data;

	public Consulta() {
		super();
	}

	public Consulta(String id, Medico medico, String prescricoes, String exames, String prontuario, String data) {
		super();
		this.id = id;
		this.medico = medico;
		this.prescricoes = prescricoes;
		this.exames = exames;
		this.prontuario = prontuario;
		this.data = data;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getPrescricoes() {
		return prescricoes;
	}

	public void setPrescricoes(String prescricoes) {
		this.prescricoes = prescricoes;
	}

	public String getExames() {
		return exames;
	}

	public void setExames(String exames) {
		this.exames = exames;
	}

	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consulta other = (Consulta) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}