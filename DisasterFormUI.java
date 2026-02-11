import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisasterFormUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("🚨 Disaster Report Panel");
        frame.setSize(420,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,2,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        panel.setBackground(new Color(30,30,30));

        JLabel title = new JLabel("Disaster Report Form", JLabel.CENTER);
        title.setForeground(Color.ORANGE);
        title.setFont(new Font("Arial",Font.BOLD,18));

        JLabel typeLabel = new JLabel("Disaster Type:");
        JLabel locationLabel = new JLabel("Location:");
        JLabel severityLabel = new JLabel("Severity:");
        JLabel dateLabel = new JLabel("Date (YYYY-MM-DD):");

        typeLabel.setForeground(Color.WHITE);
        locationLabel.setForeground(Color.WHITE);
        severityLabel.setForeground(Color.WHITE);
        dateLabel.setForeground(Color.WHITE);

        String[] disasters = {"Flood","Fire","Earthquake","Cyclone"};
        JComboBox<String> disasterBox = new JComboBox<>(disasters);

        JTextField location = new JTextField();

        String[] severity = {"Low","Medium","High"};
        JComboBox<String> severityBox = new JComboBox<>(severity);

        JTextField date = new JTextField();

        JButton submit = new JButton("Submit Report");
        submit.setBackground(new Color(255,120,0));
        submit.setForeground(Color.WHITE);

        JLabel status = new JLabel("");
        status.setForeground(Color.GREEN);

        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                status.setText("✅ Report Submitted Successfully!");
            }
        });

        panel.add(typeLabel);
        panel.add(disasterBox);

        panel.add(locationLabel);
        panel.add(location);

        panel.add(severityLabel);
        panel.add(severityBox);

        panel.add(dateLabel);
        panel.add(date);

        panel.add(new JLabel(""));
        panel.add(submit);

        panel.add(new JLabel(""));
        panel.add(status);

        frame.add(title,BorderLayout.NORTH);
        frame.add(panel,BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
