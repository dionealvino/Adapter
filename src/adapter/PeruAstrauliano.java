/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author dione
 */
public class PeruAstrauliano implements Peru{

    @Override
    public void soar() {
        System.out.println("Brulu, brulu, brulu.");
    }
    @Override
    public void voar() {
        System.out.println("Peru Voar.");
    }
    
}
