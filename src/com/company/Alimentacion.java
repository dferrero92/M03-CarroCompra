package com.company;

import java.security.MessageDigest;
import java.time.Duration;
import java.time.LocalDate;
import java.util.*;

public class Alimentacion extends Producto {

    public static  Calendar fecha = Calendar.getInstance();
    public static String dataCaducitat;


    public static void addProductAlimencion(List<Electronica>listaElectronicos,List<Alimentacion>listaAlimentos,List<Textil>listaTextil){

        Scanner scanner = new Scanner(System.in);

        Alimentacion alimento = new Alimentacion();

        int opcion = 1;
        while (opcion == 1){

            System.out.println("Introducir un nuevo Alimento?  1) Sí            0) No ");
            opcion=scanner.nextInt();scanner.nextLine();
            if (opcion==0){
                break;
            }

            if(!listaAlimentos.contains(alimento)){

                System.out.println("Introduce el nombre del producto: ");
                alimento.nombre=scanner.nextLine();
                alimento.setNombre(alimento.nombre);

                System.out.println("Introduce el código de Barras: ");
                alimento.codigoBarras= scanner.nextInt();
                alimento.setCodigoBarras(alimento.codigoBarras);

                System.out.println("Introduzca el precio: ");
                alimento.precio = scanner.nextFloat();scanner.nextLine();
                alimento.setPrecio(alimento.precio);

                System.out.println("Introduzca fecha de Caducidad: ");
                alimento.dataCaducitat =scanner.nextLine();
                alimento.setDataCaducitat(alimento.dataCaducitat);





                listaAlimentos.add(alimento);

            }else{

                Alimentacion AlimentoNew = new Alimentacion();

                System.out.println("Introduce el nombre del producto: ");
                AlimentoNew.nombre=scanner.nextLine();
                AlimentoNew.setNombre(AlimentoNew.nombre);

                System.out.println("Introduce el código de Barras: ");
                AlimentoNew.codigoBarras= scanner.nextInt();
                AlimentoNew.setCodigoBarras(AlimentoNew.codigoBarras);

                System.out.println("Introduzca el precio: ");
                AlimentoNew.precio = scanner.nextFloat();scanner.nextLine();
                AlimentoNew.setPrecio(AlimentoNew.precio);

                System.out.println("Introduzca fecha de Caducidad: ");
                AlimentoNew.dataCaducitat =scanner.nextLine();
                AlimentoNew.setDataCaducitat(AlimentoNew.dataCaducitat);

               listaAlimentos.add(AlimentoNew);
            }


        }

        //

        imprimirListaAlimentos(listaAlimentos);


        getLista_Alimentos(listaAlimentos);

        Menu.menuPrincipal(listaElectronicos,listaAlimentos,listaTextil);

    }

      // Método Para tener la lista de Alimentos Pasada y poder usarla en otros  metodos. (creo xD)

    public static List<Alimentacion> getLista_Alimentos(List<Alimentacion> listaAlimentos){

        return  listaAlimentos;
    }

    public static void imprimirListaAlimentos(List<Alimentacion> listaAlimentos){

        System.out.println("Lista Actual de Alimentos: ");
        System.out.println("***********************************************");
        for (int i = 0; i < listaAlimentos.size() ; i++) {
            System.out.println( "Nombre: " + listaAlimentos.get(i).getNombre()
                    +"\n"+"Código de Barras: " + listaAlimentos.get(i).getCodigoBarras()
                    +"\n"+"Precio: " + listaAlimentos.get(i).getPrecio()
                    +"\n"+ "Fecha de Caducidad: " + listaAlimentos.get(i).getDataCaducitat());
            System.out.println("***********************************************");

        }




        }





    public String getDataCaducitat() {
        return dataCaducitat;
    }

    public void setDataCaducitat(String dataCaducitat) {
        this.dataCaducitat = dataCaducitat;
    }

    public static void pruebahora(){

        fecha.set(2001,0,1);
        LocalDate fechaahora = LocalDate.now();

        System.out.println(fechaahora);

    }
}