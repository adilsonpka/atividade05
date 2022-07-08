import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Automovel  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column (name = "anoFabrocacao", nullable= false )
	private Integer anoFabricacao;
	@Column (name = "anoModelo", nullable= false )
	private Integer anoModelo;
	
	@Column (name = "observacoes", nullable= false )
	private String observacoes;
	@Column (name = "preco", nullable= false )
	private Float preco;
	
	private Integer kilometragem;
	@OneToMany
	@JoinColumn(name="modelo_id")
	private List<Modelo> modelos;

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Integer getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(Integer kilometragem) {
		this.kilometragem = kilometragem;
	}

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}

	public Automovel(Integer anoFabricacao, Integer anoModelo, String observacoes, int i, Integer kilometragem,
			int j) {
		super();
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.observacoes = observacoes;
		this.preco = i;
		this.kilometragem = kilometragem;
		this.modelos = j;
	}



}
