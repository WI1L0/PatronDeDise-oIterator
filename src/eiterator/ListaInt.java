/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eiterator;

/**
 *
 * @author MAWIL
 */
public class ListaInt {
    private int year[];
    private int posicion;
    
    public ListaInt(){
        year = new int[5];
        posicion = 0;
    }
    
    public void agregar(int i){
        year[posicion++] = i;
    }
    
    public ListaIntIterador iterador(){
        return new ListaIntIterador(year);
    }
}
