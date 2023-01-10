import java.awt.EventQueue;
import javax.swing.JFrame;

public class Myapp {


    private JFrame frame;

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable(){
            public void run(){
                Myapp window = new Myapp();
                window.frame.setVisible(true);
            }
        });//Fin del event Queue
        
    }//Fin del main

    public Myapp(){
        initialize();

    }// Fin del constructor myapp

    public void initialize(){
        frame = new JFrame();
        frame.setBounds(100,100,450,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//Fin del nmetodo 
    
}// Fin de la clase
