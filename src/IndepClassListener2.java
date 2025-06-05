import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener2 extends JFrame {
    public IndepClassListener2() {
        setTitle("Action 이벤트 리스터 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new Ex91MyActionListener());
        c.add(btn);
        setSize(250, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new IndepClassListener();
    }
}
// 내부 클래스로 Action 리스너 작성
class Ex91MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();

        if(b.getText().equals("Action")) {
            b.setText("액션");
        } else {
            b.setText("Action");
        }
    }

    // InnerClassListener나 JFrame의 멤버 호출 가능
    // setTitle(b.getText()); // 프레임 타이틀에 버튼문자열 출력

    public static void main(String[] args) {
        new IndepClassListener2();
    }
}