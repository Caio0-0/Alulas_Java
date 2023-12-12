
class Banco {
    String nome;
    float saldo;
    boolean contaEspecial;

    void abreConta(String nomeCorrentista, float valorInicial) {
        if (valorInicial >= 100.00) {
            nome = nomeCorrentista;
            saldo = valorInicial;
            contaEspecial = saldo < 0;
        } else {
            System.out.println("Valor inicial mínimo para abrir conta: R$100,00.");
        }
    }

    void deposito(float valor) {
        saldo += valor;
    }

    boolean saque(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }
    }

    boolean transfere(Banco destino, float valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.deposito(valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente para transferência.");
            return false;
        }
    }

    void mostrarDados() {
        System.out.println("O nome do correntista é: " + nome);
        System.out.println("O saldo é: " + saldo);
        System.out.println("Tipo de conta: " + (contaEspecial ? "Especial" : "Comum"));
        if (saldo < 0) {
            System.out.println("Saldo negativo. Atenção!");
        }
    }

    public static void main(String[] args) {
        Banco c1 = new Banco();
        Banco c2 = new Banco();

        c1.abreConta("Caio", 480);
        c1.saque(120);

        c2.abreConta("Fulano", 500);
        c2.saque(120);

        System.out.println("Dados da Conta 1:");
        c1.mostrarDados();

        System.out.println("=================");

        System.out.println("Dados da Conta 2:");
        c2.mostrarDados();

       
        c1.transfere(c2, 50);


        System.out.println("=================");

        System.out.println("Dados da Conta 1 após transferência:");
        c1.mostrarDados();
        System.out.println("=================");

        System.out.println("Dados da Conta 2 após transferência:");
        c2.mostrarDados();
    }
}

	
	
	
	
	