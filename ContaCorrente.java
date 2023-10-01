public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double calculaTributos() {
        double tributo = saldo * 0.01;
        return tributo;

    }
}
