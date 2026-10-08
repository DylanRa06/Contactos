package com.krakedev.contacto.test;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

public class TestContacto {
    public static void main(String[] args) {
        Contacto contacto = new Contacto();
        System.out.println("Nombre: " + contacto.getNombre());
        contacto.setNombre("Maria");
        Contacto referencia = contacto;
        referencia.setNombre("Juan");
        System.out.println("Nombre: " + contacto.getNombre());
        System.out.println("Mismo objeto: " + (contacto == referencia));
    }
}
