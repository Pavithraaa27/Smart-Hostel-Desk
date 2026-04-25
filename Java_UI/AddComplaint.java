import javax.swing.*;

public class AddComplaint {

    AddComplaint() {

        JFrame frame = new JFrame("Add Complaint");
        frame.setSize(400, 300);

        // 🔥 BACKGROUND
        ImageIcon bg = new ImageIcon("bg.jpg");
        JLabel background = new JLabel(bg);
        background.setBounds(0, 0, 400, 300);

        frame.setContentPane(background);
        background.setLayout(null);

        JLabel label = new JLabel("Issue:");
        label.setBounds(50, 60, 100, 30);

        JTextField issue = new JTextField();
        issue.setBounds(150, 60, 150, 30);

        JButton submit = new JButton("Submit");
        submit.setBounds(150, 130, 100, 30);

        background.add(label);
        background.add(issue);
        background.add(submit);

        // 🔹 SAVE (NO DB, SIMPLE STORAGE)
        submit.addActionListener(e -> {

            String text = issue.getText();

            if (text.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Enter issue!");
                return;
            }

            int id = (int)(Math.random() * 1000);

            DataStore.complaints.add(new String[]{
                String.valueOf(id),
                text,
                "Pending"
            });

            JOptionPane.showMessageDialog(frame, "Complaint Added!");
            issue.setText("");
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}