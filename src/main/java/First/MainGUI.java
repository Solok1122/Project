package First;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Seba-win8 on 2014-08-08.
 */
public class MainGUI extends JFrame{
    private JPanel rootPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

    MainGUI(){
        super("Hello World");
        pack();
        setContentPane(rootPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(MainGUI.this, "You clicked the button");
            }
        });

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
