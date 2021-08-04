/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soma.de.variaveis;

/**
 *
 * @author Lucas Daniel Kalbusch
 */
public class SomaDeVariaveis {
// Programa lê a lista de números e confere se os números indicados correspondem
// a resposta dada, caso verdadeiro imprime "Resposta correta", caso incorreto
// imprime "Resposta Incorreta :("
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] ListNum = {2, 4, 6, 8, 10};
        int resp = 10;
        
        if (ListNum [4] + ListNum [2] == resp){
            System.out.println("Resposta Correta!! " + (ListNum [1] + ListNum[2]));
        }
        else
            System.out.println("Resposta incorreta :(");
    }
        }
