/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_lista_doble;

/**
 *
 * @author moviles
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int cont;
    
    public ListaDoble(){
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
            nuevoNodo.setPrevio(fin);
            fin = nuevoNodo;
        }
        cont++;
    }
    
    public int tamaLista(){
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
                inicio.setPrevio(nuevoNodo);
                inicio = nuevoNodo;
            } else{
                Nodo temp = inicio;
                int cont = 0;
                while(cont < pos){
                    temp = temp.getSiguiente();
                    cont++;
                }
                // Y AHORA?
                nuevoNodo.setSiguiente(temp);
                nuevoNodo.setPrevio(temp.getPrevio());
                temp.getPrevio().setSiguiente(nuevoNodo);
                temp.setPrevio(nuevoNodo);
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
            if (cantNodos == 1){
                vaciarLista();
            } else {
                if (pos == 0){
                    inicio = inicio.getSiguiente();
                    //inicio.setSiguiente(inicio.getSiguiente().setPrevio(inicio));
                }
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
