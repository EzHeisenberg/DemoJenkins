package com.epsi.mycal;
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
    int a;
    int b;
    int res;
    Calculator c = new Calculator();

    //Scanner
    System.out.print("Entrez votre choix : ");
    Scanner sc = new Scanner(System.in);
    choix = sc.nextInt();


    switch (choix) {
      case 1:
        System.out.print("Entrez votre 1er nombre : ");
        a = sc.nextInt();
        System.out.print("Entrez votre 2er nombre : ");
        b = sc.nextInt();
        res = c.add(a, b);
        System.out.print(a +" + " + b + " = " + res);
        break;
      case 2:
        System.out.print("Entrez votre 1er nombre : ");
        a = sc.nextInt();
        System.out.print("Entrez votre 2er nombre : ");
        b = sc.nextInt();
        res = c.sub(a, b);
        System.out.print(a +" - " + b + " = " + res);
        break;
      case 3:
        System.out.print("Entrez votre 1er nombre : ");
        a = sc.nextInt();
        System.out.print("Entrez votre 2er nombre : ");
        b = sc.nextInt();
        res = c.mul(a, b);
        System.out.print(a +" * " + b + " = " + res);
        break;
      case 4:
        System.out.print("Entrez votre 1er nombre : ");
        a = sc.nextInt();
        System.out.print("Entrez votre 2er nombre : ");
        b = sc.nextInt();
        res = c.div(a, b);
        System.out.print(a +" / " + b + " = " + res);
        break;
      case 5:
        System.out.print("Entrez votre nombre : ");
        a = sc.nextInt();
        System.out.print(c.pair(a));
        break;
      case 6:
        System.out.print("Entrez votre nombre : ");
        a = sc.nextInt();
        System.out.print(c.premier(a));
        break;
    }



  }

}
