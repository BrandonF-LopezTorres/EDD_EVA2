/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_lista_simple;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moviles
 */
public class EVA2_1_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista miLista = new Lista();
        System.out.println("Cantidad de nodos " + miLista.tamaLista());
        miLista.agregar(10);//0
        miLista.agregar(20);//1
        miLista.agregar(30);//2 //aqui tiene que quedar temp
        miLista.agregar(40);//3<------insercion
        miLista.agregar(50);//4
        miLista.agregar(60);//5
        System.out.println("Cantidad de nodos " + miLista.tamaLista());
        miLista.imprimir();
        try {
            miLista.insertarEn(70, 3);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        miLista.imprimir();
        try {
            miLista.borrarEn(0);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_1_LISTA_SIMPLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Cantidad de nodos " + miLista.tamaLista());
        miLista.imprimir();
        try {
            System.out.println("Valor en 4: " + miLista.obtenValorEn(4));
        } catch (Exception ex) {
            Logger.getLogger(EVA2_1_LISTA_SIMPLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*int[]arreglo = new int [1000000];
            
            for (int i = 0; i < arreglo.length; i++) { // O(N)^2
            miLista.agregar(1000);
            }
        System.out.println("Conteo de nodos: " + miLista.tamaLista());*/
    }
    
}
