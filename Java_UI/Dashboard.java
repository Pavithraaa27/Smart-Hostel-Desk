import javax.swing.*;

public class Dashboard {

    Dashboard() {

        JFrame frame = new JFrame("Dashboard");
        frame.setSize(500, 400);

        // 🔥 BACKGROUND
        ImageIcon bg = new ImageIcon("bg.jpg");
        JLabel background = new JLabel(bg);
        background.setBounds(0, 0, 500, 400);

        frame.setContentPane(background);
        background.setLayout(null);

        JButton add = new JButton("Add Complaint");
        add.setBounds(150, 80, 200, 40);

        JButton view = new JButton("View Complaints");
        view.setBounds(150, 150, 200, 40);

        JButton exit = new JButton("Exit");
        exit.setBounds(150, 220, 200, 40);

        background.add(add);
        background.add(view);
        background.add(exit);

        add.addActionListener(e -> new AddComplaint());
        view.addActionListener(e -> new ViewComplaints());
        exit.addActionListener(e -> System.exit(0));

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}