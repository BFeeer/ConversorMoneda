import com.google.gson.Gson;
import funciones.Funcion;

import java.net.http.HttpClient;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String opcion;
        Gson gson = new Gson();
        Scanner sc = new Scanner(System.in);
        HttpClient client = HttpClient.newHttpClient();

        do{
            Funcion.mostrarOpciones();
            opcion = sc.next();
            switch (opcion){
                // Caso que realiza la conversión de una divisa a otra
                case "1":
                    Funcion.solicitarDatos(sc,client, gson);
                    break;
                // Caso que muestra la información de las divisas aceptadas
                case "2":
                    Funcion.mostrarCodigos();
                    sc.nextLine();
                    sc.nextLine();
                    break;
                // Caso que muestra información relevante del funcionamiento del conversor
                case "3":
                    Funcion.mostrarAyuda();
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "4":
                    System.out.println("Hasta luego...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(!opcion.equals("4"));
    }
}
