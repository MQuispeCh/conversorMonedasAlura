package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import javax.swing.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class ConversorMonedas {
    private static final String API_KEY = "ddd3525aa5dedbcb320e3131";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";

    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String jsonResponse = response.body();

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(jsonResponse, JsonObject.class);
        JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");

        String[] monedasDeInteres = {"USD", "EUR", "GBP", "JPY", "CAD", "AUD", "PEN"};
        Map<String, Double> tasasCambio = new HashMap<>();

        for (String moneda : monedasDeInteres) {
            if (rates.has(moneda)) {
                double tasa = rates.get(moneda).getAsDouble();
                tasasCambio.put(moneda, tasa);
            }
        }

        // Solicitar la cantidad al usuario
        String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad a convertir:");
        double cantidad = Double.parseDouble(cantidadStr);

        // Solicitar la moneda de origen
        String monedaOrigen = (String) JOptionPane.showInputDialog(null, "Seleccione la moneda de origen:",
                "Moneda de origen", JOptionPane.QUESTION_MESSAGE, null, monedasDeInteres, monedasDeInteres[0]);

        // Solicitar la moneda de destino
        String monedaDestino = (String) JOptionPane.showInputDialog(null, "Seleccione la moneda de destino:",
                "Moneda de destino", JOptionPane.QUESTION_MESSAGE, null, monedasDeInteres, monedasDeInteres[1]);

        // Realizar la conversión
        double tasaOrigen = tasasCambio.get(monedaOrigen);
        double tasaDestino = tasasCambio.get(monedaDestino);
        double resultado = (cantidad / tasaOrigen) * tasaDestino;

        // Mostrar el resultado
        String mensajeResultado = String.format("%.2f %s = %.2f %s", cantidad, monedaOrigen, resultado, monedaDestino);
        JOptionPane.showMessageDialog(null, mensajeResultado, "Resultado de la conversión", JOptionPane.INFORMATION_MESSAGE);
    }
}