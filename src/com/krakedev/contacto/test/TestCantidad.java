package com.krakedev.contacto.test;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

public class TestCantidad {
    public static void main(String[] args) {
        Directorio directorio = new Directorio();
        System.out.println("Cantidad inicial: " + directorio.contarContactos());
        directorio.agregarContacto(crearContacto("Maria", "123456789"));
        directorio.agregarContacto(crearContacto("Juan", "11111111"));
        System.out.println("Cantidad final: " + directorio.contarContactos());
    }
    private static Contacto crearContacto(String nombre, String celular) {
        Contacto contacto = new Contacto(nombre);
        contacto.setCelular(celular);
        return contacto;
    }
}
