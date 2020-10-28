import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Button implements ActionListener{ 
  JLabel label;

Button() {
      JFrame frame = new JFrame("Homework 7");
      frame.setLayout(new FlowLayout());
      frame.setSize(230,100);

      JButton red = new JButton("Red");
      JButton green = new JButton("Green");
      red.setBackground(Color.RED);
      green.setBackground(Color.GREEN);

      red.addActionListener(this);
      green.addActionListener(this);

      frame.add(red);
      frame.add(green);

      label = new JLabel("Press a color");
      frame.add(label);
      frame.setVisible(true);
}

public void actionPerformed(ActionEvent ae) {
  if(ae.getActionCommand().equals("Red")) {
    label.setText("You pressed red");
  }
  else {
    label.setText("You pressed green");
  }
}

}