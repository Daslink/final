package com.bbva.cpdv.dto.info;

import com.bbva.apx.dto.AbstractDTO;

public class DataInCarrera extends AbstractDTO {
	private static final long serialVersionUID = 5334068178452629084L;
	private String origen;
	private String destino;
	private String pan;
	private String numeroDeCuotas;
	
	/**
	 * Contructor
	 */
	 public DataInCarrera() {
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen
	 * Method to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * @param destino
	 * Method to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getPan() {
		return pan;
	}

	/**
	 * @param pan
	 * Method to set
	 */
	public void setPan(String pan) {
		this.pan = pan;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getNumeroDeCuotas() {
		return numeroDeCuotas;
	}

	/**
	 * @param numeroDeCuotas
	 * Method to set
	 */
	public void setNumeroDeCuotas(String numeroDeCuotas) {
		this.numeroDeCuotas = numeroDeCuotas;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destino == null) ? 0 : destino.hashCode());
		result = prime * result + ((numeroDeCuotas == null) ? 0 : numeroDeCuotas.hashCode());
		result = prime * result + ((origen == null) ? 0 : origen.hashCode());
		result = prime * result + ((pan == null) ? 0 : pan.hashCode());
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
		DataInCarrera other = (DataInCarrera) obj;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (numeroDeCuotas == null) {
			if (other.numeroDeCuotas != null)
				return false;
		} else if (!numeroDeCuotas.equals(other.numeroDeCuotas))
			return false;
		if (origen == null) {
			if (other.origen != null)
				return false;
		} else if (!origen.equals(other.origen))
			return false;
		if (pan == null) {
			if (other.pan != null)
				return false;
		} else if (!pan.equals(other.pan))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataInCarrera [origen=" + origen + ", destino=" + destino + ", pan=" + pan + ", numeroDeCuotas="
				+ numeroDeCuotas + "]";
	}
	 
	 

}
