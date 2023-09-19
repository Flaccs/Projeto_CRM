package crm.Repository;

import crm.model.CRM;

public interface CrmRepository {
	
		public void procurarPorNumero(Integer numero);
		public void listarTodos();
		public void cadastrar(CRM cliente);
		public void atualizarDadosCliente(CRM cliente);
		
	

		
				

}
