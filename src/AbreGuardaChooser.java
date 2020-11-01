
import java.io.File;
import javax.swing.JFileChooser;

/*
 * en esta clase se elige un filechooser que se necesita en cada momento
 */

/**
 *
 * @author igorr
 */
public class AbreGuardaChooser {
    
    JFileChooser jfc =new JFileChooser();
    
    public File dameArchivoSeleccionado(){
      return jfc.getSelectedFile();
    }
    
    public int abreChooser(){
        int seleccionar = jfc.showOpenDialog(null);
        
        return seleccionar;
    }
     public int guardaChooser(){
        int seleccionar = jfc.showSaveDialog(null);
        
        return seleccionar;
    }
    public void cancelarSeleccionArchivo(){
         jfc.cancelSelection();
    }
    
    
    
    
    
}
