import javax.swing.*;

    public class ChatArea extends JTextArea {
        private static final int ROWS = 10, COLUMNS = 30;

        public ChatArea() {
            super(ROWS, COLUMNS);
            this.setEditable(false);
            this.setLineWrap(true);
            this.setVisible(true);

        }
        public void addmessage(String username , String message){

            setText( username  +":\n  "+ message);
        }
    }