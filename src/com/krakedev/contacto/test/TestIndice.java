package com.krakedev.contacto.test;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

public class TestIndice {
    public static void main(String[] args) {
        // Error intencional: tres contactos ocupan las posiciones 0, 1 y 2.
        Directorio directorio = new Directorio();
        directorio.agregarContacto(crearContacto("Maria", "123456789"));
        directorio.agregarContacto(crearContacto("Juan", "11111111"));
        directorio.agregarContacto(crearContacto("Carlos", "123456734"));
        Contacto contacto = directorio.recuperarContacto(3);
        System.out.println(contacto.getNombre());
        // Correccion: usar una posicion de 0 a contarContactos() - 1.
    }
    private static Contacto crearContacto(String nombre, String celular) {
        Contacto contacto = new Contacto(nombre);
        contacto.setCelular(celular);
        return contacto;
    }
}
