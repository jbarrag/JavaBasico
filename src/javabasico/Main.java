/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.util.Iterator;

/**
 *
 * @author jjimen7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      try{  
        
        ListaSimple<String> lista=new ListaSimple("1");
                
        
        
        lista.insertarNodo("2");
        lista.insertarNodo("3");
        lista.insertarNodo("4");
        lista.insertarNodo("5");
        lista.insertarNodo("6");
        lista.insertarNodo("7");
        lista.insertarNodo("8");
        lista.insertarNodo("9");
        lista.insertarNodo("10");
        
          for (String s : lista) {
              System.out.println(s);
          }
        
//        while(lista.hasNext()) {       
//    System.out.println(lista.next()+" Con Iterator");
//        }

        
                 
       
       // lista.listar();
        
        ListaArray<String> listaArray=new ListaArray();
        listaArray.insertar("1");
        listaArray.insertar("2");        
        listaArray.insertar("3");
        listaArray.insertar("4");
        listaArray.insertar("5");        
        listaArray.insertar("6");
        listaArray.insertar("7");
        listaArray.insertar("8");        
        listaArray.insertar("9");
        listaArray.insertar("10");
        listaArray.insertar("11");        
        listaArray.insertar("12");
        listaArray.insertar("13");
        listaArray.insertar("14");        
        listaArray.insertar("15");
        listaArray.insertar("16");
        listaArray.insertar("17");        
        listaArray.insertar("18");
        
        for(String valor:listaArray){
            System.out.println(valor+" Con Iterable");
            
        }
            
            
       
        
      }catch(Exception ex){
          System.out.println(ex.getMessage());
      }
        
    }
}    

