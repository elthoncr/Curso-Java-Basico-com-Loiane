
 Por default atributos de uma classe somente são visiveis dentro do mesmo pacote.
 	
 	<code>
 	
 	Classe carro
		
	public class Carro {
		public String marca;
		String modelo;
		int numPassageiros;
		double capCombustivel;
		private double consumoCombustivel;
	}
	</code> 	
	
 - Nesse exemplo acima as variaveis modelo, numPassageiros e capCombustivel são visiveis dentro do pacote com.loiane.cursojava.aula31
 
 Se incluir a palavra public na frente do atributo, ela será visivel globalmente.
 
 - Nesse exemplo acima a variavel marca será visivel no escopo global.
 
 Se incluir a palavra private na frente do atributo, ela será visivel somente naquela classe.
 
  - Nesse exemplo acima a váriavel consumoCombustivel sera visivel somente naquela classe.