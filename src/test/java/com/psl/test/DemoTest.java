package com.psl.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.psl.entity.Admin;

public class DemoTest {

	@Test
	public void testValidateLogin1() {
		Admin a = new Admin();
		a.setName("jrm");
		a.setPassword("jrm");
		boolean val;
		
		System.out.println(a.getName());
		System.out.println(a.getPassword());
		if(a.getName().equals("jrm") && a.getPassword().equals("jrm")){
			
			val = true;
		}else
		{
			val = false;
		}
		Assert.assertTrue(val);
	}

}
