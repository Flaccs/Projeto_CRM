package crm.Controller;

import java.util.ArrayList;

import crm.Repository.CrmRepository;
import crm.model.CRM;

public class CRM_Controller implements CrmRepository{
	
	private ArrayList<CRM> listarClientes = new ArrayList<CRM>();
	int numero = 0;

	@Override
		public void procurarPorNumero(Integer numero) {	
		var cliente = buscarNaCollection(numero);
		if(cliente != null)
			cliente.visualizar();
		else 
			System.out.println("\nO cliente N° " + numero + " não foi encontrado!");
		
	}

		@Override
		public void atualizarDadosCliente(CRM cliente) {
		var buscarCliente = buscarNaCollection(cliente.getNumero());
		if(buscarCliente != null) {
			listarClientes.set(listarClientes.indexOf(buscarCliente), cliente);
			System.out.println("\nO cliente Nº " + cliente.getNumero() + " foi atualizada com sucesso!");
		} else 
			System.out.println("\nO cliente Nº " + cliente.getNumero() + " não foi encontrado!");

		}
	
	
	
		@Override
		public void listarTodos() {
		for (var cliente : listarClientes) {
			cliente.visualizar();
		}}
		
		@Override
		public void cadastrar(CRM cliente) {
		listarClientes.add(0, cliente);
		System.out.println("O Cliente Nº " + numero + " foi cadastrado com sucesso");	
		}
	 
		public int gerarNumero() {
			return ++ numero;
		}
		public CRM buscarNaCollection(int numero) {
			for(var cliente : listarClientes) {
				if(cliente.getNumero() == numero) {
					return cliente;
				}
			}
				return null;
		}
		public int retornaTipo(int numero) {
			for(var cliente : listarClientes) {
				if(cliente.getNumero() == numero) {
					return cliente.getTipo();
				}
			}
			return 0;
		}

}
