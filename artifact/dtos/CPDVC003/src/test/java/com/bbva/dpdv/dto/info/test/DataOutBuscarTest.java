package com.bbva.dpdv.dto.info.test;

import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;
import com.bbva.cpdv.dto.info.DataOutBuscar;

/**
 * @author hdramos
 *
 */
public class DataOutBuscarTest{
	DataOutBuscar data = new DataOutBuscar();

	/**
	 * Varaible inizilitations
	 */
	@Before
	public void starning(){
		data.setEntidad("0013");
		data.setOficina("00000");
		data.setContrato("0000000");
		data.setSaldo("00");
		data.setFeuliq(LocalDate.now());
		data.setTea("0.0");
	}
	
	/**
	 * Method for test the sentence get()  - enden ok
	 */
	@Test
	public void getTest(){
		Assert.assertEquals(data.getEntidad(), "0013");
		Assert.assertEquals(data.getOficina(), "00000");
		Assert.assertEquals(data.getContrato(), "0000000");
		Assert.assertEquals(data.getSaldo(), "00");
		Assert.assertEquals(data.getFeuliq(), LocalDate.now());
		Assert.assertEquals(data.getTea(), "0.0");
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
	public void hashCodeFailTest(){
		Assert.assertFalse(((Integer)data.hashCode()).equals(1));
	}
	
	/**
	 * Method for test the sentence hashCode()  - enden ok
	 */
	@Test
	public void hashCodeNullTest(){
		DataOutBuscar aux = new DataOutBuscar();
		int hashCode = aux.hashCode();
		Assert.assertEquals(aux.hashCode(), hashCode);
	}
	
	/**
	 * Method for test the sentence equals()  - enden ok
	 */
	@Test
	public void equalsTest(){
		DataOutBuscar aux = new DataOutBuscar();
		
		//General
		Assert.assertEquals(data.equals(data), true);
		Assert.assertEquals(data.equals(null), false);
		Assert.assertEquals(data.equals("hola"), false);
		
		//Attributes
		Assert.assertEquals(aux.equals(data), false);
		aux.setContrato(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setContrato(data.getContrato());
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setEntidad(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setEntidad(data.getEntidad());
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setFeuliq(LocalDate.of(2018, 10, 30));
		Assert.assertEquals(data.equals(aux), false);
		aux.setFeuliq(data.getFeuliq());
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setOficina(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setOficina(data.getOficina());
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setSaldo(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setSaldo(data.getSaldo());
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setTea(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setTea(data.getTea());
		
		Assert.assertEquals(data.equals(aux), true);	
	}
	
	/**
	 * Method for test the sentence toString()  - enden ok
	 */
	@Test
	public void toStringTest(){
		Assert.assertEquals(data.toString(), "DataOutBuscar [entidad=0013, oficina=00000, contrato=0000000, saldo=00, feuliq=" + LocalDate.now() + ", tea=0.0]");
	}
	
	/**
	 * Method for test the sentence toString()  - enden fail
	 */
	@Test
	public void toStringFailTest(){
		Assert.assertFalse(data.toString().equals("DataOutBuscar [entidad=0013, oficina=00000, contrato=0000000, saldo=00, feuliq=12231, tea=0.0]"));
	}
	
	
}
