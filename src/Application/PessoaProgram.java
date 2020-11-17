package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class PessoaProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of taxpayers");
        int n = sc.nextInt();
        
        List<Pessoa> c1 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
			System.out.println("TAX PAYERS"+ " #" + (i + 1)+ " data:");
			System.out.println("Individual or Company (i/c)?");
			char a = sc.next().charAt(0);
			if(a == 'i') {
				System.out.println("Name");
				String name = sc.next();
				System.out.println("Anual Income");
				double valor = sc.nextDouble();
				System.out.println("Health Expenditures");
				double expend = sc.nextDouble();
				c1.add(new PessoaFisica(name,valor,expend));
			}
			else {
				if(a == 'c') {
					System.out.println("Name:");
					String name = sc.next();
					System.out.println("Anual Income:");
					double valor = sc.nextDouble();
					System.out.println("Number of Employees:");
					int expend = sc.nextInt();
					c1.add(new PessoaJuridica(name,valor,expend));
				}
			}
		}
        System.out.println("TAXES PAID");
        for (Pessoa pessoa : c1) {
		       System.out.println(pessoa.getNome() + "$" + pessoa.calculoImposto());
		       
		}
	}

}
