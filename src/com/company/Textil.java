package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Textil extends Producto {
    Scanner scanner = new Scanner(System.in);

    public static void addProdutTextil(List<Electronica>listaElectronicos,List<Alimentacion>listaAlimentos,List<Textil>listaTextil) {
        Scanner scanner = new Scanner(System.in);
        Textil textil = new Textil();

        int opcion = 1;
        while (opcion == 1) {

            System.out.println("Introducir un nuevo producto Téxtil?  1) Sí            0) No ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion == 0) {
                break;
            }

            if (listaTextil.contains(textil)) {
                System.out.println("Introduce el numero de Barras: ");
                textil.codigoBarras = scanner.nextInt();
                textil.setCodigoBarras(textil.codigoBarras);

                listaTextil.add(textil);

            } else {
                Textil textilNew = new Textil();

                System.out.println("Introduce el nombre del Producto");
                textilNew.nombre = scanner.nextLine();
                textilNew.setNombre(textilNew.nombre);

                System.out.println("Introduce el código de Barras: ");
                textilNew.codigoBarras = scanner.nextInt();
                textilNew.setCodigoBarras(textilNew.codigoBarras);

                System.out.println("Introduce el precio");
                textilNew.precio = scanner.nextDouble();
                textilNew.setPrecio(textilNew.precio);

                listaTextil.add(textilNew);
            }

        }
        imprimirListaTextil(listaTextil);
        getLista_Textil(listaTextil);
        Menu.menuPrincipal(listaElectronicos,listaAlimentos,listaTextil);



    }
    public static List<Textil> getLista_Textil(List<Textil> listaTextil){

        return  listaTextil;
    }

            public static  void  imprimirListaTextil(List<Textil> listaTextil) {
                System.out.println("Lista Actual de Producto Textil: ");
                System.out.println("***********************************************");
                for (int i = 0; i < listaTextil.size(); i++) {
                    System.out.println(listaTextil.get(i).getCodigoBarras());
                    System.out.println( "Nombre: " + listaTextil.get(i).getNombre()
                            +"\n"+"Código de Barras: " + listaTextil.get(i).getCodigoBarras()
                            +"\n"+"Precio: " + listaTextil.get(i).getPrecio());
                    System.out.println("***********************************************");


                }


            }



}