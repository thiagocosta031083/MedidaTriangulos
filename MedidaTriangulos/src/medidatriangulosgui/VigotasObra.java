
package medidatriangulosgui;
import javax.swing.JOptionPane;
    /**
     *Condição de existência dos Triângulos:
     * A soma de 2 lados não pode ser inferior ao outro lado  ou 
     * a medida de um lado não pode ser superior a soma dos outros 2 laados
     */
public class VigotasObra {
    public String viga1, viga2, viga3;//recebe em String
    private int vig1,vig2,vig3;// faz o parse para executar
          
    public void calcularTriangulo(){
 
        viga1 = JOptionPane.showInputDialog("Digite o tamanho da Vigota 1");//JOptionPane é a classe. E showInputDialog é o método
            setVig1(Integer.parseInt(viga1));
        viga2 = JOptionPane.showInputDialog("Digite o tamanho da Vigota 2");
            setVig2(Integer.parseInt(viga2));
        viga3 = JOptionPane.showInputDialog("Digite o tamanho da Vigota 3");
            setVig3(Integer.parseInt(viga3));
         
        if (getVig1()>getVig2()+getVig3() || getVig2()>getVig1()+getVig3() ||getVig3()>getVig1()+getVig2()){
           JOptionPane.showMessageDialog(null,"Triangulo não é possível, encerrando...");
           System.exit(0);//Comando serve para PARAR o programa
            
        }else{
            JOptionPane.showMessageDialog(null,"Triangulo possível");
            
        }
    }
    
    public void classificarTriangulo(){
        if (getVig1()==getVig2() && getVig1()==getVig3()){
        JOptionPane.showMessageDialog(null,"Trinagulo Equilatero");
    }else if (getVig1()==getVig2()||getVig1()==getVig3()||getVig2()==getVig3()){
        JOptionPane.showMessageDialog(null,"Triangulo isorceles");
    } else{
        JOptionPane.showMessageDialog(null,"Triangulo Escaleno");
    }
}

 
    public int getVig1() {
        return vig1;
    }


    public void setVig1(int vig1) {
        this.vig1 = vig1;
    }


    public int getVig2() {
        return vig2;
    }


    public void setVig2(int vig2) {
        this.vig2 = vig2;
    }


    public int getVig3() {
        return vig3;
    }


    public void setVig3(int vig3) {
        this.vig3 = vig3;
    }
}

