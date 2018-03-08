package ejercicioei;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class TestPaintComponent extends JFrame {
    public TestPaintComponent(){
        add(new NewPanel());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestPaintComponent frame= new TestPaintComponent();
        frame.setTitle("Test");
        frame.setSize(200,100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}