package co.edu.ue.proyecto.taller.utilities;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public List<Integer> primeraLista = new ArrayList<>();
    public List<Integer> segundaLista = new ArrayList<>();
    public List<Integer> tercerLista = new ArrayList<>();
    public List<Integer> cuartaLista = new ArrayList<>();
    public List<Integer> quintaLista = new ArrayList<>();

    public void addElements(){
        /*First*/
        primeraLista.add(1);
        primeraLista.add(3);
        primeraLista.add(5);
        primeraLista.add(7);
        primeraLista.add(9);
        /*Second*/
        segundaLista.add(1);
        segundaLista.add(2);
        segundaLista.add(3);
        segundaLista.add(4);
        segundaLista.add(5);
        segundaLista.add(6);
        segundaLista.add(7);
        segundaLista.add(8);
        segundaLista.add(9);
        /*Third*/
        tercerLista.add(5);
        tercerLista.add(6);
        tercerLista.add(7);
        /*Fourth*/
        cuartaLista.add(5);
        cuartaLista.add(6);
        cuartaLista.add(7);
        /*Fifth*/
        quintaLista.add(6);
        quintaLista.add(5);
        quintaLista.add(7);
    };

    public boolean listaContenida(List<Integer> listaUno, List<Integer> listaDos){
        var validador = 0;
        for(int j = 0; j < listaDos.size(); j++){
            for(int i = 0; i < listaUno.size(); i++){
                  if(listaUno.get(i) == listaDos.get(j)){
                    validador++;
                }
            }
        }
        if(validador == listaUno.size()){
            System.out.println("La lista esta contenida");
            return true;
        } else {
            System.out.println("No está contenida");
            return false;
        }
    }

    public boolean listaIgual(List<Integer> listaUno, List<Integer> listaDos) {
        var validador = 0;

        if(listaUno.size() != listaDos.size()){
            System.out.println("Las listas no son iguales.");
            return false;
        } else {
            for (int i = 0; i < listaUno.size(); i++){
                if(listaUno.get(i).equals(listaDos.get(i))){
                    validador++;
                }
            }
            if(validador == listaUno.size()){
                System.out.println("Las listas son iguales");
                return true;
            } else {
                System.out.println("Las listas no son iguales.");
                return false;
            }
        }
    }

    public void listaSemejante(List<Integer> listaUno, List<Integer> listaDos) {
        var validador = 0;

        if(listaUno.size() != listaDos.size()){
            System.out.println("Las listas no son semejantes.");
        } else {
            for (int i = 0; i < listaUno.size(); i++){
                for (int j = 0; j < listaDos.size(); j++){
                    if(listaUno.get(i).equals(listaDos.get(j))){
                        validador++;
                    }
                }
            }

            if(validador == listaUno.size()){
                System.out.println("Las listas son semejantes");
            } else {
                System.out.println("Las listas no son semejantes.");
            }
        }
    }

    public void listaOrdenada(List<Integer> listaUno) {
        var validador = 0;
        for (int i = 0; i < listaUno.size(); i++){
            if(i != (listaUno.size() - 1)){
                if(listaUno.get(i) < listaUno.get(i+1)){
                    validador++;
                }
            } else if(i == (listaUno.size() - 1)){
                validador++;
            }
        }

        if (validador == listaUno.size()) {
            System.out.println("La lista es ordenada");
        } else {
            System.out.println("Lista desordenada");
        }
    }

    public void subLista(List<Integer> listaUno, List<Integer> listaDos) {
        List<Integer> subLista = new ArrayList<>();

        if(listaContenida(listaUno, listaDos)){
            for(int i = 0; i < listaUno.size(); i++){
                for(int j = 0; j < listaDos.size(); j++){
                    if(listaUno.get(i).equals(listaDos.get(j))){
                        subLista.add(listaDos.get(j));
                    }
                }
            }
            if(listaIgual(listaUno, subLista)){
                System.out.println("La lista es una sublista.");
            } else{
                System.out.println("La lista NO es una sublista");
            }

        } else{
            System.out.println("La lista NO es una sublista");
        }



    }
}
