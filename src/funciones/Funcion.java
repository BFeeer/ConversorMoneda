package funciones;

import com.google.gson.Gson;
import modelos.Conversion;
import modelos.TasaCambio;
import modelos.TasaCambioER;

import java.net.http.HttpClient;
import java.util.Scanner;

public class Funcion {
    public static void mostrarOpciones(){
        System.out.print("""
                \n-------- CONVERSIÓN DE DIVISAS --------
                1. Realizar conversión
                2. Divisas soportadas
                3. Ayuda
                4. Salir
                ---------------------------------------
                Opcion:""");
    }

    public static void solicitarDatos(Scanner sc, HttpClient client, Gson gson){
        System.out.println("\n---------- CONVERSIÓN ----------");
        System.out.print("Monto: ");
        double montoDivisaEntrada = sc.nextDouble();
        System.out.print("De: ");
        String codigoDivisaEntrada = sc.next().toUpperCase();
        System.out.print("A: ");
        String codigoDivisaSalida = sc.next().toUpperCase();
        System.out.println("---------------------------------");
        // Construir la url con los datos proporcionados y realizar una petición
        String respuestaJson = Peticion.realizarPeticion(client, codigoDivisaEntrada,codigoDivisaSalida);
        Conversion conversion = new Conversion(new TasaCambio(gson.fromJson(respuestaJson, TasaCambioER.class)), montoDivisaEntrada);
        System.out.println(conversion);
        System.out.println(conversion.getTasaCambio());
    }

    public static void mostrarCodigos(){
        System.out.print("""
                \n---------- DIVISAS SOPORTADAS ----------
                (USD) Dólar estadounidense
                (EUR) Euro
                (GTQ) Quetzal guatemalteco
                (MXN) Peso mexicano
                (ARS) Peso argentino
                (BRL) Real brasileño
                ---------------------------------------
                Pulse una tecla para regresar""");
    }

    public static void mostrarAyuda(){
        System.out.print("""
                \n---------------- AYUDA ----------------
                Para realizar una conversión es necesa-
                rio indicar el monto inicial, el código
                de la divisa de entrada y el código de
                la divisa de salida. Debe seguir el
                siguiente formato
                
                Monto: 1.00     De: USD     A: GTQ
                
                Consulte la sección de divisas para
                obtener los códigos de algunas divisas
                que soporta la aplicación.
                ---------------------------------------
                Pulse una tecla para regresar""");
    }
}
