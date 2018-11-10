package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Producto {

    Producto producto = new Producto();
    ArrayList<Alimentacion>listProductosAlimentacion= new ArrayList<>();

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public static void añdirProducto(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Alimentacion>listProducts=new ArrayList<>();
        int op=0;
        System.out.println("Que tipo de producto quiere añadir ??");
        System.out.println("1. Alimentacion   2. Electronica   3. Textil    4. Volver menu principal");
        op=sc.nextInt();

        switch (op){
            case 1 : Alimentacion.addProductAlimencion();
                break;
            case 2 : Electronica.addProductElectronica();
                break;
            case 3 : Textil.addProdutTextil();
                break;
            case 4 : Menu.menuPrincipal();
                break;
        }



    }
}
