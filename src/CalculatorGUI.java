import javax.swing.*;

public class CalculatorGUI extends JFrame {
    private JPanel mainPanel;
    private JButton a0Button;
    private JButton button2;
    private JButton button3;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton button8;
    private JButton button9;
    private JButton xButton;
    private JButton button11;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton CEButton;
    private JButton button1;
    private JButton rootButton;
    private JButton piButton;
    private JTextArea inputStringTextArea;
    private JTextArea outputStringTextArea;

    public CalculatorGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args) {
        //Setting up GUI
        JFrame frame = new CalculatorGUI("My Calculator");
        frame.setVisible(true);
    }

}
