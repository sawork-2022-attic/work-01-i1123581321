import asciiPanel.AsciiPanel;
import config.AsciiPanelConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AsciiPanelConfig.class);
        AsciiPanel panel = context.getBean(AsciiPanel.class);
        panel.write("Hello world", 1, 1);
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
