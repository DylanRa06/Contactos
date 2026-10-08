package com.krakedev.contacto.test;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

public class TestForEach {
    public static void main(String[] args) {
        Directorio dir = new Directorio();
        String[] nombres = {"Maria", "Juan", "Carlos"};
        String[] numeros = {"11111111", "22222222", "33333333"};
        for (int i = 0; i < nombres.length; i++) {
            Contacto c = new Contacto(nombres[i]);
            c.setCelular(numeros[i]);
            dir.agregarContacto(c);
        }
        for (Contacto c : dir.getContactos()) {
            System.out.println("Nombre: " + c.getNombre());
        }
        Contacto encontrado = dir.buscarContacto("22222222");
        System.out.println("Encontrado: " + encontrado.getNombre());
        System.out.println("Inexistente: " + dir.buscarContacto("99999999"));
    }
}
