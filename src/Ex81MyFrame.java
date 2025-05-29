import javax.swing.JFrame;

public class Ex81MyFrame extends JFrame {
    public Ex81MyFrame() {
        setTitle("300 x 300 스윙 프레임 만들기");
        setSize(300,300); // 프레임 크기 300x300
        setVisible(true); // 프레임 출력
    }

    public static void main(String[] args) {
        //javax.swing.SwingUtilities.invokeLater(null);
        //Ex81MyFrame frame = new Ex81MyFrame();
        new Ex81MyFrame();
    }
}