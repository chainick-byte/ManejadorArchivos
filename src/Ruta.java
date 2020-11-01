
import java.io.File;
import javax.swing.JFileChooser;

/*
 * esta clase me da la ruta donde vamos a guardar el archivo, metodo arreglapath()convierte
 * \->/
 */
/**
 *
 * @author igorr
 */
public class Ruta {

    String ruta;
    String slash="/";
     //variable auxiliar guarda la ruta del archivo seleccionado
    static String auxiliar="";  
    static int seleccionar;

    public static void setAuxiliar(String auxiliar) {
        Ruta.auxiliar = auxiliar;
    }

    public String getAuxiliar() {
        if(!auxiliar.equals("")){
        return auxiliar;
        }
        return "la estoy cagando";
    }

    public String dameRutaAbrir() {
        
        try{
        AbreGuardaChooser ab=new AbreGuardaChooser();
        seleccionar=ab.abreChooser();
        if ( seleccionar== JFileChooser.APPROVE_OPTION) {

            File file = ab.dameArchivoSeleccionado();
            System.out.println("=====================>"+file.getAbsolutePath());
            ruta = arreglaPath(file.getPath());
            System.out.println("ESTO ES MI RUTA " + ruta);
            auxiliar=ruta;
            return  ruta;
        }
        if (seleccionar == JFileChooser.CANCEL_OPTION) {
            ab.cancelarSeleccionArchivo();
            return "No has seleccionado nada:(";
        }
        }catch(Exception e){
            System.out.println("error: "+e.getMessage());
        } 

        return "Aqui Andamios, mira el metodo dameruta de Ruta";
    }
     public String dameRutaCerrar() {
        try{
        AbreGuardaChooser ab=new AbreGuardaChooser();
        seleccionar=ab.guardaChooser();
        if (seleccionar == JFileChooser.APPROVE_OPTION) {

            File file = ab.dameArchivoSeleccionado();
            ruta = arreglaPath(file.getPath());
            System.out.println("ESTO ES MI RUTA " + ruta);
            auxiliar=ruta;
            return  ruta;
        }
        if (seleccionar == JFileChooser.CANCEL_OPTION) {
            ab.cancelarSeleccionArchivo();
            return "No has seleccionado nada:(";
        }
        }catch(Exception e){
            System.out.println("error: "+e.getMessage());
        } 

        return "Aqui Andamios, mira el metodo dameruta de Ruta";
    }
    public String arreglaPath(String ruta){
        String rutaFinal=ruta;
        for(int i = 0; i<ruta.length()-1;i++){
            if(ruta.charAt(i) == 92 && ruta.charAt(i+1) != 92){
                rutaFinal=rutaFinal.substring(0,i)+slash+ rutaFinal.substring(i+1);
        }
    }
        return rutaFinal;
    }
   
}
