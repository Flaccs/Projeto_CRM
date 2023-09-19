package crm;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.util.cores;
import crm.Controller.CRM_Controller;
import crm.model.CRM;
import crm.model.Plano_Anual;
import crm.model.Plano_Mensal;
	
public class Menu {

	public static void 	main(String[] args) {
		
			Scanner leia = new Scanner(System.in);	
			CRM_Controller cliente = new CRM_Controller();

			int numero = 0;
			
			
				String nome, dn, email, cpf, celular, cep, sexo, plano;
				int tipo;
			
				System.out.println("\nCadastrar novo cliente: ");
			
				Plano_Mensal cm = new Plano_Mensal("Flávia Camila", "08.08.1992", "flavia.camila@gmail.com", "419.576.398-30","11 91035-0301", "04143-020","Feminino", cliente.gerarNumero());
				cliente.cadastrar(cm);
			
				Plano_Anual ca = new Plano_Anual("Emma Oliveira", "20.02.1997", "emma.oliveira@gmail.com", "678.987.345-20","11 93867-7589", "04930-020","Feminino", cliente.gerarNumero());
				cliente.cadastrar(ca);
							
				int opcao;
				while(true){
				System.out.println(cores.TEXT_PURPLE +
								  "***********************************************************");
				System.out.println("                                                           ");
				System.out.println("                        BEM VINDE                          ");
				System.out.println("                                                           ");
				System.out.println("***********************************************************");
				System.out.println("        1 - Cadastrar novo cliente.                        ");
				System.out.println("        2 - Consultar lista de clientes cadastrados.       ");
				System.out.println("        3 - Consultar dados por Número de cliente.         ");
				System.out.println("        4 - Atualizar dados do cliente.                    ");
				System.out.println("        5 - Finzalizar acesso.                             ");
				System.out.println("***********************************************************");
				System.out.println("Digite a opção desejada: "                   		        );

				try {
					opcao = leia.nextInt();	
				}catch(InputMismatchException e){
					System.out.println("\nDigite valores inteiros!");
					leia.nextLine();
					opcao=0;
				
				
				}
				switch(opcao) {
				case 1:
					System.out.println("Cadastrar novo cliente.");
					System.out.println("\nNome Completo: ");
					nome = leia.next();
					leia.nextLine();
					System.out.println("\nData de Nascimento: ");
					dn = leia.next();
					System.out.println("\nE-mail: ");
					email = leia.next();
					System.out.println("\nCPF: ");
					cpf = leia.next();
					System.out.println("\nCelular: ");
					celular = leia.next();
					System.out.println("\nCEP: ");
					cep = leia.next();
					System.out.println("\nSexo: ");
					sexo = leia.next();
					
				do {
						System.out.println("Digite o tipo de plano (1-mensal ou 2-anual): ");
						tipo = leia.nextInt();
				}while(tipo < 1 || tipo > 2);
				switch(tipo) {
				case 1 -> {
					cliente.cadastrar(new Plano_Mensal(nome, dn, email, cpf, celular,cep, sexo, cliente.gerarNumero()));	
				}
				case 2 -> {
					cliente.cadastrar(new Plano_Anual( nome, dn, email, cpf, celular,cep, sexo, cliente.gerarNumero()));
				}
				default -> {
					System.out.println("Esse plano é inválido! ");

				}
				}
					
				keyPress();
				break;	
				case 2:
					System.out.println("Listar todos os clientes: ");
					cliente.listarTodos();
					
				keyPress();
				break;	
				case 3:
					System.out.println("Consultar dados por número de cliente.\n\n");
					System.out.println("Digite o número do cliente: ");
					numero = leia.nextInt();
					
					cliente.procurarPorNumero(numero);
				
				keyPress();
				break;
				case 4:
					System.out.println("Atualizar dados do cliente.\n\n");
					System.out.println("Digite o número do cliente");
					numero = leia.nextInt();
					
					if(cliente.buscarNaCollection(numero) != null) {
						System.out.println("\nNome Completo: ");
						nome = leia.next();	
						leia.nextLine();
						System.out.println("\nData de Nascimento: ");
						dn = leia.next();
						System.out.println("\nE-mail: ");
						email = leia.next();
						System.out.println("\nCPF: ");
						cpf = leia.next();
						System.out.println("\nCelular: ");
						celular = leia.next();
						System.out.println("\nCEP: ");
						cep = leia.next();
						System.out.println("\nSexo: ");
						sexo = leia.next();
						
						do {
							System.out.println("Digite o tipo de plano (1-mensal ou 2-anual): ");
							tipo = leia.nextInt();
						}while(tipo < 1 || tipo > 2);
					
						
						switch(tipo) {
						case 1 -> {
							cliente.atualizarDadosCliente(new Plano_Mensal(nome, dn, email, cpf, celular,cep, sexo, numero));	
						}
						case 2 -> {
							cliente.atualizarDadosCliente(new Plano_Anual( nome, dn, email, cpf, celular,cep, sexo,numero));
						}
						default -> {
							System.out.println("Esse plano é inválido! ");

						}
						}

					}else {
						System.out.println("\nPlano não encontrado! ");

					}

				keyPress();
				break;
				
				case 5: 
						System.out.println(cores.TEXT_WHITE_BOLD + "Sessão encerrada!");
						leia.close();
						System.exit(0);
					
				keyPress();
				break;	
				default:
						System.out.println(cores.TEXT_RED_BOLD + "\nOpção inválida.\n\n");
					
				keyPress();
				break;

				}
			}
	
	}
				public static void keyPress(){
					
					try {
						System.out.println(cores.TEXT_RESET + "\nPressione Enter para continuar...");
						System.in.read();

					} catch (IOException e) {

						System.out.println("Houve um erro!");
					}
				}
				
}
