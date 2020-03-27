package com.bbva.dpdv.dto.info.test;

import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

import org.junit.Before;
import org.junit.Test;

import com.bbva.cpdv.dto.info.DataInBuscar;
import com.bbva.cpdv.dto.info.DataInCarrera;
import junit.framework.Assert;

public class DataInCarreraTest {
	DataInCarrera data = new DataInCarrera();
	
	@Before
	public void starning(){
		data.setOrigen("BOGOTA");
		data.setDestino("SOACHA");
		data.setPan("0000000000000000000");
		data.setNumeroDeCuotas("5");
	}
	
	/**
	 * Method for test the sentence get()  - enden ok
	 */
	@Test
	public void getTest(){
		Assert.assertEquals(data.getOrigen(), "BOGOTA");
		Assert.assertEquals(data.getDestino(), "SOACHA");
		Assert.assertEquals(data.getPan(), "0000000000000000000");
		Assert.assertEquals(data.getNumeroDeCuotas(), "5");
	}
	
	/**
	 * Method for test the sentence hashCode()  - enden ok
	 */
	@Test
	public void hashCodeTest(){
		int hashCode = data.hashCode();
		Assert.assertEquals(data.hashCode(), hashCode);
	}
	
	/**
	 * Method for test the sentence hashCode()  - enden Fail
	 */
	@Test
	public void hashCodeFailTes(){
		Assert.assertFalse(((Integer)data.hashCode()).equals(1));
	}
	
	/**
	 * Method for test the sentence hashCode()  - enden ok
	 */
	@Test
	public void hashCodeNullFail(){
		DataInCarrera aux = new DataInCarrera();
		int hashCode = aux.hashCode();
		Assert.assertEquals(aux.hashCode(), hashCode);		
	}
	
	/**
	 * Method for test the sentence equals()  - enden ok
	 */
	@Test
	public void equalsTest(){
		DataInCarrera aux = new DataInCarrera();
		
		//General
		Assert.assertEquals(data.equals(data), true);
		Assert.assertEquals(data.equals(null), false);
		Assert.assertEquals(data.equals("hola"), false);
		
		//Attributes
		Assert.assertEquals(aux.equals(data), false);
		aux.setDestino(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setDestino(data.getDestino());
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setNumeroDeCuotas(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setNumeroDeCuotas(data.getNumeroDeCuotas());
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setOrigen(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setOrigen(data.getOrigen());
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setPan(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setPan(data.getPan());
		
		Assert.assertEquals(data.equals(aux), true);
	}
	
	/**
	 * Method to test the sentence toString() - ended ok
	 */
	@Test
	public void toStringTest(){
		Assert.assertEquals(data.toString(), "DataInCarrera [origen=BOGOTA, destino=SOACHA, pan=0000000000000000000"
				+ ", numeroDeCuotas=5]");
	}
	
	/**
	 * Method to test the sentence toString()  - enden fail
	 */
	@Test
	public void toStringFailTest(){
		Assert.assertFalse(data.toString().equals("DataInCarrera [origen=BOGOTA, destino=SOACHA, pan=0000000000000000000"
				+ ", numeroDeCuotas=1]"));
	}
	
	
}
