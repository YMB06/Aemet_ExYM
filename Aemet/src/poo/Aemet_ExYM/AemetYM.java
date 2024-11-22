package poo.Aemet_ExYM;
import java.util.Scanner;
import java.util.Random;

public class AemetYM {
    static int NCIUDADESYM = 8; // Número de ciudades
    static String[] nombresYM = {"Almeria", "Sevilla", "Granada", "Fuengirola", "Cadiz", "Jaen", "Cordoba", "Malaga"};
    static RegCiudad[] registroTempYM = new RegCiudad[NCIUDADESYM];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GenerarRegistroTempYM(); // Generar el registro de temperaturas
        ListarRegistroTempYM(); // Listar el registro de temperaturas
        // Obtener la temperatura media de un día específico
        System.out.print("Introduce el día de la semana para obtener la temperatura media en Andalucía: ");
        String diaYM = sc.nextLine();
        double tempMediaYM = getTempMediaDiaYM(diaYM);
        System.out.println("Temperatura media en Andalucía el " + diaYM + ": " + tempMediaYM);
    }

    // Método para generar el registro de temperaturas
    public static void GenerarRegistroTempYM() {
        for (int i = 0; i < NCIUDADESYM; i++) {
            System.out.print("Introduce la temperatura máxima para " + nombresYM[i] + ": ");
            int tmax = sc.nextInt();
            System.out.print("Introduce la temperatura mínima para " + nombresYM[i] + ": ");
            int tmin = sc.nextInt();
            registroTempYM[i] = new RegCiudad(nombresYM[i], tmax, tmin);
        }
    }

    // Método para listar el registro de temperaturas
    public static void ListarRegistroTempYM() {
        for (RegCiudad ciudadYM : registroTempYM) {
            ciudadYM.mostrarTabla();
        }
    }

    // Método para obtener la temperatura media en Andalucía en un día específico
    public static double getTempMediaDiaYM(String diaYM) {
        double sumaTempYM = 0; 
        int countYM = 0;

        for (RegCiudad ciudadYM : registroTempYM) {
            sumaTempYM += ciudadYM.getTempMediaDiaYM(diaYM);
            countYM++;
        }
        return sumaTempYM / countYM;
    }
}

