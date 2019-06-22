import javax.swing.*;
import java.awt.*;

public class chatroomGUI extends JFrame {
        private final String WINDOWS_TITLE = "AUT Chat Room";
        private final int WIDTH = 500, HEIGHT = 500;
        private final int X = 100, Y = 100;
        private ChatArea chatbox;
        private MessageArea sendMessage;
        private ParticipantsArea participants;
        public chatroomGUI() {
            super();
            this.setTitle(WINDOWS_TITLE);
            this.setLayout(new BorderLayout());
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(WIDTH, HEIGHT);
            this.setLocation(X, Y);
            chatbox = new ChatArea();
            sendMessage = new MessageArea();
            participants = new ParticipantsArea();
            this.add(new JScrollPane(chatbox), BorderLayout.CENTER);
            this.add(new JScrollPane(sendMessage),BorderLayout.PAGE_END);
            this.add(new JScrollPane(participants),BorderLayout.WEST);
            this.setVisible(true);
        }
        public void addnewMessage(String username,String message){
            chatbox.addmessage(username,message);

        }
        public void addnewparticipants(String username){
            participants.addonlineperson(username);
        }
        public void removeparticipants(String username){
            participants.removeonlineperson(username);
        }

     }
