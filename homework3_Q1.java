import java.util.Scanner;
import java.util.Arrays;
public class homework3_Q1 {

    public static void main(String[] args) {  

        int target = (int) (Math.random() * 100) + 1;  
        System.out.print("target "+target);
        int user_count=3;
        int[] nums = new int[user_count]; // kullanıcıların girdiği sayıları tutacak dizi
        int[] counts = new int[user_count]; // kullanıcıların deneme sayılarını tutacak dizi
        Scanner scanner = new Scanner(System.in);
                for (int i = 0; i < 3; i++) {
                    if(nums[i]==target){
                        System.out.print("Kullanıcı " + (i+1) + " lütfen bir sayı giriniz: ");
                         nums[i] = scanner.nextInt();
                         break;
                    }
            
        }
        boolean flag=false;
        while (flag!=true) {
            for (int i = 0; i < user_count; i++) {
                if(nums[i]==target){
                    flag=true;
                    break;
                }
               else if (nums[i] < target&&flag==false) {
                    System.out.print("Kullanıcı " + (i+1) + ", too low, try again: ");
                    nums[i] = scanner.nextInt();
                    counts[i]++;
                    if(nums[i]==target){
                        flag=true;
                        break;
                    }

                } else if (nums[i] > target&&flag==false) {
                    System.out.print("Kullanıcı " + (i+1) + ", too high, try again: ");
                    nums[i] = scanner.nextInt();
                    counts[i]++;
                    if(nums[i]==target){
                        flag=true;
                        break;
                    }
                }
            }
        }
        
        System.out.println("Tebrikler! Sayıyı doğru bildiniz.");
        
        for (int i = 0; i < user_count; i++) {
            if (nums[i] == target) {
                System.out.println("Kullanıcı " + (i+1) + " kazandı. Sayı: " + target);
                System.out.println("Kullanıcı " + (i+1) + "'in deneme sayısı: " + counts[i]);
            }
            else{
                System.out.println("Kullanıcı " + (i+1) + "'in deneme sayısı: " + counts[i]);
            }
        }
        
       

    }  
}
