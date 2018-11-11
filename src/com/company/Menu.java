package com.company;

import java.util.List;
import java.util.Scanner;

public class Menu {

static final String SUPERMERCAT_NAME="MERCALOMOS";

    public static void menuPrincipal(List<Electronica> listaElectronicos, List<Alimentacion>listaAlimentos, List<Textil>listaTextiles) {
        Scanner sc = new Scanner(System.in);
        int opcio=0;

        System.out.println("**********SUPERMECADO "+ SUPERMERCAT_NAME+"*********");
        System.out.println("Esocge una opcion");
        System.out.println("1.Añadir Producto");
        System.out.println("2.Ver lista de la compra");
        System.out.println("3.Salir GRACIAS POR LA VISTA");
        opcio=sc.nextInt();

        switch(opcio){

            case 1:Producto.añdirProducto(listaElectronicos,listaAlimentos,listaTextiles);
                break;
            case 2:Carrito.mostrarCarro(listaElectronicos,listaAlimentos,listaTextiles);
                break;
        }

    }
}
