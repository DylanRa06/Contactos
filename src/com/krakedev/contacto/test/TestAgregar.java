package com.krakedev.contacto.test;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

public class TestAgregar {
    public static void main(String[] args) {
        Directorio directorio = new Directorio();
        Contacto contacto = crearContacto("Maria", "123456789");
        directorio.agregarContacto(contacto);
        System.out.println("Cantidad: " + directorio.contarContactos());
        System.out.println("Misma referencia: " + (contacto == directorio.recuperarContacto(0)));
    }
    private static Contacto crearContacto(String nombre, String celular) {
        Contacto contacto = new Contacto(nombre);
        contacto.setCelular(celular);
        return contacto;
    }
}
