import java.util.Random;

public class Conta {
    private String nrConta;
    private String agencia;
    private String titular;
    private double saldo;
    private TipoConta tipoConta;

    public Conta(String agencia, String titular, TipoConta tipoConta) {

        if (agencia.isBlank()) {
            throw new IllegalArgumentException("agencia não pode ser vazio");
        }

        if (agencia.replace(" ", "").length() < 4) {
            throw new IllegalArgumentException("agencia deve contar ao menos 4 digitos");
        }

        if (titular.isBlank()) {
            throw new IllegalArgumentException("titular não pode ser vazio");
        }

        if (titular.replace(" ", "").length() < 4) {
            throw new IllegalArgumentException("titular deve conter ao menos 4 digitos");
        }

        this.tipoConta = tipoConta;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = 0.00;
        Random r = new Random();
        this.nrConta = r.nextInt(10000, 99999) + "-" + r.nextInt(0, 9);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("o valor deve ser maior que 0");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("o valor deve ser maior que 0");
        }

        if (valor > saldo) {
            throw new IllegalArgumentException("o valor de saque é superior ao saldo");
        }

        this.saldo -= valor;
    }

    public void setAgencia(String agencia) {
        if (agencia.isBlank()) {
            throw new IllegalArgumentException("agencia não pode ser vazio");
        }

        if (agencia.replace(" ", "").length() < 4) {
            throw new IllegalArgumentException("agencia deve contar ao menos 4 digitos");
        }

        this.agencia = agencia;
    }

    public void setTitular(String titular) {
        if (titular.isBlank()) {
            throw new IllegalArgumentException("titular não pode ser vazio");
        }

        if (titular.replace(" ", "").length() < 4) {
            throw new IllegalArgumentException("titular deve conter ao menos 4 digitos");
        }

        this.titular = titular;
    }

    public String getNrConta() {
        return nrConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "nrConta='" + nrConta + '\'' +
                ", agencia='" + agencia + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", tipoConta=" + tipoConta +
                '}';
    }
}
