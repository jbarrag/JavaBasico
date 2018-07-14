

    
    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author jjimen7
 */
public class ListaSimple<T> implements Iterable<T> {
    
    private Nodo root;
    private Nodo nodoAct;
    private Nodo nodoActualRecorrido;

    public ListaSimple(T objeto) {
        Nodo nodo=new Nodo(objeto);
        this.root = nodo;
        this.nodoAct = nodo;
        this.nodoActualRecorrido=nodo;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    public Nodo getNodoAct() {
        return nodoAct;
    }

    public void setNodoAct(Nodo nodoAct) {
        this.nodoAct = nodoAct;
    }
    
    public void insertarNodo(T objeto) {
        
        
        Nodo nodo=new Nodo(objeto);
       
       this.nodoAct.setNext(nodo);
       this.nodoAct=nodo;
       
    }
    
    public void listar(){
    Nodo nodo=this.root;
        System.out.println(nodo);
    while(nodo.getNext()!=null){
        nodo=nodo.getNext();
        System.out.println(nodo);
    }
    
    }

    public class MyIterator implements  Iterator<T>{
        
        Nodo iterador;

        public MyIterator() {
            this.iterador = iterador;
        }
        
    
    @Override
    public boolean hasNext() {
        
        return iterador != null;
         
    }

    @Override
    public T next() {
        T valor = (T)iterador.getValue();
        iterador =  iterador.getNext();
        return valor;
    }
    }
    
    @Override
    public Iterator iterator() {
        return new MyIterator(); //To change body of generated methods, choose Tools | Templates.
    }
}

