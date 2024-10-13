import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculadoraSwing extends JFrame implements ActionListener {
    private JTextField display;
    private String operador;
    private double num1, num2;

    public CalculadoraSwing() {
        // Configurações da janela
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Tela de exibição
        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Painel de botões
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        // Criação dos botões
        String[] botoes = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String texto : botoes) {
            JButton button = new JButton(texto);
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        switch (comando) {
            case "C":
                display.setText("");
                break;
            case "=":
                num2 = Double.parseDouble(display.getText());
                switch (operador) {
                    case "+":
                        display.setText(String.valueOf(num1 + num2));
                        break;
                    case "-":
                        display.setText(String.valueOf(num1 - num2));
                        break;
                    case "*":
                        display.setText(String.valueOf(num1 * num2));
                        break;
                    case "/":
                        if (num2 != 0) {
                            display.setText(String.valueOf(num1 / num2));
                        } else {
                            display.setText("Erro");
                        }
                        break;
                }
                break;
            default:
                if ("+-*/".contains(comando)) {
                    num1 = Double.parseDouble(display.getText());
                    operador = comando;
                    display.setText("");
                } else {
                    display.setText(display.getText() + comando);
                }
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraSwing calc = new CalculadoraSwing();
            calc.setVisible(true);
        });
    }
}
