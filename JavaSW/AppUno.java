import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppUno {

    private JFrame frame;
    private JPanel contentPane;
    private JTextField r1,r2,r3,r12,r22,r32;

    int votol, votof;

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable(){
            public void run(){
                Calculadora window = new Calculadora();
                window.frame.setVisible(true);
            }
        });//Fin del event Queue
        
    }//Fin del main

    public AppUno(){
        initialize();

    }// Fin del constructor myapp

    public void initialize(){


/********************************** Candidato 1    **************************************** */
        frame = new JFrame();
        frame.setBounds(100,100,950,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setLayout(null);
        frame.setContentPane(contentPane);

        JLabel et1 = new JLabel("Candidato1");
        et1.setBounds(200,30,90,20);
        contentPane.add(et1);

        
        
        JButton bt1 = new JButton("Aumentar");

        bt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent args0){
                String r;

                votol = votol+1;
                r = String.valueOf(votol);
                r1.setText(r);
            }
        });

        bt1.setBounds(200,60,90,20);
        contentPane.add(bt1);

        r1 = new JTextField();
        r1.setEditable(false);
        r1.setBounds(200,90,90,20);
        r1.setColumns(10);
        contentPane.add(r1);

        r12 = new JTextField();
        r12.setEditable(false);
        r12.setBounds(200,120,90,20);
        r12.setColumns(10);
        contentPane.add(r12);



/********************************  Candidato 2   ***************************************** */


  

        JLabel et2 = new JLabel("Candidato2");
        et2.setBounds(300,30,90,20);
        contentPane.add(et2);

        
        
        JButton bt2 = new JButton("Aumentar");

        bt2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent args0){
                String r;

                votol = votol+1;
                r = String.valueOf(votol);
                r2.setText(r);
            }
        });

        bt2.setBounds(300,60,90,20);
        contentPane.add(bt2);

        r2 = new JTextField();
        r2.setEditable(false);
        r2.setBounds(300,90,90,20);
        r2.setColumns(10);
        contentPane.add(r2);

        r22 = new JTextField();
        r22.setEditable(false);
        r22.setBounds(300,120,90,20);
        r22.setColumns(10);
        contentPane.add(r22);

/************************************  Cndidato 3 ************************************************ */

        JLabel et3 = new JLabel("Candidato3");
        et3.setBounds(400,30,90,20);
        contentPane.add(et3);



        JButton bt3 = new JButton("Aumentar");

      /*   bt3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent args0){
                String r;

                votol = votol+1;
                r = String.valueOf(votol);
                r3.setText(r);   
            }
        }); */

        bt3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent args0){
                String r;
                
                
                for (int i = 0;i<10;i++) {
                    votol = votol+1;
                    r = String.valueOf(votol);
                    r3.setText(r);  
                }
                    votof = votof+1;
                    r = String.valueOf(votof);
                    r32.setText(r);    
            }
        });



        bt3.setBounds(400,60,90,20);
        contentPane.add(bt3);

        r3 = new JTextField();
        r3.setEditable(false);
        r3.setBounds(400,90,90,20);
        r3.setColumns(10);
        contentPane.add(r3);

        r32 = new JTextField();
        r32.setEditable(false);
        r32.setBounds(400,120,90,20);
        r32.setColumns(10);
        contentPane.add(r32);

    }//Fin del nmetodo 
    
}
