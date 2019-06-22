        import javax.swing.*;
        import java.awt.*;

        public class NameFrame extends JFrame {
            private static final String BTN_TXT = " Start Chatting ...";
            private static final String LABEL_TXT = " Choose Your UserName ";
            private static final int WIDTH = 300, HEIGHT = 100;
            JTextField textField;
            JButton btn;

            public NameFrame() throws HeadlessException {
                super();
                this.setLayout(new BorderLayout());
                JLabel label = new JLabel(LABEL_TXT);
                add(label, BorderLayout.PAGE_START);
                textField = new JTextField();
                add(textField, BorderLayout.CENTER);
                btn = new JButton(BTN_TXT);
                add(btn, BorderLayout.PAGE_END);
                setSize(WIDTH, HEIGHT);
                setVisible(true);
            }
        }