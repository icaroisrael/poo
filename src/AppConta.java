import javax.swing.*;

public class AppConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        int op = 100;
        while (op != 0) {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção"
                    + "\n 1 - Saldo"
                    + "\n 2 - Deposito"));
            if(op == 1){
                System.out.println("Saldo " + conta.saldo());
            }else if(op == 2){
                conta.deposito(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor deposito")));
            }
        }
    }
}
