/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_lista_simple;

/**
 *
 * @author moviles
 */
public class Lista {
    private Nodo inicio;
    private Nodo fin;
    private int cont;
    
    // POR DEFAULT, LA LISTA ESTA VACÌA
    public Lista(){
        this.inicio = null; // NO HAY NODOS EN LA LISTA
        this.fin = null;
        this.cont = 0;
    }
    
    public boolean listaVacia(){
        if(inicio == null){
            return true;
        } else{
            return false;
        }
    }
    
    public void imprimir(){
        if(inicio == null){
            System.out.println("LISTA VACÍA");
        } else{
            Nodo temp = inicio;
            // ¿CÒMO NUEVO A TEMP?
            while(temp != null){
                System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
            }
        }
        System.out.println("");
    }
    
    //AGREGAR UN NODO AL FINAL DE LA LISTA
    public void agregar(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        
        //VERIFICAR SI HAY NODOS EN LA LISTA
        if(inicio == null){ //no hay nodos en la lista
            inicio = nuevoNodo;
            fin = nuevoNodo;
        }else{ //hay nodos en la lista
            // HAY QUE MOVERNOS POR LA LISTA
            // USANDO UN NODO TEMPORAL HASTA EL
            // ÙLTIMO NODO DE LA LISTA
            /*Nodo temp = inicio;
            // ¿CÒMO NUEVO A TEMP?
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);*/
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
        cont++;
    }
    
    public int tamaLista(){
        /*int cont = 0;
        Nodo temp = inicio;
        // ¿CÒMO NUEVO A TEMP?
        while(temp != null){
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;*/
        return this.cont;
    }
    
    public void insertarEn(int valor, int pos) throws Exception{
        int cantNodos = tamaLista();
        // qué debemos validar?
        // insertar en una posiciòn no vàlida
        if(pos < 0)// posiciones negativas
            throw new Exception("No puede insertarse un nodo en una posición negativa");
        else if(pos >= cantNodos)// posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posición válida en la lista");
        else{
            Nodo nuevoNodo = new Nodo(valor);
            if(pos == 0){// insertar al inicio de la lista
                nuevoNodo.setSiguiente(inicio);
                inicio = nuevoNodo;
            } else{
                Nodo temp = inicio;
                int cont = 0;
                while(cont < (pos - 1)){
                    temp = temp.getSiguiente();
                    cont++;
                }
                // Y AHORA?
                nuevoNodo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevoNodo);
                //System.out.println(temp.getValor() + "-");
            }
            this.cont++;
        }
    }
    
    public void vaciarLista(){
        inicio = null;
        fin = null;
        cont = 0;
    }
    
    public void borrarEn(int pos) throws Exception{
        int cantNodos = tamaLista();
        // qué debemos validar?
        // insertar en una posiciòn no vàlida
        if(pos < 0)// posiciones negativas
            throw new Exception("No puede insertarse un nodo en una posición negativa");
        else if(pos >= cantNodos)// posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posición válida en la lista");
        else{
            if(cantNodos == 1){
                vaciarLista();
            }else{
                // borrar el primer nodo (LISTO)
                // borrar nodo intermedio
                // borrar el último nodo
                if(pos == 0){
                    inicio = inicio.getSiguiente();
                }else{
                    Nodo temp = inicio;
                    int cont = 0;
                    while(cont < (pos - 1)){
                        temp = temp.getSiguiente();
                        cont++;
                    }
                    // YA ESTOY EN EL NODO PREVIO
                    Nodo objSig = temp.getSiguiente();
                    temp.setSiguiente(objSig.getSiguiente());
                    if(pos == (cantNodos - 1)){// reconectar a fin
                        fin = temp;
                    }
                }
                this.cont--;
            }
        }
    }
    
    public int obtenValorEn(int pos) throws Exception{
        int cantNodos = tamaLista();
        int valor = 0;
        // qué debemos validar?
        // insertar en una posiciòn no vàlida
        if(pos < 0)// posiciones negativas
            throw new Exception("No puede insertarse un nodo en una posición negativa");
        else if(pos >= cantNodos)// posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posición válida en la lista");
        else{
            Nodo temp = inicio;
            int cont = 0;
            while(cont < pos){// el cambio es aqui ya no es (pos - 1)
                temp = temp.getSiguiente();
                cont++;
            }
            valor = temp.getValor();
        }
        return valor;
    }
    
}
