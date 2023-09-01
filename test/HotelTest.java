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
    
    Restaurante r;

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
        Hotel h = new HotelImpl();
        r = new Restaurante("nombre", 29);
        /*
        PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
         */
        
        
        //50 + 1 + 10 + 50 + 15 = 126
        assertEquals(h.precioHabitacion(1, h.valorRestaurante(r), h.valorGimnasio(Gimnasio.A), h.valorLimosina(1)),126);
        
        //Negativo
        assertNotEquals(h.precioHabitacion(1, h.valorRestaurante(r), h.valorGimnasio(Gimnasio.A), h.valorLimosina(1)),120);
    }

    /**
     * Test of valorRestaurante method, of class Hotel.
     */
    @Test
    public void testValorRestaurante() {
        System.out.println("valorRestaurante");
        //29 30 40 50 51
        mockHotel h = new mockHotel();

        //29
        r = new Restaurante("nombre", 29);
        assertEquals(h.valorRestaurante(r), 10);
        //negativo
        assertEquals(h.valorRestaurante(r), 70);

        //30
        r.setCapacidad(30);
        assertEquals(h.valorRestaurante(r), 30);

        //40
        r.setCapacidad(40);
        assertEquals(h.valorRestaurante(r), 30);

        //50
        r.setCapacidad(50);
        assertEquals(h.valorRestaurante(r), 50);

        //51
        r.setCapacidad(51);
        assertEquals(h.valorRestaurante(r), 50);

    }

    /**
     * Test of valorGimnasio method, of class Hotel.
     */
    @Test
    public void testValorGimnasio() {
        System.out.println("valorGimnasio");
        mockHotel h = new mockHotel();

        //50 A , 30 B
        //50 A
        assertEquals(h.valorGimnasio(Gimnasio.A), 50);
        //Negativo
        assertNotEquals(h.valorGimnasio(Gimnasio.A), 30);

        //30 B
        assertEquals(h.valorGimnasio(Gimnasio.B), 30);
        //negativo
        assertNotEquals(h.valorGimnasio(Gimnasio.B), 50);

    }

    /**
     * Test of valorLimosina method, of class Hotel.
     */
    @Test
    public void testValorLimosina() {
        System.out.println("valorLimosina");
        mockHotel h = new mockHotel();

        assertEquals(h.valorLimosina(0), 0);
        assertEquals(h.valorLimosina(1), 15);
        assertEquals(h.valorLimosina(5), 75);
        assertEquals(h.valorLimosina(-3), 0);

    }

    public class HotelImpl extends Hotel {
    }

}
