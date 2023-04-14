package revisando.java;

import static java.lang.Integer.parseInt;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RevisandoRepicoes {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // ----------------FOR--------------------------

        //tabuda
        /*
       
        int n;
        int calc = 0;
        
        System.out.println("bota um number");
        n=obj.nextInt();
        
        for (int i = 0; i <=10; i++) {

            System.out.println(n+" X "+i+" = "+(n*i));
            
        }
         */
 /*
        
          // fatorial
        Scanner obj = new Scanner(System.in);
        int fat;
        int calc =1;
        int calc2=1;
        
        System.out.println("bota um number");
        fat=obj.nextInt();
        
        for (int i = fat; i >=1; i--) {
            calc=calc*i;
          
            System.out.println(" fatorial de "+fat+" é =  "+calc);
            
        }
         */
 /*
        // soma de 1 ate 100 
        //   int ab = 0;
        //   int max = 100;
        //   for (int i = 0, y = 0; i < 100; y++) {
        // ab=(min+max)*((max-min+1)/2);
        //   i = i + y;
        //  System.out.println(i);
        // }
        
        
        
        
        // -----------TESTE REPITACAO DO----------------
        /*  do {
            System.out.println("Digite um numero ");
            a = entrada.nextInt();

        } while (a != 9);
        
        
        
        
         */
        // ------- while ------
        //  while(TRUE){
        // }  
        /* 
       
       while(1<=5){
        System.out.println("ditite");  
       }  
         
       
         */
        // ---------------exemplo VETOR------------
        /*
               int[] vetor={4,7,8,9-1};
        
                System.out.println(""+vetor.length);
         */
 /*
        //Ignorar letras
        String[] vogais = new String[6];
        int count = 0;
        int qtdVogais = 0;
        do {

            System.out.println("letra ");
            String letra = obj.next();
            //inonar letra
            if (letra.equalsIgnoreCase("a")) {

                vogais[count] = letra;
                qtdVogais++;
            }

            count++;
        } while (count < vogais.length);
        {

            System.out.println("Vogais ");
            for (String consoante : vogais) {
                if (consoante != null) {
                    System.out.println(consoante);
                }

            }
            System.out.println("qtd = " + qtdVogais);
        }
         */
 /*
        int [] idade=new int [10];
        for (int i = 0; i < 10; i++) {
            idade[i] = i+1;
        }
        for (int x : idade) {
            System.out.println(x);
        }
         */
        //-------------- Array multidimensional--------------
        /*
        //importa numeros aletorios
        Random random = new Random();
        
        int[][] m =new int[4][4];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j]= random.nextInt(9);
                   
            }
            
            System.out.println("Matriz: ");
            for (int[] linha : m) {
                for (int coluna : linha) {
                    System.out.println(coluna+" ");
                }
                System.out.println();
            }
        }
        
         */
       
        /*
        // a resposta é 11 pq o o valor fica guarddo no NUM e no CONT TBM
        int num = 1, cout =0;

        while (cout <=3) {

            cout++;
            num += cout;
        }
        System.out.println(num);
        System.out.println(cout);
        
       */ 

        /*
        // A RESPOSTA É 7 PQ O 1ª ARRAY[] CONSULTA A COLUNA E O 2º CONSULTA A LINHA E JÁ RETORNA O UNICO VALOR
        int[][] numeros = {{4, 9, 8, 5}, {3, 0, 1, 5}, {1, 2, 7, 4}};
        System.out.print(numeros[2][2]);
        */
     
        
        

    }

}
