public class Conta {

    public double saldo;

    public boolean sacar(double valor){
            if(saldo - valor < 0) {
                System.out.println("Não foi possivel realizar o saque,voce só possui: RS" + saldo );
                return false;
            }
            saldo -= valor;
            return true;
    }

    public void depositar(double valor) {
            saldo += valor;
    }

    public double obterSaldo() {
        return saldo;
    }

}
