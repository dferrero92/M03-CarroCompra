package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Producto {

    int codigoBarras;
    double precio;
    String nombre;



    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void añdirProducto(List<Electronica>listaElectronicos,List<Alimentacion>listaAlimentos,List<Textil>listaTextil){
        Scanner sc = new Scanner(System.in);

        ArrayList<Alimentacion>listProducts=new ArrayList<>();

        int op=0;
        System.out.println("Que tipo de producto quiere añadir ??");
        System.out.println("1. Alimentacion   2. Electronica   3. Textil    4. Volver menu principal");
        op=sc.nextInt();

        switch (op){
            case 1 : Alimentacion.addProductAlimencion(listaElectronicos,listaAlimentos,listaTextil);
                break;
            case 2 : Electronica.addProductElectronica(listaElectronicos,listaAlimentos,listaTextil);
                break;
            case 3 : Textil.addProdutTextil(listaElectronicos,listaAlimentos,listaTextil);
                break;
            case 4 : Menu.menuPrincipal(listaElectronicos,listaAlimentos,listaTextil);
                break;
        }




    }



    }

