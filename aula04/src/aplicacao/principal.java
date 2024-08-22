package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta;
import entidade.ContaComercial;
import entidade.ContaPoupanca;
import entidade.enums.Cores;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);


		List<Conta> lista = new ArrayList<>();
		System.out.println("Digite o  nome: ");
		String nome = scn.next();
		System.out.println("Digite o ano : ");
		int ano = scn.nextInt();
		System.out.println("Digite o numero : ");
		int number = scn.nextInt();
		System.out.println("Digite o limite: ");
		
		double limit = scn.nextDouble();

		System.out.println("Digite [1] cor Black, [2] cor Pink [3] Red");
		
		int numColor = scn.nextInt();
		
		if(numColor == 1) {
			
			ContaComercial cc = new ContaComercial(nome,ano,number,Cores.BLACK,limit);
			lista.add(cc);

			
		}else if(numColor == 2) {
			ContaComercial cc = new ContaComercial(nome,ano,number,Cores.PINK,limit);
			lista.add(cc);
		}
		else if(numColor == 3) {
			ContaComercial cc = new ContaComercial(nome,ano,number,Cores.RED,limit);
			lista.add(cc);
		}
		
		
		if(numColor == 1) {
			
			ContaPoupanca cp = new ContaPoupanca(nome,ano,number,Cores.BLACK);
			lista.add(cp);

			
		}else if(numColor == 2) {
			ContaPoupanca cp = new ContaPoupanca(nome,ano,number,Cores.PINK);
			lista.add(cp);
		}
		else if(numColor == 3) {
			ContaPoupanca cp = new ContaPoupanca(nome,ano,number,Cores.PINK);
			lista.add(cp);
		}




		
		System.out.println("Digite a conta a qual você deseja atuar: ");
		String Contas = scn.next();
		for(Conta e : lista) {
			if(Contas.contains(("Corrente").toLowerCase())) {
				
				System.out.println(lista.get(0));
				break;
				
			}
			else if(Contas.contains("Poupanca")){
				System.out.println(lista.get(1));
				break;
			}
		}
	}

}
