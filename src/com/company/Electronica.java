package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Electronica extends Producto{

    public static void addProductElectronica(List<Electronica>listaElectronicos,List<Alimentacion>listaAlimentos,List<Textil>listaTextiles){

        Scanner scanner = new Scanner(System.in);
        Electronica electronico = new Electronica();

        int opcion = 1;
        while (opcion == 1){

            System.out.println("Introducir un nuevo producto Electrónico?  1) Sí            0) No ");
            opcion=scanner.nextInt();scanner.nextLine();
            if (opcion==0){
                break;
            }
            boolean igual = true;
                Electronica electronicoNew = new Electronica();

                System.out.println("Introduce el nombre del producto: ");
                electronicoNew.nombre=scanner.nextLine();
                electronicoNew.setNombre(electronicoNew.nombre);

            if(listaElectronicos.contains(electronicoNew.nombre==electronico.nombre)) {
                System.out.println("Articulo con el mismo nombre introducido!!");
                System.out.println("Introduce el código de Barras: ");
                electronico.codigoBarras = scanner.nextInt();
                electronico.setCodigoBarras(electronico.codigoBarras);

            }


            System.out.println("Introduce el código de Barras: ");
                electronicoNew.codigoBarras= scanner.nextInt();
                electronicoNew.setCodigoBarras(electronicoNew.codigoBarras);

                System.out.println("Introduzca el precio: ");
                electronicoNew.precio = scanner.nextFloat();scanner.nextLine();
                electronicoNew.setPrecio(electronicoNew.precio);


                listaElectronicos.add(electronicoNew);


        }

        imprimirListaElectronicos(listaElectronicos);
        getLista_Electronica(listaElectronicos);
        Menu.menuPrincipal(listaElectronicos,listaAlimentos,listaTextiles);

        }
    public static List<Electronica> getLista_Electronica(List<Electronica> listaElectronicos){

        return  listaElectronicos;
    }


    public static void imprimirListaElectronicos(List<Electronica> listaElectronicos){

            System.out.println("Lista Actual de productos de elctronica: ");
            System.out.println("***********************************************");
            for (int i = 0; i < listaElectronicos.size() ; i++) {
                System.out.println( "Nombre: " + listaElectronicos.get(i).getNombre()
                        +"\n"+"Código de Barras: " + listaElectronicos.get(i).getCodigoBarras()
                        +"\n"+"Precio: " + listaElectronicos.get(i).getPrecio());
                System.out.println("***********************************************");

            }

        }
}
