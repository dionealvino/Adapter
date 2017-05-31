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

//PeruAdapter implementando Pato, utilizando métodos distintos
public class PeruAdapter implements Pato{
     private Peru peru;

    public PeruAdapter( Peru peru ){
        this.peru = peru;
    }

    @Override
    public void grasnar() {
        peru.soar(); /* MÉTODO DE PERU SENDO UTILIZADO DE FORMA ADAPTADA */
    }

    @Override
    public void voar() {
        peru.voar(); /* IGUALMENTE AQUI */
    }

    @Override
    public void mergulhar() {
        throw new UnsupportedOperationException("Método mergulho() não suportado por Perus"); 
    }
}
