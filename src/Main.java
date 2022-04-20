import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        int op = 100;
        while(op != 0){

             op = Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção"
                     +"\n 1 - ligar"
                     +"\n 2 - Desligar"
                     +"\n 3 - Status"
                     +"\n 4 - +"
                     +"\n 5 - "
                     +"\n 6 - ^"
                     +"\n 7 --"
                     +"\n 8 Mostrar Volume"
                     +"\n 9 Mostrar Canal"
                     +"\n0 - Sair"));
             if(op == 1){
                 tv.ligar();
             }else if(op == 2){
                 tv.desligar();
             }else if(op == 3){
                 System.out.println(tv.status);
             }else if(op == 4){
                 tv.aumentaVolume();
             }else if(op == 5){
                 tv.diminuiVolume();
             }else if(op == 6){
                 tv.aumentaCanal();
             }
             else if(op == 7){
                 tv.diminuiCanal();
             }
             else if(op == 8){
                System.out.println(tv.volume);
             }
             else if(op == 9){
                 System.out.println(tv.canal);
             }
             else{
                 op = 0;
             }
        }
    }
}
