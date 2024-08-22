package entidade;

import entidade.enums.Cores;

public class Conta {

		private String nome;
		private int numero;
		private double saldo;
		private Cores cor;



		public Conta(String nome, int numero, double saldo, Cores cor) {
			super();
			this.nome = nome;
			this.numero = numero;
			this.saldo = saldo;
			this.cor = cor;
		}
		
		public double sacar(double deposito) {
			return saldo - deposito;
		}
		public double depositar(double deposito) {
			return saldo = saldo +5;
		}

		public double getSaldo() {
			return saldo;
		}

		@Override
		public String toString() {
			return "Conta nome=" + nome + ", numero=" + numero + ", saldo=" + saldo +" + "+cor  ;
		}
}
