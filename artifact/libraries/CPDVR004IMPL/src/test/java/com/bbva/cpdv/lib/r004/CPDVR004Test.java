package com.bbva.cpdv.lib.r004;

import java.io.IOException;

import javax.annotation.Resource;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.Advised;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bbva.cpdv.dto.info.DataOutBuscar;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/CPDVR004-app.xml",
		"classpath:/META-INF/spring/CPDVR004-app-test.xml",
		"classpath:/META-INF/spring/CPDVR004-arc.xml",
		"classpath:/META-INF/spring/CPDVR004-arc-test.xml" })
public class CPDVR004Test {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(CPDVR004.class);
	
	@Resource(name = "cpdvR004")
	private CPDVR004 cpdvR004;
	
	@Before
	public void setUp() throws Exception {		
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.cpdvR004;
		if(this.cpdvR004 instanceof Advised){
			Advised advised = (Advised) this.cpdvR004;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		try{
		LOGGER.info("Executing the test...");
		DataOutBuscar aux = cpdvR004.execute("C:\\Users\\hdramos\\Downloads\\IDE_APX_win64\\IDE_APX_win64\\workspace\\UF_PagoDeViaje_CPDV\\LAURA VARON CASAS.json");
		Assert.assertEquals(aux.getContrato(), "92164508");
	}catch(Exception  e){
		LOGGER.info("Error: Executing..." +e );
		}
	}
	
}
