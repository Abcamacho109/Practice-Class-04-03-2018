import java.util.Scanner;

public class Prom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sca = new Scanner (System.in);
System.out.println("Please Enter A Number");


int [] e = new int[5];
int [] b = new int[5];

int pop [] = new int [5];
for (int i = 0; i < pop.length; i++) {
	e[i] = Sca.nextInt();
	b[i] = Sca.nextInt();
	pop[i] = e[i] + b[i];
	System.out.println(pop[i]);
}


	}

}
