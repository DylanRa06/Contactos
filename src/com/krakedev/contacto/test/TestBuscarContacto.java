package com.krakedev.contacto.test;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

public class TestBuscarContacto {
    public static void main(String[] args) {
        Directorio dir = new Directorio();
        Contacto c1 = new Contacto();
        c1.setNombre("Maria");
        c1.setCelular("123456789");
        Contacto c2 = new Contacto();
        c2.setNombre("Juan");
        c2.setCelular("11111111");
        Contacto c3 = new Contacto();
        c3.setNombre("Carlos");
        c3.setCelular("123456734");
        dir.agregarContacto(c1);
        dir.agregarContacto(c2);
        dir.agregarContacto(c3);
        Contacto encontrado = dir.buscarContacto("123456789");
        if (encontrado != null) {
            System.out.println("Nombre: " + encontrado.getNombre());
        } else {
            System.out.println("No existe");
        }
        Contacto noEncontrado = dir.buscarContacto("1231cccd");
        if (noEncontrado != null) {
            System.out.println("Nombre: " + noEncontrado.getNombre());
        } else {
            System.out.println("No existe la persona con ese número");
        }
    }
}
