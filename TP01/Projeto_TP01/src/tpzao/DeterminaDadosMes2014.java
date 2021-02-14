package tpzao;

import java.util.Scanner;
import java.util.Locale; //vai fazer com que o scanner enxergue ponto "." com virgula entre caracteres

public class DeterminaDadosMes2014 {
	static public void GerenciaMes2014(String mes, int Operacao){
		
		Scanner ler = new Scanner(System.in);
    	ler.useLocale(Locale.ENGLISH);
    	int QntDias = 0;
    	int Contador = 0;
		int aux = 0;
		
		switch(mes){

        case "Janeiro":
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJaneiro2014 = new double[QntDias];
        	aux = 0;
        	        	
        	System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJaneiro2014[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJaneiro2014);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJaneiro2014,VetorJaneiro2014.length, mes, 2014);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJaneiro2014,VetorJaneiro2014.length, mes, 2014);
        	}else {
        		RelatorioMet.executa(VetorJaneiro2014, VetorJaneiro2014.length, mes, 2014);
        		}

        	MetodoSwitch.SwitchzaoDaMassa(); break;
        
        case "Fevereiro":
            
        	QntDias = 28;
        	Contador = 0;
        	double [] VetorFevereiro2014 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorFevereiro2014[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorFevereiro2014);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorFevereiro2014,VetorFevereiro2014.length, mes, 2014);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorFevereiro2014,VetorFevereiro2014.length, mes, 2014);
        	}else {
        		RelatorioMet.executa(VetorFevereiro2014, VetorFevereiro2014.length, mes, 2014);
        		}
        	
        	MetodoSwitch.SwitchzaoDaMassa(); break;
      	            
            
        case "Março":
        	
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMarco2014 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMarco2014[Contador] = ler.nextDouble();
        		Contador++;
        	}

        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMarco2014);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMarco2014,VetorMarco2014.length, mes, 2014);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMarco2014,VetorMarco2014.length, mes, 2014);
        	}else {
        		RelatorioMet.executa(VetorMarco2014, VetorMarco2014.length, mes, 2014);
        		}
            
        	MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Abril":
           
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorAbril2014 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAbril2014[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAbril2014);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAbril2014,VetorAbril2014.length, mes, 2014);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAbril2014,VetorAbril2014.length, mes, 2014);
        	}else {
        		RelatorioMet.executa(VetorAbril2014, VetorAbril2014.length, mes, 2014);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Maio":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMaio2014 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMaio2014[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMaio2014);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMaio2014,VetorMaio2014.length, mes, 2014);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMaio2014,VetorMaio2014.length, mes, 2014);
        	}else {
        		RelatorioMet.executa(VetorMaio2014, VetorMaio2014.length, mes, 2014);
        		}
        	        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Junho":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorJunho2014 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJunho2014[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJunho2014);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJunho2014,VetorJunho2014.length, mes, 2014);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJunho2014,VetorJunho2014.length, mes, 2014);
        	}else {
        		RelatorioMet.executa(VetorJunho2014, VetorJunho2014.length, mes, 2014);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Julho":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJulho2014 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJulho2014[Contador] = ler.nextDouble();
        		Contador++;
        	}     
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJulho2014);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJulho2014,VetorJulho2014.length, mes, 2014);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJulho2014,VetorJulho2014.length, mes, 2014);
        	}else {
        		RelatorioMet.executa(VetorJulho2014, VetorJulho2014.length, mes, 2014);
        		}
        	
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Agosto":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorAgosto2014 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAgosto2014[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAgosto2014);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAgosto2014,VetorAgosto2014.length, mes, 2014);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAgosto2014,VetorAgosto2014.length, mes, 2014);
        	}else {
        		RelatorioMet.executa(VetorAgosto2014, VetorAgosto2014.length, mes, 2014);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Setembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorSetembro2014 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorSetembro2014[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorSetembro2014);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorSetembro2014,VetorSetembro2014.length, mes, 2014);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorSetembro2014,VetorSetembro2014.length, mes, 2014);
        	}else {
        		RelatorioMet.executa(VetorSetembro2014, VetorSetembro2014.length, mes, 2014);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Outubro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorOutubro2014 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorOutubro2014[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorOutubro2014);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorOutubro2014,VetorOutubro2014.length, mes, 2014);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorOutubro2014,VetorOutubro2014.length, mes, 2014);
        	}else {
        		RelatorioMet.executa(VetorOutubro2014, VetorOutubro2014.length, mes, 2014);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Novembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorNovembro2014 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorNovembro2014[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorNovembro2014);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorNovembro2014,VetorNovembro2014.length, mes, 2014);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorNovembro2014,VetorNovembro2014.length, mes, 2014);
        	}else {
        		RelatorioMet.executa(VetorNovembro2014, VetorNovembro2014.length, mes, 2014);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Dezembro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorDezembro2014 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorDezembro2014[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorDezembro2014);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorDezembro2014,VetorDezembro2014.length, mes, 2014);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorDezembro2014,VetorDezembro2014.length, mes, 2014);
        	}else {
        		RelatorioMet.executa(VetorDezembro2014, VetorDezembro2014.length, mes, 2014);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        default:
        	
        	System.out.println("Digite um mes válido!");

    }
		
		
		
	}

}
