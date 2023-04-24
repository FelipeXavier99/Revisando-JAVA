package revisando.java;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
import static java.lang.Integer.parseInt; // Classe pra converçao
import java.util.Scanner; //Classe q consta next... pra pegar os dados do "sout" 
import javax.swing.JOptionPane; // classe pra mostrar msg melhorada
*/

//Aulas dio
// Qdo o atributo for de letra minuscula o valor dele n atelra mais fica EXEMPLO : final int AA
//String resultado= a==b ?"verdadeiro" : "falso";   -- uma condicao IF com esses dados!  
// ex1.equals(ex2); método equals q compara os 2 atributos se sao iguais
//Pra executar numa terminal(cmd) dentro da pasta BIN do projeto classe e criar variavel  String b=args[0];
public class RevisandoJAVA {

    public static void main(String[] args) {
        int i1, i2, valor;
        int res = 10;
        String item, item2, op, item1;
        String primeiroNome = "RAfa";
        String lastName = "vieira"; 
        
      Date dataHoraAtual = new Date();
        

   String time = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
   
        System.out.println(dataHoraAtual);

       
         // System.out.println("fevereito");

      //  Scanner entrada = new Scanner(System.in);
      // System.out.println("fevereito");
      

        /* 
        System.out.println("Digite uma operacao +  -  *  / ");
       // valor=entrada.nextInt();  recebe inteiro
       String b=entrada.nextLine();   recebe strin
         */
      
        /*
        //TESTE COM COM MAIS UMA CONDICAO IF,ELSE
        int mes=9;
        if(mes==1){
            System.out.println("Janeiro");
        }else  if(mes==2){
       
            System.out.println("fevereito");
        }
        */
        
      
         
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
/*
        /// metodo com VOID nao usa return
           public   void somar(int n1,int n2){
           resultado=n1+n2;
        System.out.println(n1+" + "+n2+" = "+resultado);
        }
    }
        
        */
        
        
        
        
        //---------------AULAS DIO JAVA BOOTCAMP(TQI Kotlin - Backend Developer) - TITULO= dominando a lin JAVA
        
        // SOBRECARGAS- dois métodos com o mesmo na mesmca classe nome mas com qtd de paramentros diferents
        
        
        
        
        
        
        /// get E setters - proteer dados em outra classe
        /*
        String getDescricao() {
		return descricao;
	}

	 void setDescricao(String descricao) {
		this.descricao = descricao;
	}
*/
        
        
        
        ///CONSTRUTORES EM CLASSES
        
       // após criar uma clase só é criar uma com o mesmo nome e com parametr ex:
        
      //  Classe (int exmemlo){}
      //aí no main invoca = Classe c = new Classe(exemlo parametro); 
        
        
      
      
      
      
      //HERANÇA - filhos herdam do pai 
      
      //public class Fila extends Mae {
    

      
     // -UpCasting sobe  a herarqui ex:
      // Gato g = new Gato();
      //Felino f = g;
        
      
      // DownCasting -desce herarqui Ex
    //  Felino f = new Gato();
//   Gato g = (Gato) f;
      
      //obs: em pyton tem HERANÇA multipla
      
      
      
      // Polimorfismo(mais immportante e mais complexo) é o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse podem invocar métodos que têm a mesma identificação
      //ex:
      /*
      class Aplicativo {
  public static void main(String args[]){
    System.out.println("Polimorfismo\n");
    Mamifero mamifero1 = new Elefante();
    System.out.println("Cota diaria de leite do elefante: " + mamifero1.obterCotaDiariaDeLeite());
    Mamifero mamifero2 = new Rato();
    System.out.println("Cota diaria de leite do rato: " + mamifero2.obterCotaDiariaDeLeite());


*/
      
     /*overrride - SOBRESCER UM NOVO MÉTODO ABSTRACT(mais usados nas filhas)
        @Override
void metodo(){
    System.out.print("filo Gerente pra func");
}
     */ 
      
      //INTERFACES-uma classe q consta metodos abstract
     /*  class InterfaceSomar implements TesteInterface {
    

    //@Override-usa mais qdo for subscrito
    void   metodoSoma(double n1,double n2);
    System.out.println("Somando "+(n1+n2));

}
      */
      
      //PACOTES ex:
      //package revisando.java;
    //  import java.util.Date;
      
    
      
    //VISIBILIDADE/ENCAPSULAMENTO-Métodos,atributos e classes
    /*
    -PUBLIC- Tudo livre
    -PRIVATE - só pode ser usado na mesma classe e nem herdadods
    -PROTECTED-Somente no mesmo pacote
    -ABSTRACT-somente usa nas classes e nao pode ser instaciada
    -STATIC - qdo um atributo é declado pode sr intanciados em todas as classes
    -FINAL-nao pode estender,sobrescrever(override)
    
    
    
    
    
      */
      // COLLECTION(list,set,map,stram)
            
      
      //IMPLEMENTACOES class InterfaceSomar implements TesteInterface {
    /*
  @Override
    void   metodoSoma(double n1,double n2);
    System.out.println("Somando "+(n1+n2));
}
      
      
      */
      
//DEBUGGIN-FAZ PILHA pra verificar o cod

//TRATAMENTPS EXCECEPTION
 




//ARRENDONDAR VALOR DECIMAL
//DecimalFormat deci= new DecimalFormat("0.00");
// deci.format(valor));



// OUTRO TIPO DE FAZER CONDICAO IF ELSE
 //imposto = salarioBruto * (salarioBruto <= 1100.00 ? 0.05 : salarioBruto > 2500.00 ? 0.15 : 0.10);
 
 
 //PRA BOTAR MAIS UM DECIMAL APÓS A VIRULA %.2f   
 //EXEMLPLO: DETALHE QUE O printf TERMINA COM F
 // System.out.printf("%.2f", salarioLiquido);10,00
 

      
    }

}

