package tpzao;

public class RetornaMaior {
	static public void maior(double [] vetor, int tamanho, String Mes, int Ano) {
	
		int contador = 0;
		int posicaoMaior = 1; //posicao 1 pois é startado o maior vetor na posicao 1
		double maiorTemperatura = vetor[0]; // maior temperatura é a inicial, para comparar
		
		
		for (contador = 1; contador < tamanho; contador++) {
			//contador = 1 porque já foi inicializado o contador igual a 0 na variável maiorTemperatura
			if(vetor[contador]  > maiorTemperatura) {
				maiorTemperatura = vetor[contador];
				posicaoMaior = contador + 1; //guarda a posicao do contador + 1 porque inicia-se no contador = 0
			}
			
		}
		
		
		System.out.println("A maior média de temperatura para esse mês é: " + maiorTemperatura + "ºC");
		System.out.println("E se encontra no dia: " + posicaoMaior + "/" + Mes + "/" + Ano + "\n");
	
	 	
		
	}

}
