package com.company;

import javax.xml.soap.Text;
import java.util.ArrayList;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Carrito {



    public static void juntarListas(List<Electronica> listaElectronicos, List<Alimentacion> listaAlimentos, List<Textil> listaTextil){

        List<Object> newList = Stream.concat(listaAlimentos.stream(), listaTextil.stream())
                .collect(Collectors.toList());

        System.out.println(newList);
    }



    public static void mostrarCarro(List<Electronica> listaElectronicos, List<Alimentacion> listaAlimentos, List<Textil> listaTextil) {

        int cantidad = 1;
        int precioTotal=0;


        System.out.println("--------Carro de la compra-----------");

        System.out.println("CANTIDAD  PRODUCTO    PRECIO");
        for (int i = 0; i < listaAlimentos.size(); i++) {
            System.out.println(cantidad + "    X      " + listaAlimentos.get(i).nombre + "      " + listaAlimentos.get(i).precio);

            for (int j = 0; j < listaElectronicos.size(); j++) {
                System.out.println(cantidad + "    X      " + listaElectronicos.get(j).nombre + "      " + listaElectronicos.get(j).precio);

                for (int k = 0; k < listaTextil.size(); k++) {
                    System.out.println(cantidad + "    X      " + listaTextil.get(k).nombre + "      " + listaTextil.get(k).precio);


                    precioTotal = (int) (listaAlimentos.get(i).precio +listaElectronicos.get(j).precio+listaTextil.get(k).precio);
                    System.out.println("Total Productos: " + cantidad + "     " + "Precio Total:" + precioTotal);
                    System.out.println("-------------------------------------");


                }
            }
        }

    }



}

