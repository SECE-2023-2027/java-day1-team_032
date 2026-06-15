import java.util.Scanner;

public class sixth_program {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimal = sc.nextInt();
        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal number is : " + hex);
    }   
}
