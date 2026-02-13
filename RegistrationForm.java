import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class RegistrationForm {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Authentication");
        frame.setSize(420,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(10,25,20));
        frame.setLayout(null);

        JLabel title = new JLabel("Authentication",SwingConstants.CENTER);
        title.setBounds(20,20,360,30);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial",Font.BOLD,18));
        frame.add(title);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setBounds(40,60,100,20);
        frame.add(emailLabel);

        JTextField emailLogin = new JTextField();
        emailLogin.setBounds(40,80,320,35);
        frame.add(emailLogin);

        JLabel passLabel = new JLabel("Password");
        passLabel.setForeground(Color.WHITE);
        passLabel.setBounds(40,120,100,20);
        frame.add(passLabel);

        JPasswordField passwordLogin = new JPasswordField();
        passwordLogin.setBounds(40,140,320,35);
        frame.add(passwordLogin);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(40,190,320,35);
        loginBtn.setBackground(new Color(0,200,120));
        frame.add(loginBtn);

        JLabel signupText = new JLabel("Don't have an account? Sign up",SwingConstants.CENTER);
        signupText.setBounds(40,230,320,25);
        signupText.setForeground(Color.LIGHT_GRAY);
        frame.add(signupText);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setBounds(40,260,100,20);
        frame.add(nameLabel);

        JTextField name = new JTextField();
        name.setBounds(40,280,320,35);
        frame.add(name);

        JLabel phoneLabel = new JLabel("Phone Number");
        phoneLabel.setForeground(Color.WHITE);
        phoneLabel.setBounds(40,320,150,20);
        frame.add(phoneLabel);

        JTextField phone = new JTextField();
        phone.setBounds(40,340,320,35);
        frame.add(phone);

        JLabel locationLabel = new JLabel("Location");
        locationLabel.setForeground(Color.WHITE);
        locationLabel.setBounds(40,380,150,20);
        frame.add(locationLabel);

        JTextField location = new JTextField();
        location.setBounds(40,400,320,35);
        frame.add(location);

        JPanel rolePanel = new JPanel();
        rolePanel.setBounds(40,450,320,40);
        rolePanel.setBackground(new Color(10,25,20));

        JRadioButton admin = new JRadioButton("Admin");
        JRadioButton responder = new JRadioButton("Responder");
        JRadioButton citizen = new JRadioButton("Citizen");

        admin.setBackground(new Color(10,25,20));
        responder.setBackground(new Color(10,25,20));
        citizen.setBackground(new Color(10,25,20));

        admin.setForeground(Color.WHITE);
        responder.setForeground(Color.WHITE);
        citizen.setForeground(Color.WHITE);

        ButtonGroup group = new ButtonGroup();
        group.add(admin);
        group.add(responder);
        group.add(citizen);
        citizen.setSelected(true);

        rolePanel.add(admin);
        rolePanel.add(responder);
        rolePanel.add(citizen);
        frame.add(rolePanel);

        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(40,510,320,40);
        registerBtn.setBackground(new Color(0,200,120));
        frame.add(registerBtn);

        JLabel status = new JLabel("",SwingConstants.CENTER);
        status.setBounds(40,560,320,25);
        status.setForeground(Color.GREEN);
        frame.add(status);

        registerBtn.addActionListener(e -> {

            String userName = name.getText().trim();
            String userPhone = phone.getText().trim();
            String userLocation = location.getText().trim();
            String userEmail = emailLogin.getText().trim();
            String userPassword = new String(passwordLogin.getPassword()).trim();

            String role="";
            if(admin.isSelected()) role="Admin";
            if(responder.isSelected()) role="Responder";
            if(citizen.isSelected()) role="Citizen";

            if(userName.isEmpty() || userPhone.isEmpty() || userLocation.isEmpty()
                    || userEmail.isEmpty() || userPassword.isEmpty()){
                JOptionPane.showMessageDialog(frame,"Please fill all fields");
                return;
            }

            String filePath="registration_data.csv";
            File file=new File(filePath);

            try{
                boolean fileExists=file.exists();
                FileWriter writer=new FileWriter(file,true);

                if(!fileExists){
                    writer.append("Name,Email,Password,Phone,Location,Role\n");
                }

                writer.append(userName+","+userEmail+","+userPassword+","+"\""+userPhone+"\","+userLocation+","+role+"\n");
                writer.close();

                status.setText("Registration Completed");

                name.setText("");
                phone.setText("");
                location.setText("");
                emailLogin.setText("");
                passwordLogin.setText("");
                citizen.setSelected(true);

            }catch(IOException ex){
                JOptionPane.showMessageDialog(frame,"Close Excel file and try again");
            }
        });

        frame.setVisible(true);
    }
}
