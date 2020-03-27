package com.bbva.cpdv.lib.r003;

import javax.annotation.Resource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.Advised;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bbva.cpdv.dto.info.DataOutCarrera;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/CPDVR003-app.xml",
		"classpath:/META-INF/spring/CPDVR003-app-test.xml",
		"classpath:/META-INF/spring/CPDVR003-arc.xml",
		"classpath:/META-INF/spring/CPDVR003-arc-test.xml" })
public class CPDVR003Test {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(CPDVR003.class);
	
	@Resource(name = "cpdvR003")
	private CPDVR003 cpdvR003;
	
	@Before
	public void setUp() throws Exception {		
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.cpdvR003;
		if(this.cpdvR003 instanceof Advised){
			Advised advised = (Advised) this.cpdvR003;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		try{
		LOGGER.info("Executing the test...");
		DataOutCarrera aux = cpdvR003.execute("BOGOTA", "SOACHA", "4955025695495093", "9");
		Assert.assertEquals(aux.getTitular(), "LAURA VARON CASAS");
		LOGGER.info("Executing enden ok...");
		}catch(Exception e){
			LOGGER.info("Error: Executing..... ");
		}	
	}
}
