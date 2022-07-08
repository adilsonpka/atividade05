import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Modelo implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name = "descricao", nullable= false )
	private String descricao;
	@Column (name = "potencia", nullable= false )
	private Integer potencia;
	
	@OneToMany
	@JoinColumn(name="marca_id")
	private List<Marca> marcas;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Integer getPotencia() {
		return potencia;
	}


	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}


	public List<Marca> getMarcas() {
		return marcas;
	}


	public void setMarcas(List<Marca> marcas) {
		this.marcas = marcas;
	}


	public Modelo(Integer id, String descricao, Integer potencia, int i) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.potencia = potencia;
		this.marcas = i;
	}


		
	
	
	

}
