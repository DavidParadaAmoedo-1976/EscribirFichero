package org.davidparada;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EscribirFichero {
    private static final String FIN = "-1";

    private static final Path RUTA_FICHERO = Path.of("salida.txt");

    private EscribirFichero() {
        System.out.println("Iniciando el fichero...");
    }

    public static void main(String[] args) throws IOException {
        List<String> numerosString = leerLineasDelUsuario();
        escribirFichero(RUTA_FICHERO, numerosString);
        System.out.printf("Fichero guardado en: %s%n", RUTA_FICHERO.toAbsolutePath());
        System.out.printf("Líneas escritas: %d%n", numerosString.size());
    }

    private static List<String> leerLineasDelUsuario() {
        System.out.printf("Escribe líneas de texto y pulsa Enter. Escribe \"%s\" para terminar.%n", FIN);

        List<Integer> numeros = new ArrayList<>();

        try (var scanner = new Scanner(System.in, StandardCharsets.UTF_8)) {
            while (scanner.hasNextLine()) {
                String entrada = scanner.nextLine();
                if (FIN.equalsIgnoreCase(entrada)) {
                    break;
                }

                Integer numero = Integer.parseInt(entrada);
                numeros.add(numero);
            }
        }

        return numeros.stream()
                .map(n -> n + "")
                .toList();
    }

    private static void escribirFichero(Path ruta, List<String> numerosString) throws IOException {
        
        int numerosTotal = numerosString.size();
        int sumaNumeros = sumanumeros();
        int numeroMayor = numeroMasGrande();
        int numeroMenor = numeroMasPequeño();
        int numeroMedio = numeroMedio();
        double medianaNumeros = medianaNumeros();
        int modaNumeros = modaNumeros();
        String listadoUnicos = listadoUnicos();
        Files.write(ruta, numerosString);
    }

    private static String listadoUnicos() {
    }

    private static int modaNumeros() {
        return 0;
    }

    private static double medianaNumeros() {
        return 0;
    }

    private static int numeroMedio() {
        return 0;
    }

    private static int numeroMasPequeño() {
        return 0;
    }

    private static int numeroMasGrande() {
        return 0;
    }

    private static int sumanumeros() {
    }
}


