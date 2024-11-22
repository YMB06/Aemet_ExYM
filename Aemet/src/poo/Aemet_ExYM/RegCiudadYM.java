package poo.Aemet_ExYM;
import java.util.Random;

public class RegCiudadYM {
    static int NDIASYM = 7; // Número de días en la semana
    static int TEMPYM = 3; // Número de muestras de temperatura
    static String[] diasSemanaYM = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

    private String nombreYM;
    private int tmaxYM;
    private int tminYM;
    private int[][] temperaturasYM;

    // Constructor de la clase, inicializa los valores y genera las temperaturas
    public RegCiudadYM(String nombreYM, int tmaxYM, int tminYM) { 
        this.nombreYM = nombreYM; 
        this.tmaxYM = tmaxYM == 0 ? 40 : tmaxYM; // si introducimos 0 se pone el valor por defecto 40
        this.tminYM = tminYM == 0 ? -1 : tminYM;// si ponemos 0 va por defecto
        this.temperaturasYM = new int[NDIASYM][TEMPYM]; 
        generarTemperaturasYM(); }
    // Método para generar las temperaturas aleatorias entre tmax y tmin
    private void generarTemperaturasYM() {
        Random rand = new Random();
        for (int i = 0; i < NDIASYM; i++) {
            for (int j = 0; j < TEMPYM; j++) {
                temperaturasYM[i][j] = rand.nextInt((tmaxYM - tminYM) + 1) + tminYM;
            }
        }
    }

    // Método para obtener el nombre de la ciudad
    public String getNombreYM() {
        return nombreYM;
    }

    // Método para obtener los datos de temperatura de un día específico
    public int[] getDatosDiaYM(String dia) {
        int indexYM = -1;
        for (int i = 0; i < diasSemanaYM.length; i++) {
            if (diasSemanaYM[i].equalsIgnoreCase(dia)) {
                indexYM = i;
                break;
            }
        }
        if (indexYM == -1) return null;

        //array con los datos maximos, minimos y media
        int[] datosYM = new int[3];
        datosYM[0] = Integer.MIN_VALUE; 
        datosYM[1] = Integer.MAX_VALUE; 
        datosYM[2] = 0; 

        int suma = 0;
        for (int temp : temperaturasYM[indexYM]) {
            if (temp > datosYM[0]) datosYM[0] = temp; //Saca el maximo
            if (temp < datosYM[1]) datosYM[1] = temp; //Saca el minimo
            suma += temp;
        }
        datosYM[2] = suma / TEMPYM; // Saca la media
        return datosYM;
    }

    // Método para obtener la temperatura media de un día específico
    public double getTempMediaDiaYM(String diaYM) {
        int indexYM = -1;
        for (int i = 0; i < diasSemanaYM.length; i++) {
            if (diasSemanaYM[i].equalsIgnoreCase(diaYM)) {
                indexYM = i;
                break;
            }
        }
        if (indexYM == -1) return -1;

        int sumaYM = 0;
        for (int tempYM : temperaturasYM[indexYM]) {
            sumaYM += tempYM;
        }
        return (double) sumaYM / TEMPYM;
    }
    
    // Método para mostrar la tabla de temperaturas
    public void mostrarTabla() {
        System.out.println("Ciudad: " + nombreYM);
        for (int i = 0; i < NDIASYM; i++) {
            System.out.print(diasSemanaYM[i] + ": ");
            for (int j = 0; j < TEMPYM; j++) {
                System.out.print(temperaturasYM[i][j] + " ");
            }
            System.out.println();
        }
    }
}