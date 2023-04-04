package revisando.java;

import static java.lang.Integer.parseInt;
import java.util.Scanner;
import javax.swing.JOptionPane;

//Aulas dio
// Qdo o atributo for de letra minuscula o valor dele n atelra mais fica EXEMPLO : final int AA
//String resultado= a==b ?"verdadeiro" : "falso";   -- uma condicao IF com esses dados!  
// ex1.equals(ex2); método equals q compara os 2 atributos se sao iguais
public class RevisandoJAVA {

    public static void main(String[] args) {
        int i1, i2, a;
        int res = 0;
        String item, item2, op, item1;
        String primeiroNome = "RAfa";
        String lastName = "vieira";

        Scanner entrada = new Scanner(System.in);

        /*
        System.out.println("Digite uma operacao +  -  *  / ");
       // a=entrada.nextInt();
       String b=entrada.nextLine();
         */
        // TESTE REPITACAO DO
        do {
            System.out.println("Digite um numero ");
            a = entrada.nextInt();

        } while (a != 9);

        //   System.out.println(" "+primeiroNome+" "+lastName);
        //System.out.println(nomeCompleto(primeiroNome,lastName));   
        /*
        op = JOptionPane.showInputDialog("Digite uma operacao +  -  *  /  ");
        
       
         
          
          item1 = JOptionPane.showInputDialog("Digite um valor 1");
          item2 = JOptionPane.showInputDialog("Digite um valor 2");
        //  System.out.println(item2);


        
         //convertr strin para INT
       i1=  parseInt(item1);
        i2=  parseInt(item2);
         
        
           if(b=="c")
           // res=i1+i2;
            System.out.println("resposta");
     

         */
    }

    // método retnoor texto
    public static String nomeCompleto(String primeiroNome, String lastName) {

        return primeiroNome.concat(" ").concat(lastName);
    }

    // método retnoor numero
    public double soma(int num1, int num2) {
        int soma = 0;
        soma = num1 + num2;
        return soma;
    }
    
    // metodo boolean
        public void valiar() {
       //btrue;
    }

}
