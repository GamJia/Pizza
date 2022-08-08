package Pizza_main;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.Timer;

public class flour_rotate extends Frame implements ActionListener{

  int theta;

  Button clockwise=new Button("시계 방향");

  Button counterClockwise=new Button("반 시계 방향");

  Graphics2D g2;

  public flour_rotate(String title){               // 생성자

    super(title);

    setLayout(new FlowLayout());              // 레이아웃 변경

    add(clockwise);                           // 버튼 추가

    add(counterClockwise);

    clockwise.addActionListener(this);          // 이벤트 처리

    counterClockwise.addActionListener(this);

  }

  public void actionPerformed(ActionEvent ae){

	  Timer timer = new Timer(16, new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
        	  theta+=15;   
              repaint();
          }
      });
      timer.start();
	  
                                

  }

  public void paint(Graphics g){

    if(g2==null){

      g2=(Graphics2D)getGraphics();

      g2.translate(150,150);                         // 좌표 축 이동

    }

    g2.rotate(Math.toRadians(theta));              // theta만큼 회전한다.

    g2.draw(new Line2D.Float(-100, 0, 100, 0));     // 축과 원을 그린다.

    g2.draw(new Line2D.Float(0, -100, 0, 100));

    g2.fill(new Ellipse2D.Float(50, 50, 20, 20));

  }  

  public static void main(String []args){

    Frame f=new flour_rotate("좌표축 회전");

    f.setSize(300, 300);

    f.setVisible(true);

  }

}