package tpzao;

import java.util.Scanner;
import java.util.Locale; //vai fazer com que o scanner enxergue ponto "." com virgula entre caracteres

public class DeterminaDadosMes2017 {
	static public void GerenciaMes2017(String mes, int Operacao){
		
		Scanner ler = new Scanner(System.in);
    	ler.useLocale(Locale.ENGLISH);
    	int QntDias = 0;
    	int Contador = 0;
		int aux = 0;
		
		switch(mes){

        case "Janeiro":
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJaneiro2017 = new double[QntDias];
        	aux = 0;
        	        	
        	System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJaneiro2017[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJaneiro2017);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJaneiro2017,VetorJaneiro2017.length, mes, 2017);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJaneiro2017,VetorJaneiro2017.length, mes, 2017);
        	}else {
        		RelatorioMet.executa(VetorJaneiro2017, VetorJaneiro2017.length, mes, 2017);
        		}

        	MetodoSwitch.SwitchzaoDaMassa(); break;
        
        case "Fevereiro":
            
        	QntDias = 28;
        	Contador = 0;
        	double [] VetorFevereiro2017 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorFevereiro2017[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorFevereiro2017);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorFevereiro2017,VetorFevereiro2017.length, mes, 2017);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorFevereiro2017,VetorFevereiro2017.length, mes, 2017);
        	}else {
        		RelatorioMet.executa(VetorFevereiro2017, VetorFevereiro2017.length, mes, 2017);
        		}
        	
        	MetodoSwitch.SwitchzaoDaMassa(); break;
      	            
            
        case "Março":
        	
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMarco2017 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMarco2017[Contador] = ler.nextDouble();
        		Contador++;
        	}

        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMarco2017);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMarco2017,VetorMarco2017.length, mes, 2017);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMarco2017,VetorMarco2017.length, mes, 2017);
        	}else {
        		RelatorioMet.executa(VetorMarco2017, VetorMarco2017.length, mes, 2017);
        		}
            
        	MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Abril":
           
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorAbril2017 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAbril2017[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAbril2017);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAbril2017,VetorAbril2017.length, mes, 2017);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAbril2017,VetorAbril2017.length, mes, 2017);
        	}else {
        		RelatorioMet.executa(VetorAbril2017, VetorAbril2017.length, mes, 2017);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Maio":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMaio2017 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMaio2017[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMaio2017);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMaio2017,VetorMaio2017.length, mes, 2017);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMaio2017,VetorMaio2017.length, mes, 2017);
        	}else {
        		RelatorioMet.executa(VetorMaio2017, VetorMaio2017.length, mes, 2017);
        		}
        	
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Junho":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorJunho2017 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJunho2017[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJunho2017);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJunho2017,VetorJunho2017.length, mes, 2017);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJunho2017,VetorJunho2017.length, mes, 2017);
        	}else {
        		RelatorioMet.executa(VetorJunho2017, VetorJunho2017.length, mes, 2017);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Julho":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJulho2017 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJulho2017[Contador] = ler.nextDouble();
        		Contador++;
        	}        	
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJulho2017);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJulho2017,VetorJulho2017.length, mes, 2017);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJulho2017,VetorJulho2017.length, mes, 2017);
        	}else {
        		RelatorioMet.executa(VetorJulho2017, VetorJulho2017.length, mes, 2017);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Agosto":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorAgosto2017 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAgosto2017[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAgosto2017);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAgosto2017,VetorAgosto2017.length, mes, 2017);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAgosto2017,VetorAgosto2017.length, mes, 2017);
        	}else {
        		RelatorioMet.executa(VetorAgosto2017, VetorAgosto2017.length, mes, 2017);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Setembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorSetembro2017 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorSetembro2017[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorSetembro2017);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorSetembro2017,VetorSetembro2017.length, mes, 2017);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorSetembro2017,VetorSetembro2017.length, mes, 2017);
        	}else {
        		RelatorioMet.executa(VetorSetembro2017, VetorSetembro2017.length, mes, 2017);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Outubro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorOutubro2017 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorOutubro2017[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorOutubro2017);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorOutubro2017,VetorOutubro2017.length, mes, 2017);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorOutubro2017,VetorOutubro2017.length, mes, 2017);
        	}else {
        		RelatorioMet.executa(VetorOutubro2017, VetorOutubro2017.length, mes, 2017);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Novembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorNovembro2017 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorNovembro2017[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorNovembro2017);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorNovembro2017,VetorNovembro2017.length, mes, 2017);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorNovembro2017,VetorNovembro2017.length, mes, 2017);
        	}else {
        		RelatorioMet.executa(VetorNovembro2017, VetorNovembro2017.length, mes, 2017);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Dezembro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorDezembro2017 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorDezembro2017[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorDezembro2017);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorDezembro2017,VetorDezembro2017.length, mes, 2017);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorDezembro2017,VetorDezembro2017.length, mes, 2017);
        	}else {
        		RelatorioMet.executa(VetorDezembro2017, VetorDezembro2017.length, mes, 2017);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        default:
        	
        	System.out.println("Digite um mes válido!");

    }
		
		
		
	}

}
