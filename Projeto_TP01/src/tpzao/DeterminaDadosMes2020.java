package tpzao;

import java.util.Scanner;
import java.util.Locale; //vai fazer com que o scanner enxergue ponto "." com virgula entre caracteres

public class DeterminaDadosMes2020 {
	static public void GerenciaMes2020(String mes, int Operacao){
		
		Scanner ler = new Scanner(System.in);
    	ler.useLocale(Locale.ENGLISH);
    	int QntDias = 0;
    	int Contador = 0;
		int aux = 0;
		
		switch(mes){

        case "Janeiro":
        	/*
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJaneiro2020 = new double[QntDias];
        	aux = 0;
        	        	
        	System.out.println("Digite as médias de temperatura por dia desse mês");
        	*/
        	
        	double[] VetorJaneiro2020 = {25.6, 20.1, 25.0, 27.8, 23.4, 
	 				22.8, 27.5, 21.0, 22.0, 20.0, 28.4, 25.4, 26.7,
	 				28.9, 24.5, 22.2, 18.7, 19.8, 27.5, 30.5,
	 				25.6, 20.1, 25.0, 27.8, 23.4, 
	 				22.8, 27.5, 21.0, 22.0, 20.0, 28.4};
	    	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJaneiro2020);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJaneiro2020,VetorJaneiro2020.length, mes, 2020);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJaneiro2020,VetorJaneiro2020.length, mes, 2020);
        	}else {
        		RelatorioMet.executa(VetorJaneiro2020, VetorJaneiro2020.length, mes, 2020);

        	}

        	MetodoSwitch.SwitchzaoDaMassa(); break;
        
        case "Fevereiro":
            
        	QntDias = 29;
        	Contador = 0;
        	double [] VetorFevereiro2020 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorFevereiro2020[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorFevereiro2020);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorFevereiro2020,VetorFevereiro2020.length, mes, 2020);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorFevereiro2020,VetorFevereiro2020.length, mes, 2020);
        	}else {
        		RelatorioMet.executa(VetorFevereiro2020, VetorFevereiro2020.length, mes, 2020);
        		}
        	
        	MetodoSwitch.SwitchzaoDaMassa(); break;
      	            
            
        case "Março":
        	
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMarco2020 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMarco2020[Contador] = ler.nextDouble();
        		Contador++;
        	}

        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMarco2020);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMarco2020,VetorMarco2020.length, mes, 2020);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMarco2020,VetorMarco2020.length, mes, 2020);
        	}else {
        		RelatorioMet.executa(VetorMarco2020, VetorMarco2020.length, mes, 2020);
        		}
            
        	MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Abril":
           
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorAbril2020 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAbril2020[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAbril2020);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAbril2020,VetorAbril2020.length, mes, 2020);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAbril2020,VetorAbril2020.length, mes, 2020);
        	}else {
        		RelatorioMet.executa(VetorAbril2020, VetorAbril2020.length, mes, 2020);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Maio":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMaio2020 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMaio2020[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMaio2020);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMaio2020,VetorMaio2020.length, mes, 2020);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMaio2020,VetorMaio2020.length, mes, 2020);
        	}else {
        		RelatorioMet.executa(VetorMaio2020, VetorMaio2020.length, mes, 2020);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Junho":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorJunho2020 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJunho2020[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJunho2020);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJunho2020,VetorJunho2020.length, mes, 2020);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJunho2020,VetorJunho2020.length, mes, 2020);
        	}else {
        		RelatorioMet.executa(VetorJunho2020, VetorJunho2020.length, mes, 2020);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Julho":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJulho2020 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJulho2020[Contador] = ler.nextDouble();
        		Contador++;
        	}        
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJulho2020);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJulho2020,VetorJulho2020.length, mes, 2020);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJulho2020,VetorJulho2020.length, mes, 2020);
        	}else {
        		RelatorioMet.executa(VetorJulho2020, VetorJulho2020.length, mes, 2020);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Agosto":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorAgosto2020 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAgosto2020[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAgosto2020);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAgosto2020,VetorAgosto2020.length, mes, 2020);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAgosto2020,VetorAgosto2020.length, mes, 2020);
        	}else {
        		RelatorioMet.executa(VetorAgosto2020, VetorAgosto2020.length, mes, 2020);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Setembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorSetembro2020 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorSetembro2020[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorSetembro2020);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorSetembro2020,VetorSetembro2020.length, mes, 2020);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorSetembro2020,VetorSetembro2020.length, mes, 2020);
        	}else {
        		RelatorioMet.executa(VetorSetembro2020, VetorSetembro2020.length, mes, 2020);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Outubro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorOutubro2020 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorOutubro2020[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorOutubro2020);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorOutubro2020,VetorOutubro2020.length, mes, 2020);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorOutubro2020,VetorOutubro2020.length, mes, 2020);
        	}else {
        		RelatorioMet.executa(VetorOutubro2020, VetorOutubro2020.length, mes, 2020);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Novembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorNovembro2020 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorNovembro2020[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorNovembro2020);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorNovembro2020,VetorNovembro2020.length, mes, 2020);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorNovembro2020,VetorNovembro2020.length, mes, 2020);
        	}else {
        		RelatorioMet.executa(VetorNovembro2020, VetorNovembro2020.length, mes, 2020);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Dezembro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorDezembro2020 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorDezembro2020[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorDezembro2020);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorDezembro2020,VetorDezembro2020.length, mes, 2020);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorDezembro2020,VetorDezembro2020.length, mes, 2020);
        	}else {
        		RelatorioMet.executa(VetorDezembro2020, VetorDezembro2020.length, mes, 2020);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        default:
        	
        	System.out.println("Digite um mes válido!");

    }
		
		
		
	}

}
