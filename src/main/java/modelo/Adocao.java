package modelo;

import java.io.Serializable;
import java.lang.Long;
import java.security.Timestamp;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Adocao
 *
 */
@Entity
@Table(name = "adocao")
public class Adocao implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private static final long serialVersionUID = 1L;

	public Adocao() {
		super();
	}

	/* Animal */
	private String nomeAnimal;
	private String descricaoAnimal;
	private String especie;
	private String sexo;
	private String portePeso;
	private Integer idade;
	private String pelagem;
	private String raca;
	private Boolean castrado;
	private String linkVideo;
	private Date dataCadastro;

	/* Anunciante */
	private String cpfAnunciante;
	private String nomeAnunciante;
	private String estado;
	private String cidade;
	private String telefone;
	private String email;
	private String observacao;

	private String status;
	
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getDescricaoAnimal() {
		return descricaoAnimal;
	}

	public void setDescricaoAnimal(String descricaoAnimal) {
		this.descricaoAnimal = descricaoAnimal;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPortePeso() {
		return portePeso;
	}

	public void setPortePeso(String portePeso) {
		this.portePeso = portePeso;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Boolean getCastrado() {
		return castrado;
	}

	public void setCastrado(Boolean castrado) {
		this.castrado = castrado;
	}

	public String getLinkVideo() {
		return linkVideo;
	}

	public void setLinkVideo(String linkVideo) {
		this.linkVideo = linkVideo;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getCpfAnunciante() {
		return cpfAnunciante;
	}

	public void setCpfAnunciante(String cpfAnunciante) {
		this.cpfAnunciante = cpfAnunciante;
	}

	public String getNomeAnunciante() {
		return nomeAnunciante;
	}

	public void setNomeAnunciante(String nomeAnunciante) {
		this.nomeAnunciante = nomeAnunciante;
	}

	
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return this.id;
	}

}
