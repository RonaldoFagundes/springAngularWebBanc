package com.rfagundes.financial.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Categoria {

	private Integer id;
	private String tipo;
	private String descricao;

	private List<ContaBancaria> contaBancaria = new ArrayList<>();

	public Categoria() {
		super();
	}

	public Categoria(Integer id, String tipo, String descricao) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<ContaBancaria> getContaBancaria() {
		return contaBancaria;
	}

	public void setContaBancaria(List<ContaBancaria> contaBancaria) {
		this.contaBancaria = contaBancaria;
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
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}

}
