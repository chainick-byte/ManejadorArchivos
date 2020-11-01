
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/*
 * clase que lee el archivo y lo plasa en la pantalla...
 */
/**
 *
 * @author igorr
 */
public class FicheroLectura {

    ArrayList<String> fichero = new ArrayList<String>();
    Ruta ruta = new Ruta();

    public ArrayList<String> leerArchivo() {
        String linea;
        String auxiliar = "";
        try {

            BufferedReader br = new BufferedReader(new FileReader(ruta.dameRutaAbrir()));
        for (linea = br.readLine(); linea != null; linea = br.readLine()) {
                fichero.add(linea);
            }
            for (int i = 0; i < fichero.size(); i++) {
                auxiliar = auxiliar + fichero.get(i) + "\n";
                System.out.println(fichero.get(i));
            }
            br.close();
            return fichero;

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        System.out.println("la hemos liado parda");
        return null;

    }

   

}
