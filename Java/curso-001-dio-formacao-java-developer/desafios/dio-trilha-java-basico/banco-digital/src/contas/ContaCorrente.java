package contas;

import banco.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente:");
        super.imprimirDadosConta();
        System.out.println("\n");
    }
}
