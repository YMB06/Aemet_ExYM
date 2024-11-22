package poo.Aemet_Ex;
import java.util.Random;

public class RegCiudadYM {
    static int NDIASYM = 7; // numero de dias de la semana
        static int TEMPYM = 3; // las veces que muestra temperatura por dia de cada ciudad
        static String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        // array de cada ciudad 
        private String nombre;
        private int tmax;
        private int tmin;
        private int[][] temperaturas;
        
        // Constructor que inicializa los valores y genera las temperaturas
        public RegCiudadYM(String nombre, int tmax, int tmin) {
            this.nombre = nombre;
            this.tmax = tmax = 40;
            this.tmin = tmin = -1;
            this.temperaturas = new int[NDIASYM][TEMPYM];
            generarTemperaturas();
        }
    
    public void generarTemperaturas() {
        Random rand = new Random();
        for (int i = 0; i< NDIASYM; i++){ // recorre dias
            for (int j = 0; j< TEMPYM; j++) {// recorre temperaturas
                temperaturas[i][j] = rand.nextInt((tmax - tmin)+1)+tmin; // Genera un número aleatorio entre 20 y 40
                temperaturas[i][j] = (int) (rand.nextDouble(temperaturas[i][j] * 10.0) / 10.0);
            }
        }
    }
    //Metodo getter
    public String getNombre() {
        return nombre;
    }

    //METODOS FUNCIONALES PARA SACAR LOS DATOS QUE SE SOLICITAN
    //Metodo para mostrar las temperaturas de solo un dia de la semana    
    public int[] getDatosDia(String dia){
        int index = -1; // iniciamos un indice
        for (int i = 0; i<diasSemana.length; i++){
            if (diasSemana[i].equalsIgnoreCase(dia)) {
                index = i;
                break; // sale cuando encuentra el dia de la semana que se le pide
            }
        }
        if (index == -1)
            return null; // el dia no se ha encontrado porque se introduce un dia incorrecto

        int[] datos = new int[3];
        datos[0] = Integer.MIN_VALUE; // sacamos el valor maximo
        datos[1] = Integer.MAX_VALUE; // sacamos el valor minimo
        datos[2] = 0; // sacamos la media
        
        int suma = 0;
    }
    
    // metodos funcionales

    

}
