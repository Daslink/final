package com.bbva.dpdv.dto.info.test;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;
import com.bbva.cpdv.dto.info.DataOutCarrera;;

public class DataOutCarreraTest {
	DataOutCarrera data = new DataOutCarrera();

	/**
	 * Varaible inizilitations
	 */
	@Before
	public void starning() {
		data.setPan("000000000");
		data.setEntidad("0013");
		data.setCentro("0000");
		data.setProducto("000000000");
		data.setNumeroDeContrato("000000000");
		data.setTitular("Hernan");
		data.setDireccion("Calle 74# 77b-23");
		data.setNumeroDeCuotas("3");
		String array[] = {"0","0","0"};
		data.setCuotasCalculadas(array);
	}

	/**
	 * Method for test the sentence get() - enden ok
	 */
	@Test
	public void getTest() {
		Assert.assertEquals(data.getPan(), "000000000");
		Assert.assertEquals(data.getEntidad(), "0013");
		Assert.assertEquals(data.getCentro(), "0000");
		Assert.assertEquals(data.getProducto(), "000000000");
		Assert.assertEquals(data.getNumeroDeContrato(), "000000000");
		Assert.assertEquals(data.getTitular(), "Hernan");
		Assert.assertEquals(data.getDireccion(), "Calle 74# 77b-23");
		Assert.assertEquals(data.getNumeroDeCuotas(), "3");
		Assert.assertEquals(Arrays.toString(data.getCuotasCalculadas()), "[0, 0, 0]");
	}

	/**
	 * Method for test the sentence hashCode() - enden ok
	 */
	@Test
	public void hashCodeTest() {
		int hashCode = data.hashCode();
		Assert.assertEquals(data.hashCode(), hashCode);
	}

	/**
	 * Method for test the sentence hashCode() - enden fail
	 */
	@Test
	public void hashCodeFailTest() {
		Assert.assertFalse(((Integer) data.hashCode()).equals(1));
	}

	/**
	 * Method for test the sentence hashCode() - enden ok
	 */
	@Test
	public void hashCodeNullTest() {
		DataOutCarrera aux = new DataOutCarrera();
		int hashCode = aux.hashCode();
		Assert.assertEquals(aux.hashCode(), hashCode);
	}

	/**
	 * Method for test the sentence equals() - enden ok
	 */
	@Test
	public void equalsTest() {
		DataOutCarrera aux = new DataOutCarrera();

		// General
		Assert.assertEquals(data.equals(data), true);
		Assert.assertEquals(data.equals(null), false);
		Assert.assertEquals(data.equals("hola"), false);

		// Attributes
		Assert.assertEquals(aux.equals(data), false);
		aux.setCentro(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setCentro(data.getCentro());

		Assert.assertEquals(aux.equals(data), false);
		String array[] = { " " };
		aux.setCuotasCalculadas(array);
		Assert.assertEquals(data.equals(aux), false);
		aux.setCuotasCalculadas(data.getCuotasCalculadas());

		Assert.assertEquals(aux.equals(data), false);
		aux.setDireccion(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setDireccion(data.getDireccion());

		Assert.assertEquals(aux.equals(data), false);
		aux.setEntidad(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setEntidad(data.getEntidad());

		Assert.assertEquals(aux.equals(data), false);
		aux.setNumeroDeContrato(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setNumeroDeContrato(data.getNumeroDeContrato());

		Assert.assertEquals(aux.equals(data), false);
		aux.setNumeroDeCuotas(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setNumeroDeCuotas(data.getNumeroDeCuotas());

		Assert.assertEquals(aux.equals(data), false);
		aux.setPan(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setPan(data.getPan());

		Assert.assertEquals(aux.equals(data), false);
		aux.setProducto(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setProducto(data.getProducto());

		Assert.assertEquals(aux.equals(data), false);
		aux.setTitular(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setTitular(data.getTitular());

		Assert.assertEquals(data.equals(aux), true);
	}

	/**
	 * Method for test the sentence toString() - enden ok
	 */
	@Test
	public void toStringTest() {
		Assert.assertEquals(data.toString(),
				"DataOutCarrera [pan=000000000, entidad=0013, centro=0000, producto=000000000, numeroDeContrato=000000000, titular=Hernan, direccion=Calle 74# 77b-23, numeroDeCuotas=3, cuotasCalculadas=[0, 0, 0]]");
	}

	@Test
	public void toStringFailTest() {
		Assert.assertFalse(data.toString().equals("no"));
	}
}
