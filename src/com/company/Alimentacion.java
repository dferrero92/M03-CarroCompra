package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static java.time.Period.ofDays;

public class Alimentacion extends Producto {

    public static LocalDate dataCaducitat;
    public static DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public static void setDataCaducitat(LocalDate dataCaducitat) {
        Alimentacion.dataCaducitat = dataCaducitat;
    }

    public static LocalDate getDataCaducitat() {
        return dataCaducitat;
    }

    public static long getPeriodo() {

        long p2= ChronoUnit.DAYS.between(LocalDate.now(),getDataCaducitat());

        return p2;
    }






    public static void addProductAlimencion(List<Electronica>listaElectronicos,List<Alimentacion>listaAlimentos,List<Textil>listaTextil){

        Scanner scanner = new Scanner(System.in);
        Alimentacion alimento = new Alimentacion();
        int dias=0;
        int meses=0;
        int anyos=0;
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

                try {

                    alimento.dataCaducitat = LocalDate.parse(scanner.nextLine());
                    alimento.setDataCaducitat(dataCaducitat);
                    listaAlimentos.add(alimento);
                }catch(Exception DatetimeParseException){
                    System.out.println("FORMATO DE FECHA INCORRECTO DEBE SER AÑO-MES-DíAS");
                }

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
                AlimentoNew.dataCaducitat =LocalDate.parse(scanner.nextLine());
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


    public static void pruebahora(){

        System.out.println(getPeriodo());



    }
}