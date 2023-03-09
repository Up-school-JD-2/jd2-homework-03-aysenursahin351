import java.util.Scanner;
import java.util.Arrays;
public class homework3_Q2{

    public static void main(String[] args) {  

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String text = scanner.nextLine();

        System.out.println("Girilen metin: " + text);
         String reversedText="";
        for (int i = text.length()-1; i >=0 ; i--) {
           // System.out.println(text.charAt(i));
            reversedText+=text.charAt(i);
        }
       // System.out.println("Girilen metin: " + reversedText);

    
    if(text.equals(reversedText)){
        System.out.println("Palindromdur.");
    }
    else{
        System.out.println("Palindrom değildir.");

    }

}
}