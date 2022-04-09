import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage {
    private JFrame frame;
    private JPanel MainPage;
    private JLabel l1;
    private JButton custbutton;
    private JButton storebutton;

    public MainPage(){
        //Creating Main Frame
        frame =new JFrame();
        frame.setContentPane(MainPage);
        frame.setTitle("Jewelry Store");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //Change page
        custbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == custbutton){
                    frame.dispose();
                    CustomerHome myWindow = new CustomerHome();

                }

            }
        });

        //Change page
        storebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == storebutton){
                    frame.dispose();
                    EmployeeHome myWindow = new EmployeeHome();

                }

            }
        });
    }

    public static void main(String[] args) {
        MainPage project = new MainPage();

    }
}
