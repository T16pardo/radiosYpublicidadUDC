
package co.edu.ude.poo.radioypublicidadUDC;

import co.edu.ude.poo.radioypublicidadUDC.vistas.vistaPrincipal;

/**
 *
 * @author thalma
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // System.out.println("prueba");
        
         vistaPrincipal  vistas = new vistaPrincipal();
       // vistas.setLocationRelativeTo(null);
       vistas.setExtendedState(vistaPrincipal.MAXIMIZED_BOTH);
        vistas.setVisible(true);
    }
    
}
