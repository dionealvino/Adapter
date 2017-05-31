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
public class PatoMarreco implements Pato{

    @Override
    public void grasnar() {
        System.out.print("Quack, quack, quack.");
    }
    @Override
    public void voar() {
        System.out.println("Pato voar.");
    }

    @Override
    public void mergulhar() {
        System.out.println("Pato mergulhar.");
    }
    
}
