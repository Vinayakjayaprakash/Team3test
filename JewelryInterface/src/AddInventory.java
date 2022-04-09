import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddInventory {
    private JFrame frame;
    private JPanel MainPanel;
    private JTextField FieldID;
    private JTextField Product;
    private JTextField Manufacture;
    private JTextField Color;
    private JTextField Type;
    private JTextField Price;
    private JButton updateButton;
    private JButton addDataButton;
    private JButton deleteButton;
    private JButton backButton;
    private JTable table1;
    private JLabel Field;
    private JLabel prod;
    private JLabel manu;
    private JLabel col;
    private JLabel ty;
    private JLabel pro;
    private JScrollPane panel1;
    private JPanel panel;

    AddInventory() {
        //Creating Main Frame
        frame = new JFrame();
        frame.setContentPane(MainPanel);
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
                    EmployeeHome myWindow = new EmployeeHome();

                }
            }
        });

        //Adding data from text fields to table
        addDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(FieldID.getText().equals("")||Product.getText().equals("")||Manufacture.getText().equals("")||Color.getText().equals("")||Type.getText().equals("")||Price.getText().equals("")){
                    //JOptionPane.showMessageDialog(this, "Please Enter All Data");
                }
                else {
                    String data[] = {FieldID.getText(),Product.getText(),Manufacture.getText(),Color.getText(),Type.getText(),Price.getText()};
                    FieldID.setText("");
                    Product.setText("");
                    Manufacture.setText("");
                    Color.setText("");
                    Type.setText("");
                    Price.setText("");

                }

            }
        });


    }

    //Change table
    private void createUIComponents() {
        String[] columns = {"FieldID","Product", "Manufacture", "Color", "Type", "Price"};
        Object[][] data = {};
        table1 = new JTable(data, columns);


    }



    }

