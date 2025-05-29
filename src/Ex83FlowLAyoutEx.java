import javax.swing.*;
import java.awt.*;

public class Ex83FlowLAyoutEx extends JFrame {
    public Ex83FlowLAyoutEx() {
        setTitle("FlowLayout 예제"); // 프레임의 타이틀 달기
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기

        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, hgap:30, vgap40));

        contentPane.add(new JButton("add")); 
        contentPane.add(new JButton("sub"));
        contentPane.add(new JButton("mul"));
        contentPane.add(new JButton("div"));
        contentPane.add(new JButton("Calculate"));

        setSize(300,200); // 프레임 크기 300 x 200 설정
        setVisible(true); // 화면에 프레임 출력
    }

    public static void main(String[] args) {
        new Ex83FlowLAyoutEx();
    }
}
