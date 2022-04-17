/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Elizabeth Maffei
 */
public class EntidadesCarta {
    private  int carta;
    private String palo;
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


    public int getCarta() {
        return carta;
    }

    public void setCarta(int carta) {
        this.carta = carta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public EntidadesCarta(int carta, String palo) {
        this.carta = carta;
        this.palo = palo;
    }

    public EntidadesCarta() {
    }

}
