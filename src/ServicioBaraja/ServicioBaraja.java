/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioBaraja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Elizabeth Maffei
 */
public class ServicioBaraja {
     int cant = 0;
    int aux = 0;
    private ArrayList<carta> cartas = new ArrayList<>();
    private ArrayList<carta> eliminadas = new ArrayList<>();
    private carta carta;

    public void cargaCartas(carta e) {

        for (int i = 1; i < 13; i++) {
            e = new carta(i, "Oro");
            cartas.add(e);
            if (i == 8 || i == 9) {
                cartas.remove(e);
            }
        }
        for (int i = 1; i < 13; i++) {
            e = new carta(i, "Espada");
            cartas.add(e);
            if (i == 8 || i == 9) {
                cartas.remove(e);
            }
        }

        for (int i = 1; i < 13; i++) {
            e = new carta(i, "Basto");
            cartas.add(e);
            if (i == 8 || i == 9) {
                cartas.remove(e);
            }
        }

        for (int i = 1; i < 13; i++) {
            e = new carta(i, "Copa");
            cartas.add(e);
            if (i == 8 || i == 9) {
                cartas.remove(e);
            }
        }
        System.out.println(cartas.toString());

    }

    public void barajar() {
        Collections.shuffle(cartas);
        System.out.println(cartas.toString());
    }

    public void siguienteCarta() {
        if (aux == 40) {
            System.out.println("no hay mas cartas en el mazo");
        } else {
            System.out.println(cartas.get(aux));
            aux++;
        }
    }

    public int cartasDisponibles() {
        System.out.println("las cartas disponibles son " + cartas.size());
        return cartas.size();
    }

    public void darCartas() {

        Scanner leer = new Scanner(System.in);
        System.out.println("cuantas cartas quiere: ");
        cant = leer.nextInt();

        if (cartas.size() < cant) {
            System.out.println("ingrese una cantidad menor de cartas");

        } else {
            Iterator it = cartas.iterator();
            while (it.hasNext() && cant > 0) {
                cant--;
                carta c1 = (carta) it.next();
                System.out.println(c1.toString());
                eliminadas.add(c1);
                it.remove();

            }

        }
    }

    public void cartasMonton() {
        if (eliminadas.size() > 0) {
            System.out.println("Las cartas eliminadas son : " + eliminadas.toString());
        } else {
            System.out.println("no hay cartas eliminadas");
        }
    }

    public void mostrarMazo() {
        System.out.println(cartas.toString());
    }

}

