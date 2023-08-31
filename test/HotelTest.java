/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan
 */
public class HotelTest {
    
    public HotelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of precioHabitacion method, of class Hotel.
     */
    @Test
    public void testPrecioHabitacion() {
        System.out.println("precioHabitacion");
        Hotel instance = new HotelImpl();
        int expResult = 0;
        int result = instance.precioHabitacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valorRestaurante method, of class Hotel.
     */
    @Test
    public void testValorRestaurante() {
        System.out.println("valorRestaurante");
        
        Restaurante r = new Restaurante("nombre",10);
        Hotel h = new Hotel();
        
        Hotel instance = new HotelImpl();
        
        int expResult = 0;
        int result = instance.valorRestaurante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valorGimnasio method, of class Hotel.
     */
    @Test
    public void testValorGimnasio() {
        System.out.println("valorGimnasio");
        Hotel instance = new HotelImpl();
        int expResult = 0;
        int result = instance.valorGimnasio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valorLimosina method, of class Hotel.
     */
    @Test
    public void testValorLimosina() {
        System.out.println("valorLimosina");
        Hotel instance = new HotelImpl();
        int expResult = 0;
        int result = instance.valorLimosina();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HotelImpl extends Hotel {
    }
    
}
