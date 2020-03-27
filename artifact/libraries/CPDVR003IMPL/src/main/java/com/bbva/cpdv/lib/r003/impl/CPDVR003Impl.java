package com.bbva.cpdv.lib.r003.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.bbva.cpdv.dto.info.DataOutCarrera;
import com.bbva.cpdv.lib.r003.CPDVR003;

public class CPDVR003Impl extends CPDVR003Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(CPDVR003.class);

	@Override
	public DataOutCarrera execute(String origen, String destino, String pan, String numeroDeCuotas) throws FileNotFoundException, IOException {
		
		LOGGER.info("Starting execute");
		
		DataOutCarrera dataOut = new DataOutCarrera();
		
		RestTemplate restTemplate = new RestTemplate();
		String json = restTemplate.getForObject("https://maps.googleapis.com/maps/api/directions/json?origin=" + origen
				+ "&destination=" + destino + "&key=AIzaSyByPeqwGB3sb1BXGhEkzfzmnOodqugTM6Q", String.class);
		
		String[] datos = readFile(pan);
		
		dataOut = inicializarObjeto(datos, numeroDeCuotas, valor(json));
		
		createJson(dataOut);
		
		return dataOut;
	}
	
	/**
	 * @param numeroDeCuenta
	 * @throws IOException
	 * Method to search the client
	 */
	private String[] readFile(String numeroDeCuenta) throws IOException,FileNotFoundException {
		String linea = null;
		BufferedReader bf = new BufferedReader(new FileReader(
				"C:\\Users\\hdramos\\Downloads\\IDE_APX_win64\\IDE_APX_win64\\workspace\\UF_PagoDeViaje_CPDV\\ListadoTarjetas2.txt"));
		while ((linea = bf.readLine()) != null) {
			String datos[] = linea.split(";");
			if ((datos[0] + datos[1]).equals(numeroDeCuenta)) {
				return datos;
			}
		}
		return null;
	}
	
	/**
	 * @param json
	 * @return
	 * Method to calculate value of distance
	 */
	private String valor(String json) throws JsonParseException, JsonMappingException, IOException{		
		ObjectMapper objectMapper = new ObjectMapper();	
		JsonNode jsonNode = objectMapper.readValue(json, JsonNode.class);
		JsonNode distancia = jsonNode.get("routes").get(0).get("legs").get(0).get("distance").get("value");
		
		long val = 2*(Long.parseLong(distancia.toString()));
	
		return Long.toString(val);
	}
	
	/**
	 * @param datos
	 * @return
	 * Method to inicilization DataOut
	 */
	private DataOutCarrera inicializarObjeto(String[] datos, String numeroDeCuotas, String valor){
		DataOutCarrera aux = new DataOutCarrera();
		
		aux.setPan((datos[0] + datos[1]));
		aux.setEntidad(datos[2]);
		aux.setCentro(datos[3]);
		aux.setProducto(datos[4]);
		aux.setNumeroDeContrato(datos[5]);
		aux.setTitular(datos[6]);
		aux.setDireccion(datos[7]);
		aux.setNumeroDeCuotas(numeroDeCuotas);
		
		datos[8] = datos[8].replace(',', '.');
		double interes = Double.parseDouble(datos[8]);
		long saldoTotal = (Long.parseLong(valor));
		int limite = Integer.parseInt(numeroDeCuotas);

		String cuotas[]= new String[limite];
		for(int i =0; i<limite; i++){
			if(i == 0){
				cuotas[i] = "Cuota "+ (i+1) +": "+ (long)saldoTotal/limite;
			}else{
			if(i==1){
				cuotas[i] = "Cuota "+ (i+1) +": "+  (long)((saldoTotal*interes)+((saldoTotal-(saldoTotal/limite))*interes));
			}else{
				cuotas[i]= "Cuota "+ (i+1) +": "+ (long)((saldoTotal-((saldoTotal/limite)*i))*interes);
			}
		} 
	}
		aux.setCuotasCalculadas(cuotas);
		
		return aux;
	}
	
	/**
	 * @param data
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws FileNotFoundException
	 * @throws IOException
	 * Method to create the json
	 */
	private void createJson(DataOutCarrera data) throws JsonGenerationException, JsonMappingException, FileNotFoundException, IOException{
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new FileOutputStream(
				"C:\\Users\\hdramos\\Downloads\\IDE_APX_win64\\IDE_APX_win64\\workspace\\UF_PagoDeViaje_CPDV\\"+data.getTitular()+".json"), data);	
	}
}
