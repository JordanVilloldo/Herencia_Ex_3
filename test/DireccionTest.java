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
public class DireccionTest {
    
    Direccion d;
    
    public DireccionTest() {
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

    @Test
    public void testConstructor() {
        
        d = new Direccion("calle", "ciudad");
        
        assertEquals(d.getCalle(),"calle");
        assertEquals(d.getCiudad(),"ciudad");
        
        
        assertNotEquals(d.getCalle(), "calee");
        assertNotEquals(d.getCiudad(), "calee");
        
    }
    
}
