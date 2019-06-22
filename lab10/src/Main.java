    public class Main
    {

        public static void main(String [] args)
        {
        chatroomGUI chatroom = new chatroomGUI();
        NameFrame name = new NameFrame();
            chatroom.addnewMessage("User1","this is message");
        for(int i=0;i<=10;i++)
        {
           chatroom.addnewparticipants("user"+i);
        }
        }
    }
