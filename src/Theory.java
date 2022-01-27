import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Theory extends JFrame {
    JButton calculate;
    JLabel QuizL;
    JLabel AssiL;
    JLabel MidL;
    JLabel fianlL;
    JLabel CreditHours;
    JTextField QuizT;
    JTextField CR;
    JTextField AssiT;
    JTextField mid;
    JTextField fianl;
    JTextField QuizO;
    JTextField AssiO;
    JTextField midO;
    JTextField fianlO;
    Box v0,v1,v2,v3,v4,v5;
    public Theory(){
        super("Theory Only");
        setLayout(new FlowLayout());
        v0 = Box.createHorizontalBox();
        v1 = Box.createHorizontalBox();
        v2 = Box.createHorizontalBox();
        v3 = Box.createHorizontalBox();
        v4 = Box.createHorizontalBox();
        v5 = Box.createVerticalBox();
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

        MidL = new JLabel("MidTerm Marks: ");
        v3.add(MidL);
        midO = new JTextField(5);
        v3.add(midO);
        v3.add(new JLabel("  /  "));
        mid = new JTextField(5);
        v3.add(mid);
        v5.add(v3);

        fianlL = new JLabel("Final Marks: ");
        v4.add(fianlL);
        fianlO = new JTextField(5);
        v4.add(fianlO);
        v4.add(new JLabel("  /  "));
        fianl = new JTextField(5);
        v4.add(fianl);
        v5.add(v4);
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

                        double y = quizag+assiag+midsag+finlag;
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

    public static void main(String[] args) {
        Theory t = new Theory();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setSize(500,500);
        t.setVisible(true);
    }
}
