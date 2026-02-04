import javax.swing.*;
import java.awt.*;

public class BirthdayApp {

        private static boolean visible = true;
        private static int colorIndex = 0;

        public static void main(String[] args) {

        JFrame frame = new JFrame("🎉 Happy Birthday 🎉");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

//       Dark panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(20, 20, 20));
        panel.setLayout(new GridLayout(3, 1));

//        Original label
        JLabel title = new JLabel("Happy Birthday to me 🎂", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 26));
        title.setForeground(new Color(0, 255, 200));

//         Java Label
        JLabel fromJava = new JLabel("From Java ☕", SwingConstants.CENTER);
        fromJava.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        fromJava.setForeground(Color.LIGHT_GRAY);

//      label effect
        JLabel effect = new JLabel("☕ 🎉 ☕", SwingConstants.CENTER);
        effect.setFont(new Font("Segoe UI Emoji", Font.BOLD, 22));

        panel.add(title);
        panel.add(fromJava);
        panel.add(effect);

        frame.add(panel);
        frame.setVisible(true);
//      Animation colors
        Color[] colors = {
                new Color(0, 255, 200),
                new Color(255, 0, 150),
                new Color(255, 200, 0),
                new Color(100, 150, 255)
        };

//      Animation timer
        Timer timer = new Timer(500, e -> {
//            Blinking text
                visible = !visible;
                title.setVisible(visible);

//            color change
                effect.setForeground(colors[colorIndex]);
                colorIndex = (colorIndex + 1) % colors.length;
        });

        timer.start();
        }
}
