package com.krakedev.contacto.entidades.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

// Tema 23: cada prueba crea su propio Directorio; solo @Test, sin @BeforeEach.
public class TestDirectorioBusqueda {
    @Test
    public void testBuscarContactoExistente() {
        Directorio directorio = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Juan");
        c1.setCelular("0991111111");
        directorio.agregarContacto(c1);
        Contacto encontrado = directorio.buscarContacto("0991111111");
        assertEquals(c1, encontrado);
        assertEquals("Juan", encontrado.getNombre());
    }

    @Test
    public void testBuscarContactoInexistente() {
        Directorio directorio = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Juan");
        c1.setCelular("0991111111");
        directorio.agregarContacto(c1);
        assertNull(directorio.buscarContacto("0000000000"));
    }

    @Test
    public void testEliminarContactoExistente() {
        Directorio directorio = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Juan");
        c1.setCelular("0991111111");
        Contacto c2 = new Contacto();
        c2.setNombre("Maria");
        c2.setCelular("0992222222");
        directorio.agregarContacto(c1);
        directorio.agregarContacto(c2);
        assertTrue(directorio.eliminarContacto("0991111111"));
        assertNull(directorio.buscarContacto("0991111111"));
        assertEquals(1, directorio.obtenerCantidadContactos());
        assertEquals(c2, directorio.buscarContacto("0992222222"));
    }

    @Test
    public void testEliminarContactoInexistente() {
        Directorio directorio = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Juan");
        c1.setCelular("0991111111");
        directorio.agregarContacto(c1);
        assertFalse(directorio.eliminarContacto("0000000000"));
        assertEquals(1, directorio.obtenerCantidadContactos());
        assertEquals(c1, directorio.buscarContacto("0991111111"));
    }

    @Test
    public void testBuscarContactosCoincidenciaConResultados() {
        Directorio directorio = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Maria");
        c1.setCelular("0991111111");
        Contacto c2 = new Contacto();
        c2.setNombre("Mariana");
        c2.setCelular("0992222222");
        Contacto c3 = new Contacto();
        c3.setNombre("Carlos");
        c3.setCelular("0993333333");
        directorio.agregarContacto(c1);
        directorio.agregarContacto(c2);
        directorio.agregarContacto(c3);
        ArrayList<Contacto> resultados = directorio.buscarContactosCoincidencia("Mar");
        assertEquals(2, resultados.size());
        assertEquals(c1, resultados.get(0));
        assertEquals(c2, resultados.get(1));
        assertEquals(3, directorio.obtenerCantidadContactos());
    }

    @Test
    public void testBuscarContactosCoincidenciaSinResultados() {
        Directorio directorio = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Maria");
        c1.setCelular("0991111111");
        directorio.agregarContacto(c1);
        ArrayList<Contacto> resultados = directorio.buscarContactosCoincidencia("Pedro");
        assertEquals(0, resultados.size());
        // Una subcadena interior no cuenta: el nombre debe empezar por ella.
        assertEquals(0, directorio.buscarContactosCoincidencia("ria").size());
        assertEquals(1, directorio.obtenerCantidadContactos());
    }
}
