package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Textil extends Producto{
Scanner scanner = new Scanner(System.in);

    public static void addProdutTextil() {
        Scanner scanner = new Scanner(System.in);

        List<Textil> listaTextils = new ArrayList<Textil>();
        Textil textil = new Textil();

int opcion = 1;
while (opcion == 1){

    System.out.println("Introducir un nuevo producto Téxtil?  1) Sí            0) No ");
    opcion=scanner.nextInt();scanner.nextLine();
    if (opcion==0){
        break;
    }

    if(!listaTextils.contains(textil)){
        System.out.println("Introduce el código de Barras: ");
        textil.codigoBarras= scanner.nextInt();
        textil.setCodigoBarras(textil.codigoBarras);

        listaTextils.add(textil);

    }else{
        Textil textilNew = new Textil();

        System.out.println("Introduce el código de Barras: ");
        textilNew.codigoBarras= scanner.nextInt();
        textilNew.setCodigoBarras(textilNew.codigoBarras);

        listaTextils.add(textilNew);
    }


}


        for (int i = 0; i < listaTextils.size() ; i++) {
            System.out.println(listaTextils.get(i).getCodigoBarras());
        }

    }
}
