import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor=1;
		int comp=0;
		int max=0;

		Scanner lector=new Scanner(System.in);
		
		for(int i=0; i<10;i++) {
			System.out.println("Introdueix un valor nou");
			comp=lector.nextInt();
			if(i==0) {
				valor=comp;
				max=comp;
			}
			if(valor>=comp) {
				valor=comp;
			}
			if(max<=comp){
			max=comp;
			}
		}
		
		System.out.println(valor);
		System.out.println(max);
	}

}
