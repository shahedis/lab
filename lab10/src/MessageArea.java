import javax.swing.*;
import java.awt.*;

public class MessageArea extends JPanel {
      JTextField textField;
      JButton btn;
      private  static final String LABEL = "send message";
       public MessageArea(){
           super();
           this.setLayout(new BorderLayout());
           textField = new JTextField();
           this.add(textField,BorderLayout.CENTER);
           btn = new JButton(LABEL);
           this.add(btn,BorderLayout.EAST);
           this.setVisible(true);
       }



    }
