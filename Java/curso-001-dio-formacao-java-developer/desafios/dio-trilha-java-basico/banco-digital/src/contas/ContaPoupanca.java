package contas;

import banco.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança:");
        super.imprimirDadosConta();
        System.out.println("\n");
    }
}
