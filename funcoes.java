import java.util.Scanner;


public class funcoes {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite 3 numeros: ");

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
        // na mão:
    // if (a > b && a > c){
    //     System.out.println("O número " + a + "é o maior");
    // }
    // else if (b > c ){
    //     System.out.println("O número " + b + "é o maior");
    // }
    // else{
    //     System.out.println("O número " + c + "é o maior");
    // }

    int higher = max(a, b , c);
    showResult(higher);
}
    // function that returns the biggest number 
    public static int max(int x, int y, int z){
        int maior;
        if (x > y && x > z){
            maior = x;
        }
        else if (y > x & y > z){
            maior = y;
        }
        else{
            maior = z;
        }

        return maior;
    }     
    
    // function that only prints the result 
    public static void showResult(int valor) { // void is used when a function doensn't returns a value
        System.out.println("Higher = " + valor);
} 
}
