package LAB10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentRegistrationForm extends JFrame implements ActionListener {

    JTextField tname, tfname, tmname, tphone, temail, day, month, year, taddress;
    JRadioButton male, female, other, cse, eee, bba;
    JCheckBox c, cpp, java, ai;
    JComboBox<String> cb;

    JButton submit, reset;

    StudentRegistrationForm() {

        setTitle("Student Registration Form");
        setSize(600,750);
        setLayout(null);
        getContentPane().setBackground(Color.YELLOW);

        JLabel title = new JLabel("Student Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBounds(150,20,350,30);
        add(title);

        JLabel name = new JLabel("Name:");
        name.setBounds(50,80,120,25);
        add(name);

        tname = new JTextField();
        tname.setBounds(200,80,250,25);
        add(tname);

        JLabel fname = new JLabel("Father's Name:");
        fname.setBounds(50,120,120,25);
        add(fname);

        tfname = new JTextField();
        tfname.setBounds(200,120,250,25);
        add(tfname);

        JLabel mname = new JLabel("Mother's Name:");
        mname.setBounds(50,160,120,25);
        add(mname);

        tmname = new JTextField();
        tmname.setBounds(200,160,250,25);
        add(tmname);

        JLabel phone = new JLabel("Phone:");
        phone.setBounds(50,200,120,25);
        add(phone);

        tphone = new JTextField();
        tphone.setBounds(200,200,250,25);
        add(tphone);

        JLabel email = new JLabel("Email:");
        email.setBounds(50,240,120,25);
        add(email);

        temail = new JTextField();
        temail.setBounds(200,240,250,25);
        add(temail);

        JLabel gender = new JLabel("Gender:");
        gender.setBounds(50,280,120,25);
        add(gender);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");

        male.setBounds(200,280,70,25);
        female.setBounds(270,280,80,25);
        other.setBounds(360,280,70,25);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        bg.add(other);

        add(male);
        add(female);
        add(other);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setBounds(50,320,120,25);
        add(dob);

        day = new JTextField();
        month = new JTextField();
        year = new JTextField();

        day.setBounds(200,320,40,25);
        month.setBounds(250,320,40,25);
        year.setBounds(300,320,60,25);

        add(day);
        add(month);
        add(year);

        JLabel address = new JLabel("Address:");
        address.setBounds(50,360,120,25);
        add(address);

        taddress = new JTextField();
        taddress.setBounds(200,360,250,25);
        add(taddress);

        JLabel blood = new JLabel("Blood Group:");
        blood.setBounds(50,400,120,25);
        add(blood);

        String[] bloods={"Select","A+","A-","B+","B-","O+","O-","AB+","AB-"};
        cb = new JComboBox<>(bloods);
        cb.setBounds(200,400,100,25);
        add(cb);

        JLabel dept = new JLabel("Department:");
        dept.setBounds(50,440,120,25);
        add(dept);

        cse = new JRadioButton("CSE");
        eee = new JRadioButton("EEE");
        bba = new JRadioButton("BBA");

        cse.setBounds(200,440,60,25);
        eee.setBounds(270,440,60,25);
        bba.setBounds(340,440,60,25);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(cse);
        bg2.add(eee);
        bg2.add(bba);

        add(cse);
        add(eee);
        add(bba);

        JLabel course = new JLabel("Course:");
        course.setBounds(50,480,120,25);
        add(course);

        c = new JCheckBox("C");
        cpp = new JCheckBox("C++");
        java = new JCheckBox("Java");
        ai = new JCheckBox("AI");

        c.setBounds(200,480,50,25);
        cpp.setBounds(250,480,60,25);
        java.setBounds(310,480,60,25);
        ai.setBounds(370,480,50,25);

        add(c);
        add(cpp);
        add(java);
        add(ai);

        submit = new JButton("Submit");
        submit.setBounds(200,550,100,30);
        add(submit);

        reset = new JButton("Reset");
        reset.setBounds(320,550,100,30);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==submit) {

            String name=tname.getText();
            String father=tfname.getText();
            String mother=tmname.getText();
            String phone=tphone.getText();
            String email=temail.getText();
            String address=taddress.getText();

            String gender="";
            if(male.isSelected()) gender="Male";
            else if(female.isSelected()) gender="Female";
            else gender="Other";

            String dob=day.getText()+"-"+month.getText()+"-"+year.getText();
            String blood=cb.getSelectedItem().toString();

            String department="";
            if(cse.isSelected()) department="CSE";
            else if(eee.isSelected()) department="EEE";
            else department="BBA";

            String course="";
            if(c.isSelected()) course+="C ";
            if(cpp.isSelected()) course+="C++ ";
            if(java.isSelected()) course+="Java ";
            if(ai.isSelected()) course+="AI ";

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection con=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/studentdb",
                        "root",
                        "rashika@god"
                );

                Statement st=con.createStatement();

                String query="insert into student(name,father_name,mother_name,phone,email,gender,dob,address,blood_group,department,course) "
                        + "values('"+name+"','"+father+"','"+mother+"','"+phone+"','"+email+"','"+gender+"','"+dob+"','"+address+"','"+blood+"','"+department+"','"+course+"')";

                st.executeUpdate(query);

                JOptionPane.showMessageDialog(this,"Data Inserted Successfully");

                con.close();

            } catch(Exception ex) {
                System.out.println(ex);
            }
        }

        if(e.getSource()==reset) {

            tname.setText("");
            tfname.setText("");
            tmname.setText("");
            tphone.setText("");
            temail.setText("");
            taddress.setText("");

            day.setText("");
            month.setText("");
            year.setText("");

            male.setSelected(false);
            female.setSelected(false);
            other.setSelected(false);

            cse.setSelected(false);
            eee.setSelected(false);
            bba.setSelected(false);

            c.setSelected(false);
            cpp.setSelected(false);
            java.setSelected(false);
            ai.setSelected(false);

            cb.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}