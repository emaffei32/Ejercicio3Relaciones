/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones3;

/**
 *
 * @author Elizabeth Maffei
 */
public class Relaciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // ArrayList<carta> cartas = new ArrayList<>();

        carta c1 = new carta();
        barajaServicios b1 = new barajaServicios();

        b1.cargaCartas(c1);
        b1.barajar();
        b1.darCartas();
        b1.cartasDisponibles();
        b1.darCartas();
        b1.cartasDisponibles();
        b1.cartasMonton();
        b1.cartasDisponibles();

    }
}    
    

