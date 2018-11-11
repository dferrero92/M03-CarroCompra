package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Electronica extends Producto{

    public static void addProductElectronica(){

        Scanner scanner = new Scanner(System.in);

        List<Electronica> listaElectronicos = new ArrayList<Electronica>();
        Electronica electronico = new Electronica();

        int opcion = 1;
        while (opcion == 1){

            System.out.println("Introducir un nuevo producto Electrónico?  1) Sí            0) No ");
            opcion=scanner.nextInt();scanner.nextLine();
            if (opcion==0){
                break;
            }

            if(!listaElectronicos.contains(electronico)){
                System.out.println("Introduce el código de Barras: ");
                electronico.codigoBarras= scanner.nextInt();
                electronico.setCodigoBarras(electronico.codigoBarras);

                listaElectronicos.add(electronico);

            }else{
                Electronica electronicoNew = new Electronica();

                System.out.println("Introduce el código de Barras: ");
                electronicoNew.codigoBarras= scanner.nextInt();
                electronicoNew.setCodigoBarras(electronicoNew.codigoBarras);

                listaElectronicos.add(electronicoNew);
            }


        }


        for (int i = 0; i < listaElectronicos.size() ; i++) {
            System.out.println( "Código de Barras: " + listaElectronicos.get(i).getCodigoBarras());
        }




    }



}
