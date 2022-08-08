package Pizza_main;

import java.awt.*;

import java.awt.event.*;

public class animation extends Frame{

	Image img[] = new Image[15];	
	
	
	int num = 0;
	
	
	public animation(String title){
	
	super(title);
	
	for(int i = 0; i < 15; i++){
	
	img[i] = Toolkit.getDefaultToolkit().getImage("C:\\Users\\EX-A320M-GAMING\\eclipse-workspace\\Pizza\\images\\flour\\f"+(i+1)+".jpg");
	
	}
	
	
	addWindowListener(new WindowHandler());
	
	setSize(600,800);
	setLocation(0,0);
	
	setVisible(true);
	
	}
	
	public void paint(Graphics g){
		
	
	
	if(num > 15)num=0;	
	
	g.drawImage(img[num++], 0, 0, this);
	
	
	}
	
	
	
	class WindowHandler extends WindowAdapter{
	
	public void windowClosing(WindowEvent e){
	
	System.exit(0);
	
	}
	
	}



	public static void main(String[] args) {
	
	
	
	animation ani = new animation("애니메이션");
	
	while(true){
	
	try{
	
	Thread.sleep(100);
	
	ani.repaint();
	
	}
	
	catch(InterruptedException e){
	
	System.out.println(e.getMessage());
	
	break;
	
	}
	
	}/*0.1초마다 화면을 갱신하면서 달리는 캐릭터를 출력함.*/
	
	
	
	}



}


