package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import com.google.gson.Gson;

import org.example.models.Animes;
import org.example.models.Datum;




import javax.net.ssl.HttpsURLConnection;

public class LaAPI {
    public static void main(String[] args) {
        // Este este es un ejemolo https://api.jikan.moe/v4/anime?q=Naruto&sfw


        try {

            // URL animes de anruto
            URL url = new URL("https://api.jikan.moe/v4/anime?q=Naruto&sfw");
            // Conexión de la URL de tipo segura
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            // Configuracion del tipo de solisitud (GET, POST, etc.)
            connection.setRequestMethod("GET");
            // Flujo de datos de respuesta por parte de la API
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            // Configuracion del objeto Gson
             Gson gson = new Gson();
            // Deserializa el JSON en un objeto de Animes
             Animes animes = gson.fromJson(response.toString(),Animes.class);

             int i =0;
             for(Datum datum : animes.getData())
                System.out.println(i+++" Titulo: "+datum.getTitle());

            //System.out.println(response.toString()); // Body

        } catch (Exception e) {

            e.printStackTrace();
        }

    }
}