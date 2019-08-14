/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogadores;
   
public class Principal {
    public static void main(String[] args){
        Jogo j = new Jogo();
        j.InserirJogador();
        j.inserirAposta();
        j.jogarDados();
        j.mostrarResultado();
        j.mostrarVEncedor();
        
    }
}
