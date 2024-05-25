package funciones;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Peticion {
    private static final String KEY = "1fdd61c76dc5838140695b21";
    private static String construirUrl(String codigoDivisaEntrada, String codigoDivisaSalida){
        return "https://v6.exchangerate-api.com/v6/"+KEY+"/pair/"+codigoDivisaEntrada+"/"+codigoDivisaSalida;
    }

    public static String realizarPeticion(HttpClient client, String codigoDivisaEntrada, String codigoDivisaSalida){
        String urlPeticion = construirUrl(codigoDivisaEntrada, codigoDivisaSalida);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlPeticion))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            return "Error: "+e;
        }
    }
}
