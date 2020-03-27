package com.bbva.dpdv.dto.info.test;

import org.junit.Before;
import org.junit.Test;
import com.bbva.cpdv.dto.info.DataInBuscar;
import junit.framework.Assert;

public class DataInBuscarTest {
	DataInBuscar data =  new DataInBuscar();
	
	/**
	 * Varaible inizilitations
	 */
	@Before
	public void starning(){
		data.setJson("{Nombre: Hernan}");		
	}
	
	/**
	 * Method for test the sentence get()  - enden ok
	 */
	@Test
	public void getTest(){
		Assert.assertEquals(data.getJson(), "{Nombre: Hernan}");
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
	 * Method for test the sentence hashCode()  - enden fail
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
		DataInBuscar aux = new DataInBuscar();
		int hashCode = aux.hashCode();
		Assert.assertEquals(aux.hashCode(), hashCode);		
	}
	
	/**
	 * Method for test the sentence equals()  - enden ok
	 */
	@Test
	public void equalTest(){
		DataInBuscar aux = new DataInBuscar();
		
		//General
		Assert.assertEquals(data.equals(data), true);
		Assert.assertEquals(data.equals(null), false);
		Assert.assertEquals(data.equals("hola"), false);
		
		//Attributes
		Assert.assertEquals(aux.equals(data), false);
		aux.setJson(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setJson(data.getJson());
		
		Assert.assertEquals(data.equals(aux), true);
	}
	
	/**
	 * Method to test the sentence toString() - ended ok
	 */
	@Test
	public void toStringTest(){
		Assert.assertEquals(data.toString(), "DataInBuscar [json={Nombre: Hernan}]");
	}
	
	/**
	 * Method to test the sentence toString()  - enden fail
	 */
	@Test
	public void toStringFailTest(){
		Assert.assertFalse(data.toString().equals("DataInBuscar [json={Nombre: Jorge}]"));
	}
	

}
