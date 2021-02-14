package tpzao;

import java.util.Scanner;
import java.util.Locale; //vai fazer com que o scanner enxergue ponto "." com virgula entre caracteres

public class DeterminaDadosMes2012 {
	static public void GerenciaMes2012(String mes, int Operacao){
		
		Scanner ler = new Scanner(System.in);
    	ler.useLocale(Locale.ENGLISH);
    	int QntDias = 0;
    	int Contador = 0;
		int aux = 0;
		
		switch(mes){

        case "Janeiro":
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJaneiro2012 = new double[QntDias];
        	aux = 0;
        	        	
        	System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJaneiro2012[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJaneiro2012);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJaneiro2012,VetorJaneiro2012.length, mes, 2012);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJaneiro2012,VetorJaneiro2012.length, mes, 2012);
        	}else {
        		RelatorioMet.executa(VetorJaneiro2012, VetorJaneiro2012.length, mes, 2012);
        		}


        	MetodoSwitch.SwitchzaoDaMassa(); 
        	break;
        
        case "Fevereiro":
            
        	QntDias = 29;
        	Contador = 0;
        	double [] VetorFevereiro2012 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorFevereiro2012[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorFevereiro2012);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorFevereiro2012,VetorFevereiro2012.length, mes, 2012);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorFevereiro2012,VetorFevereiro2012.length, mes, 2012);
        	}else {
        		RelatorioMet.executa(VetorFevereiro2012, VetorFevereiro2012.length, mes, 2012);
        		}
        	
        	MetodoSwitch.SwitchzaoDaMassa(); 
        	break;
      	            
            
        case "Março":
        	
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMarco2012 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMarco2012[Contador] = ler.nextDouble();
        		Contador++;
        	}

        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMarco2012);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMarco2012,VetorMarco2012.length, mes, 2012);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMarco2012,VetorMarco2012.length, mes, 2012);
        	}else {
        		RelatorioMet.executa(VetorMarco2012, VetorMarco2012.length, mes, 2012);
        		}
            
        	MetodoSwitch.SwitchzaoDaMassa(); 
        	break;

        case "Abril":
           
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorAbril2012 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAbril2012[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAbril2012);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAbril2012,VetorAbril2012.length, mes, 2012);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAbril2012,VetorAbril2012.length, mes, 2012);
        	}else {
        		RelatorioMet.executa(VetorAbril2012, VetorAbril2012.length, mes, 2012);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); 
            break;
            
        case "Maio":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMaio2012 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMaio2012[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMaio2012);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMaio2012,VetorMaio2012.length, mes, 2012);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMaio2012,VetorMaio2012.length, mes, 2012);
        	}else {
        		RelatorioMet.executa(VetorMaio2012, VetorMaio2012.length, mes, 2012);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); 
            break;

        case "Junho":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorJunho2012 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJunho2012[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJunho2012);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJunho2012,VetorJunho2012.length, mes, 2012);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJunho2012,VetorJunho2012.length, mes, 2012);
        	}else {
        		RelatorioMet.executa(VetorJunho2012, VetorJunho2012.length, mes, 2012);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); 
            break;
            
        case "Julho":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJulho2012 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJulho2012[Contador] = ler.nextDouble();
        		Contador++;
        	}        	
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJulho2012);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJulho2012,VetorJulho2012.length, mes, 2012);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJulho2012,VetorJulho2012.length, mes, 2012);
        	}else {
        		RelatorioMet.executa(VetorJulho2012, VetorJulho2012.length, mes, 2012);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); 
            break;

        case "Agosto":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorAgosto2012 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAgosto2012[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAgosto2012);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAgosto2012,VetorAgosto2012.length, mes, 2012);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAgosto2012,VetorAgosto2012.length, mes, 2012);
        	}else {
        		RelatorioMet.executa(VetorAgosto2012, VetorAgosto2012.length, mes, 2012);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); 
            break;
            
        case "Setembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorSetembro2012 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorSetembro2012[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorSetembro2012);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorSetembro2012,VetorSetembro2012.length, mes, 2012);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorSetembro2012,VetorSetembro2012.length, mes, 2012);
        	}else {
        		RelatorioMet.executa(VetorSetembro2012, VetorSetembro2012.length, mes, 2012);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); 
            break;

        case "Outubro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorOutubro2012 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorOutubro2012[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorOutubro2012);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorOutubro2012,VetorOutubro2012.length, mes, 2012);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorOutubro2012,VetorOutubro2012.length, mes, 2012);
        	}else {
        		RelatorioMet.executa(VetorOutubro2012, VetorOutubro2012.length, mes, 2012);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); 
            break;
            
        case "Novembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorNovembro2012 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorNovembro2012[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorNovembro2012);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorNovembro2012,VetorNovembro2012.length, mes, 2012);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorNovembro2012,VetorNovembro2012.length, mes, 2012);
        	}else {
        		RelatorioMet.executa(VetorNovembro2012, VetorNovembro2012.length, mes, 2012);
        		}
        	        	
            MetodoSwitch.SwitchzaoDaMassa(); 
            break;

        case "Dezembro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorDezembro2012 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorDezembro2012[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorDezembro2012);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorDezembro2012,VetorDezembro2012.length, mes, 2012);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorDezembro2012,VetorDezembro2012.length, mes, 2012);
        	}else {
        		RelatorioMet.executa(VetorDezembro2012, VetorDezembro2012.length, mes, 2012);
        		}
        	
        	
            MetodoSwitch.SwitchzaoDaMassa(); 
            break;
            
        default:
        	
        	System.out.println("Digite um mes válido!");
        	MetodoSwitch.SwitchzaoDaMassa();

    }
		
		
		
	}

}
