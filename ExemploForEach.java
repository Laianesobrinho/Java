// repetição sobre arrays/coleções.
// exercicio percorrendo array de inteiros

public class ExemploForEach {
    public static void main (String[] args) {
        int[] numeros = {1, 2, 3, 4, 5}; //vetor inteiro "numeros"
        for (int numero : numeros) {
            // Lado esquerdo: lado direito
            // lado esquerdo: declara variavel para armazenamento temporario do valor do elemento
            //durante a repetição.
            // Lado direito: é o array/coleção que estamos percorrendo.
            System.out.println(numero);
        }
    }
}