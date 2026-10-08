package com.krakedev.contacto.test;

public class TestConBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Posicion: " + i);
            if (i == 2) {
                System.out.println("Encontrado; se detiene el ciclo");
                break;
            }
        }
    }
}
