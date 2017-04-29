import javax.swing.*;
import java.awt.*;

public class Main{

    /*** Run this file to test your software ***/

    /*** There is no need to edit this file ***/


    public static void startGUI(){
        DreamVacationGUI instance = new DreamVacationGUI();

        JFrame frame = new JFrame("Dream Vacation");
        frame.setSize(1020, 670);
        frame.setLayout(new GridLayout(2,2));

        frame.getContentPane().add(instance.getMapPanel());
        frame.getContentPane().add(instance.getDescriptionPanel());
        frame.getContentPane().add(instance.getControlPanel());
        frame.getContentPane().add(instance.getChatPanel());

        for(Component c : frame.getContentPane().getComponents()){
            c.setBackground(Color.getHSBColor(0.55f,0.15f,0.95f));
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                startGUI();
            }
        });
    }


}
