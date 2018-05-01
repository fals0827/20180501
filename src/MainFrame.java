import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private JButton jbtnAdd = new JButton("< --");
    private JButton jbtnLess = new JButton("-- >");
    private JButton jbtnExit = new JButton("Exit");
    private int count = 0 , x = 100;
    private JLabel jlb = new JLabel("@ ____ @");
    private JTextField jtf = new JTextField("0");

    public MainFrame () {
        this.init();
    }
    private void init () {
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocation(80,60);
        this.setSize(800,600);

        jbtnAdd.setLocation(100,50);
        jbtnAdd.setSize(100,100);
        jbtnLess.setLocation(210,50);
        jbtnLess.setSize(100,100);
        jlb.setBounds(x,160,100,50);
        jbtnExit.setBounds(320,50,100,100);
        jtf.setBounds(100,250,100,20);

        jbtnAdd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x -= Integer.parseInt(jtf.getText());
                jlb.setLocation(x,160);
                count ++;
                if (count % 2 == 0){
                    jlb.setText("@ ____ @");
                }else {
                    jlb.setText("> ____ <");
                }
            }
        });


        jbtnLess.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x += Integer.parseInt(jtf.getText());
                jlb.setLocation(x,160);
                count ++ ;
                if (count % 2 == 0){
                    jlb.setText("@ ____ @");
                }else {
                    jlb.setText("> ____ <");
                }
            }
        });

        jbtnExit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.add(jbtnAdd);
        this.add(jbtnLess);
        this.add(jlb);
        this.add(jbtnExit);
        this.add(jtf);
    }
}
