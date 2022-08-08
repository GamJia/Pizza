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

  Button clockwise=new Button("�ð� ����");

  Button counterClockwise=new Button("�� �ð� ����");

  Graphics2D g2;

  public flour_rotate(String title){               // ������

    super(title);

    setLayout(new FlowLayout());              // ���̾ƿ� ����

    add(clockwise);                           // ��ư �߰�

    add(counterClockwise);

    clockwise.addActionListener(this);          // �̺�Ʈ ó��

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

      g2.translate(150,150);                         // ��ǥ �� �̵�

    }

    g2.rotate(Math.toRadians(theta));              // theta��ŭ ȸ���Ѵ�.

    g2.draw(new Line2D.Float(-100, 0, 100, 0));     // ��� ���� �׸���.

    g2.draw(new Line2D.Float(0, -100, 0, 100));

    g2.fill(new Ellipse2D.Float(50, 50, 20, 20));

  }  

  public static void main(String []args){

    Frame f=new flour_rotate("��ǥ�� ȸ��");

    f.setSize(300, 300);

    f.setVisible(true);

  }

}