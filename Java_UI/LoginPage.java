import javax.swing.*;
import java.awt.*;

public class LoginPage {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hostel Complaint Login");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 🔥 BACKGROUND IMAGE
        ImageIcon bg = new ImageIcon("bg.jpg");
        JLabel background = new JLabel(bg);
        background.setBounds(0, 0, 400, 250);

        frame.setContentPane(background);
        background.setLayout(null);

        // 🔹 COMPONENTS
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);

        JTextField userField = new JTextField();
        userField.setBounds(150, 50, 150, 30);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(150, 100, 150, 30);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(150, 150, 100, 30);

        background.add(userLabel);
        background.add(userField);
        background.add(passLabel);
        background.add(passField);
        background.add(loginBtn);

        // 🔹 LOGIN LOGIC
        loginBtn.addActionListener(e -> {
            if (userField.getText().equals("admin") &&
                new String(passField.getPassword()).equals("admin")) {

                JOptionPane.showMessageDialog(frame, "Login Successful!");
                new Dashboard();
                frame.dispose();

            } else {
                JOptionPane.showMessageDialog(frame, "Invalid Login");
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}