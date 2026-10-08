package com.krakedev.contacto.test;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;
import java.util.ArrayList;

public class TestNullPointer {
    public static void main(String[] args) {
        // Error intencional para practicar Debug.
        ArrayList<Contacto> contactos = null;
        contactos.add(crearContacto("Maria", "123456789"));
        // Correccion: cambiar null por new ArrayList<Contacto>().
    }
    private static Contacto crearContacto(String nombre, String celular) {
        Contacto contacto = new Contacto(nombre);
        contacto.setCelular(celular);
        return contacto;
    }
}
