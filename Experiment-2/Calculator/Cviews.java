import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Cviews extends JFrame {

    JLabel lblA, lblB, lblResult;

    JTextField txta;
    JTextField txtb;
    JTextField txtresult;

    JButton add;
    JButton sub;
    JButton mul;
    JButton div;
    JButton clear;

    public Cviews() {

        setTitle("MVC Calculator");
        setSize(500, 430);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        getContentPane().setBackground(new Color(35, 35, 45));

        JLabel heading = new JLabel("CALCULATOR");
        heading.setBounds(100, 20, 300, 50);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 28));
        heading.setForeground(Color.WHITE);
        add(heading);

        lblA = new JLabel("First Number:");
        lblA.setBounds(60, 95, 150, 35);
        lblA.setFont(new Font("Arial", Font.BOLD, 16));
        lblA.setForeground(Color.WHITE);
        add(lblA);

        txta = new JTextField();
        txta.setBounds(220, 95, 200, 35);
        txta.setFont(new Font("Arial", Font.PLAIN, 16));
        add(txta);

        lblB = new JLabel("Second Number:");
        lblB.setBounds(60, 150, 150, 35);
        lblB.setFont(new Font("Arial", Font.BOLD, 16));
        lblB.setForeground(Color.WHITE);
        add(lblB);

        txtb = new JTextField();
        txtb.setBounds(220, 150, 200, 35);
        txtb.setFont(new Font("Arial", Font.PLAIN, 16));
        add(txtb);

        lblResult = new JLabel("Result:");
        lblResult.setBounds(60, 205, 150, 35);
        lblResult.setFont(new Font("Arial", Font.BOLD, 16));
        lblResult.setForeground(Color.WHITE);
        add(lblResult);

        txtresult = new JTextField();
        txtresult.setBounds(220, 205, 200, 35);
        txtresult.setFont(new Font("Arial", Font.BOLD, 16));
        txtresult.setEditable(false);
        add(txtresult);

        add = new JButton("Add");
        add.setBounds(40, 280, 95, 40);
        add(add);

        sub = new JButton("Subtract");
        sub.setBounds(145, 280, 95, 40);
        add(sub);

        mul = new JButton("Multiply");
        mul.setBounds(250, 280, 95, 40);
        add(mul);

        div = new JButton("Divide");
        div.setBounds(355, 280, 95, 40);
        add(div);

        clear = new JButton("Clear");
        clear.setBounds(190, 340, 110, 35);
        add(clear);

        setVisible(true);
    }
}