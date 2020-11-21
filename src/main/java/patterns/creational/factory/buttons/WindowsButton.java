package patterns.creational.factory.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Describes Windows button
 */
public class WindowsButton implements Button {
    /**
     * Main panel of frame
     */
    private final JPanel panel = new JPanel();

    /**
     * Dialog's frame
     */
    private final JFrame frame = new JFrame();

    /**
     * Exit button
     */
    private JButton button;

    /**
     * Draws Windows frame with "Exit" button
     */
    @Override
    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello, World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);
        frame.setSize(320, 200);
        frame.setVisible(true);
    }

    /**
     * Implements event handler to Windows button
     */
    @Override
    public void onClick() {
        button = new JButton("Exit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
