
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        // sadece uzunluğu tek sayı olan cümlelerde geçerlidir
        Scanner scanner = new Scanner(System.in);
        String cumle = scanner.nextLine();
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < cumle.length() / 2; i++){
            stack.push(cumle.charAt(i));
        }
        //isPalindorme(cumle, stack);
        if(isPalindorme(cumle, stack))
            System.out.println(cumle + " Panilndrom dur");
        else if(!isPalindorme(cumle, stack))
            System.out.println(cumle + " Palindrom değildir");
    }
    
    public static boolean isPalindorme(String cumle, Stack<Character> stack){
        for(int i = (cumle.length()/2)+1; i < cumle.length(); i++){
            if(cumle.charAt(i) != stack.pop()){
                   //System.out.println(cumle + " Panilndrom değildir");
                   return false;
            }
        }
        //System.out.println(cumle + " Panilndrom dur");
        return true;
    }
}
