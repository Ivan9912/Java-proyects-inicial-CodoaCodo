import java.util.Scanner;

public class jassvass {
    public static void main(String[] args) {

        /*int numero1,numero2,numero3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un primer número");
        numero1 = sc.nextInt();
        System.out.println("Ingrese un segundo número");
        numero2 = sc.nextInt();
        System.out.println("Ingrese un tercer número");
        numero3 = sc.nextInt();


        if ((numero1 == numero2) && (numero1 == numero3)) {
            System.out.println("Todos los números son iguales ");
        }else {
            if ((numero1 > numero2) && (numero1 > numero3)) {
                System.out.println("El número mayor entre los tres números es el numero 1: " + numero1);
            } else {
                if (numero2 > numero3) {
                    System.out.println("El número mayor entre los tres números es el numero 2: " + numero2);
                } else {
                    System.out.println("El número mayor entre los tres números es el numero 3: " + numero3);
                }
            }
        }*/
//---------------------------------------------
        /*int numeroIngresado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 10, por favor.");
        numeroIngresado = sc.nextInt();


        if ((numeroIngresado < 1) || (numeroIngresado > 10)) {
            System.out.println("No ingresaste un número del 1 al 10. Vuelva a intentar.");
        }else while (numeroIngresado <= 10) {
            System.out.println("Número impreso: " + numeroIngresado + "/10");
            numeroIngresado++;
        }*/
//------------------------------------------------

        for (int i=2; i<=50; i++) {
            if (i%2 == 0) {
                System.out.println("Este es un número par y es el número: " + i);
            }else {
                System.out.println("Aquí yace un número impar...");
            }
        }
//-----------------------------------------------------


    }
}