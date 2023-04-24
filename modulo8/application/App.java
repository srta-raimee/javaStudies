package modulo8.application;

import java.util.Scanner;

import modulo8.entities.Triangle;

public class App {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pega as variaveis já declaradas na classe Triangle e aplica para as instâncias x e y
        Triangle x, y;
        x = new Triangle(); // dizendo que a var aqui se refere a um espaço de memoria que será criado
        y = new Triangle();


        System.out.println("Enter the measure of the triangle X: ");
        x.a = sc.nextDouble(); // atribuindo os valores de a, b e c ao X
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measure of the triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
    
      double areaX = x.calcularArea();
      double areaY = y.calcularArea();

      System.out.printf("The area of the Triangle X is: %.2f \n", areaX );
      System.out.printf("The area of the Triangle Y is: %.2f \n", areaY);
      } 
  }
