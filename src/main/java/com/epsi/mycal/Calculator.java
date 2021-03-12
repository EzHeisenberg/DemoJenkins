package com.epsi.mycal;

public class Calculator {

  public int add(int valueA, int valueB) {
    return valueA + valueB;
  }

  public int sub(int valueA, int valueB) {
    return valueA - valueB;
  }

  public int mul(int valueA, int valueB) {
    return valueA * valueB;
  }

  public int div(int valueA, int valueB) {
    return valueA / valueB;
  }


  public boolean pair(int valueA) {
    if (valueA % 2 == 0) {
      System.out.println("Le nombre est pair.");
      return true;
    }
    else{
      System.out.println("Le nombre est impair.");
      return false;
    }
  }

  public boolean premier(int valueA){
    int reste;
    boolean flag = true;

    for(int i=2; i <= valueA/2; i++)
    {
      //nombre est divisible par lui-meme
      reste = valueA%i;

      //si le reste est 0, alors arrete la boucle. Sinon continuer la boucle
      if(reste == 0)
      {
        flag = false;
        break;
      }
    }
    //si flag est true, alors nombre est premier, sinon non premier
    if(flag){
      System.out.println(valueA + " est un nombre premier");
      return true;
    }
    else{
      System.out.println(valueA + " n'est pas un nombre premier");
      return false;
    }
  }






}
