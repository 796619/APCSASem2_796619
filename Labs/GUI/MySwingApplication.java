import javax.swing.*;
public class MySwingApplication implements Runnable
{
    JFrame jFrame; 
    public void run(){
        JFrame jFrame = new JFrame("Window"); 
        jFrame.setSize(500,679);
        CanvasComponent canvasComponent = new CanvasComponent(60,90);
        jFrame.add(canvasComponent); 
        jFrame.addKeyListener(canvasComponent); 
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(){
        MySwingApplication mySwingApplication = new MySwingApplication(); 
        javax.swing.SwingUtilities.invokeLater(mySwingApplication); 

    }

}