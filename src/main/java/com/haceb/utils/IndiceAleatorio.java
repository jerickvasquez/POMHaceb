package com.haceb.utils;

import java.util.Random;

public class IndiceAleatorio {

    public static int generarIndiceAleatorio(int tamanoArreglo) {
        Random random = new Random();
        return random.nextInt(tamanoArreglo);
    }
}
