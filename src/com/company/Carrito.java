package com.company;

import javax.xml.soap.Text;
import java.util.ArrayList;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Carrito {


    public static void juntarListas(List<Electronica> listaElectronicos, List<Alimentacion> listaAlimentos, List<Textil> listaTextil) {

        List<Object> newList = Stream.concat(listaAlimentos.stream(), listaTextil.stream())
                .collect(Collectors.toList());

        System.out.println(newList);
    }


    public static void mostrarCarro(List<Electronica> listaElectronicos, List<Alimentacion> listaAlimentos, List<Textil> listaTextil) {

        int cantidad = 1;

        double precioTotal = 0;
        double precioTotalAlimentos=0;
        double precioTotalElectronica=0;
        double precioTotalTextil=0;


        System.out.println("--------Carro de la compra-----------");

        System.out.println("CANTIDAD  PRODUCTO    PRECIO");
        System.out.println("*******************************");

        generarListaAlimentos(listaAlimentos, precioTotalAlimentos);
        for (int i = 0; i <listaAlimentos.size() ; i++) {
            precioTotalAlimentos= precioTotalAlimentos + listaAlimentos.get(i).getPrecio();
        }
        System.out.println("Precio Total de Alimentos: " + precioTotalAlimentos);
        System.out.println("*********************************");
        generarListaElectronicos(listaElectronicos, precioTotalElectronica);
        for (int i = 0; i <listaElectronicos.size() ; i++) {
            precioTotalElectronica= precioTotalElectronica + listaElectronicos.get(i).getPrecio();
        }
        System.out.println("Precio Total de Electronicos: "+ precioTotalElectronica);
        System.out.println("*********************************");

        generarListaTextiles(listaTextil, precioTotalTextil);
        for (int i = 0; i <listaTextil.size() ; i++) {
            precioTotalTextil= precioTotalTextil + listaTextil.get(i).getPrecio();
        }
        System.out.println("Precio Total de Textil: "+ precioTotalTextil);
        System.out.println("*********************************");
        System.out.println("--------------------------------");

        precioTotal = precioTotalAlimentos + precioTotalElectronica + precioTotalTextil;

        System.out.println("PRECIO TOTAL DEL CARRITO: " + precioTotal);



    }


    public static void generarListaAlimentos(List<Alimentacion> listaAlimentos, double precioTotalAlimentos) {
        int cantidad = 1;
        // double precioTotalAlimentos=0;

        if (listaAlimentos.isEmpty()) {
            System.out.println("No hay Alimentos");
        } else {

            for (int i = 0; i < listaAlimentos.size(); i++) {
                System.out.println(cantidad + "    X      " + listaAlimentos.get(i).nombre + "      " + listaAlimentos.get(i).precio);
                precioTotalAlimentos = precioTotalAlimentos + listaAlimentos.get(i).precio;
            }
        }

    }

    public static void generarListaElectronicos(List<Electronica> listaElectronicos, double precioTotalElectronicos) {
        int cantidad = 1;
        if (listaElectronicos.isEmpty()) {
            System.out.println("No hay productos Electrónicos");
        } else {

            for (int i = 0; i < listaElectronicos.size(); i++) {
                System.out.println(cantidad + "    X      " + listaElectronicos.get(i).nombre + "      " + listaElectronicos.get(i).precio);
                precioTotalElectronicos = precioTotalElectronicos + listaElectronicos.get(i).precio;
            }
        }
    }
    public static void generarListaTextiles(List<Textil> listaTextiles, double precioTotalTextiles) {
        int cantidad = 1;

        if (listaTextiles.isEmpty()) {
            System.out.println("No hay productos Textiles");
            precioTotalTextiles = 0;
        } else {

            for (int i = 0; i < listaTextiles.size(); i++) {
                System.out.println(cantidad + "    X      " + listaTextiles.get(i).nombre + "      " + listaTextiles.get(i).precio);
                precioTotalTextiles = precioTotalTextiles + listaTextiles.get(i).precio;
            }
        }
    }

}