package com.krakedev.contacto.entidades.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

// Los cuatro casos del tema 18. Se completan las partes no visibles del video.
public class TestDirectorio {
    @Test
    public void testAgregarContactoNuevo() {
        Directorio directorio = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Juan");
        c1.setCelular("0991111111");
        boolean resultado = directorio.agregarContacto(c1);
        assertTrue(resultado);
        assertEquals(1, directorio.obtenerCantidadContactos());
    }

    @Test
    public void testAgregarContactoDuplicado() {
        Directorio directorio = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Juan");
        c1.setCelular("0991111111");
        Contacto c2 = new Contacto();
        c2.setNombre("Maria");
        c2.setCelular("0991111111");
        directorio.agregarContacto(c1);
        boolean resultado = directorio.agregarContacto(c2);
        assertFalse(resultado);
        assertEquals(1, directorio.obtenerCantidadContactos());
    }

    @Test
    public void testVerificarTamanoLista() {
        Directorio directorio = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Juan");
        c1.setCelular("0991111111");
        Contacto c2 = new Contacto();
        c2.setNombre("Maria");
        c2.setCelular("0992222222");
        directorio.agregarContacto(c1);
        directorio.agregarContacto(c2);
        assertEquals(2, directorio.obtenerCantidadContactos());
    }

    @Test
    public void testNoSeAgreganDuplicados() {
        Directorio directorio = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Juan");
        c1.setCelular("0991111111");
        assertTrue(directorio.agregarContacto(c1));
        assertFalse(directorio.agregarContacto(c1));
        Contacto c2 = new Contacto();
        c2.setNombre("Maria");
        c2.setCelular("0991111111");
        assertFalse(directorio.agregarContacto(c2));
        assertFalse(directorio.agregarContacto(c2));
        assertEquals(1, directorio.obtenerCantidadContactos());
    }
}
