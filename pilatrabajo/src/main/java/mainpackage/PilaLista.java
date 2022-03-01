/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpackage;

/**
 *
 * @author juanp
 */
public class PilaLista {
    
    private final Lista lista;
    private int top;

    public PilaLista(Lista lista) {
        this.lista = lista;
        if(lista.c==0){this.top = 0;}else{this.top = lista.c--;}
    }
    
    public boolean push(Object o){
        if(o!=null){
            lista.add(o);
            top++;
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public boolean pop(){
        if(lista.c!=0){
            lista.remove(++top);
            top--;
            return true;
        }
        else{
            return false;
        }
    }
    
    public Nodo pick(){
        if(lista.c!=0){
            return lista.head;
        }
        else{
            return null;
        }
    }
}
