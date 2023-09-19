package crm.model;

public class Plano_Anual extends CRM {

	public Plano_Anual(String nome, String dn, String email, String cpf, String celular, String cep, String sexo,
			Integer numero) {
		super(nome, dn, email, cpf, celular, cep, sexo, numero);
	}
		public  String getTipoPlano() {
			return "anual";
		
	}
	

		

		
	

		
		
}
