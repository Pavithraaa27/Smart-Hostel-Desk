import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewComplaints {

    ViewComplaints() {

        JFrame frame = new JFrame("View Complaints");
        frame.setSize(500, 300);

        // 🔥 BACKGROUND
        ImageIcon bg = new ImageIcon("bg.jpg");
        JLabel background = new JLabel(bg);
        background.setBounds(0, 0, 500, 300);

        frame.setContentPane(background);
        background.setLayout(null);

        String[] cols = {"ID", "Issue", "Status"};

        String[][] data = new String[DataStore.complaints.size()][3];

        for (int i = 0; i < DataStore.complaints.size(); i++) {
            data[i] = DataStore.complaints.get(i);
        }

        JTable table = new JTable(new DefaultTableModel(data, cols));
        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(50, 50, 400, 150);

        background.add(scroll);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}