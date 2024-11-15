// Exercicio que verifica o nivel de conhecimento de programaçao com base nos anos de experiencia
import java.util.Scanner;

public class ExemploIfElse {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); //Cria um objeto scanner para leiura de entrada do usuário 
        
        System.out.print("Digite quantos anos de experiencia voce possui:");
        int anosDeExperiencia = scanner.nextInt();// Le o nº de anos de experiencia
        if(anosDeExperiencia <2){
        System.out.println("Você é um desenvolvedor junior!");            
        } else if (anosDeExperiencia >= 2 && anosDeExperiencia <5){
            System.out.println("Você é um desenvolvedor pleno!");
        } else {
            System.out.println("Você é um desenvolvedor sênior");
        }
    }
}