import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Ccontroller implements ActionListener {

    Cmodels cm;
    Cviews cv;

    public Ccontroller(Cmodels cm, Cviews cv) {

        this.cm = cm;
        this.cv = cv;

        cv.add.addActionListener(this);
        cv.sub.addActionListener(this);
        cv.mul.addActionListener(this);
        cv.div.addActionListener(this);
        cv.clear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cv.clear) {
            cv.txta.setText("");
            cv.txtb.setText("");
            cv.txtresult.setText("");
            cv.txta.requestFocus();
            return;
        }

        try {
            double a = Double.parseDouble(cv.txta.getText());
            double b = Double.parseDouble(cv.txtb.getText());

            double result;

            if (e.getSource() == cv.add) {
                result = cm.add(a, b);
                cv.txtresult.setText(String.valueOf(result));
            }

            else if (e.getSource() == cv.sub) {
                result = cm.sub(a, b);
                cv.txtresult.setText(String.valueOf(result));
            }

            else if (e.getSource() == cv.mul) {
                result = cm.mul(a, b);
                cv.txtresult.setText(String.valueOf(result));
            }

            else if (e.getSource() == cv.div) {
                result = cm.div(a, b);
                cv.txtresult.setText(String.valueOf(result));
            }

        } catch (NumberFormatException exception) {

            JOptionPane.showMessageDialog(
                    cv,
                    "Please enter valid numbers.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE
            );

        } catch (ArithmeticException exception) {

            JOptionPane.showMessageDialog(
                    cv,
                    exception.getMessage(),
                    "Calculation Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}