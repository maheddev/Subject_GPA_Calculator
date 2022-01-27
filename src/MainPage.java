import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame {
    JButton Lab;
    JButton theory;
    public MainPage(){
        super("Select Subject Type");
        setLayout(new FlowLayout());
        Box v = Box.createHorizontalBox();
        v.setBackground(Color.BLACK);
        theory = new JButton("Theory Only");
        theory.setBorder(new EmptyBorder(20,20,20,20));
        Lab = new JButton("Theory + Lab");
        Lab.setBorder(new EmptyBorder(20,20,20,20));
        v.add(theory);
        v.add(new JLabel("    "));
        v.add(Lab);
        add(v);
        
        handeler h = new handeler();
        theory.addActionListener(h);
        Lab.addActionListener(h);
    }
    private class handeler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == theory){
                dispose();
                Theory t = new Theory();
                t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                t.setSize(500,500);
                t.setVisible(true);
            }
            else if(e.getSource() ==  Lab){
                dispose();
                Lab l = new Lab();
                l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                l.setSize(500,500);
                l.setVisible(true);
            }
        }
    }

    public static void main(String[] args) {
        MainPage m =new MainPage();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setSize(500,500);
        m.setVisible(true);
    }
}
