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
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PatoMarreco pm = new PatoMarreco();
        PeruAstrauliano pr = new PeruAstrauliano();
         PeruAdapter peruAdapter = new PeruAdapter( pr );
        Pato[] patos = {pm, peruAdapter};

        for( Pato p : patos ){
            p.grasnar();
            System.out.println();
            p.voar();
            System.out.println();
            p.mergulhar();
            System.out.println();
        }
    }
    
}
