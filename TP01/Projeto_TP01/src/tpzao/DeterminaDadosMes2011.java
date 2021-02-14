package tpzao;

import java.util.Scanner;

import java.util.Locale; //vai fazer com que o scanner enxergue ponto "." com virgula entre caracteres

public class DeterminaDadosMes2011 {
	static public void GerenciaMes2011(String mes, int Operacao){
		
		Scanner ler = new Scanner(System.in);
    	ler.useLocale(Locale.ENGLISH);
    	int QntDias = 0;
    	int Contador = 0;
		int aux = 0;
		double soma = 0;
		double media = 0;
		
		switch(mes){

        case "Janeiro":
        
        	
        	
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJaneiro2011 = new double[QntDias];
        	aux = 0;
        	
        	System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJaneiro2011[Contador] = ler.nextDouble();
        		Contador++;
        	}//preenche array
        	
        	System.out.println(" ");
        	
        	
        		
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJaneiro2011);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJaneiro2011,VetorJaneiro2011.length, mes, 2011);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJaneiro2011,VetorJaneiro2011.length, mes, 2011);
        	}else {
        		RelatorioMet.executa(VetorJaneiro2011, VetorJaneiro2011.length, mes, 2011);
        		}
        	
        	MetodoSwitch.SwitchzaoDaMassa(); //função chamada para voltar ao menu principal
		
        	break;
        	
    	

        
        case "Fevereiro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorFevereiro2011 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorFevereiro2011[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	MetodoSwitch.SwitchzaoDaMassa();
        	break;
      	            
            
        case "Março":
        	
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMarco2011 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMarco2011[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMarco2011);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMarco2011,VetorMarco2011.length, mes, 2011);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMarco2011,VetorMarco2011.length, mes, 2011);
        	}else {
        		
        	}
        	
        	MetodoSwitch.SwitchzaoDaMassa();
        	break;

        case "Abril":
           
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorAbril2011 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAbril2011[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAbril2011);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAbril2011,VetorAbril2011.length, mes, 2011);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAbril2011,VetorAbril2011.length, mes, 2011);
        	}else {
        		
        	}
        	
        	MetodoSwitch.SwitchzaoDaMassa();
            break;
            
        case "Maio":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMaio2011 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMaio2011[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMaio2011);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMaio2011,VetorMaio2011.length, mes, 2011);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMaio2011,VetorMaio2011.length, mes, 2011);
        	}else {
        		
        	}
        	
        	MetodoSwitch.SwitchzaoDaMassa();
            break;

        case "Junho":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorJunho2011 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJunho2011[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	MetodoSwitch.SwitchzaoDaMassa();
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJunho2011);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJunho2011,VetorJunho2011.length, mes, 2011);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJunho2011,VetorJunho2011.length, mes, 2011);
        	}else {
        		
        	}
        	
            break;
            
        case "Julho":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJulho2011 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJulho2011[Contador] = ler.nextDouble();
        		Contador++;
        	}        	
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJulho2011);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJulho2011,VetorJulho2011.length, mes, 2011);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJulho2011,VetorJulho2011.length, mes, 2011);
        	}else {
        		
        	}
        	
        	MetodoSwitch.SwitchzaoDaMassa();
            break;

        case "Agosto":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorAgosto2011 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAgosto2011[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAgosto2011);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAgosto2011,VetorAgosto2011.length, mes, 2011);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAgosto2011,VetorAgosto2011.length, mes, 2011);
        	}else {
        		
        	}
        	
        	
        	MetodoSwitch.SwitchzaoDaMassa();
            break;
            
        case "Setembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorSetembro2011 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorSetembro2011[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorSetembro2011);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorSetembro2011,VetorSetembro2011.length, mes, 2011);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorSetembro2011,VetorSetembro2011.length, mes, 2011);
        	}else {
        		
        	}
        	
        	MetodoSwitch.SwitchzaoDaMassa();
            break;

        case "Outubro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorOutubro2011 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorOutubro2011[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorOutubro2011);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorOutubro2011,VetorOutubro2011.length, mes, 2011);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorOutubro2011,VetorOutubro2011.length, mes, 2011);
        	}else {
        		
        	}
        	
        	MetodoSwitch.SwitchzaoDaMassa();
            break;
            
        case "Novembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorNovembro2011 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorNovembro2011[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorNovembro2011);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorNovembro2011,VetorNovembro2011.length, mes, 2011);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorNovembro2011,VetorNovembro2011.length, mes, 2011);
        	}else {
        		
        	}
        	
        	MetodoSwitch.SwitchzaoDaMassa();
            break;

        case "Dezembro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorDezembro2011 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorDezembro2011[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorDezembro2011);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorDezembro2011,VetorDezembro2011.length, mes, 2011);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorDezembro2011,VetorDezembro2011.length, mes, 2011);
        	}else {
        		
        	}
        	
        	MetodoSwitch.SwitchzaoDaMassa();
            break;
            
        default:
        	
        	System.out.println("Digite um mes válido!");
        	MetodoSwitch.SwitchzaoDaMassa();

    }
		
		
		
	}

}
