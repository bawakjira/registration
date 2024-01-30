
// Java program to implement
// a Simple Registration Form
// using Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

class MyFrame
        extends JFrame
        implements ActionListener {

    private final JTextField tname;
    private final JTextField tlname;
    private final JTextField tID;
    private final JTextField tdept;

    private final JTextField tgrade;

    private final JTextField tmno;
    private final JLabel Acadamic;
    private final JComboBox<String> date;
    private final JComboBox<String> month;
    private final JComboBox<String> year;
    private final JTextArea tadd;
    private JCheckBox term;
    private final JButton reset;
    private JTextArea tout;
    private final JLabel res;
    private JTextArea resadd;
    private double gpa;

    // constructor, to initialize the components
    // with default values.
    public MyFrame() {
        setTitle("Fresh Student Registration Form");
        setBounds(1000, 10, 1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        // Components of the Form
        Container c = getContentPane();
        c.setLayout(null);

        JLabel title = new JLabel("Fresh Student Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(3000, 30);
        title.setLocation(300, 30);
        c.add(title);

        JLabel name = new JLabel("First name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(190, 20);
        name.setLocation(200, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 20));
        tname.setSize(190, 20);
        tname.setLocation(340, 100);
        c.add(tname);

        JLabel lname = new JLabel("Last name");
        lname.setFont(new Font("Arial", Font.PLAIN, 20));
        lname.setSize(190, 20);
        lname.setLocation(200, 130);
        c.add(lname);
        tlname = new JTextField();
        tlname.setFont(new Font("Arial", Font.PLAIN, 15));
        tlname.setSize(190, 20);
        tlname.setLocation(340, 130);
        c.add(tlname);
        JLabel dept = new JLabel("Departement");
        dept.setFont(new Font("Arial", Font.PLAIN, 20));
        dept.setSize(150, 20);
        dept.setLocation(200, 160);
        c.add(dept);
        tdept = new JTextField();
        tdept.setFont(new Font("Arial", Font.PLAIN, 15));
        tdept.setSize(210, 20);
        tdept.setLocation(340, 160);
        tdept.setEditable(false);
        c.add(tdept);
        JLabel grade = new JLabel("Grade");
        grade.setFont(new Font("Arial", Font.PLAIN, 20));
        grade.setSize(150, 20);
        grade.setLocation(200, 190);
        c.add(grade);
        tgrade = new JTextField();
        tgrade.setFont(new Font("Arial", Font.PLAIN, 15));
        tgrade.setSize(210, 20);
        tgrade.setLocation(340, 190);
        c.add(tgrade);
        JLabel semister = new JLabel("Semister");
        semister.setFont(new Font("Arial", Font.PLAIN, 20));
        semister.setSize(150, 20);
        semister.setLocation(200, 220);
        c.add(semister);
        String[] tsemists = {"1", "2", "3", "4", "5",
                "6", "7", "8", "9", "10",
        };
        JComboBox<String> tsemist = new JComboBox<>(tsemists);
        tsemist.setFont(new Font("Arial", Font.PLAIN, 15));
        tsemist.setSize(210, 20);
        tsemist.setLocation(340, 220);
        c.add(tsemist);
        JLabel mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(200, 250);
        c.add(mno);
        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(340, 250);
        c.add(tmno);
        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(200, 280);
        c.add(gender);
        JRadioButton male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(340, 280);
        c.add(male);
        JRadioButton female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(415, 280);
        c.add(female);
        ButtonGroup gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        JLabel ID = new JLabel("ID Number");
        ID.setFont(new Font("Arial", Font.PLAIN, 20));
        ID.setSize(100, 20);
        ID.setLocation(200, 315);
        c.add(ID);
        tID = new JTextField();
        tID.setFont(new Font("Arial", Font.PLAIN, 15));
        tID.setSize(150, 20);
        tID.setLocation(340, 315);
        c.add(tID);

        Acadamic  = new JLabel("Regist.date");
        Acadamic.setFont(new Font("Arial", Font.PLAIN, 20));
        Acadamic.setSize(100, 20);
        Acadamic.setLocation(200, 350);
        c.add(Acadamic);
        String[] dates = {"1", "2", "3", "4", "5",
                "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30",
                "31"};
        date = new JComboBox<>(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(340, 350);
        c.add(date);
        String[] months = {"Jan", "feb", "Mar", "Apr",
                "May", "Jun", "July", "Aug",
                "Sup", "Oct", "Nov", "Dec"};
        month = new JComboBox<>(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(390, 350);
        c.add(month);
        String[] years = {"1995", "1996", "1997", "1998",
                "1999", "2000", "2001", "2002",
                "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010",
                "2011", "2012", "2013", "2014",
                "2015", "2016", "2017", "2018",
                "2019", "2019", "2019", "2019", "2019", "2020", "2021", "2022"};
        year = new JComboBox<>(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(460, 350);
        c.add(year);
        JLabel add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(200, 380);
        c.add(add);
        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(340, 380);
        tadd.setLineWrap(true);
        c.add(tadd);
        JButton sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(290, 500);
        sub.addActionListener(this);
        c.add(sub);
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(410, 500);
        reset.addActionListener(this);
        c.add(reset);
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(240, 550);
        c.add(res);
        setVisible(true);
        sub.addActionListener(new ActionListener() {
            final String validNumber= "^\\d*$";
            final String validLetter ="^[a-zA-Z]*$";
            final String ValidLetteralidlen = "^[tname >2 && tname <= 50]*$,[tlname >2 && tlname <= 50]*$";
            final String validphone = "^\\d*$";

            @Override
            public void actionPerformed(ActionEvent e) {
                String result = tgrade.getText().toString();
                String phone = tmno.getText().toString();
                if (tname.getText().toString().isEmpty()){
                    JOptionPane.showMessageDialog(null, "please write your first name");
                    return;
                }else if (tID.getText().toString().isEmpty()){
                    JOptionPane.showMessageDialog(null, "please write your ID Number");
                    return;
                }else if (!tname.getText().toString().matches(validLetter)) {
                    JOptionPane.showMessageDialog(null, "please write first name in letter only");
                    return;
                }
                else if (tlname.getText().toString().isEmpty()){
                    JOptionPane.showMessageDialog(null, "please write your last name");
                    return;
                }else if (!tlname.getText().toString().matches(validLetter)) {
                    JOptionPane.showMessageDialog(null, "please write lastname in letter only");
                    return;
                }
                else if (result.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "please write grade");
                    return;
                }
                else if (result.matches(validLetter)) {
                    JOptionPane.showMessageDialog(null, "please write gpa in number");
                    return;
                }
                else if (phone.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "phone number is mandatory");
                    return;
                } else if (!phone.matches(validphone)) {
                    JOptionPane.showMessageDialog(null, "please write must be Number");
                    return;
                }else if (phone.length() != 10) {
                    JOptionPane.showMessageDialog(null, "please write correct digit");
                    return;
                } else if (phone.indexOf("09")!=0) {
                    JOptionPane.showMessageDialog(null, "please write phone number inn format way");
                    return;
                }
                else if (tadd.getText().toString().isEmpty()){
                    JOptionPane.showMessageDialog(null, "please write your Addresses");
                    return;
                }
                else {
                    gpa = Double.parseDouble(String.valueOf(result));
                }
                if (gpa < 1.76) {
                    JOptionPane.showMessageDialog(null, "you are failed");
                    return;
                } else if (gpa >= 1.76 && gpa < 2.0) {
                    JOptionPane.showMessageDialog(null, "you are warning, please be strong");
                    return;
                } else if (gpa >= 2.0 && gpa < 3.0) {
                    JOptionPane.showMessageDialog(null, "you cannot register in informatics college");
                    return;
                } else if (gpa >= 3.0 && gpa <= 3.2) {
                    String dep="INFORMATION SCIENCE";
                    tdept.setText(dep);
                    try {
                        FileWriter fileWriter= new FileWriter("C:\\Users\\ADMIN\\Documents\\Assignment\\IS.txt",true);
                        fileWriter.write("====================================\n");
                        fileWriter.write("WELCOME TO INFORMATION SCIENCE DEPARTMENT\n");
                        fileWriter.write("First name: "+tname.getText()+"\n");
                        fileWriter.write("Last name :"+tlname.getText()+"\n");
                        fileWriter.write("ID Number :"+tID.getText()+"\n");
                        fileWriter.write("departement :"+dep+"\n");
                        fileWriter.write("grade :"+tgrade.getText()+"\n");
                        fileWriter.write("Address: "+tadd.getText()+"\n");
                        fileWriter.close();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    JOptionPane.showMessageDialog(null, "WELCOME ,you are Registered in INFORMATION SCIENCE");
                    return;
                } else if (gpa > 3.2 && gpa <= 3.4) {
                    String dep="INFORMATION TECHNOLOGY";
                    tdept.setText(dep);
                    try {
                        FileWriter fileWriter= new FileWriter("C:\\Users\\ADMIN\\Documents\\Assignment\\IT.txt",true);
                        fileWriter.write("====================================\n");
                        fileWriter.write("WELCOME TO INFORMATION TECHNOLOGY DEPARTMENT\n");
                        fileWriter.write("First name: "+tname.getText()+"\n");
                        fileWriter.write("Last name :"+tlname.getText()+"\n");
                        fileWriter.write("ID Number :"+tID.getText()+"\n");
                        fileWriter.write("departement :"+dep+"\n");
                        fileWriter.write("grade :"+tgrade.getText()+"\n");
                        fileWriter.write("Address: "+tadd.getText()+"\n");
                        fileWriter.close();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    JOptionPane.showMessageDialog(null, "WELCOME ,you are Registered in INFORMATION TECHNOLOGY");
                    return;
                } else if (gpa > 3.40 && gpa <= 3.6) {
                    String dep="COMPUTER SCIENCE ";
                    tdept.setText(dep);
                    try {
                        FileWriter fileWriter= new FileWriter("C:\\Users\\ADMIN\\Documents\\Assignment\\CS.txt",true);
                        fileWriter.write("====================================\n");
                        fileWriter.write("WELCOME TO COMPUTER SCIENCE DEPARTMENT\n");
                        fileWriter.write("First name: "+tname.getText()+"\n");
                        fileWriter.write("Last name :"+tlname.getText()+"\n");
                        fileWriter.write("ID Number :"+tID.getText()+"\n");
                        fileWriter.write("departement :"+dep+"\n");
                        fileWriter.write("grade :"+tgrade.getText()+"\n");
                        fileWriter.write("Address: "+tadd.getText()+"\n");
                        fileWriter.close();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    JOptionPane.showMessageDialog(null, "WELCOME ,you are Registered in COMPUTER SCIENCE");
                    return;
                }
                else if (gpa > 3.6 && gpa <= 4.0) {
                    String dep="SOFTWARE ENGINEERING";
                    tdept.setText(dep);
                    try {
                        FileWriter fileWriter= new FileWriter("C:\\Users\\ADMIN\\Documents\\Assignment\\SW.txt",true);
                        fileWriter.write("====================================\n");
                        fileWriter.write("WELCOME TO SOFTWARE ENGINEERING DEPARTMENT\n");
                        fileWriter.write("First name: "+tname.getText()+"\n");
                        fileWriter.write("Last name :"+tlname.getText()+"\n");
                        fileWriter.write("ID Number :"+tID.getText()+"\n");
                        fileWriter.write("departement :"+dep+"\n");
                        fileWriter.write("grade :"+tgrade.getText()+"\n");
                        fileWriter.write("Address: "+tadd.getText()+"\n");
                        fileWriter.close();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    JOptionPane.showMessageDialog(null, "WELCOME ,you are Registered in SOFTWARE ENGINEERING");
                    return;
                }
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == reset) {
                    String def = "";
                    tname.setText(def);
                    tID.setText(def);
                    tgrade.setText(def);
                    tlname.setText(def);
                    tadd.setText(def);
                    tdept.setText(def);
                    Acadamic.setText(def);
                    tmno.setText(def);
                    res.setText(def);
                    tout.setText(def);
                    term.setSelected(false);
                    date.setSelectedIndex(0);
                    month.setSelectedIndex(0);
                    year.setSelectedIndex(0);
                    resadd.setText(def);
                }
            }
        });
    }
    public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
