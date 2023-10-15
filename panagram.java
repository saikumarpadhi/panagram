import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        S.toLowerCase();
        if(S.length()<26){
            System.out.println("Not a Panagram");
        }
        else {
            for(char ch = 'a'; ch <= 'z';ch++){
                if(S.indexOf(ch) < 0){
                    System.out.println("Not a Panagram");
                }
            }
            System.out.println("It is a Panagram");
        }
    }
}