package ex2;

import javax.swing.JOptionPane;

public class Ex2 {
	
	public static void main(String args[]) {
		int a;
		a = Integer.parseInt((JOptionPane.showInputDialog("Digite um numero")));
		System.out.println(Ex2(a));
	}
	
	public static String Ex2(int n) {
		if (n >= 2000)
			return "entrada limitada a 2000";
		//condi��o de parada. se o valor for igual a 1 n�o h� mais convers�o, pois o resultado ser� ele mesmo
		else if (n == 1) {
			return Integer.toString(n%2);
		}
		else {
			int r;
			r = n/2;
			// a fun��o retorna uma string com o resto da divis�o atual, ao mesmo tempo ela chama a si mesma enviando o resultado inteiro
			// da divis�o do numero atual por 2, possibilitando que a convers�o contine ocorrendo
			return Ex2(r) + Integer.toString(n%2);
		}
	}
}
