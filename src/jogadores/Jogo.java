package jogadores;
import java.util.Scanner;

public class Jogo {
private int resultado;
private Dado dado1 = new Dado();
private Dado dado2 = new Dado();
private Jogadores jogador1, jogador2;
private Scanner entrada = new Scanner(System.in);
   public void InserirJogador(){
       System.out.println("Jogador1, Qual o seu nome: ");
      jogador1 = new Jogadores (entrada.next());
      
      System.out.println("Jogador2, Qual o seu nome: ");
      jogador2 = new Jogadores (entrada.next());
       
   }     
   
   public void inserirAposta(){
       int aposta;
       do{
       System.out.println(jogador1.getNomejogador() + "Informe sua aposta: ");
       aposta = entrada.nextInt();
   }while (aposta < 2 || aposta > 12 );
       
       do{
       System.out.println(jogador2.getNomejogador() + "Informe sua aposta: ");
       aposta = entrada.nextInt();
        if(aposta == jogador1.getValorAposta()){
            System.out.println("Valor ja escolhido. Tente novamente");
        }
   }while (aposta < 2 || aposta > 12 || aposta== jogador1.getValorAposta());
   
}
   public void jogarDados(){
   dado1.setFace();
   dado2.setFace();
   
   }
   
public void mostrarResultado(){
    resultado = dado1.getFace() + dado2.getFace();
    
    System.out.println("Resultado: "+resultado);
}

public void mostrarVEncedor() {
    if(resultado == jogador1.getValorAposta())
        System.out.println("Jogador1 Venceu a aposta");

    else if(resultado == jogador2.getValorAposta())
        System.out.println("jogador2 venceu a aposta");
    else 
        System.out.println("Computer Venceu");
    
}

   