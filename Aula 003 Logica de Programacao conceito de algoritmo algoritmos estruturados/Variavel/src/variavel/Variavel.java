/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variavel;
/**
 *
 * @author azlin
 */
public class Variavel {
    int a = 6;
    int b = 7;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Variavel Val = new Variavel();
        String str1 = "Ola mundo   ";
        String str2 = "Ola mundo \n";
        int[] ListNum = {1, 2, 3, 4, 6, 8, 10,};
        int resp = 11;
    
        System.out.print(str1);
        System.out.println(str2);
        System.out.println(str2 + str1);
        System.out.printf("Soma da variveis a e b = %d \n", (Val.a + Val.b));
         if (ListNum[0]+ListNum[6] == resp){
            System.out.print("Resposta correta " + (ListNum[6] + ListNum[0]));
         }
         else{
            System.out.print("Resposta incorreta");
         }
    }
}
