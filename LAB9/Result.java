//Write a GUI program in Java with three Labels – Enter the First Number, Enter the Second Number, Result, and three text fields for  - first number, second number and result and four buttons - Add, Sub, multiply and reset as shown below. On clicking of any of these buttons, the corresponding operation should be performed with input1 and input2 and the result should be displayed in the result box. 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Result {
    public static void main(String[] args) {
        // Frame
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        JLabel num1Label = new JLabel("Enter the First Number:");
        num1Label.setBounds(20, 20, 150, 30);
        frame.add(num1Label);

        JLabel num2Label = new JLabel("Enter the Second Number:");
        num2Label.setBounds(20, 60, 150, 30);
        frame.add(num2Label);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 100, 150, 30);
        frame.add(resultLabel);

        // Text Fields
        JTextField num1Field = new JTextField();
        num1Field.setBounds(180, 20, 150, 30);
        frame.add(num1Field);

        JTextField num2Field = new JTextField();
        num2Field.setBounds(180, 60, 150, 30);
        frame.add(num2Field);

        JTextField resultField = new JTextField();
        resultField.setBounds(180, 100, 150, 30);
        resultField.setEditable(false);
        frame.add(resultField);

        // Buttons
        JButton addBtn = new JButton("Add");
        addBtn.setBounds(20, 150, 80, 30);
        frame.add(addBtn);

        JButton subBtn = new JButton("Sub");
        subBtn.setBounds(110, 150, 80, 30);
        frame.add(subBtn);

        JButton mulBtn = new JButton("Multiply");
        mulBtn.setBounds(200, 150, 100, 30);
        frame.add(mulBtn);

        JButton resetBtn = new JButton("Reset");
        resetBtn.setBounds(310, 150, 80, 30);
        frame.add(resetBtn);        
     }
}