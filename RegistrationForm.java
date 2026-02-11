import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class RegistrationForm {

    public static void main(String[] args) {

        JFrame frame = new JFrame("User Registration");
        frame.setSize(420, 480);
        frame.setLayout(new GridLayout(10, 2, 10, 10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField name = new JTextField();
        JTextField email = new JTextField();
        JPasswordField password = new JPasswordField();
        JTextField phone = new JTextField();
        JTextField location = new JTextField();
        JTextField region = new JTextField();

        String[] roles = {"Admin", "Responder", "Citizen"};
        JComboBox<String> roleBox = new JComboBox<>(roles);

        JButton submit = new JButton("Register");
        JLabel status = new JLabel("");

        frame.add(new JLabel("Name")); frame.add(name);
        frame.add(new JLabel("Email")); frame.add(email);
        frame.add(new JLabel("Password")); frame.add(password);
        frame.add(new JLabel("Phone Number")); frame.add(phone);
        frame.add(new JLabel("Location")); frame.add(location);
        frame.add(new JLabel("Region")); frame.add(region);
        frame.add(new JLabel("Role")); frame.add(roleBox);
        frame.add(new JLabel("")); frame.add(submit);
        frame.add(new JLabel("")); frame.add(status);

        submit.addActionListener(e -> {

            String userName = name.getText().trim();
            String userEmail = email.getText().trim();
            String userPassword = new String(password.getPassword()).trim();
            String userPhone = phone.getText().trim();
            String userLocation = location.getText().trim();
            String userRegion = region.getText().trim();
            String userRole = roleBox.getSelectedItem().toString();

            // ✅ VALIDATION
            if (userName.isEmpty() || userEmail.isEmpty() || userPassword.isEmpty()
                    || userPhone.isEmpty() || userLocation.isEmpty() || userRegion.isEmpty()) {

                JOptionPane.showMessageDialog(frame,
                        "❌ Please fill all fields");
                return;
            }

            String filePath = "D:\\Vscode\\registration_data.csv";
            File file = new File(filePath);

            try {
                boolean fileExists = file.exists();
                FileWriter writer = new FileWriter(file, true);

                // Header only once
                if (!fileExists) {
                    writer.append("Name,Email,Password,Phone,Location,Region,Role\n");
                }

                // Save clean Excel-friendly data
                writer.append(userName + "," +
                        userEmail + "," +
                        userPassword + "," +
                        "\"" + userPhone + "\"," +
                        userLocation + "," +
                        userRegion + "," +
                        userRole + "\n");

                writer.close();

                status.setText("✅ Registration Completed!");
                JOptionPane.showMessageDialog(frame,
                        "Saved successfully!\n\nLocation:\n" + filePath);

                // ✅ CLEAR FIELDS AFTER SAVE
                name.setText("");
                email.setText("");
                password.setText("");
                phone.setText("");
                location.setText("");
                region.setText("");
                roleBox.setSelectedIndex(0);

            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame,
                        " Close Excel file and try again");
            }
        });

        frame.setVisible(true);
    }
}
