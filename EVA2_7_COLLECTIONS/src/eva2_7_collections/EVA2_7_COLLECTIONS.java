/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author moviles
 */
public class EVA2_7_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LISTA
        LinkedList<String> listaEnlazada = new LinkedList();
        listaEnlazada.add("Hola");
        listaEnlazada.add(" ");
        listaEnlazada.add("Mundo");
        listaEnlazada.add("!!");
        System.out.println("LINKED LIST");
        System.out.println(listaEnlazada);
        System.out.println(listaEnlazada.get(0));
        listaEnlazada.remove();
        System.out.println(listaEnlazada);
        listaEnlazada.addFirst("Hola");
        System.out.println(listaEnlazada);
        for (int i = 0; i < listaEnlazada.size(); i++) {
            System.out.print(listaEnlazada.get(i) + " ");
        }
        //ARARYLIST
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        System.out.println("");
        System.out.println("ARRAY LIST");
        System.out.println(arrayList);
        arrayList.add(2, 250);
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        //QUEUES
        //STACK
        //CONJUNTOS
    }
    
}
