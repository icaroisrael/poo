public class Conta {
    private double saldo;


    public double saldo(){
        return saldo;
    }

    public void deposito(double valor){
        saldo = saldo + valor;
    }

}
