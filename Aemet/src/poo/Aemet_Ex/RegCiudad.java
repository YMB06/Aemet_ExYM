package poo.Aemet_Ex;

import java.util.Scanner;

public class RegCiudad {
    
    Scanner scanner = new Scanner(System.in);

    // Constantes para el número de ciudades y estaciones
    private static final int NDIASYM = 5;
    private static final int NTEMPYM = 3;
    String nombre;
    int tmax, min;
    // Array con los nombres de las ciudades
    // Array con los nombres de las estaciones
    private static final String[] diasSemana = { "Invierno", "Primavera", "Verano", "Otoño" };



}
//Se pretende llevar el registro semanal de temperaturas 
//de cada ciudad andaluza. De cada ciudad se toman tres 
//muestras de temperatura enteras entre dos valores Vmax y Vmin solicitados por teclado.

/*se usan los metodos Aemet: 
 * int NCIUDADES = 8
 * nombres = ("Almeria", "Sevilla", "Granada", "Fuengirola", "Cadiz", "Jaen", "Cordoba", "Malaga")
 * registroTemp: RegCiudad(8)
 * generarregistrotemp
 * listarregistrotemp
 * 
 * Regciudad
 * int NDIAS = 7;
 * int TEMP = 3;
 * int tmax, tmin
 * diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"}
 * 
 * constructores
 * getters/setters
 * mostrarTabla
 * metodosFuncionales
 */