package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Hola Dani
        List<Electronica> listaElectronicos=new ArrayList<>();
        List<Alimentacion>listaAlimentos=new ArrayList<>();
        List<Textil>listaTextil= new ArrayList<>();
        Menu.menuPrincipal(listaElectronicos,listaAlimentos,listaTextil);
    }
}
