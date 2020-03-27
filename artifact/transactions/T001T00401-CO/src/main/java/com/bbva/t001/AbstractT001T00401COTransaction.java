package com.bbva.t001;


import com.bbva.cpdv.dto.info.DataInBuscar;
import com.bbva.cpdv.dto.info.DataOutBuscar;
import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractT001T00401COTransaction extends AbstractTransaction {

	public AbstractT001T00401COTransaction(){
	}
	
	protected DataInBuscar getDataIn(){
		return (DataInBuscar)getParameter("dataIn");
	}
	
	protected void setDatainbuscar(final DataOutBuscar dataOut){
		this.addParameter("DataInBuscar", dataOut);
	}	
	

	
	

}
