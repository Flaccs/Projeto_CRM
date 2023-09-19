package crm.model;	


public abstract class CRM {
		private String nome;
		private String dn;
		private String email;
		private String cpf;
		private String celular;
		private String cep;
		private String sexo;
		private Integer numero;
		
		public CRM(String nome, String dn, String email, String cpf, String celular, String cep,
				String sexo, Integer numero) {
			this.nome = nome;
			this.dn = dn;
			this.email = email;
			this.cpf = cpf;
			this.celular = celular;
			this.cep = cep;
			this.sexo = sexo;
			this.numero = numero;
		}
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDn() {
			return dn;
		}

		public void setDn(String dn) {
			this.dn = dn;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getCelular() {
			return celular;
		}
			
		public void setCelular(String celular) {
			this.celular = celular;
		}

		public String getCep() {
			return cep;
		}

		public void setCep(String cep) {
			this.cep = cep;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		 public Integer getNumero() {
			 return numero;
		}
		 public void setNumero(Integer numero) {
			 this.numero = numero;
		 }
		
		public void visualizar() {
			
			
		System.out.println("***********************************************************");
		System.out.println("                    Dados do Cliente:                      ");
		System.out.println("***********************************************************");
		System.out.println("Nome: " + this.nome                                         );
		System.out.println("Data de Nascimento: " + this.dn                             );
		System.out.println("E-mail: " + this.email                                      );
		System.out.println("CPF: " + this.cpf                                           );
		System.out.println("Celular: " + this.celular                                   );
		System.out.println("CEP: " + this.cep                                           );
		System.out.println("Sexo: " + this.sexo                                         );
		System.out.println("Plano: " + this.getTipoPlano()                               );


}
		
		public int getTipo() {
			return 0;
			

			
		}
		
		public abstract String getTipoPlano();
		

		
	
		
			
		
}
