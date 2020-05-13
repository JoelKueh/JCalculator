import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class CalculatorGUI extends JFrame {
    private JPanel mainPanel;
    private JButton a0Button;
    private JButton decimalButton;
    private JButton calculateButton;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton addButton;
    private JButton divideButton;
    private JButton multiplyButton;
    private JButton subtractButton;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton clearButton;
    private JButton exponentButton;
    private JButton rootButton;
    private JButton piButton;
    private JTextArea inputStringTextArea;
    private JTextArea outputStringTextArea;

    public CalculatorGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();


        decimalButton.addActionListener(new NumberBtnClicked(decimalButton.getText()));
        calculateButton.addActionListener(new NumberBtnClicked(calculateButton.getText()));

        a0Button.addActionListener(new NumberBtnClicked(a0Button.getText()));
        a1Button.addActionListener(new NumberBtnClicked(a1Button.getText()));
        a2Button.addActionListener(new NumberBtnClicked(a2Button.getText()));
        a3Button.addActionListener(new NumberBtnClicked(a3Button.getText()));
        a4Button.addActionListener(new NumberBtnClicked(a4Button.getText()));
        a5Button.addActionListener(new NumberBtnClicked(a5Button.getText()));
        a6Button.addActionListener(new NumberBtnClicked(a6Button.getText()));
        a7Button.addActionListener(new NumberBtnClicked(a7Button.getText()));
        a8Button.addActionListener(new NumberBtnClicked(a8Button.getText()));
        a9Button.addActionListener(new NumberBtnClicked(a9Button.getText()));
        piButton.addActionListener(new NumberBtnClicked(piButton.getText()));

        addButton.addActionListener(new OperandBtnClicked(addButton.getText()));
        divideButton.addActionListener(new OperandBtnClicked(divideButton.getText()));
        multiplyButton.addActionListener(new OperandBtnClicked(multiplyButton.getText()));
        subtractButton.addActionListener(new OperandBtnClicked(subtractButton.getText()));
        exponentButton.addActionListener(new OperandBtnClicked(exponentButton.getText()));
        rootButton.addActionListener(new OperandBtnClicked(rootButton.getText()));

        clearButton.addActionListener(new NumberBtnClicked(clearButton.getText()));
    }

    private class NumberBtnClicked implements ActionListener {
        private String inputStr;

        public NumberBtnClicked(String inputStr) {
            this.inputStr = inputStr;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Number Clicked");


        }
    }

    private class OperandBtnClicked implements ActionListener {
        private String inputStr;

        public OperandBtnClicked(String inputStr) {
            this.inputStr = inputStr;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Operand Clicked");
        }
    }

    private class ClearBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static void main(String[] args) {
        //Setting up GUI
        JFrame frame = new CalculatorGUI("My Calculator");
        frame.setVisible(true);

        int sizeOfArray = 100;

        int[] intArray = (int[])java.lang.reflect.Array.newInstance(int.class, sizeOfArray);
    }
}