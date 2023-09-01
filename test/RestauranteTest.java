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
public class RestauranteTest {
    
    Restaurante r;
    
    public RestauranteTest() {
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
        r = new Restaurante("a",20);
        
        assertEquals(r.getNombre(),"a");
        assertEquals(r.getCapacidad(),20);
        
        //negative path
        assertNotEquals(r.getNombre(),"as");
        assertNotEquals(r.getCapacidad(),22);
    }
    
}
