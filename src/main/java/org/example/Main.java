package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leerTeclado=new Scanner(System.in);


        System.out.println("*PEQUEÑO TEATRO*");
        System.out.println("*****************");
        System.out.println("1. agregar obra: ");
        System.out.println("2. mostrar obra: ");
        System.out.println("3. buscar obras por nombre: ");
        System.out.println("4. Modificar costo: ");
        System.out.println("0. Salir");
        System.out.println("******************");



        int opcionElegida;

        ArrayList<HashMap<String,Object>> obras =new ArrayList<>();


        do {
            HashMap<String, Object> obra =new HashMap<>();
            System.out.print("Digita una opcion: ");
            opcionElegida=leerTeclado.nextInt();
            //LIMPIANDO EL BUFFER
            leerTeclado.nextLine();

            if (opcionElegida==1){
                System.out.println("Ingresando una obra");
                System.out.print("Ingresa el nombre de la obra: ");
                String nombreObra =leerTeclado.nextLine();
                System.out.print("ingresa el director de la obra: ");
                String directorObra =leerTeclado.nextLine();
                System.out.print("Ingresa la descripcion de la obra: ");
                String descripcionObra =leerTeclado.nextLine();
                System.out.print("ingresa el genero de la obra: ");
                String generoObra =leerTeclado.nextLine();
                System.out.print("Ingresa el precio de la obra: ");
                int precioObra =leerTeclado.nextInt();
                int idObra =new Random().nextInt(100);
                LocalDate fechaObra = LocalDate.of(2024, 12, 10);


                obra.put("nombre", nombreObra);
                obra.put("director", directorObra);
                obra.put("genero", descripcionObra);
                obra.put("precio", precioObra);
                obra.put("descripcion", descripcionObra);
                obra.put("id", idObra);
                obra.put("fecha fin", fechaObra);


                obras.add(obra);




            } else if (opcionElegida==2) {
                System.out.println("Mostrando el inventario");
                for(HashMap<String,Object>productoAxuliar: obras){
                    System.out.println(productoAxuliar);
                }
            } else if (opcionElegida==3) {
                System.out.println("Buscar obra");
                System.out.println("Ingresa el nombre del obra: ");
                String nombreProducto=leerTeclado.nextLine();


                for(HashMap<String,Object>productoAxuliar: obras){


                    if(nombreProducto.equals(productoAxuliar.get("nombre"))){}
                    System.out.println("obra encontrado");
                    int indiceobra= obras.indexOf("obra encontrado");
                    System.out.println(productoAxuliar.put("nombre", obra.get("nombre")));

                }


            } else if (opcionElegida==4) {
                System.out.println("Modificar obra");
            } else if (opcionElegida==0) {
                System.out.println("Saliendo");
            }else {
                System.out.println("Opcion invalida");
            }

        }while (opcionElegida!=0);


    }
}
