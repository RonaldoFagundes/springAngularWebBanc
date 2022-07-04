package com.rfagundes.financial.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class ContaBancaria {

	private Integer id;
	private String tipo;
	private String numero;
	private BigDecimal saldo;

	private Categoria categoria;

	public ContaBancaria() {
		super();
	}

	public ContaBancaria(Integer id, String tipo, String numero, BigDecimal saldo, Categoria categoria) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.numero = numero;
		this.saldo = saldo;
		this.categoria = categoria;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
		ContaBancaria other = (ContaBancaria) obj;
		return Objects.equals(id, other.id);
	}

}