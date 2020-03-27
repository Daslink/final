package com.bbva.cpdv.lib.r004;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bbva.cpdv.dto.info.DataOutBuscar;

public interface CPDVR004 {

	DataOutBuscar execute(String ruta) throws JsonParseException, JsonMappingException, IOException;

}
