package com.bbva.cpdv.dto.info;

import com.bbva.apx.dto.AbstractDTO;

public class DataInBuscar extends AbstractDTO{
	private static final long serialVersionUID = 6764877975132200141L;
	private String json;
	
	/**
	 * Constructor
	 */
	public DataInBuscar(){}

	/**
	 * @return
	 * Method to get
	 */
	public String getJson() {
		return json;
	}

	/**
	 * @param json
	 * Method to set
	 */
	public void setJson(String json) {
		this.json = json;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((json == null) ? 0 : json.hashCode());
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
		DataInBuscar other = (DataInBuscar) obj;
		if (json == null) {
			if (other.json != null)
				return false;
		} else if (!json.equals(other.json))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataInBuscar [json=" + json + "]";
	}

	
	
}
