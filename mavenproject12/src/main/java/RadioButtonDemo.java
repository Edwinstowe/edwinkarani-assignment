import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RadioButtonDemo extends JFrame {
    private final JRadioButton birdButton;
    private final JRadioButton catButton;
    private final JRadioButton dogButton;
    private final JRadioButton rabbitButton;
    private final JRadioButton pigButton;
    private JLabel petLabel;
    private final ButtonGroup group;

    private ImageIcon birdIcon;
    private ImageIcon catIcon;
    private ImageIcon dogIcon;
    private ImageIcon rabbitIcon;
    private ImageIcon pigIcon;

    public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        
        birdIcon = new ImageIcon("bird.png");
        catIcon = new ImageIcon("cat.png");
        dogIcon = new ImageIcon("dog.png");
        rabbitIcon = new ImageIcon("rabbit.png");
        pigIcon = new ImageIcon("pig.png");

       
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        
        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        
        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);

        
        petLabel = new JLabel();
        add(petLabel);

        
        birdButton.addActionListener((ActionEvent e) -> {
            petLabel.setIcon(birdIcon);
        });

        catButton.addActionListener((ActionEvent e) -> {
            petLabel.setIcon(catIcon);
        });

        dogButton.addActionListener((ActionEvent e) -> {
            petLabel.setIcon(dogIcon);
        });

        rabbitButton.addActionListener((ActionEvent e) -> {
            petLabel.setIcon(rabbitIcon);
        });

        pigButton.addActionListener((ActionEvent e) -> {
            petLabel.setIcon(pigIcon);
        });

        
        birdButton.setSelected(true);
        petLabel.setIcon(birdIcon);

        setVisible(true);
    }

    public static void main(String[] args) {
        RadioButtonDemo radioButtonDemo = new RadioButtonDemo();
    }
}

