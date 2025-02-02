import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField display;
    private double firstNum = 0;
    private String operator = "";
    private boolean isOperatorClicked = false;

    public CalculatorGUI() {
        setTitle("Калькулятор");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        String[] buttons = {
                "7", "8" , "9", "/",
                "4", "5" , "6", "*",
                "1", "2" , "3", "-",
                "C", "0" , "=", "+"
        };
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 + num2;
            case "*":
                return num1 + num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(this, "Ошибка: деление на ноль!",
                            "Ошибка", JOptionPane.ERROR_MESSAGE);
                    return 0;
                }
            default:
                return 0;
        }
    }
}
