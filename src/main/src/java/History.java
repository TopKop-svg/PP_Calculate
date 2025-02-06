import javax.swing.*;
import java.util.ArrayList;

public class History {
    private ArrayList<String> history = new ArrayList<>();

    public void addEntry(String entry) {
        history.add(entry);
    }

    public void showHistory() {
        if (history.isEmpty()) {
            JOptionPane.showMessageDialog(null, "История операция пуста",
                    "История", JOptionPane.INFORMATION_MESSAGE);
        } else {
            StringBuilder historyText = new StringBuilder();
            for (String entry : history) {
                historyText.append(entry).append("\n");
            }
            JOptionPane.showMessageDialog(null, historyText.toString(),
                    "История операций", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void cleanHistory() {
        history.clear();
        JOptionPane.showMessageDialog(null,
                "История операций очищена. ",
                "История",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
