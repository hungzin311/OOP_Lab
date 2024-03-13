import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main(String[] args) {
        String Strnum1, Strnum2; 
        String StrNotification = "You've just enter: ";

        Strnum1 = JOptionPane.showInputDialog(null,
                                            "Please input the first number",
                                            "Input the first number",JOptionPane.INFORMATION_MESSAGE);
        StrNotification += Strnum1 + " and ";

        Strnum2 = JOptionPane.showInputDialog(null,
                                            "Please input the second number",
                                            "Input the second number",JOptionPane.INFORMATION_MESSAGE);

        StrNotification += Strnum2; 

        JOptionPane.showMessageDialog(null, StrNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0); 
    }
}
