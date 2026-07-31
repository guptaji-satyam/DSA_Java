package Basics;

public class Palindrome {
     public static void main(String[] args) {

        String name="madam";
        String reverse="";
        
        for (int i = name.length() - 1; i >=0; i--){
            reverse +=  name.charAt(i);
        }
        if(name.equalsIgnoreCase(reverse)){
            System.out.println("is palindrome ");
        }else{
            System.out.println("is not palindrome ");
        }
    }
}
