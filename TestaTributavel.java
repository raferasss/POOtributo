public class TestaTributavel {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();
        ContaPoupanca conta2 = new ContaPoupanca();
        SeguroDeVida seguro1 =  new SeguroDeVida();
        conta1.depositar(60000);
        conta2.depositar(60000);
        System.out.println(conta1.obterSaldo());
        System.out.println(conta1.obterSaldo());
        conta1.sacar(10000);
        conta2.sacar(10000);
        System.out.println(conta1.obterSaldo());
        System.out.println(conta2.obterSaldo());
        double tributoconta1 = conta1.calculaTributos();
        System.out.println(tributoconta1);
        double tributoseguro1 = seguro1.calculaTributos();
        System.out.println(tributoseguro1);
    }
}