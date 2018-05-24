package calc;
import java.util.Scanner;
public class calc 
{
public static void main(String[] args)
{
Scanner scan = new Scanner (System.in);
System.out.println("Izberi operaciq : [1] Subirane [2] Izvajdane [3] Umnojenie [4] Delenie");
int operaciq = scan.nextInt();
System.out.println("Vavedi chislo");
int a = scan.nextInt();
System.out.println("Vavedi chislo");
int b = scan.nextInt();
 if (operaciq==1){
int c=a+b;
System.out.println("Rezultata e " + c);
 }
 else if (operaciq==2){
	int c=a-b;
	System.out.println("Rezultata e " + c);
 }
 else if (operaciq==3){
	 int c=a*b;
	 System.out.println("Rezultata e " + c);
 }
 else {
	 int c=a/b;
	 System.out.println("Rezultata e " +c);
 }
}
}

