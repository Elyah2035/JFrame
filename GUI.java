import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private int count;
    private JLabel lable;
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    public GUI(){
         frame = new JFrame();
         panel = new JPanel();
         button = new JButton("Dont push me");
         button.addActionListener(this);

        lable = new JLabel("");


        panel.setBorder(BorderFactory.createEmptyBorder(50,50,10,30));//top,left,bottom,right
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(lable);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//stops the program when close (otherwise runs in the background)
        frame.setTitle("duck");// top title
        frame.pack();
        frame.setVisible(true); // sets it true that we can see the window
    }


    public static void main(String[] args) {

        new GUI();


    }


    @Override
    public void actionPerformed(ActionEvent e) {
       count++;

           lable.setText("I SAID DONT");
       }
    }
