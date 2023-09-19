package crm.model;

public class Plano_Mensal extends CRM{

		public Plano_Mensal(String nome, String dn, String email, String cpf, String celular, String cep, String sexo,
			Integer numero) {
		super(nome, dn, email, cpf, celular, cep, sexo, numero);
		}

		
		public  String getTipoPlano() {
			return "mensal";
			
		}
		

		
		
		
	
}
