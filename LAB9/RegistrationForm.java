//1.Design a registration form using Swing with following components on it – Label, Textbox, Text area, Checkbox, Radio button and Button, Image.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm {
    public static void main(String[] args) {

        // Frame
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Image
        ImageIcon icon = new ImageIcon("profile.jpeg"); // put image in same folder
        JLabel imgLabel = new JLabel(icon);
        imgLabel.setBounds(180, 10, 100, 100);
        frame.add(imgLabel);

        // Name Label & TextField
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 130, 100, 30);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 130, 200, 30);
        frame.add(nameField);

        // Address Label & TextArea
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 180, 100, 30);
        frame.add(addressLabel);

        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(150, 180, 200, 60);
        frame.add(addressArea);

        // Gender (Radio Buttons)
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 260, 100, 30);
        frame.add(genderLabel);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150, 260, 80, 30);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(230, 260, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        frame.add(male);
        frame.add(female);

        // Hobbies (CheckBoxes)
        JLabel hobbyLabel = new JLabel("Hobbies:");
        hobbyLabel.setBounds(50, 310, 100, 30);
        frame.add(hobbyLabel);

        JCheckBox reading = new JCheckBox("Reading");
        reading.setBounds(150, 310, 100, 30);

        JCheckBox sports = new JCheckBox("Sports");
        sports.setBounds(250, 310, 100, 30);

        frame.add(reading);
        frame.add(sports);

        // Submit Button
        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(180, 370, 100, 30);
        frame.add(submitBtn);

        // Button Action
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String address = addressArea.getText();

                String gender = "";
                if (male.isSelected()) gender = "Male";
                if (female.isSelected()) gender = "Female";

                String hobbies = "";
                if (reading.isSelected()) hobbies += "Reading ";
                if (sports.isSelected()) hobbies += "Sports";

                JOptionPane.showMessageDialog(frame,
                        "Name: " + name +
                        "\nAddress: " + address +
                        "\nGender: " + gender +
                        "\nHobbies: " + hobbies);
            }
        });

        frame.setVisible(true);
    }
}