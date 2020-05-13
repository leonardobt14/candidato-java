import java.util.Locale;
import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int escolaridade, experiencia, pontoescolaridade, pontoexperiencia, a;
		char viagens, habilitacao;
		
		System.out.println ("Qual sua escolaridade?");
		System.out.println ("1) Ensino Fundamental");
		System.out.println ("2) Ensino Médio");
		System.out.println ("3) Ensino Superior");
		System.out.println ("4) Pós-graduação");
		System.out.print ("Digite uma opção: ");
		escolaridade = sc.nextInt();
		
		System.out.println();
		System.out.print("Você tem quantos anos de experiência profissional? ");
		experiencia = sc.nextInt();
		System.out.print("Você tem disponibilidade para viajar (S/N)? ");
		viagens = sc.next().charAt(0);
		System.out.print("Você tem habilitação de motorista (S/N)? ");
		habilitacao = sc.next().charAt(0);
		
		if (escolaridade == 1) {
			pontoescolaridade = 10;
		}
		else if (escolaridade == 2){
			pontoescolaridade = 20;
		}
		else if (escolaridade == 3){
			pontoescolaridade = 30;
		} 
		else {
			pontoescolaridade = 40;
		}
		
		
		if (experiencia == 0) {
			pontoexperiencia = 0;
		}
		else if (experiencia <= 2){
			pontoexperiencia = 10;
		}
		else if (experiencia > 2 && experiencia <= 5){
			pontoexperiencia = 20;
		} 
		else {
			pontoexperiencia = 40;
		}
		
		
		System.out.println();
		System.out.println("Pontos por escolaridade: " + pontoescolaridade);
		System.out.println("Pontos por experiência: " + pontoexperiencia);

		System.out.println();
		if (escolaridade == 1) {
			System.out.println("Infelizmente seu perfil não atende a empresa");
		}
		else {
			System.out.println("Você está habilitado para o(s) seguinte(s) cargo(s):");
			
		if (escolaridade == 2 && habilitacao == 'S') {
			System.out.println("ASSISTENTE");
		}
		if (escolaridade >= 3 && experiencia > 2) {
			System.out.println("GERENTE");
		}
		if (escolaridade >= 3 && experiencia > 5 && viagens == 'S'){
			System.out.println("ANALISTA");
		} 
		}
		
		sc.close();
	}

}
