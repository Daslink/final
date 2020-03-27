package com.bbva.cpdv.dto.info;

import java.util.Arrays;
import com.bbva.apx.dto.AbstractDTO;

/**
 * @author hdramos
 *
 */
public class DataOutCarrera extends AbstractDTO{
	private static final long serialVersionUID = -1911229181211759688L;
	private String pan;
	private String entidad;
	private String centro;
	private String producto;
	private String numeroDeContrato;
	private String titular;
	private String direccion;
	private String numeroDeCuotas;
	private String[] cuotasCalculadas;
	
	/**
	 * Constructor
	 */
	public DataOutCarrera(){}

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
	public String getEntidad() {
		return entidad;
	}

	/**
	 * @param entidad
	 * method to set
	 */
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getCentro() {
		return centro;
	}

	/**
	 * @param centro
	 * Method to set
	 */
	public void setCentro(String centro) {
		this.centro = centro;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getProducto() {
		return producto;
	}

	/**
	 * @param producto
	 * Method to set
	 */
	public void setProducto(String producto) {
		this.producto = producto;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getNumeroDeContrato() {
		return numeroDeContrato;
	}

	/**
	 * @param numeroDeContrato
	 * Method to set
	 */
	public void setNumeroDeContrato(String numeroDeContrato) {
		this.numeroDeContrato = numeroDeContrato;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular
	 * Method to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return
	 * Method to get
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion
	 * Method to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	/**
	 * @return
	 * Method to get
	 */
	public String[] getCuotasCalculadas() {
		return cuotasCalculadas;
	}

	/**
	 * @param cuotasCalculadas
	 * Method to set
	 */
	public void setCuotasCalculadas(String[] cuotasCalculadas) {
		this.cuotasCalculadas = cuotasCalculadas;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		result = prime * result + Arrays.hashCode(cuotasCalculadas);
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((entidad == null) ? 0 : entidad.hashCode());
		result = prime * result + ((numeroDeContrato == null) ? 0 : numeroDeContrato.hashCode());
		result = prime * result + ((numeroDeCuotas == null) ? 0 : numeroDeCuotas.hashCode());
		result = prime * result + ((pan == null) ? 0 : pan.hashCode());
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
		result = prime * result + ((titular == null) ? 0 : titular.hashCode());
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
		DataOutCarrera other = (DataOutCarrera) obj;
		if (centro == null) {
			if (other.centro != null)
				return false;
		} else if (!centro.equals(other.centro))
			return false;
		if (!Arrays.equals(cuotasCalculadas, other.cuotasCalculadas))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (entidad == null) {
			if (other.entidad != null)
				return false;
		} else if (!entidad.equals(other.entidad))
			return false;
		if (numeroDeContrato == null) {
			if (other.numeroDeContrato != null)
				return false;
		} else if (!numeroDeContrato.equals(other.numeroDeContrato))
			return false;
		if (numeroDeCuotas == null) {
			if (other.numeroDeCuotas != null)
				return false;
		} else if (!numeroDeCuotas.equals(other.numeroDeCuotas))
			return false;
		if (pan == null) {
			if (other.pan != null)
				return false;
		} else if (!pan.equals(other.pan))
			return false;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataOutCarrera [pan=" + pan + ", entidad=" + entidad + ", centro=" + centro + ", producto=" + producto
				+ ", numeroDeContrato=" + numeroDeContrato + ", titular=" + titular + ", direccion=" + direccion
				+ ", numeroDeCuotas=" + numeroDeCuotas + ", cuotasCalculadas=" + Arrays.toString(cuotasCalculadas)
				+ "]";
	}
	
		
}
