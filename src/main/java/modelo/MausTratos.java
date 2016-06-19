package modelo;

import java.io.Serializable;
import java.lang.Long;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity:ServiceMausTratos
 *
 */
@Entity
@Table(name="maustratos")
public class MausTratos implements Serializable {

	   
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private static final long serialVersionUID = 1L;

	 private String endereco;
	    private Integer latitude;
	    private Integer longitude;
	    private String descricao;
//	    private List<Integer> imagens;
	
		private String status;
		
		
		
		public MausTratos(String endereco, Integer latitude, Integer longitude, String descricao) {
			super();
			this.endereco = endereco;
			this.latitude = latitude;
			this.longitude = longitude;
			this.descricao = descricao;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	
	public MausTratos() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getLatitude() {
		return latitude;
	}
	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}
	public Integer getLongitude() {
		return longitude;
	}
	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
//	public List<Integer> getImagens() {
//		return imagens;
//	}
//	public void setImagens(List<Integer> imagens) {
//		this.imagens = imagens;
//	}
   
	
	
}
