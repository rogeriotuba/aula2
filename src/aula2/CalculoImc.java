package aula2;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		//Realizar o calculo de IMC onde  calculo é Peso/(Altura *Altura)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o seu peso:  ");
		Double peso = scan.nextDouble();
		System.out.println("O  seu peso e "+ peso);
		
		
		System.out.println("Digite o seu altura:  ");
		Double altura = scan.nextDouble();
		System.out.println("A sua altura  e "+ altura);
		
		Double IMC = peso/(altura*altura);
		System.out.println("O seu IMC e "+ IMC);
		
		
		if(IMC<18.5){
			System.out.println("O seu IMC e "+ IMC +"Você está abaixo do Peso");	
		}
		else if(IMC>=18.5 && IMC<=24.9){
			System.out.println("O seu IMC e "+ IMC +"Você está com Peso normal");	
		}
		else if(IMC>=25 && IMC<=29.9){
			System.out.println("O seu IMC e "+ IMC +"Você está com Sobre Peso ");	
		}
		else if(IMC>=30 && IMC<=34.9){
			System.out.println("O seu IMC e "+ IMC +"Você está com Obesidade  Grau I");	
		}
		else if(IMC>=35 && IMC<=39.9){
			System.out.println("O seu IMC e "+ IMC +"Você está com Obesidade  Grau II");	
		}
		else {
			System.out.println("O seu IMC e "+ IMC +"Você está com Obesidade  Grau III");	
		}
	}

}
