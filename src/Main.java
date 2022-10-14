import java.util.Scanner;

public class Main {
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

        /*for (int i=2; i<=50; i++) {
        if (i%2 == 0) {
            System.out.println("Este es un número par y es el número: " + i);
        }else {
            System.out.println("Aquí yace un número impar...");
        }
    }*/
//-----------------------------------------------------

    int comprarEntradas, valorEntradaMayores, valorEntradaMenores, cantidadDeMenores, totalEntradaParaMenores, totalEntradaParaMayores, valorTotal;

    valorEntradaMayores = 700;
    valorEntradaMenores = 500;

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de entradas que comprará, por favor.");
    comprarEntradas = sc.nextInt();

    System.out.println("Ingrese la cantidad que les corresponden a los menores de 11 años, por favor.\nLas entradas valen para adultos $700 y para menores $500.");
    cantidadDeMenores = sc.nextInt();

    if ((cantidadDeMenores < comprarEntradas) && (comprarEntradas >= 0) && (cantidadDeMenores >= 0)) {
        totalEntradaParaMenores = cantidadDeMenores * valorEntradaMenores;
        totalEntradaParaMayores = (comprarEntradas - cantidadDeMenores) * valorEntradaMayores;
        valorTotal = totalEntradaParaMenores + totalEntradaParaMayores;

        System.out.println("Solicitó " + comprarEntradas + " entrada/s.\nCon " + cantidadDeMenores + " entrada/s con el precio para menores.\nEl valor a pagar de las entradas para los adultos es de: $" + totalEntradaParaMenores + " pesos.\nY el valor para las entradas de los menores de edad es: $" + totalEntradaParaMayores + " pesos.\nEl valor total a pagar por las entradas es: $" + valorTotal + " pesos.");

    }else {
        System.out.println("ERROR:\nEscribió algún número negativo.\nLa cantidad de entradas para menores es mayor que la cantidad de entradas solicitadas.\nRevise alguno de estos posibles errores. Por favor vuelva a ingresar a realizar su compra. Gracias por su visita.");
    }

//---------------------------------------------------------------------------

        /*String nameUser, passwordUser, nameLogIn, passwordLogIn;
        int count = 3;

        nameLogIn = "user1234";
        passwordLogIn = "1234ñI";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre de Usuario, por favor.");
        nameUser = sc.nextLine();

        while (nameUser.equals(nameLogIn)) {
            System.out.println("Ahora " + nameUser + ", ingrese su contraseña, por favor.");
            passwordUser = sc.nextLine();

            if (passwordUser.equals(passwordLogIn)) {
                System.out.println("Bienvenido " + nameLogIn + "!");
                break;
            }else {
                count--;
                System.out.println(nameLogIn + " Ingresó mal la contraseña...\nVuelva a Ingresar, por favor.\nLe quedan " + count + "/3");
                if (count == 0) {
                    System.out.println(nameLogIn + " Superaste los 3 intentos permitidos para loggear. Vuelva a intentar!");
                    break;
                }
            }

        }*/



    }
}