package com.bbva.t001;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.bbva.cpdv.dto.info.DataInBuscar;
import com.bbva.cpdv.dto.info.DataOutBuscar;
import com.bbva.cpdv.lib.r004.CPDVR004;
import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;


/**
 * Transaccion
 * Implementacion de logica de negocio.
 * @author hdramos
 *
 */
public class T001T00401COTransaction extends AbstractT001T00401COTransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractT001T00401COTransaction.class);

	@Override
	public void execute() {
		try{
			CPDVR004 CPDVR004 = (CPDVR004) getServiceLibrary(CPDVR004.class);
			DataInBuscar dataIn = this.getDataIn();
			DataOutBuscar dataOut = CPDVR004.execute(dataIn.getJson());
			LOGGER.debug("Successful search");
			setContentLocation(getURIPath());
			setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
			this.setDataOut(dataOut);
			}catch(Exception e){
				LOGGER.debug("Error search");
			}
		}

	private void setDataOut(DataOutBuscar dataOut) {
		// TODO Auto-generated method stub
		
	}
	}

