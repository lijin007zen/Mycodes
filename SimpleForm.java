import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleForm extends JFrame implements ActionListener {

    // Form components
    private JLabel nameLabel, emailLabel;
    private JTextField nameField, emailField;
    private JButton submitButton;
    private JLabel resultLabel;

    // Constructor
    public SimpleForm() {
        // Set up the frame
        setTitle("Simple Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Initialize components
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        submitButton = new JButton("Submit");
        resultLabel = new JLabel("");

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(submitButton);
        add(resultLabel);

        // Add action listener to the button
        submitButton.addActionListener(this);
    }

    // Action performed method to handle button click
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String email = emailField.getText();
        resultLabel.setText("Name: " + name + ", Email: " + email);
    }

    // Main method to run the application
    public static void main(String[] args) {
        SimpleForm form = new SimpleForm();
        form.setVisible(true);
    }
}
