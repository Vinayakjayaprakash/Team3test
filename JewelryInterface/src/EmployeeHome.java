import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeHome {
    private JFrame frame;
    private JLabel toplabel;
    private JButton addInventoryButton;
    private JButton pastCustomersButton;
    private JButton backButton;
    private JPanel Home;

    EmployeeHome() {
        //Creating Main Frame
        frame = new JFrame();
        frame.setContentPane(Home);
        frame.setTitle("Jewelry Store");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //Change page
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == backButton){
                    frame.dispose();
                    MainPage myWindow = new MainPage();

                }
            }
        });

        //Change page
        addInventoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == addInventoryButton){
                    frame.dispose();
                    AddInventory myWindow = new AddInventory();

                }

            }
        });
    }
}
