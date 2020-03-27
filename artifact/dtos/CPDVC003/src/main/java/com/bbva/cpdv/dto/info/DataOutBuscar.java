package com.bbva.cpdv.dto.info;

import java.time.LocalDate;

import com.bbva.apx.dto.AbstractDTO;

public class DataOutBuscar extends AbstractDTO {
	private static final long serialVersionUID = 2663012682232151314L;
	private String entidad;
	private String oficina;
	private String contrato;
	private String saldo;
	private LocalDate feuliq;
	private String tea;
	
	/**
	 * Constructor
	 */
	public DataOutBuscar() {	
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getEntidad() {
		return entidad;
	}

	/**
	 * @param entidad
	 * Method to set
	 */
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getOficina() {
		return oficina;
	}

	/**
	 * @param oficina
	 * Method to set
	 */
	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getContrato() {
		return contrato;
	}

	/**
	 * @param contrato
	 * Method to set
	 */
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 * Method to set
	 */
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return
	 * Method to get
	 */
	public LocalDate getFeuliq() {
		return feuliq;
	}

	/**
	 * @param feuliq
	 * Method To set
	 */
	public void setFeuliq(LocalDate feuliq) {
		this.feuliq = feuliq;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getTea() {
		return tea;
	}

	/**
	 * @param tea
	 * Method to set
	 */
	public void setTea(String tea) {
		this.tea = tea;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contrato == null) ? 0 : contrato.hashCode());
		result = prime * result + ((entidad == null) ? 0 : entidad.hashCode());
		result = prime * result + ((feuliq == null) ? 0 : feuliq.hashCode());
		result = prime * result + ((oficina == null) ? 0 : oficina.hashCode());
		result = prime * result + ((saldo == null) ? 0 : saldo.hashCode());
		result = prime * result + ((tea == null) ? 0 : tea.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataOutBuscar other = (DataOutBuscar) obj;
		if (contrato == null) {
			if (other.contrato != null)
				return false;
		} else if (!contrato.equals(other.contrato))
			return false;
		if (entidad == null) {
			if (other.entidad != null)
				return false;
		} else if (!entidad.equals(other.entidad))
			return false;
		if (feuliq == null) {
			if (other.feuliq != null)
				return false;
		} else if (!feuliq.equals(other.feuliq))
			return false;
		if (oficina == null) {
			if (other.oficina != null)
				return false;
		} else if (!oficina.equals(other.oficina))
			return false;
		if (saldo == null) {
			if (other.saldo != null)
				return false;
		} else if (!saldo.equals(other.saldo))
			return false;
		if (tea == null) {
			if (other.tea != null)
				return false;
		} else if (!tea.equals(other.tea))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataOutBuscar [entidad=" + entidad + ", oficina=" + oficina + ", contrato=" + contrato + ", saldo="
				+ saldo + ", feuliq=" + feuliq + ", tea=" + tea + "]";
	}
	
	
	
	

}
