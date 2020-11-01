
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

/*
 *Aqui se escribe el texto dela pantalla en el archivo correspondiente, hay dos 
 *metodos uno es para escribir en el achivo donde ya se ha seleccionado la ruta previamente 
 *otro para guardar el texto en el archivo nuevo
 */

/**
 *
 * @author igorr
 */
public class FicheroEscritura {

    List<String> arrayDeTextoPantalla;
    Ruta ruta = new Ruta();
    FicheroLectura fs = new FicheroLectura();

    public void escriboMismoArchivo(List<String> arrayDeTextoPantalla) {
        String path = ruta.getAuxiliar();
        System.out.println("RUTA QUE RECIBO DEL METODO: " + path);
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (int i = 0; i < arrayDeTextoPantalla.size(); i++) {
                bw.write(arrayDeTextoPantalla.get(i));
                bw.newLine();
            }
            bw.close();

        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }

    }

    public void escriboNuevoArchivo(List<String> arrayDeTextoPantalla) {
        String path = ruta.dameRutaCerrar();
        System.out.println("RUTA QUE RECIBO DEL METODO: " + path);
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (int i = 0; i < arrayDeTextoPantalla.size(); i++) {
                bw.write(arrayDeTextoPantalla.get(i));
                bw.newLine();
            }
            bw.close();

        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }

    }

}
