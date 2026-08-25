import java.util.Scanner;
class PalindromeDSANOSTUB{
      
    public static void main(String args[]){
          
          Scanner sc = new Scanner(System.in);
          StringBuilder sb = new StringBuilder();
          System.out.println("Enter the string to check the plaindrome: ");
      String string = sc.nextLine();
          for(int i = string.length()-1; i>=0;i--){
                char ch = string.charAt(i);
                  sb.append(ch);
            }
            String newString = sb.toString();
                  if(string.equals(newString)){
                        System.out.println("yes");
          }else{
                System.out.println("No");
          }
    }
}

