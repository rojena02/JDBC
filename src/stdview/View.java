package stdview;
import javax.swing.*;
public class View {
    JFrame F;
    JLabel labelId, labelUsername, labelPassword;
    JTextField textFieldId, textFieldUsername;
    JPasswordField passwordField;
    JButton btnInsert;

    public View(){
        F = new JFrame("login form");
        //id
        labelId= new JLabel("ID");
        labelId.setBounds(50,50,100,30);
        textFieldId= new JTextField();
        textFieldId.setBounds(200,50,150,30);

        //username
        labelUsername= new JLabel("Name");
        labelUsername.setBounds(50,100,100,30);
        textFieldUsername= new JTextField();
        textFieldUsername.setBounds(200,100,150,30);

        //password
        labelPassword= new JLabel("Password");
        labelPassword.setBounds(50,150,100,30);
        passwordField = new JPasswordField();
        passwordField.setBounds(200,150,150,30);

        //button
        btnInsert=new JButton("Insert");
        btnInsert.setBounds(300,200,100,30);

        btnInsert.addActionListener(e->{
            int id=Integer.parseInt(textFieldId.getText());
            String username=textFieldUsername.getText();
            String pass=passwordField.getText();

            System.out.println("Id="+id);
            System.out.println("Username="+username);
            System.out.println("Password="+pass);


        });

        //frame
        F.add(labelId);
        F.add(textFieldId);
        F.add(labelUsername);
        F.add(textFieldUsername);
        F.add(labelPassword);
        F.add(passwordField);
        F.add(btnInsert);


        F.setSize(1000,1000);
        F.setLayout(null);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String args[]){
        new View();
    }


}
