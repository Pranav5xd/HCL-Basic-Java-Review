package com.hcl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Connection;

import org.junit.After;
import org.junit.Before;



public class DBTest {
	DBHandler dbh = new DBHandler();
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	private final ByteArrayOutputStream err = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before 
	public void setStreams() {
	    System.setOut(new PrintStream(out));
	    System.setErr(new PrintStream(err));
	}
	
	

	@After
	public void restoreInitialStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	@Test
	public void testDeleteRecord() {
		try (Connection connection = dbh.getConnection()) {
			dbh.createTable();
			dbh.deleteRecord("1");
			assertTrue("Record deleted".equals(out.toString()));

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	@Test
	public void testInsertRecord() {
		try (Connection connection = dbh.getConnection()) {
			dbh.createTable();
			Employee emp = new Employee("Pranav", null, 1, 1);
			dbh.insertRecord(emp);
			assertTrue("Record inserted".equals(out.toString()));

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	@Test
	public void testSelectRecord() {
		try (Connection connection = dbh.getConnection()) {
			dbh.createTable();
			dbh.selectRecord("1");
			assertTrue("Record shown".equals(out.toString()));

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	@Test
	public void testUpdateRecord() {
		try (Connection connection = dbh.getConnection()) {
			dbh.createTable();
			dbh.updateRecord("Age = 5", "EMPID = 1");
			assertTrue("Record updated".equals(out.toString()));

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
}
