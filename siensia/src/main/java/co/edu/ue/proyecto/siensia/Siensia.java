package co.edu.ue.proyecto.siensia;

import co.edu.ue.proyecto.siensia.utilities.Listas;

import java.util.ArrayList;
import java.util.List;

public class Siensia {

    public static void main(String[] args) {

        Listas listas = new Listas();
        listas.addElements();

        List<Integer> listaUno = listas.primeraLista;
        List<Integer> listaDos = listas.segundaLista;
        List<Integer> listaTres = listas.tercerLista;
        List<Integer> listaCuatro = listas.cuartaLista;
        List<Integer> listaCinco = listas.quintaLista;

        Integer validador = 0;

        /*Lista contenida*/
        listas.listaContenida(listaCuatro, listaCinco);

        /*Lista igual*/
        listas.listaIgual(listaTres, listaCuatro);

        /*Lista semejante*/
        listas.listaSemejante(listaCuatro, listaCinco);

        /*Lista ordenada*/

        listas.listaOrdenada(listaCinco);

        /*Sublista*/

        listas.subLista(listaTres, listaDos);

    }
}
