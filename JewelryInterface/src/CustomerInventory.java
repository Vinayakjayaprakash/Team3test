import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class CustomerInventory{
    private JFrame frame;
    private JLabel toplabel;
    private JPanel Inventory;
    private JTable table1;
    private JButton button1;
    private JScrollPane panel1;
    String[] columns = new String[]{"Product", "Manufacture", "Color", "Type", "Price"};

    CustomerInventory() {
        //Creating Main Frame
        frame = new JFrame();
        frame.setContentPane(Inventory);
        frame.setTitle("Jewelry Store");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //Change page
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button1){
                    frame.dispose();
                    CustomerHome myWindow = new CustomerHome();

                }
            }
        });
    }

    //Table gets data from mySQL
    private void createUIComponents() {
        DefaultTableModel model = new DefaultTableModel(0,5);
        model.setColumnIdentifiers(columns);
        try {
            table1 = new JTable(model);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jewelrystore","root","Krishna2012");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from products");
            while (rs.next()){
                Object[] row = {rs.getString("Product"),rs.getString("Manufacture"),rs.getString("Color"),rs.getString("Type"),rs.getFloat("Price")};
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


}


