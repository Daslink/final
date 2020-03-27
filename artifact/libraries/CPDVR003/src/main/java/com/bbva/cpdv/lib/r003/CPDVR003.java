package com.bbva.cpdv.lib.r003;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.bbva.cpdv.dto.info.DataOutCarrera;

public interface CPDVR003 {

	DataOutCarrera execute(String origen, String Destino, String pan, String numeroDeCuotas) throws FileNotFoundException, IOException;

}
