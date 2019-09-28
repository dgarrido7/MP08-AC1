import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor=0;;
		int comp=0;
		Scanner lector=new Scanner(System.in);
		
		for(int i=0; i<5;i++) {
			System.out.println("Introdueix un valor nou");
			comp=lector.nextInt();
			if(i==0) {
				valor=comp;
			}
			if(valor>=comp) {
				valor=comp;
			}
		}
		
		System.out.println(valor);
		
	}

}
