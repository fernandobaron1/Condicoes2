
package condicoes2;


public class Condicoes2 {

    
    public static void main(String[] args) {
        
      /* caso o aluno seja reincidente, ele deve ganhar um 
desconto de 10% */ 

    boolean reincidente = true;
    boolean emDia = true;
    
    if (reincidente ==true & emDia == true) {
        System.out.println("10% de desconto");
    } else {
        System.out.println ("0% de desconto");
    }
    }
    
}
