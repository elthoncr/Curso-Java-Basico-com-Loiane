package com.loiane.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Elthon Rodrigues");
		//contato.setEndereco("Rua Bocaina");
		//contato.setTelefone("11 986864207");
		
		//Criar objeto endereco
		Endereco end = new Endereco();
		end.setNomeRua("Rua Bocaina");
		end.setNumero("346");
		end.setComplemento("Casa");
		end.setCidade("Várzea Paulista");
		end.setEstado("São Paulo");
		end.setCep("13222-420");
		
		contato.setEndereco(end);
		
		//Criando Objeto telefone
		//Relacionamento tem um Telefone
		Telefone tel = new Telefone();
		tel.setTipo("Celular");
		tel.setDdd("11");
		tel.setTelefone("98686-4207");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("Casa");
		tel2.setDdd("11");
		tel2.setTelefone("4595-4714");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
		contato.setTelefones(telefones);
		
		//contato.setTelefone(tel);
		
		System.out.println("Nome: "+contato.getNome());
		
		//Teste Saída no Console
		//System.out.println("Endereço: "+contato.getEndereco());
		//System.out.println("Telefone: "+contato.getTelefone());
		
		/**
		 * 
		 *  Para deixar o código mais seguro e evitar erros e exceções
		 *  É feito uma verificação se o objeto contato
		 *  e o objeto contato.getEndereco() não irão retornar null
		 *  Ele faz a verificação se o objeto contido neles é diferente
		 *  de null e então ele entra no if e imprimi. 
		 * 
		 * */
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if(contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd()+" "+contato.getTelefone().getTelefone());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd()+" "+t.getTelefone());
			}
		}
		
	}

}
