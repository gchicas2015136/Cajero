import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;

public class Cajero{
	public static void main(String args []){
	Random rand = new Random();
	BigInteger numTrans = new BigInteger (50, rand);
	int saldoA, saldoB, retiroA, retiroB, retiromaxA, retiromaxB, totalA, totalB, i, S;
	retiromaxA = 0;
	retiromaxB = 0;
	String usuario, contra;
	i = 1;
	saldoA = 3000;
	saldoB = 5000;
	Scanner scan = new Scanner(System.in);
	System.out.println("*******************************************");
	System.out.println("Bienvenido a este Cajero Automatico");
	System.out.println("*******************************************");
	System.out.println("Ingrese su usuario Porfavor: ");
		usuario = scan.next();
	System.out.println("*******************************************");
	System.out.println("Ingrese su Contraseña porfavor : ");
		contra = scan.next();
	System.out.println("*******************************************");

		if(usuario.equals("Juan") && contra.equals("1234")){
	System.out.println("Bienvenido Juan");
	System.out.println("Tu saldo es : " + saldoA);
	while (i <= 1){
	System.out.println(" ");
	System.out.println("*******************************************");
	System.out.println("Ingrese cuanto dinero desea retirar Porfavor");
	System.out.println("*******************************************");
	
		System.out.println("1. Q10");
		System.out.println("2. Q50");
		System.out.println("3. Q100");
		System.out.println("4. Q500");
		System.out.println("5. Q1000");
		System.out.println("6. Q1500");
		System.out.println("7. Q2000");
		System.out.println("8. Monto Variable");	
		System.out.println("9. Salir");	
		System.out.println("*******************************************");
		int op = scan.nextInt();

		
		switch(op){
	
			case 1:

	if(retiromaxA >= 2000){
	System.out.println("*******************************************");
	System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor");
	System.out.println("*******************************************");
		}else{
		i = 1;
		totalA = saldoA - 10;
		saldoA = totalA;
		retiromaxA = retiromaxA + 10;
			
	if(totalA >= 0) {
		System.out.println("*******************************************");
		System.out.println("Si puede retirar dinero, su saldo total es : " + totalA);
		System.out.println("Numero de Transacion: " + numTrans);
		System.out.println("*******************************************");
	}else if(totalA <= 0) {
		System.out.println("*******************************************");
		System.out.println("No puede retirar dinero en este momento, usted tiene un saldo negativo, porfavor resuelva las deudas pendientes con el banco");
		System.out.println("*******************************************");	
	}else if(totalA == 0) {
		System.out.println("*******************************************");
		System.out.println("No puedes retirar dinero en este momento, su saldo esta vacio en este momento");
		System.out.println("*******************************************");
		}
	}
		break;	

			case 2:
		if(retiromaxA >= 2000){
		System.out.println("*******************************************");
		System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor");
		System.out.println("*******************************************");
		}else{
		i = 1;
		totalA = saldoA - 50;
		saldoA = totalA;	
		retiromaxA = retiromaxA + 50;
	if(totalA >= 0) {
		System.out.println("*******************************************");
		System.out.println("Si puede retirar dinero, su saldo total es : " + totalA);
		System.out.println("Numero de Transacion: " + numTrans);
		System.out.println("*******************************************");
	}else if(totalA <= 0) {
		System.out.println("*******************************************");
		System.out.println("No puede retirar dinero en este momento, usted tiene un saldo negativo, porfavor resuelva las deudas pendientes con el banco");
		System.out.println("*******************************************");	
	}else if(totalA == 0) {
		System.out.println("*******************************************");
		System.out.println("No puedes retirar dinero en este momento, su saldo esta vacio en este momento");
		System.out.println("*******************************************");
		}
	}
		break;	

			case 3:

		if(retiromaxA >= 2000){
		System.out.println("*******************************************");
		System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor");
		System.out.println("*******************************************");
		}else{
		i = 1;
		totalA = saldoA - 100;
		saldoA = totalA;	
		retiromaxA = retiromaxA + 100;
	if(totalA >= 0) {
		System.out.println("*******************************************");
		System.out.println("Si puede retirar dinero, su saldo total es : " + totalA);
		System.out.println("Numero de Transacion: " + numTrans);
		System.out.println("*******************************************");
	}else if(totalA <= 0) {
		System.out.println("*******************************************");
		System.out.println("No puede retirar dinero en este momento, usted tiene un saldo negativo, porfavor resuelva las deudas pendientes con el banco");
		System.out.println("*******************************************");	
	}else if(totalA == 0) {
		System.out.println("*******************************************");
		System.out.println("No puedes retirar dinero en este momento, su saldo esta vacio en este momento");
		System.out.println("*******************************************");
		}
	}
		break;	

			case 4:

		if(retiromaxA >= 2000){
		System.out.println("*******************************************");
		System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor");
		System.out.println("*******************************************");
		}else{
		i = 1;
		totalA = saldoA - 500;
		saldoA = totalA;	
		retiromaxA = retiromaxA + 500;
	if(totalA >= 0) {
		System.out.println("*******************************************");
		System.out.println("Si puede retirar dinero, su saldo total es : " + totalA);
		System.out.println("Numero de Transacion: " + numTrans);
		System.out.println("*******************************************");
	}else if(totalA <= 0) {
		System.out.println("*******************************************");
		System.out.println("No puede retirar dinero en este momento, usted tiene un saldo negativo, porfavor resuelva las deudas pendientes con el banco");
		System.out.println("*******************************************");	
	}else if(totalA == 0) {
		System.out.println("*******************************************");
		System.out.println("No puedes retirar dinero en este momento, su saldo esta vacio en este momento");
		System.out.println("*******************************************");
		}
	}
		break;	

			case 5:

		if(retiromaxA >= 2000){
		System.out.println("*******************************************");
		System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor");
		System.out.println("*******************************************");
		}else{
		i = 1;
		totalA = saldoA - 1000;
		saldoA = totalA;	
		retiromaxA = retiromaxA + 1000;
	if(totalA >= 0) {
		System.out.println("*******************************************");
		System.out.println("Si puede retirar dinero, su saldo total es : " + totalA);
		System.out.println("Numero de Transacion: " + numTrans);
		System.out.println("*******************************************");
	}else if(totalA <= 0) {
		System.out.println("*******************************************");
		System.out.println("No puede retirar dinero en este momento, usted tiene un saldo negativo, porfavor resuelva las deudas pendientes con el banco");
		System.out.println("*******************************************");	
	}else if(totalA == 0) {
		System.out.println("*******************************************");
		System.out.println("No puedes retirar dinero en este momento, su saldo esta vacio en este momento");
		System.out.println("*******************************************");
		}
	}
		break;	

			case 6:
		if(retiromaxA >= 2000){	
		System.out.println("*******************************************");
		System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor");
		System.out.println("*******************************************");
		}else{
		i = 1;
		totalA = saldoA - 1500;
		saldoA = totalA;	
		retiromaxA = retiromaxA + 1500;
	if(totalA >= 0) {
		System.out.println("*******************************************");
		System.out.println("Si puede retirar dinero, su saldo total es : " + totalA);
		System.out.println("Numero de Transacion: " + numTrans);
		System.out.println("*******************************************");
	}else if(totalA <= 0) {
		System.out.println("*******************************************");
		System.out.println("No puede retirar dinero en este momento, usted tiene un saldo negativo, porfavor resuelva las deudas pendientes con el banco");
		System.out.println("*******************************************");	
	}else if(totalA == 0) {
		System.out.println("*******************************************");
		System.out.println("No puedes retirar dinero en este momento, su saldo esta vacio en este momento");
		System.out.println("*******************************************");
		}
	}
		break;	

			case 7:
		if(retiromaxA >= 2000){
		System.out.println("*******************************************");
		System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor");
		System.out.println("*******************************************");
		}else{
		i = 1;
		totalA = saldoA - 2000;
		saldoA = totalA;
		retiromaxA = retiromaxA + 2000;
	if(totalA >= 0) {
		System.out.println("*******************************************");
		System.out.println("Si puede retirar dinero, su saldo total es : " + totalA);
		System.out.println("Numero de Transacion: " + numTrans);
		System.out.println("*******************************************");
	}else if(totalA <= 0) {
		System.out.println("*******************************************");
		System.out.println("No puede retirar dinero en este momento, usted tiene un saldo negativo, porfavor resuelva las deudas pendientes con el banco");
		System.out.println("*******************************************");	
	}else if(totalA == 0) {
		System.out.println("*******************************************");
		System.out.println("No puedes retirar dinero en este momento, su saldo esta vacio en este momento");
		System.out.println("*******************************************");
		}
	}
		break;	

	
				case 8:
		if(retiromaxA >= 2000){
		System.out.println("*******************************************");
		System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor");
		System.out.println("*******************************************");
		}else{
		i = 1;
		
		System.out.println("*******************************************");
		System.out.println("Has escogido la opcion de Monto vatiable");	
		System.out.println("Ingrese cuanto desea sacar porfavor: (2000 maximo)");	
		System.out.println("Tiene que ser multiplo de 50");
		System.out.println("*******************************************");
		retiroA = scan.nextInt();
		S = retiroA%50;
		retiromaxA = retiromaxA + retiroA;
		if(S == 0 && retiroA <= 2000){
		totalA = saldoA - retiroA;
		saldoA = totalA;
		System.out.println("Has ingresado la cantidad de " + retiroA);		
		System.out.println("*******************************************");
		System.out.println("Su saldo Actual es de " + totalA);
		System.out.println("*******************************************");
		}else{			
		System.out.println("*******************************************");	
		System.out.println("La cantidad ingresada no es multiplo de 50, ingrese una cantidad valida porfavor");
		System.out.println("*******************************************");
		}
	}
		break;	


			case 9:
		i = 100;
		System.out.println("*******************************************");
		System.out.println("Has salido del cajero, !Muchas Gracias!");
		System.out.println("*******************************************");
		
				break;	
		
				} //while(A)
			} //switch(A)

	//if(juan)		
	}else if(usuario.equals("Carlos") && contra.equals("Kinal")){
	System.out.println("Bienvenido Carlos");
	System.out.println("Tu saldo es : " + saldoB);
	while (i <= 1){
	System.out.println(" ");
	System.out.println("*******************************************");
	System.out.println("Ingrese cuanto dinero desea retirar Porfavor");
	System.out.println("*******************************************");
		System.out.println("1. Q10");
		System.out.println("2. Q50");
		System.out.println("3. Q100");
		System.out.println("4. Q500");
		System.out.println("5. Q1000");
		System.out.println("6. Q1500");
		System.out.println("7. Q2000");
		System.out.println("8. Monto Variable");	
		System.out.println("9. Salir");	
		System.out.println("*******************************************");
		int op = scan.nextInt();

		switch(op){
			case 1:

		if(retiromaxB >= 2000){
		System.out.println("*******************************************");
		System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor");
		System.out.println("*******************************************");
		}else{
		i = 1;
		totalB = saldoB - 10;
		saldoB = totalB;	
		retiromaxB = retiromaxB + 10;

	if(totalB >= 0) {
		System.out.println("*******************************************");
		System.out.println("Si puede retirar dinero, su saldo total es : " + totalB);
		System.out.println("Numero de Transacion: " + numTrans);
		System.out.println("*******************************************");
	}else if(totalB <= 0) {
		System.out.println("*******************************************");
		System.out.println("No puede retirar dinero en este momento, usted tiene un saldo negativo, porfavor resuelva las deudas pendientes con el banco");
		System.out.println("*******************************************");
	}else if(totalB == 0) {
		System.out.println("*******************************************");
		System.out.println("No puedes retirar dinero en este momento, su saldo esta vacio en este momento");
		System.out.println("*******************************************");
		}
	}
		break;	

			case 2:
		
		if(retiromaxB >= 2000){
		System.out.println("*******************************************");
		System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor");
		System.out.println("*******************************************");
		}else{
		i = 1;
		totalB = saldoB- 50;
		saldoB = totalB;	
		retiromaxB = retiromaxB + 50;

	if(totalB >= 0) {
		System.out.println("*******************************************");
		System.out.println("Si puede retirar dinero, su saldo total es : " + totalB);
		System.out.println("Numero de Transacion: " + numTrans);
		System.out.println("*******************************************");
	}else if(totalB <= 0) {
		System.out.println("*******************************************");
		System.out.println("No puede retirar dinero en este momento, usted tiene un saldo negativo, porfavor resuelva las deudas pendientes con el banco");
		System.out.println("*******************************************");
	}else if(totalB == 0) {
		System.out.println("*******************************************");
		System.out.println("No puedes retirar dinero en este momento, su saldo esta vacio en este momento");
		System.out.println("*******************************************");
		}

		break;	
	}
			case 3:

		
		if(retiromaxB >= 2000){
		System.out.println("*******************************************");
		System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor");
		System.out.println("*******************************************");
		}else{
		i = 1;
		totalB = saldoB - 100;
		saldoB = totalB;	
		retiromaxB = retiromaxB + 100;

	if(totalB >= 0) {
		System.out.println("*******************************************");
		System.out.println("Si puede retirar dinero, su saldo total es : " + totalB);
		System.out.println("Numero de Transacion: " + numTrans);
		System.out.println("*******************************************");
	}else if(totalB <= 0) {
		System.out.println("*******************************************");
		System.out.println("No puede retirar dinero en este momento, usted tiene un saldo negativo, porfavor resuelva las deudas pendientes con el banco");
		System.out.println("*******************************************");
	}else if(totalB == 0) {
		System.out.println("*******************************************");
		System.out.println("No puedes retirar dinero en este momento, su saldo esta vacio en este momento");
		System.out.println("*******************************************");
		}
			break;	
	}
			case 4:
		
		
		if(retiromaxB >= 2000){
		System.out.println("*******************************************");
		System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor, !Gracias por usar nuestros servicios!");
		System.out.println("*******************************************");
		}else{
		i = 1;
		totalB = saldoB- 500;
		saldoB = totalB;	
		retiromaxB = retiromaxB + 500;

	if(totalB >= 0) {
		System.out.println("*******************************************");
		System.out.println("Si puede retirar dinero, su saldo total es : " + totalB);
		System.out.println("Numero de Transacion: " + numTrans);
		System.out.println("*******************************************");
	}else if(totalB <= 0) {
		System.out.println("*******************************************");
		System.out.println("No puede retirar dinero en este momento, usted tiene un saldo negativo, porfavor resuelva las deudas pendientes con el banco");
		System.out.println("*******************************************");
	}else if(totalB == 0) {
		System.out.println("*******************************************");
		System.out.println("No puedes retirar dinero en este momento, su saldo esta vacio en este momento");
		System.out.println("*******************************************");
		}
	}
		break;	

			case 5:

		
		if(retiromaxB >= 2000){
		System.out.println("*******************************************");
		System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor");
		System.out.println("*******************************************");
		}else{
		i = 1;
		totalB = saldoB- 1000;
		saldoB = totalB;
		retiromaxB = retiromaxB + 1000;
	
	if(totalB >= 0) {
		System.out.println("*******************************************");
		System.out.println("Si puede retirar dinero, su saldo total es : " + totalB);
		System.out.println("Numero de Transacion: " + numTrans);
		System.out.println("*******************************************");
	}else if(totalB <= 0) {
		System.out.println("*******************************************");
		System.out.println("No puede retirar dinero en este momento, usted tiene un saldo negativo, porfavor resuelva las deudas pendientes con el banco");
		System.out.println("*******************************************");
	}else if(totalB == 0) {
		System.out.println("*******************************************");
		System.out.println("No puedes retirar dinero en este momento, su saldo esta vacio en este momento");
		System.out.println("*******************************************");
		}
		break;	
	}
			case 6:

		
		if(retiromaxB >= 2000){
		System.out.println("*******************************************");
		System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor");
		System.out.println("*******************************************");
		}else{
		i = 1;
		totalB = saldoB- 1500;
		saldoB = totalB;	
		retiromaxB = retiromaxB + 1500;

	if(totalB >= 0) {
		System.out.println("*******************************************");
		System.out.println("Si puede retirar dinero, su saldo total es : " + totalB);
		System.out.println("Numero de Transacion: " + numTrans);
		System.out.println("*******************************************");
	}else if(totalB <= 0) {
		System.out.println("*******************************************");
		System.out.println("No puede retirar dinero en este momento, usted tiene un saldo negativo, porfavor resuelva las deudas pendientes con el banco");
		System.out.println("*******************************************");
	}else if(totalB == 0) {
		System.out.println("*******************************************");
		System.out.println("No puedes retirar dinero en este momento, su saldo esta vacio en este momento");
		System.out.println("*******************************************");
		}
	}
		break;	

			case 7:

		
		if(retiromaxB > 2000){
		System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor");
		}else{
		i = 1;
		totalB = saldoB - 2000;
		saldoB = totalB;
		retiromaxB = retiromaxB + 2000;

	if(totalB >= 0) {
		System.out.println("*******************************************");
		System.out.println("Si puede retirar dinero, su saldo total es : " + totalB);
		System.out.println("Numero de Transacion: " + numTrans);
		System.out.println("*******************************************");
	}else if(totalB <= 0) {
		System.out.println("*******************************************");
		System.out.println("No puede retirar dinero en este momento, usted tiene un saldo negativo, porfavor resuelva las deudas pendientes con el banco");
		System.out.println("*******************************************");
	}else if(totalB == 0) {
		System.out.println("*******************************************");
		System.out.println("No puedes retirar dinero en este momento, su saldo esta vacio en este momento");
		System.out.println("*******************************************");
		}
	}
		break;	

			
				case 8:

		
		if(retiromaxB >= 2000){
	System.out.println("Ya has llegado al limite de retiros por hoy, regresa otro dia porfavor");
		}else{
		i = 1;
		
		System.out.println("*******************************************");
		System.out.println("Has escogido la opcion de Monto vatiable");	
		System.out.println("Ingrese cuanto desea sacar porfavor: (2000 maximo)");	
		System.out.println("Tiene que ser multiplo de 50");
		System.out.println("*******************************************");
		retiroB = scan.nextInt();
		S = retiroB%50;
		retiromaxB = retiromaxB + retiroB;
		if(S == 0 && retiroB <= 2000){
		totalB = saldoB - retiroB;
		saldoB = totalB;
		System.out.println("*******************************************");
		System.out.println("Has ingresado la cantidad de " + retiroB);
		System.out.println("*******************************************");
		System.out.println("Su saldo Actual es de " + totalB);
		System.out.println("*******************************************");
		}else{
		System.out.println("*******************************************");
		System.out.println("La cantidad ingresada no es multiplo de 50, ingrese una cantidad valida porfavor");
		System.out.println("*******************************************");
		}	
	}
		break;	


			case 9:
		i = 100;
		System.out.println("*******************************************");
		System.out.println("Has salido del cajero, !Muchas Gracias!");
		System.out.println("*******************************************");
		
				break;	
				}//else if(B)
			}//while(B)
		}//switch(B)
	}//static void main	
}//public class				