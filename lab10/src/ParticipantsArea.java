import javax.swing.*;
import java.awt.*;

    public class ParticipantsArea extends JPanel {
        private  static final String LABEL = "online list" ;
        DefaultListModel<String> onlinelist;
        public ParticipantsArea(){
            super();
            this.setLayout(new BorderLayout());
            JLabel label = new JLabel(LABEL);
            this.add(label,BorderLayout.PAGE_START);
            onlinelist = new DefaultListModel<>();
            JList<String> list = new JList<>(onlinelist);
            list.setSize(50,50);
            this.add(list,BorderLayout.WEST);
            this.setVisible(true);
        }
        public void addonlineperson(String username){
            onlinelist.addElement(username);
        }
        public void removeonlineperson(String username){
            onlinelist.removeElement(username);
        }






    }
