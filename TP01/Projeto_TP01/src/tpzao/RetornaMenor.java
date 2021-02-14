package tpzao;

public class RetornaMenor {
	public static void menor(double vetor[], int tamanho, String Mes, int Ano){
			
		int contador = 0;
		int posicaoMenor = 1; //posicao 1 pois é startado o maior vetor na posicao 1
		double menorTemperatura = vetor[0]; // maior temperatura é a inicial, para comparar
		
		
		for (contador = 1; contador < tamanho; contador++) {
			//contador = 1 porque já foi inicializado o contador igual a 0 na variável maiorTemperatura
			if(vetor[contador]  < menorTemperatura) {
				menorTemperatura = vetor[contador];
				posicaoMenor = contador + 1; //guarda a posicao do contador + 1 porque inicia-se no contador = 0
			}
			
		}
		
		System.out.println("A menor média de temperatura para esse mês é: " + menorTemperatura + "ºC");
		System.out.println("E se encontra no dia: " + posicaoMenor + "/" + Mes + "/" + Ano + "\n");
	
       
	}
}
