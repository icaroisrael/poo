import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        int op = 100;
        while(op != 0){

             op = Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção\n1 - ligar\n2 - Desligar\n 3 - Status\n0 - Sair"));
             if(op == 1){
                 tv.ligar();
             }else if(op == 2){
                 tv.desligar();
             }else if(op == 3){
                 System.out.println(tv.status);
             }else{
                 op = 0;
             }
        }
    }
}
