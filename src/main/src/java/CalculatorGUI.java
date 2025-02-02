
import javax.swing.*;
import java.awt.*;
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

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        String[] buttons = {
                "7", "8" , "9", "/",
                "4", "5" , "6", "*",
                "1", "2" , "3", "-",
                "C", "0" , "=", "+"
        };

        for(String text: buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            if (isOperatorClicked) {
                display.setText("");
                isOperatorClicked = false;
            }
            display.setText(display.getText() + command);
        } else if (command.equals("C")) { //Очистка
            display.setText("");
            firstNum = 0;
        } else if (command.equals("=")) {
            if (!operator.isEmpty()) {
                double secondNumber = Double.parseDouble(display.getText());
                double result = calculate(firstNum, secondNumber, operator);
                display.setText(String.valueOf(result));
                operator = "";
            }
        } else{ // Если выбрана операция
            if (!operator.isEmpty()) {
                //Если операция уже была выбрана, вычисляем промежуточный результат
                double secondNumber = Double.parseDouble(display.getText());
                double result = calculate(firstNum, secondNumber, operator);
                display.setText(String.valueOf(result));
                firstNum = result;
            } else {
                firstNum = Double.parseDouble(display.getText());
            }
            operator = command;
            isOperatorClicked = true;
        }
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



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorGUI calculatorGUI = new CalculatorGUI();
            calculatorGUI.setVisible(true);
        });
    }
}
