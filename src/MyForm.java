import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm extends JFrame{

    private JTextField pole1;
    private JTextField pole2;
    Abrobotchik abr = new Abrobotchik();

    public MyForm(String name) {
        super(name);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pole1 = new JTextField(10);
        pole2 = new JTextField(12);
        add(pole1);
        add(pole2);
        pack();
        setVisible(true);
        pole1.addActionListener(abr);
        pole2.addActionListener(abr);


    }
     private class Abrobotchik implements ActionListener {
         public void actionPerformed(ActionEvent event){
           String s1 = "Hello ";
           if(event.getSource()== pole1){
               s1 = String.format("pol1 : % s" ,event.getActionCommand());
           }else if (event.getSource()== pole1){
                 s1 = String.format("pol2 : % s" ,event.getActionCommand());
             }
           JOptionPane.showConfirmDialog(null, s1);
}
    }
}