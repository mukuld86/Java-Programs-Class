import javax.swing.*;

public class Calculator extends JFrame {
    private JLabel jNumber1;

    public Calculator(){
        setTitle("Simple Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
