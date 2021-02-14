package tpzao;

import java.util.Scanner;
import java.util.Locale; //vai fazer com que o scanner enxergue ponto "." com virgula entre caracteres

public class DeterminaDadosMes2013 {
	static public void GerenciaMes2013(String mes, int Operacao){
		
		Scanner ler = new Scanner(System.in);
    	ler.useLocale(Locale.ENGLISH);
    	int QntDias = 0;
    	int Contador = 0;
		int aux = 0;
		
		switch(mes){

        case "Janeiro":
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJaneiro2013 = new double[QntDias];
        	aux = 0;
        	        	
        	System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJaneiro2013[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJaneiro2013);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJaneiro2013,VetorJaneiro2013.length, mes, 2013);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJaneiro2013,VetorJaneiro2013.length, mes, 2013);
        	}else {
        		RelatorioMet.executa(VetorJaneiro2013, VetorJaneiro2013.length, mes, 2013);
        		}
        	

        	MetodoSwitch.SwitchzaoDaMassa(); break;
        
        case "Fevereiro":
            
        	QntDias = 28;
        	Contador = 0;
        	double [] VetorFevereiro2013 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorFevereiro2013[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorFevereiro2013);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorFevereiro2013,VetorFevereiro2013.length, mes, 2013);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorFevereiro2013,VetorFevereiro2013.length, mes, 2013);
        	}else {
        		RelatorioMet.executa(VetorFevereiro2013, VetorFevereiro2013.length, mes, 2013);
        		}
        	
        	MetodoSwitch.SwitchzaoDaMassa(); break;
      	            
            
        case "Março":
        	
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMarco2013 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMarco2013[Contador] = ler.nextDouble();
        		Contador++;
        	}

        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMarco2013);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMarco2013,VetorMarco2013.length, mes, 2013);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMarco2013,VetorMarco2013.length, mes, 2013);
        	}else {
        		RelatorioMet.executa(VetorMarco2013, VetorMarco2013.length, mes, 2013);
        		}
            
        	MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Abril":
           
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorAbril2013 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAbril2013[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAbril2013);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAbril2013,VetorAbril2013.length, mes, 2013);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAbril2013,VetorAbril2013.length, mes, 2013);
        	}else {
        		RelatorioMet.executa(VetorAbril2013, VetorAbril2013.length, mes, 2013);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Maio":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMaio2013 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMaio2013[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMaio2013);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMaio2013,VetorMaio2013.length, mes, 2013);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMaio2013,VetorMaio2013.length, mes, 2013);
        	}else {
        		RelatorioMet.executa(VetorMaio2013, VetorMaio2013.length, mes, 2013);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Junho":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorJunho2013 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJunho2013[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJunho2013);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJunho2013,VetorJunho2013.length, mes, 2013);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJunho2013,VetorJunho2013.length, mes, 2013);
        	}else {
        		RelatorioMet.executa(VetorJunho2013, VetorJunho2013.length, mes, 2013);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Julho":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJulho2013 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJulho2013[Contador] = ler.nextDouble();
        		Contador++;
        	}        	
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJulho2013);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJulho2013,VetorJulho2013.length, mes, 2013);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJulho2013,VetorJulho2013.length, mes, 2013);
        	}else {
        		RelatorioMet.executa(VetorJulho2013, VetorJulho2013.length, mes, 2013);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Agosto":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorAgosto2013 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAgosto2013[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAgosto2013);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAgosto2013,VetorAgosto2013.length, mes, 2013);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAgosto2013,VetorAgosto2013.length, mes, 2013);
        	}else {
        		RelatorioMet.executa(VetorAgosto2013, VetorAgosto2013.length, mes, 2013);
        		}
        	
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Setembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorSetembro2013 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorSetembro2013[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorSetembro2013);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorSetembro2013,VetorSetembro2013.length, mes, 2013);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorSetembro2013,VetorSetembro2013.length, mes, 2013);
        	}else {
        		RelatorioMet.executa(VetorSetembro2013, VetorSetembro2013.length, mes, 2013);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Outubro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorOutubro2013 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorOutubro2013[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorOutubro2013);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorOutubro2013,VetorOutubro2013.length, mes, 2013);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorOutubro2013,VetorOutubro2013.length, mes, 2013);
        	}else {
        		RelatorioMet.executa(VetorOutubro2013, VetorOutubro2013.length, mes, 2013);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Novembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorNovembro2013 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorNovembro2013[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorNovembro2013);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorNovembro2013,VetorNovembro2013.length, mes, 2013);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorNovembro2013,VetorNovembro2013.length, mes, 2013);
        	}else {
        		RelatorioMet.executa(VetorNovembro2013, VetorNovembro2013.length, mes, 2013);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Dezembro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorDezembro2013 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorDezembro2013[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorDezembro2013);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorDezembro2013,VetorDezembro2013.length, mes, 2013);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorDezembro2013,VetorDezembro2013.length, mes, 2013);
        	}else {
        		RelatorioMet.executa(VetorDezembro2013, VetorDezembro2013.length, mes, 2013);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        default:
        	
        	System.out.println("Digite um mes válido!");

    }
		
		
		
	}

}
