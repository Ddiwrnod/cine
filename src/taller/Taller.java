/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

public class Cine {
	public static void main(String[] args)
	{
		java.util.Scanner lectura = new java.util.Scanner(System.in);
		int sillas[][] = new int [11][21];
		int usuarios[] = new int [1000];
		int tarjeta[] = new int [1000];
		int reserva[] = new int [1000];
		int a,b,c,d,ingresos=0,conttarj=0;
		char op='s';
		char s='s';
		do
		{
			a=menu();
			switch(a)
			{
			case 1:
				System.out.println("Ingrese el número de cédula: ");
				usuarios[conttarj]=lectura.nextInt();
				tarjeta[conttarj]=70000;
				reserva[conttarj]=0;
				conttarj++;
				ingresos=ingresos+70000;
				System.out.println("Press Any Key To Continue...");
		        new java.util.Scanner(System.in).nextLine();
		        break;
			case 2:
				System.out.println("Ingrese su número de cédula: ");
				b=lectura.nextInt();
				d=-1;
				for(int i=0;i<1000;i++)
				{
					if(usuarios[i]==b)
					{
						d=i;
						i=1001;
					}
				}
				if(d==-1)
				{
					System.out.println("El usuario no existe");
					System.out.println("Press Any Key To Continue...");
			        new java.util.Scanner(System.in).nextLine();
					break;
				}
				do
				{
				System.out.println("Ingrese la silla que desea reservar(1-10,1-20: ");
				b=lectura.nextInt();
				c=lectura.nextInt();
				if(sillas[b][c]!=1)
				{
					sillas[b][c]=1;
					if(b>=8)
					{
						ingresos=ingresos+11000;
						reserva[d]=reserva[d]+11000;
					}
					else
					{
						ingresos=ingresos+8000;
						reserva[d]=reserva[d]+8000;
					}
					
				}
				else
				{
					System.out.println("La silla está ocupada");
				}
				System.out.println("si desea reservar otra silla digite s: ");
				s=lectura.next().charAt(0);
				}while(s=='s');
				System.out.println("Press Any Key To Continue...");
		        new java.util.Scanner(System.in).nextLine();
				break;
			case 3:
				do
				{
				System.out.println("Ingrese la silla que desea comprar(1-10,1-20: ");
				b=lectura.nextInt();
				c=lectura.nextInt();
				if(sillas[b][c]!=1)
				{
					sillas[b][c]=1;
					if(b>=8)
						ingresos=ingresos+11000;
					else
						ingresos=ingresos+8000;
				}
				else
				{
					System.out.println("La silla está ocupada");
				}
				System.out.println("si desea comprar otra silla digite s: ");
				s=lectura.next().charAt(0);
				}while(s=='s');
				System.out.println("Press Any Key To Continue...");
		        new java.util.Scanner(System.in).nextLine();
				break;
			case 4:
				do
				{
				System.out.println("Ingrese la silla que desea cancelar(1-10,1-20: ");
				b=lectura.nextInt();
				c=lectura.nextInt();
				if(sillas[b][c]==1)
				{
					sillas[b][c]=0;
					if(b>=8)
						ingresos=ingresos-11000;
					else
						ingresos=ingresos-8000;
				}
				else
				{
					System.out.println("La silla está vacía");
				}
				System.out.println("si desea cancelar otra silla digite s: ");
				s=lectura.next().charAt(0);
				}while(s=='s');
				System.out.println("Press Any Key To Continue...");
		        new java.util.Scanner(System.in).nextLine();
				break;
			case 5:
				System.out.println("Ingrese su número de cédula: ");
				b=lectura.nextInt();
				d=-1;
				for(int i=0;i<1000;i++)
				{
					if(usuarios[i]==b)
					{
						d=i;
						i=1001;
					}
				}
				if(d==-1)
				{
					System.out.println("El usuario no existe");
					System.out.println("Press Any Key To Continue...");
			        new java.util.Scanner(System.in).nextLine();
					break;
				}
				if(tarjeta[d]>reserva[d])
				{
					tarjeta[d]=tarjeta[d]-reserva[d];
					System.out.println("El nuevo saldo de su tarjeta es: "+tarjeta[d]);
				}
				else
				{
					System.out.println("Saldo insuficiente, el pago debe hacerse en efectivo");
				}
				System.out.println("Press Any Key To Continue...");
		        new java.util.Scanner(System.in).nextLine();
				break;
			case 6:
				System.out.println("Ingrese su número de cédula: ");
				b=lectura.nextInt();
				d=-1;
				for(int i=0;i<1000;i++)
				{
					if(usuarios[i]==b)
					{
						d=i;
						i=1001;
					}
				}
				if(d==-1)
				{
					System.out.println("El usuario no existe");
					System.out.println("Press Any Key To Continue...");
			        new java.util.Scanner(System.in).nextLine();
					break;
				}
				System.out.println("Ingrese el saldo que desea recargar");
				b=lectura.nextInt();
				tarjeta[d]=tarjeta[d]+b;
				ingresos=ingresos+b;
				System.out.println("El nuevo saldo de su tarjeta es: "+tarjeta[d]);
			case 7:
				System.out.println("El ingreso total hasta ahora es: " +ingresos);
				System.out.println("Press Any Key To Continue...");
		        new java.util.Scanner(System.in).nextLine();
				break;
			}
		}while(op=='s');
		}
	
	public static int menu()
	{
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		int a;
		System.out.println("1.Compra de tarjeta \n2.Reserva \n3.Compra boletas \n4.Cancelar reserva \n5.Pagar reserva \n6.Recargar tarjeta\n7.Totales vendidos");
		a=teclado.nextInt();
		return a;
	}
}