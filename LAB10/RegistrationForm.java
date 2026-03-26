import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class RegistrationForm implements ActionListener {

    JFrame f;
    JTextField email, username;
    JPasswordField password, confirm;
    JButton submit;

    RegistrationForm() {

        f = new JFrame("Registration Page");

        JLabel title = new JLabel("Registration Page");
        title.setBounds(150, 30, 200, 30);

        JLabel l1 = new JLabel("Enter Email:");
        l1.setBounds(50, 80, 120, 30);
        email = new JTextField();
        email.setBounds(180, 80, 150, 30);

        JLabel l2 = new JLabel("Enter Username:");
        l2.setBounds(50, 130, 120, 30);
        username = new JTextField();
        username.setBounds(180, 130, 150, 30);

        JLabel l3 = new JLabel("Enter Password:");
        l3.setBounds(50, 180, 120, 30);
        password = new JPasswordField();
        password.setBounds(180, 180, 150, 30);

        JLabel l4 = new JLabel("Confirm Password:");
        l4.setBounds(50, 230, 140, 30);
        confirm = new JPasswordField();
        confirm.setBounds(180, 230, 150, 30);

        submit = new JButton("Submit");
        submit.setBounds(150, 300, 100, 30);

        submit.addActionListener(this);

        f.add(title);
        f.add(l1); f.add(email);
        f.add(l2); f.add(username);
        f.add(l3); f.add(password);
        f.add(l4); f.add(confirm);
        f.add(submit);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String em = email.getText();
        String user = username.getText();
        String pass = String.valueOf(password.getPassword());
        String conf = String.valueOf(confirm.getPassword());

        if (!pass.equals(conf)) {
            JOptionPane.showMessageDialog(f, "Passwords do not match!");
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "rashika@god" // change
            );

            Statement stmt = con.createStatement();

            String query = "INSERT INTO register VALUES ('"
                    + em + "', '" + user + "', '" + pass + "')";

            stmt.executeUpdate(query);

            con.close();

            // ✅ NEW FRAME AFTER SUCCESS
            JFrame success = new JFrame("Success");
            JLabel msg = new JLabel("Student has registered successfully!");
            msg.setBounds(50, 50, 300, 30);

            success.add(msg);
            success.setSize(350, 200);
            success.setLayout(null);
            success.setVisible(true);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}