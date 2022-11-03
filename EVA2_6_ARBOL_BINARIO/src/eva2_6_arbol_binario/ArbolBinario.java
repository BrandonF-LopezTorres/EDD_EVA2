/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_arbol_binario;

/**
 *
 * @author moviles
 */
public class ArbolBinario {
    private Nodo root;

    public ArbolBinario() {
        this.root = null;
    }
    
    //Metodo publico para el usuario
    public void agregar(int valor){
        
        
        if(root == null){
            root = new Nodo(valor);
        } else {
            agregarRecur(valor, root);
        }
    }
    
    //Metodo recursivo agregar, necesita el valor y el nodo actual    
    private void agregarRecur(int valor, Nodo nodoActual){
        //1 Que el inicio recibido es null
        //Arbol vacio
        //2 decidir si va a izq o der
        /*
        verificar si el lado (nodo) es null, si es null, ahi va el valor.
        si no repetir recursion
        */
        Nodo nuevo = new Nodo(valor);
        if(valor < nodoActual.getValor()){ //va a la izq
            if(nodoActual.getIzquierda() == null){
                nodoActual.setIzquierda(nuevo);
            } else {
                agregarRecur(valor, nodoActual.getIzquierda());
            }
        } else if(valor > nodoActual.getValor()) { //Va a la der
            if(nodoActual.getDerecha()== null){
                nodoActual.setDerecha(nuevo);
            } else {
                agregarRecur(valor, nodoActual.getDerecha());
            }
        } else { //Igual
            //Ignorar
            System.out.println("ELEMENTO REPETIDO");
        }
    }
    
    //In order
    //Valor, Derecha
    //Metodo publico, metodo privado recursivo
    
    public void inOrder(){
        inOrderRecu(root);
        System.out.println("");
    }
    
    private void inOrderRecu(Nodo nodo){
        if (nodo != null){
            inOrderRecu(nodo.getIzquierda());
            System.out.print(nodo.getValor() + " - ");
            inOrderRecu(nodo.getDerecha());
        }
    }
    
    public void postOrder(){
        postOrderRecu(root);
        System.out.println("");
    }
    
    private void postOrderRecu(Nodo nodo){
        if (nodo != null){
            postOrderRecu(nodo.getIzquierda());            
            postOrderRecu(nodo.getDerecha());
            System.out.print(nodo.getValor() + " - ");
        }
    }
    
    public void preOrder(){
        preOrderRecu(root);
        System.out.println("");
    }
    
    private void preOrderRecu(Nodo nodo){
        if (nodo != null){
            System.out.print(nodo.getValor() + " - ");
            preOrderRecu(nodo.getIzquierda());            
            preOrderRecu(nodo.getDerecha());            
        }
    }
    
    //COMO BORRAMOS NODOS
}
