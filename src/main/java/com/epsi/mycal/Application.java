package com.epsi.mycal;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) {

    System.out.println("Calculator");
    System.out.println("--------------------------");
    System.out.println("1 - Addition");
    System.out.println("2 - Soustraction");
    System.out.println("3 - Multiplication");
    System.out.println("4 - Division");
    System.out.println("5 - Nombre pair / impaire");
    System.out.println("6 - Nombre premier");
    System.out.println("--------------------------");

    int choix;
    int valueA;
    int valueB;
    int res;
    Calculator c = new Calculator();

    //Scanner
    System.out.print("Entrez votre choix : ");
    Scanner scanner = new Scanner(System.in, Charset.defaultCharset());
    choix = scanner.nextInt();


    switch (choix) {
      case 1:
        System.out.print("Entrez votre 1er nombre : ");
        valueA = scanner.nextInt();
        System.out.print("Entrez votre 2er nombre : ");
        valueB = scanner.nextInt();
        res = c.add(valueA, valueB);
        System.out.print(valueA +" + " + valueB + " = " + res);
        break;
      case 2:
        System.out.print("Entrez votre 1er nombre : ");
        valueA = scanner.nextInt();
        System.out.print("Entrez votre 2er nombre : ");
        valueB = scanner.nextInt();
        res = c.sub(valueA, valueB);
        System.out.print(valueA +" - " + valueB + " = " + res);
        break;
      case 3:
        System.out.print("Entrez votre 1er nombre : ");
        valueA = scanner.nextInt();
        System.out.print("Entrez votre 2er nombre : ");
        valueB = scanner.nextInt();
        res = c.mul(valueA, valueB);
        System.out.print(valueA +" * " + valueB + " = " + res);
        break;
      case 4:
        System.out.print("Entrez votre 1er nombre : ");
        valueA = scanner.nextInt();
        System.out.print("Entrez votre 2er nombre : ");
        valueB = scanner.nextInt();
        res = c.div(valueA, valueB);
        System.out.print(valueA +" / " + valueB + " = " + res);
        break;
      case 5:
        System.out.print("Entrez votre nombre : ");
        valueA = scanner.nextInt();
        System.out.print(c.pair(valueA));
        break;
      case 6:
        System.out.print("Entrez votre nombre : ");
        valueA = scanner.nextInt();
        System.out.print(c.premier(valueA));
        break;
      default:
        System.out.println("EHEH");
        break;
    }



  }

}
