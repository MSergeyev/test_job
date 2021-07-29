package TestFrame;
import javax.swing.JFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class FrameTest  {
    public static void main(String[] args) {
        class SimpleClickListener implements MouseListener{

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX() + "" + e.getY());

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        }

        // создаем окно
        JFrame jf = new JFrame();
        // устанавливаем ему размеры
        jf.setSize(400, 300);
        // и показываем его
        jf.setVisible(true);
        SimpleClickListener mouseListener = new SimpleClickListener();
        jf.addMouseListener(mouseListener);

    }
}

