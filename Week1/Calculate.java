import javax.swing.JOptionPane;
public class Calculate {
    public static void main(String[] args) {
        String Str1, Str2; 
        Str1 = JOptionPane.showInputDialog(null, "Please Input first num", "Enter first num", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(Str1); 
        Str2 = JOptionPane.showInputDialog(null, "Please Input second number", "Second number", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(Str2); 

        String res = "Sum: "; 
        
        res += (num1 + num2) + " Difference: " + (Math.abs(num1 - num2)) + " Product: " + (num1*num2) + " Quotient: ";
        if(num2 == 0){
            res += "Error!"; 
        }
        else{
            res += (num1/num2);
        }
        JOptionPane.showMessageDialog(null, res, "Show", JOptionPane.INFORMATION_MESSAGE); 
        System.exit(0);        
    }
}