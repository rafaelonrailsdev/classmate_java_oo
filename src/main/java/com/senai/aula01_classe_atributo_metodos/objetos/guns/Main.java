package com.senai.aula01_classe_atributo_metodos.objetos.guns;

import com.senai.aula01_classe_atributo_metodos.guns.Guns;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Guns ak47 = new Guns("AK-47",
            "Rifle de Assalto",
            "7.62x39mm",
            30,
            400.0f,
            4.3f,
            "plástico, madeira e ferro",
            "Kalashnikov"

    );

        Guns gun[]= new Guns[3];
        ArrayList gunsList = new ArrayList<>();


    }
}
