import sun.applet.Main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerHome {
    private JLabel l1;
    private JPanel CustomerPage;
    private JTextField textField1;
    private JTextField textField2;
    private JButton back;
    private JButton OKButton;
    private JButton itemsButton;
    private JLabel fn;
    private JLabel ln;
    private JFrame frame;

    CustomerHome() {
        //Creating Main Frame
        frame = new JFrame();
        frame.setContentPane(CustomerPage);
        frame.setTitle("Jewelry Store");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //Change page
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == back){
                    frame.dispose();
                    MainPage myWindow = new MainPage();

                }
            }
        });

        //Change page
        itemsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == itemsButton){
                    frame.dispose();
                    CustomerInventory CI = new CustomerInventory();
                }
            }
        });
    }
}
