package com.bbva.cpdv.lib.r004.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.bbva.cpdv.dto.info.DataOutBuscar;
import com.bbva.cpdv.dto.info.DataOutCarrera;
import com.bbva.cpdv.lib.r004.CPDVR004;

public class CPDVR004Impl extends CPDVR004Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(CPDVR004.class);

	@Override
	public DataOutBuscar execute(String ruta) throws JsonParseException, JsonMappingException, IOException {
		LOGGER.info("Starting execute");

		DataOutBuscar dataOut = new DataOutBuscar();

		String[] datos = readFile(ruta);

		dataOut = buscarRegistro(datos);

		return dataOut;
	}

	/**
	 * @param numeroDeCuenta
	 * @throws JsonMappingException
	 * @throws JsonParseException
	 * @throws IOException
	 * Method to search the client
	 */
	private String[] readFile(String ruta) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		String data[] = new String[4];
		File file = new File(ruta);
		DataOutCarrera jsonNode = objectMapper.readValue(file, DataOutCarrera.class);
		data[0] = jsonNode.getEntidad();
		data[1] = jsonNode.getCentro();
		data[2] = jsonNode.getProducto();
		data[3] = jsonNode.getNumeroDeContrato();
		
		return data;
	}

	/**
	 * @param datos
	 * @return
	 * @throws IOException
	 * @throws FileNotFoundException
	 * Method to search for registry
	 */
	private DataOutBuscar buscarRegistro(String[] datos) throws IOException, FileNotFoundException {
		DataOutBuscar aux = new DataOutBuscar();
		String linea = null;
		BufferedReader bf = new BufferedReader(new FileReader(
				"C:\\Users\\hdramos\\Downloads\\IDE_APX_win64\\IDE_APX_win64\\workspace\\UF_PagoDeViaje_CPDV\\ArchivoPortafolio.txt"));
		while ((linea = bf.readLine()) != null) {
			String data[] = linea.split(";");

			if ((datos[0] + datos[1] + datos[2] + datos[3]).equals(data[0] + data[1] + data[2] + data[3])) {
				
				aux.setEntidad(data[0]);
				aux.setOficina(data[5]);
				aux.setContrato(data[6]);
				aux.setSaldo(data[7]);
				data[8]= data[8].replace('/', '-');
				data[8]= data[8].replace("3", "03");			
				aux.setFeuliq(LocalDate.parse(data[8]));
				aux.setTea(data[9]);		
				escribirRegistro(aux);
				return aux;
			}
		}
		return null;
	}

	private void escribirRegistro(DataOutBuscar datos) throws IOException, FileNotFoundException {
		ArrayList<String> array = new ArrayList<>();
		String linea = null;
		BufferedReader bf = new BufferedReader(new FileReader(
				"C:\\Users\\hdramos\\Downloads\\IDE_APX_win64\\IDE_APX_win64\\workspace\\UF_PagoDeViaje_CPDV\\ContratosFeuliq.txt"));
		while ((linea = bf.readLine()) != null) {
			String data[] = linea.split(";");
			if(data.length == 6){
				data[4] = data[4].replace('/', '-');
			array.add(data[0] + ";" + data[1] + ";" + data[2] + ";" + data[3] + ";" + data[4] + ";"+ data[5]);
			}
		}
		array.add(datos.getEntidad() + ";" + datos.getOficina() + ";" + datos.getContrato() + ";" + datos.getSaldo() + ";" + datos.getFeuliq() + ";" + datos.getTea()+";N");
		
		Collections.sort(array);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
				"C:\\Users\\hdramos\\Downloads\\IDE_APX_win64\\IDE_APX_win64\\workspace\\UF_PagoDeViaje_CPDV\\NEWContratosFeuliq.txt")));
		
		 for(int i =0; i<array.size();i++){
			 if(i==0){
				 bw.write(array.get(i));
			 }
			 bw.write("\n" + array.get(i));
		 }
	}
}
