import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab extends JFrame {
    JButton calculate;
    JLabel QuizL;
    JLabel AssiL;
    JLabel MidL;
    JLabel fianlL;
    JLabel CreditHours;
    JTextField QuizT;
    JTextField CRT;
    JTextField CRL;
    JTextField AssiT;
    JTextField AssiTlab;
    JTextField mid;
    JTextField midlab;
    JTextField fianl;
    JTextField fianllab;
    JTextField QuizO;
    JTextField AssiO;
    JTextField AssiOLab;
    JTextField midO;
    JTextField midOlab;
    JTextField fianlO;
    JTextField fianlOlab;
    Box v0,v1,v2,v3,v4,v5,v6,v7,v8;
    public Lab(){
        super("Theory + Lab");
        setLayout(new FlowLayout());
        v0 = Box.createHorizontalBox();
        v1 = Box.createHorizontalBox();
        v2 = Box.createHorizontalBox();
        v3 = Box.createHorizontalBox();
        v4 = Box.createHorizontalBox();
        v6 = Box.createHorizontalBox();
        v7 = Box.createHorizontalBox();
        v8 = Box.createHorizontalBox();
        v5 = Box.createVerticalBox();
        CreditHours = new JLabel("Enter Credit Hours: Theory: ");
        v0.add(CreditHours);
        CRT = new JTextField(3);
        v0.add(CRT);
        v0.add(new JLabel(", Lab: "));
        CRL = new JTextField(3);
        v0.add(CRL);
        v5.add(v0);
        QuizL = new JLabel("Avg. of QUIZES marks: ");
        v1.add(QuizL);
        QuizO = new JTextField(5);
        v1.add(QuizO);
        v1.add(new JLabel("  /  "));
        QuizT = new JTextField(5);
        v1.add(QuizT);
        v5.add(v1);

        AssiL = new JLabel("Avg. of Assignment Marks: ");
        v2.add(AssiL);
        AssiO = new JTextField(5);
        v2.add(AssiO);
        v2.add(new JLabel("  /  "));
        AssiT = new JTextField(5);
        v2.add(AssiT);
        v5.add(v2);

        JLabel AssilabL = new JLabel("Avg. of Lab Assignment Marks: ");
        v6.add(AssilabL);
        AssiOLab = new JTextField(5);
        v6.add(AssiOLab);
        v6.add(new JLabel("  /  "));
        AssiTlab = new JTextField(5);
        v6.add(AssiTlab);
        v5.add(v6);

        MidL = new JLabel("MidTerm Marks: ");
        v3.add(MidL);
        midO = new JTextField(5);
        v3.add(midO);
        v3.add(new JLabel("  /  "));
        mid = new JTextField(5);
        v3.add(mid);
        v5.add(v3);

        JLabel lsd= new JLabel("MidTerm Marks: ");
        v7.add(lsd);
        midOlab = new JTextField(5);
        v7.add(midOlab);
        v7.add(new JLabel("  /  "));
        midlab = new JTextField(5);
        v7.add(midlab);
        v5.add(v7);

        fianlL = new JLabel("Final Marks: ");
        v4.add(fianlL);
        fianlO = new JTextField(5);
        v4.add(fianlO);
        v4.add(new JLabel("  /  "));
        fianl = new JTextField(5);
        v4.add(fianl);
        v5.add(v4);

        JLabel dfL = new JLabel("Lab Final Marks: ");
        v8.add(dfL);
        fianlOlab = new JTextField(5);
        v8.add(fianlOlab);
        v8.add(new JLabel("  /  "));
        fianllab = new JTextField(5);
        v8.add(fianllab);
        v5.add(v8);

        calculate = new JButton("Calculate");
        v5.add(calculate);
        add(v5);
        calculate.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        double quizOb = Double.parseDouble(QuizO.getText());
                        double quizto = Double.parseDouble(QuizT.getText());
                        double assiOb = Double.parseDouble(AssiO.getText());
                        double assito = Double.parseDouble(AssiT.getText());
                        double midOb = Double.parseDouble(midO.getText());
                        double midTo = Double.parseDouble(mid.getText());
                        double finalOb = Double.parseDouble(fianlO.getText());
                        double finalTo = Double.parseDouble(fianl.getText());

                        double quizag = (quizOb/quizto)*15;
                        double assiag = (assiOb/assito)*10;
                        double midsag = (midOb/midTo)*25;
                        double finlag = (finalOb/finalTo)*50;

                        double assiObl = Double.parseDouble(AssiOLab.getText());
                        double assitol = Double.parseDouble(AssiTlab.getText());
                        double midObl = Double.parseDouble(midOlab.getText());
                        double midTol = Double.parseDouble(midlab.getText());
                        double finalObl = Double.parseDouble(fianlOlab.getText());
                        double finalTol = Double.parseDouble(fianllab.getText());

                        double assiagl = (assiOb/assito)*25;
                        double midsagl = (midOb/midTo)*25;
                        double finlagl = (finalOb/finalTo)*50;

                        double t = quizag+assiag+midsag+finlag;
                        double l = assiagl+midsagl+finlagl;
                        int crt = Integer.parseInt(CRT.getText());
                        int crl = Integer.parseInt(CRL.getText());
                        int i = crl+crt;
                        double y = ((crt*t)/i) + ((crl*l)/i);
                        String str = String.format("Your Final Marks are: %.2f",y);
                        JOptionPane.showMessageDialog(null,str);
                        if (y>=90){
                            JOptionPane.showMessageDialog(null,"Your GPA is 4.0");
                        }
                        else if (y >= 85 && y < 90){
                            JOptionPane.showMessageDialog(null,"Your GPA is 3.7");
                        }
                        else if (y >= 80 && y < 85){
                            JOptionPane.showMessageDialog(null,"Your GPA is 3.3");
                        }
                        else if (y >= 75 && y < 80){
                            JOptionPane.showMessageDialog(null,"Your GPA is 3.0");
                        }
                        else if (y >= 70 && y < 75){
                            JOptionPane.showMessageDialog(null,"Your GPA is 2.7");
                        }
                        else if (y >= 65 && y < 70){
                            JOptionPane.showMessageDialog(null,"Your GPA is 2.3");
                        }
                        else if (y >= 60 && y < 65){
                            JOptionPane.showMessageDialog(null,"Your GPA is 2.0");
                        }
                        else if (y >= 55 && y < 60){
                            JOptionPane.showMessageDialog(null,"Your GPA is 1.7");
                        }
                        else if (y >= 50 && y < 55){
                            JOptionPane.showMessageDialog(null,"Your GPA is 1.3");
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"Your GPA is 0");
                        }

                    }
                }
        );
    }
}
