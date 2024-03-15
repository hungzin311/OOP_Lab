import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = keyboard.nextInt();
        String star = "*";
        for(int i=1; i <=n; i++){
            String empty = "";
            for(int j = 0; j< (n-i); j++) empty += ' '; 
            System.out.println(empty + star + empty);
            star += "**";
        }
        keyboard.close();     
    }
}
