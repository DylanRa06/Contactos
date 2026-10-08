package com.krakedev.contacto.test;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

public class TestObtener {
    public static void main(String[] args) {
        Directorio directorio = new Directorio();
        directorio.agregarContacto(crearContacto("Maria", "123456789"));
        directorio.agregarContacto(crearContacto("Juan", "11111111"));
        directorio.agregarContacto(crearContacto("Carlos", "123456734"));
        Contacto contacto = directorio.recuperarContacto(1);
        System.out.println("Nombre: " + contacto.getNombre());
    }
    private static Contacto crearContacto(String nombre, String celular) {
        Contacto contacto = new Contacto(nombre);
        contacto.setCelular(celular);
        return contacto;
    }
}
