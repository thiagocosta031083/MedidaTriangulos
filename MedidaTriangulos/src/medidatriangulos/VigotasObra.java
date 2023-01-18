
package medidatriangulos;

import java.util.Scanner;
    /**
     *Condição de existência dos Triângulos:
     * A soma de 2 lados não pode ser inferior ao outro lado  ou 
     * a medida de um lado não pode ser superior a soma dos outros 2 laados
     */
public class VigotasObra {
    
    public int vig1,vig2,vig3;
    Scanner ler = new Scanner (System.in);
    
    public void calcularTriangulo(){
        System.out.println("Digite o tamanho da Vigota 1:");
            vig1 = ler.nextInt();
        System.out.println("Digite o tamanho da Vigota 2:");
            vig2 = ler.nextInt();
        System.out.println("Digite o tamanho da Vigota 3:");
            vig3 = ler.nextInt();
        ler.close();
     
        if (vig1>vig2+vig3 || vig2>vig1+vig3 ||vig3>vig1+vig2){
            System.out.println("Triangulo não é possível, encerrando...");
            System.exit(0);//Comando serve para PARAR o programa
            
        }else{
            System.out.println("Triangulo possível");
            
        }
    }
    
    public void classificarTriangulo(){
        if (vig1==vig2 && vig1==vig3){
        System.out.println("Trinagulo Equilatero");
    }else if (vig1==vig2||vig1==vig3||vig2==vig3){
        System.out.println("Triangulo isorceles");
    } else{
        System.out.println("Triangulo Escaleno");
    }
}
}

