import java.util.Scanner;
public class MonthDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Please enter the month: ");
        int month = input.nextInt(); 
        System.out.print("Please enter the year: "); 
        int year = input.nextInt();
        if(month > 12 || month < 0){
            System.out.println("Error!");
            System.out.print("Please enter the month: ");
            month = input.nextInt(); 
        }
        if(year < 0){
            System.out.println("Error!");
            System.out.print("Please enter the year: ");
            year = input.nextInt(); 
        }
        int ok = 0; 
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ok = 1; 
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12){
            System.out.println("There is 31 days");
        }
        if(month == 4 || month ==6  || month == 9 || month == 11){ 
            System.out.println("There is 30 days");
        }
        if(month == 2 && ok == 1){
            System.out.println("There is 29 days");
        }
        if(month == 2 && ok == 0){
            System.out.println("There is 28 days");
        }
        input.close();
    }
}
