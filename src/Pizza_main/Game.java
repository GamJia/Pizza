package Pizza_main;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
	
	public class Game extends JFrame{	
		
		
		static int count=1;
		static int count2=1;
		static int count3=1;
		static int count4=1;
		static int count5=1;		
		
		static int timecount=1;
		static int timecount2=1;
		static int timecount3=1;
		static int timecount4=1;
		static int timecount5=1;
		static int timecount6=1;
		static int timecount7=1;
		static int timecount8=1;
		
		static int Bovencount=1;
		static int Povencount=1;
		static int Sovencount=1;		
		
		static JButton start_button=new JButton();			
		
		static JButton pizza1=new JButton();
		static JButton pizza2=new JButton();
		static JButton pizza3=new JButton();
		
		static JButton music_stop_button1=new JButton();	
		static JButton exit_button1=new JButton();
		static JButton next_button1=new JButton();
		
		static JButton music_stop_button2=new JButton();	
		static JButton exit_button2=new JButton();
		static JButton next_button2=new JButton();
		
		static JButton music_stop_button3=new JButton();	
		static JButton exit_button3=new JButton();
		static JButton next_button3=new JButton();
		
		static JButton music_stop_button4=new JButton();	
		static JButton exit_button4=new JButton();
		static JButton next_button4=new JButton();
		
		static JButton music_stop_button5=new JButton();	
		static JButton exit_button5=new JButton();
		static JButton next_button5=new JButton();
		
		static JButton oil_music_stop_button=new JButton();	
		static JButton oil_exit_button=new JButton();
		static JButton oil_next_button=new JButton();		
		
		static JButton music_stop_button6=new JButton();	
		static JButton exit_button6=new JButton();
		static JButton next_button6=new JButton();
		
		static JButton music_stop_button7=new JButton();	
		static JButton exit_button7=new JButton();
		static JButton next_button7=new JButton();
		
		static JButton music_stop_button8=new JButton();	
		static JButton exit_button8=new JButton();
		static JButton next_button8=new JButton();
		
		static JButton music_stop_button9=new JButton();	
		static JButton exit_button9=new JButton();
		static JButton next_button9=new JButton();
		
		static JButton music_stop_button10=new JButton();	
		static JButton exit_button10=new JButton();
		static JButton next_button10=new JButton();
		
		static JButton music_stop_button11=new JButton();	
		static JButton exit_button11=new JButton();
		static JButton next_button11=new JButton();
		
		static JButton music_stop_button12=new JButton();	
		static JButton exit_button12=new JButton();
		static JButton next_button12=new JButton();
		
		static JButton music_stop_button13=new JButton();	
		static JButton exit_button13=new JButton();
		static JButton next_button13=new JButton();
		
		static JButton music_stop_button14=new JButton();	
		static JButton exit_button14=new JButton();
		static JButton next_button14=new JButton();	
		
		
		static JButton flour_button=new JButton();
		static JButton water_button=new JButton();
		static JButton salt_button=new JButton();
		static JButton sugar_button=new JButton();
		static JButton oil_button=new JButton();
		
		static JLabel flour_label=new JLabel();
		static JLabel water_label=new JLabel();
		static JLabel salt_label=new JLabel();
		static JLabel sugar_label=new JLabel();
		static JLabel oil_label=new JLabel();		
		
		static JLabel flour_pour=new JLabel();
		static JLabel flour_pour2=new JLabel();
		static JLabel flour_pour3=new JLabel();
		static JLabel flour_pour4=new JLabel();
		static JLabel flour_pour5=new JLabel();
		
		static JLabel flour_move=new JLabel();
		static JLabel water_move=new JLabel();
		static JLabel salt_move=new JLabel();
		static JLabel sugar_move=new JLabel();
		static JLabel oil_move=new JLabel();
		
		static JButton spread_button=new JButton();
		static JButton roller_button=new JButton();	
		static JButton roller_button2=new JButton();	
		static JButton roller_button3=new JButton();	
		static JButton roller_button4=new JButton();	
		static JButton roller_button5=new JButton();	
		static JButton roller_button6=new JButton();	
		static JButton roller_button7=new JButton();	
		static JButton roller_button8=new JButton();	
		
		
		static JButton Boolgogi_button=new JButton();
		static JButton Corn_button=new JButton();
		static JButton BPaprika_button=new JButton();
		static JButton Onion_button=new JButton();
		
		static JButton Pepperoni_button=new JButton();
		static JButton PMushroom_button=new JButton();
		static JButton PPaprika_button=new JButton();
		static JButton POlive_button=new JButton();
		
		static JButton Shrimp_button=new JButton();
		static JButton SMushroom_button=new JButton();
		static JButton Pineapple_button=new JButton();
		static JButton SOlive_button=new JButton();
		
		static JButton boolgogi_oven_button=new JButton();
		static JButton pepperoni_oven_button=new JButton();
		static JButton seafood_oven_button=new JButton();		
		
		private boolean flour_check=false;
		private boolean water_check=false;
		private boolean salt_check=false;
		private boolean sugar_check=false;
		private boolean oil_check=false;
		
		private boolean Boolgogi_check=false;
		private boolean Pepperoni_check=false;
		private boolean Seafood_check=false;
		
		private boolean B_Boolgogi_choose=false;
		private boolean B_Corn_choose=false;
		private boolean B_Paprika_choose=false;
		private boolean B_Onion_choose=false;
		
		private boolean P_Pepperoni_choose=false;
		private boolean P_Mushroom_choose=false;
		private boolean P_Paprika_choose=false;
		private boolean P_Olive_choose=false;
		
		private boolean S_Shrimp_choose=false;
		private boolean S_Mushroom_choose=false;
		private boolean S_Pineapple_choose=false;
		private boolean S_Olive_choose=false;
		
		
		
		private ImageIcon s = new ImageIcon(Main.class.getResource("../image/title-start.png"));
		private ImageIcon sc = new ImageIcon(Main.class.getResource("../image/title-start-click.png"));	
		
		private ImageIcon title_name=new ImageIcon(Main.class.getResource("../image/title_name.gif"));	
		
		private ImageIcon ms = new ImageIcon(Main.class.getResource("../image/music-stop.png"));
		private ImageIcon msc = new ImageIcon(Main.class.getResource("../image/music-stop-click.png"));
		
		private ImageIcon ex = new ImageIcon(Main.class.getResource("../image/exit.png"));
		private ImageIcon exc = new ImageIcon(Main.class.getResource("../image/exit_click.png"));
		
		private ImageIcon n = new ImageIcon(Main.class.getResource("../image/next.png"));
		private ImageIcon nc = new ImageIcon(Main.class.getResource("../image/next-click.png"));
		
		private ImageIcon p1 = new ImageIcon(Main.class.getResource("../image/pizza1.png"));
		private ImageIcon p1c = new ImageIcon(Main.class.getResource("../image/pizza1-click.png"));
		
		private ImageIcon p2 = new ImageIcon(Main.class.getResource("../image/pizza2.png"));
		private ImageIcon p2c = new ImageIcon(Main.class.getResource("../image/pizza2-click.png"));
		
		private ImageIcon p3 = new ImageIcon(Main.class.getResource("../image/pizza3.png"));
		private ImageIcon p3c = new ImageIcon(Main.class.getResource("../image/pizza3-click.png"));
		
		private ImageIcon flour = new ImageIcon(Main.class.getResource("../flour/flour_button.png"));
		private ImageIcon flourgif = new ImageIcon(Main.class.getResource("../flour/flour.gif"));
		private ImageIcon dark_flour = new ImageIcon(Main.class.getResource("../flour/dark_flour.png"));
		private ImageIcon flour_click = new ImageIcon(Main.class.getResource("../flour/flour_button_click.png"));
		
		private ImageIcon water = new ImageIcon(Main.class.getResource("../flour/water_button.png"));
		private ImageIcon watergif = new ImageIcon(Main.class.getResource("../flour/water.gif"));
		private ImageIcon dark_water = new ImageIcon(Main.class.getResource("../flour/dark_water.png"));
		private ImageIcon water_click = new ImageIcon(Main.class.getResource("../flour/water_button_click.png"));
		
		private ImageIcon salt = new ImageIcon(Main.class.getResource("../flour/salt_button.png"));
		private ImageIcon saltgif = new ImageIcon(Main.class.getResource("../flour/salt.gif"));
		private ImageIcon dark_salt = new ImageIcon(Main.class.getResource("../flour/dark_salt.png"));
		private ImageIcon salt_click = new ImageIcon(Main.class.getResource("../flour/salt_button_click.png"));
		
		private ImageIcon sugar = new ImageIcon(Main.class.getResource("../flour/sugar_button.png"));
		private ImageIcon sugargif = new ImageIcon(Main.class.getResource("../flour/sugar.gif"));
		private ImageIcon dark_sugar = new ImageIcon(Main.class.getResource("../flour/dark_sugar.png"));
		private ImageIcon sugar_click = new ImageIcon(Main.class.getResource("../flour/sugar_button_click.png"));
		
		private ImageIcon oil = new ImageIcon(Main.class.getResource("../flour/oil_button.png"));
		private ImageIcon oilgif = new ImageIcon(Main.class.getResource("../flour/oil.gif"));
		private ImageIcon dark_oil = new ImageIcon(Main.class.getResource("../flour/dark_oil.png"));
		private ImageIcon oil_click = new ImageIcon(Main.class.getResource("../flour/oil_button_click.png"));
		
		
		private ImageIcon flourpour1 = new ImageIcon(Main.class.getResource("../flour/flour.png"));
		private ImageIcon flourpour2 = new ImageIcon(Main.class.getResource("../flour/flour2.png"));
		private ImageIcon flourpour3 = new ImageIcon(Main.class.getResource("../flour/flour3.png"));
		private ImageIcon flourpour4 = new ImageIcon(Main.class.getResource("../flour/flour4.png"));
		private ImageIcon flourpour5 = new ImageIcon(Main.class.getResource("../flour/flour5.png"));
		
	
		private ImageIcon sauce_outline=new ImageIcon(Main.class.getResource("../sauce/sauce_out_line.png"));	
		
		private ImageIcon spread_dough1 = new ImageIcon(Main.class.getResource("../spread/spread1.png"));
		private ImageIcon spread_dough2 = new ImageIcon(Main.class.getResource("../spread/spread2.png"));
		private ImageIcon spread_dough3 = new ImageIcon(Main.class.getResource("../spread/spread3.png"));
		private ImageIcon spread_dough4 = new ImageIcon(Main.class.getResource("../spread/spread4.png"));
		private ImageIcon spread_dough5 = new ImageIcon(Main.class.getResource("../spread/spread5.png"));
		private ImageIcon spread_dough6 = new ImageIcon(Main.class.getResource("../spread/spread6.png"));
		private ImageIcon spread_dough7 = new ImageIcon(Main.class.getResource("../spread/spread7.png"));
		private ImageIcon spread_dough8 = new ImageIcon(Main.class.getResource("../spread/spread8.png"));
		private ImageIcon spread_dough9 = new ImageIcon(Main.class.getResource("../spread/spread9.png"));
		private ImageIcon spread_roller = new ImageIcon(Main.class.getResource("../spread/roller.gif"));		
		private ImageIcon roller = new ImageIcon(Main.class.getResource("../spread/roller.png"));
		private ImageIcon roller_click = new ImageIcon(Main.class.getResource("../spread/roller_click.png"));		
	
		private ImageIcon boolgogi = new ImageIcon(Main.class.getResource("../boolgogi/boolgogi_button.png"));
		private ImageIcon boolgogi_click = new ImageIcon(Main.class.getResource("../boolgogi/boolgogi_button_click.png"));	
		private ImageIcon corn = new ImageIcon(Main.class.getResource("../boolgogi/corn_button.png"));
		private ImageIcon corn_click = new ImageIcon(Main.class.getResource("../boolgogi/corn_button_click.png"));	
		private ImageIcon paprika = new ImageIcon(Main.class.getResource("../boolgogi/paprika_button.png"));
		private ImageIcon paprika_click = new ImageIcon(Main.class.getResource("../boolgogi/paprika_button_click.png"));	
		private ImageIcon onion = new ImageIcon(Main.class.getResource("../boolgogi/onion_button.png"));
		private ImageIcon onion_click = new ImageIcon(Main.class.getResource("../boolgogi/onion_button_click.png"));
		private ImageIcon pepperoni = new ImageIcon(Main.class.getResource("../pepperoni/pepperoni_button.png"));
		private ImageIcon pepperoni_click = new ImageIcon(Main.class.getResource("../pepperoni/pepperoni_button_click.png"));
		private ImageIcon mushroom = new ImageIcon(Main.class.getResource("../pepperoni/mushroom_button.png"));
		private ImageIcon mushroom_click = new ImageIcon(Main.class.getResource("../pepperoni/mushroom_button_click.png"));
		private ImageIcon olive = new ImageIcon(Main.class.getResource("../pepperoni/olive_button.png"));
		private ImageIcon olive_click = new ImageIcon(Main.class.getResource("../pepperoni/olive_button_click.png"));
		private ImageIcon shrimp = new ImageIcon(Main.class.getResource("../seafood/shrimp_button.png"));
		private ImageIcon shrimp_click = new ImageIcon(Main.class.getResource("../seafood/shrimp_button_click.png"));
		private ImageIcon pineapple = new ImageIcon(Main.class.getResource("../seafood/pineapple_button.png"));
		private ImageIcon pineapple_click = new ImageIcon(Main.class.getResource("../seafood/pineapple_button_click.png"));
		
		private ImageIcon oven_button=new ImageIcon(Main.class.getResource("../oven/oven_button.png"));
		private ImageIcon oven_button_click=new ImageIcon(Main.class.getResource("../oven/oven_button_click.png"));
		private ImageIcon oven_light=new ImageIcon(Main.class.getResource("../oven/oven_light.png"));
		private ImageIcon arrow=new ImageIcon(Main.class.getResource("../oven/arrow.gif"));
		
		private ImageIcon complete_outline=new ImageIcon(Main.class.getResource("../sauce/complete_outline.png"));	
		
		private ImageIcon bite=new ImageIcon(Main.class.getResource("../image/biting.png"));	
		private ImageIcon biting_outline=new ImageIcon(Main.class.getResource("../image/biting_outline.png"));	
		
		public Game() {
			homeframe();
			
			Toolkit tk = Toolkit.getDefaultToolkit();
			Image cursorimage=tk.getImage("src/image/cursor.png");
			Point point=new Point(10,10);
			Cursor cursor=tk.createCustomCursor(cursorimage, point, "");
			
			Toolkit htk = Toolkit.getDefaultToolkit();
	        Image hand_cursorimage = htk.getImage("src/image/hand_cursor.png");
	        Point handpoint = new Point(10,10);
	        Cursor hand_cursor = htk.createCustomCursor(hand_cursorimage, handpoint, "");
	        
	        Toolkit stk = Toolkit.getDefaultToolkit();
	        Image sauce_cursorimage = stk.getImage("src/sauce/tomato.png");
	        Point saucepoint = new Point(10,10);
	        Cursor sauce_cursor = stk.createCustomCursor(sauce_cursorimage, saucepoint, "");
	        
	        PointerInfo pointer=MouseInfo.getPointerInfo();
	         
			
			setCursor(cursor);
			
			//Music titleMusic= new Music("SUMMER_TRIANGLE.mp3",true);
			Music titleMusic= new Music("Parade.mp3",true);			
			titleMusic.start();
			
			
			JPanel page1=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../image/title.jpg")).getImage();
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}
			};
			
			JPanel page2=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../image/first.jpg")).getImage();
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);	
				}
			};
			
			JPanel flour_page=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../flour/flour_background.jpg")).getImage();
				
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}		
						
				
			};		
			
			
			JPanel water_page=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../flour/water_background.jpg")).getImage();
				
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}		
						
				
			};		
			
			JPanel salt_page=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../flour/salt_background.jpg")).getImage();
				
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}		
						
				
			};		
			
			JPanel sugar_page=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../flour/sugar_background.jpg")).getImage();
				
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}		
						
				
			};		
			
			JPanel oil_page=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../flour/oil_background.jpg")).getImage();
				
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}		
						
				
			};		
			
			
			JPanel stir_page=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../stir/stir_background.jpg")).getImage();
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}
				
				
				
			};		
			
			JPanel spread_page=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../spread/spread_background.jpg")).getImage();
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}
				
				
				
			};		
			
			
			JPanel sauce_page=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../sauce/sauce_background.jpg")).getImage();
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}
				
				
				
			};	
			
			JPanel cheese_page=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../cheese/cheese_background.jpg")).getImage();
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}
				
				
				
			};	
			
			JPanel boolgogi_page=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../boolgogi/boolgogi_background.jpg")).getImage();
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}
				
				
				
			};		
			
			JPanel pepperoni_page=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../pepperoni/pepperoni_background.jpg")).getImage();
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}
				
				
				
			};		
			
			JPanel seafood_page=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../seafood/seafood_background.jpg")).getImage();
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}
				
				
				
			};		
			
			
			JPanel oven_boolgogi_page=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../oven_boolgogi/oven_boolgogi_background.jpg")).getImage();
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}
				
				
				
			};		
			
			JPanel oven_pepperoni_page=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../oven_pepperoni/oven_pepperoni_background.jpg")).getImage();
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}
				
				
				
			};		
			
			JPanel oven_seafood_page=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../oven_seafood/oven_seafood_background.jpg")).getImage();
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}
				
				
				
			};		
			
			JPanel boolgogi_complete=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../boolgogi/boolgogi_complete.jpg")).getImage();
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}
				
				
				
			};		
			
			JPanel pepperoni_complete=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../pepperoni/pepperoni_complete.jpg")).getImage();
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}
				
				
				
			};		
			
			JPanel seafood_complete=new JPanel() {
				
				Image background=new ImageIcon(Main.class.getResource("../seafood/seafood_complete.jpg")).getImage();
				public void paintComponent(Graphics g) {
						super.paintComponent(g);
						g.drawImage(background, 0, 0, null);
				}
				
				
				
			};	
			
			
			
			page1.setBounds(0,0,600,800);
			page2.setBounds(0,0,600,800);
			flour_page.setBounds(0,0,600,800);	
			water_page.setBounds(0,0,600,800);	
			salt_page.setBounds(0,0,600,800);	
			sugar_page.setBounds(0,0,600,800);	
			oil_page.setBounds(0,0,600,800);	
			stir_page.setBounds(0,0,600,800);	
			spread_page.setBounds(0,0,600,800);	
			sauce_page.setBounds(0,0,600,800);
			cheese_page.setBounds(0,0,600,800);
			boolgogi_page.setBounds(0,0,600,800);
			pepperoni_page.setBounds(0,0,600,800);
			seafood_page.setBounds(0,0,600,800);
			oven_boolgogi_page.setBounds(0,0,600,800);
			oven_pepperoni_page.setBounds(0,0,600,800);
			oven_seafood_page.setBounds(0,0,600,800);
			boolgogi_complete.setBounds(0,0,600,800);
			pepperoni_complete.setBounds(0,0,600,800);
			seafood_complete.setBounds(0,0,600,800);
			
			/*레이아웃 지정*/
			page1.setLayout(null);
			page2.setLayout(null);
			flour_page.setLayout(null);	
			water_page.setLayout(null);	
			salt_page.setLayout(null);	
			sugar_page.setLayout(null);	
			oil_page.setLayout(null);	
			stir_page.setLayout(null);
			spread_page.setLayout(null);
			sauce_page.setLayout(null);	
			cheese_page.setLayout(null);	
			boolgogi_page.setLayout(null);
			pepperoni_page.setLayout(null);
			seafood_page.setLayout(null);
			oven_boolgogi_page.setLayout(null);
			oven_pepperoni_page.setLayout(null);
			oven_seafood_page.setLayout(null);
			boolgogi_complete.setLayout(null);
			pepperoni_complete.setLayout(null);
			seafood_complete.setLayout(null);
			
			
			/*visible*/
			page2.setVisible(false);
			flour_page.setVisible(false);
			water_page.setVisible(false);
			salt_page.setVisible(false);
			sugar_page.setVisible(false);
			oil_page.setVisible(false);
			stir_page.setVisible(false);
			spread_page.setVisible(false);
			sauce_page.setVisible(false);	
			cheese_page.setVisible(false);	
			boolgogi_page.setVisible(false);
			pepperoni_page.setVisible(false);
			seafood_page.setVisible(false);
			oven_boolgogi_page.setVisible(false);
			oven_pepperoni_page.setVisible(false);
			oven_seafood_page.setVisible(false);
			boolgogi_complete.setVisible(false);
			pepperoni_complete.setVisible(false);
			seafood_complete.setVisible(false);
			
			
			/*패널이나 프레임에 추가*/
			add(page1);
			add(page2);
			add(flour_page);
			add(water_page);
			add(salt_page);
			add(sugar_page);
			add(oil_page);
			add(stir_page);
			add(spread_page);
			add(sauce_page);
			add(cheese_page);
			add(boolgogi_page);
			add(pepperoni_page);
			add(seafood_page);
			add(oven_boolgogi_page);
			add(oven_pepperoni_page);
			add(oven_seafood_page);
			add(boolgogi_complete);
			add(pepperoni_complete);
			add(seafood_complete);
			
			JLabel name_label=new JLabel();
			name_label.setIcon(title_name);
			name_label.setBounds(5,165,315,215);		
			
			
	        start_button.setIcon(s);
			start_button.setBounds(200, 490, 189, 189);
			start_button.setBorderPainted(false);
	        start_button.setContentAreaFilled(false);
	        start_button.setFocusPainted(false);
	        start_button.setCursor(hand_cursor);
	        start_button.setOpaque(false);
	        
			start_button.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		
	        		start_button.setIcon(sc);
	        		
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		start_button.setIcon(s);
	        	}
	        	
	
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{    
	        		Music clickMusic= new Music("Check.mp3",false);
	        		clickMusic.start();
	        		try {
	        			Thread.sleep(800);
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}
	        		
	        		page1.setVisible(false);
	        		page2.setVisible(true);
	        		
	        	}
	        	
	        	
	        }); 
				
			
			
			
			///////////////////////////////////////////////////////////////////////////////////
			
			
		
	
			pizza1.setIcon(p1);
			pizza1.setBounds(0, 0, 300, 375);
			pizza1.setBorderPainted(false);
			pizza1.setContentAreaFilled(false);
			pizza1.setFocusPainted(false);
			pizza1.setCursor(hand_cursor);
			pizza1.setOpaque(false);
			
	       
			pizza1.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		Music clickMusic= new Music("ping.mp3",false);
					clickMusic.start();
	        		pizza1.setIcon(p1c);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		pizza1.setIcon(p1);
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		Music clickMusic= new Music("Check.mp3",false);
	        		clickMusic.start();
	        		try {
	        			Thread.sleep(200);
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}
	        		
	        		page2.setVisible(false);
	        		flour_page.setVisible(true); 		
	        		Boolgogi_check=true;
	        		Pepperoni_check=false;
	        		Seafood_check=false;
	        		
	        	}
	        	
	        	
	        });
			
	
			pizza2.setIcon(p2);
			pizza2.setBounds(300, 205, 300, 375);
			pizza2.setBorderPainted(false);
			pizza2.setContentAreaFilled(false);
			pizza2.setFocusPainted(false);
			pizza2.setCursor(hand_cursor);
			pizza2.setOpaque(false);
			
	       
			pizza2.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		Music clickMusic= new Music("ping.mp3",false);
					clickMusic.start();
	        		pizza2.setIcon(p2c);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		pizza2.setIcon(p2);
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		Music clickMusic= new Music("Check.mp3",false);
	        		clickMusic.start();
	        		try {
	        			Thread.sleep(200);
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}
	        		page2.setVisible(false);
	        		flour_page.setVisible(true);
	        		Boolgogi_check=false;
	        		Pepperoni_check=true;
	        		Seafood_check=false;
	        		
	        	}
	        	
	        	
	        });
			
			pizza3.setIcon(p3);
			pizza3.setBounds(0, 425, 300, 375);
			pizza3.setBorderPainted(false);
			pizza3.setContentAreaFilled(false);
			pizza3.setFocusPainted(false);
			pizza3.setCursor(hand_cursor);
			pizza3.setOpaque(false);
			
			pizza3.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		Music clickMusic= new Music("ping.mp3",false);
					clickMusic.start();
	        		pizza3.setIcon(p3c);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		pizza3.setIcon(p3);
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		Music clickMusic= new Music("Check.mp3",false);
	        		clickMusic.start();
	        		try {
	        			Thread.sleep(200);
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}
	        		page2.setVisible(false);
	        		flour_page.setVisible(true); 
	        		Boolgogi_check=false;
	        		Pepperoni_check=false;
	        		Seafood_check=true;
	        	}
	        	
	        	
	        });
			
			/////////////////////////////////////////////////////////////////////////////////
			
			flour_label.setIcon(flour);
			flour_label.setBounds(430, 70, 186, 186);
			
			
			flour_pour.setIcon(flourpour1);
			flour_pour.setBounds(101, 272, 392,392);	
			flour_pour.setVisible(false);				
			
			flour_move.setIcon(flourgif);
			flour_move.setBounds(200, 250, 300,300);	
			flour_move.setVisible(false);			
			
			
	
			music_stop_button1.setIcon(ms);
			music_stop_button1.setBounds(420, 10, 71, 71);
			music_stop_button1.setBorderPainted(false);
			music_stop_button1.setContentAreaFilled(false);
			music_stop_button1.setFocusPainted(false);
			music_stop_button1.setCursor(hand_cursor);
			music_stop_button1.setOpaque(false);
	       
			
			music_stop_button1.addMouseListener(new MouseAdapter() {
		        	
		        	@Override
		        	public void mouseEntered(MouseEvent e)
		        	{
		        		music_stop_button1.setIcon(msc);
		        	}
		        	
		        	@Override
		        	public void mouseExited(MouseEvent e)
		        	{
		        		music_stop_button1.setIcon(ms);
		        	}
		        	@Override
		        	public void mousePressed(MouseEvent e)
		        	{
		        		Music clickMusic= new Music("Click.mp3",false);
		        		clickMusic.start();
		        		try {
		        			Thread.sleep(200);
		        		}catch(InterruptedException ex)
		        		{
		        			
		        		}
		        		titleMusic.close();
		        		
		        	}
		        	
		        	
		        	
		        });
			
			exit_button1.setIcon(ex);
			exit_button1.setBounds(500, 10, 71, 71);
			exit_button1.setBorderPainted(false);
			exit_button1.setContentAreaFilled(false);
			exit_button1.setFocusPainted(false);
			exit_button1.setCursor(hand_cursor);
			exit_button1.setOpaque(false);
			
	       
			exit_button1.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		exit_button1.setIcon(exc);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		exit_button1.setIcon(ex);
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		Music clickMusic= new Music("Click.mp3",false);
	        		clickMusic.start();
	        		try {
	        			Thread.sleep(200);
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}
	        		System.exit(0);     		
	        		
	        	}
	        	
	        	
	        });
			
			next_button1.setIcon(n);
			next_button1.setBounds(340, 10, 71, 71);
			next_button1.setBorderPainted(false);
			next_button1.setContentAreaFilled(false);
			next_button1.setFocusPainted(false);
			next_button1.setCursor(hand_cursor);
			next_button1.setOpaque(false);
			next_button1.setVisible(false);
			
			next_button1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				next_button1.setIcon(nc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				next_button1.setIcon(n);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		
	        		flour_page.setVisible(false);
	        		water_page.setVisible(true);
	        		    
			}
			
			});
			
			///////////////////////////////////////////////////////////////////////////////////

			water_label.setIcon(water);
			water_label.setBounds(430, 70, 186, 186);				
			
			flour_pour2.setIcon(flourpour2);
			flour_pour2.setBounds(101, 272, 392,392);	
			flour_pour2.setVisible(false);
			
			water_move.setIcon(watergif);
			water_move.setBounds(200, 250, 300,300);	
			water_move.setVisible(false);			
			
			
			music_stop_button2.setIcon(ms);
			music_stop_button2.setBounds(420, 10, 71, 71);
			music_stop_button2.setBorderPainted(false);
			music_stop_button2.setContentAreaFilled(false);
			music_stop_button2.setFocusPainted(false);
			music_stop_button2.setCursor(hand_cursor);
			music_stop_button2.setOpaque(false);
	       
			
			music_stop_button2.addMouseListener(new MouseAdapter() {
		        	
		        	@Override
		        	public void mouseEntered(MouseEvent e)
		        	{
		        		music_stop_button2.setIcon(msc);
		        	}
		        	
		        	@Override
		        	public void mouseExited(MouseEvent e)
		        	{
		        		music_stop_button2.setIcon(ms);
		        	}
		        	@Override
		        	public void mousePressed(MouseEvent e)
		        	{
		        		Music clickMusic= new Music("Click.mp3",false);
		        		clickMusic.start();
		        		try {
		        			Thread.sleep(200);
		        		}catch(InterruptedException ex)
		        		{
		        			
		        		}
		        		titleMusic.close();
		        		
		        	}
		        	
		        	
		        	
		        });
			
			exit_button2.setIcon(ex);
			exit_button2.setBounds(500, 10, 71, 71);
			exit_button2.setBorderPainted(false);
			exit_button2.setContentAreaFilled(false);
			exit_button2.setFocusPainted(false);
			exit_button2.setCursor(hand_cursor);
			exit_button2.setOpaque(false);
			
	       
			exit_button2.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		exit_button2.setIcon(exc);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		exit_button2.setIcon(ex);
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		Music clickMusic= new Music("Click.mp3",false);
	        		clickMusic.start();
	        		try {
	        			Thread.sleep(200);
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}
	        		System.exit(0);     		
	        		
	        	}
	        	
	        	
	        });
			
			next_button2.setIcon(n);
			next_button2.setBounds(340, 10, 71, 71);
			next_button2.setBorderPainted(false);
			next_button2.setContentAreaFilled(false);
			next_button2.setFocusPainted(false);
			next_button2.setCursor(hand_cursor);
			next_button2.setOpaque(false);
			next_button2.setVisible(false);
			
			next_button2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				next_button2.setIcon(nc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				next_button2.setIcon(n);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		
	        		water_page.setVisible(false);
	        		salt_page.setVisible(true);
	        		    
			}
			
			});
			
			
			
			///////////////////////////////////////////////////////////////////////////////////

			salt_label.setIcon(salt);
			salt_label.setBounds(430, 70, 186, 186);				
			
			flour_pour3.setIcon(flourpour3);
			flour_pour3.setBounds(101, 272, 392,392);	
			flour_pour3.setVisible(false);
			
			salt_move.setIcon(saltgif);
			salt_move.setBounds(200, 250, 300,300);	
			salt_move.setVisible(false);	
			
			music_stop_button3.setIcon(ms);
			music_stop_button3.setBounds(420, 10, 71, 71);
			music_stop_button3.setBorderPainted(false);
			music_stop_button3.setContentAreaFilled(false);
			music_stop_button3.setFocusPainted(false);
			music_stop_button3.setCursor(hand_cursor);
			music_stop_button3.setOpaque(false);
	       
			
			music_stop_button3.addMouseListener(new MouseAdapter() {
		        	
		        	@Override
		        	public void mouseEntered(MouseEvent e)
		        	{
		        		music_stop_button3.setIcon(msc);
		        	}
		        	
		        	@Override
		        	public void mouseExited(MouseEvent e)
		        	{
		        		music_stop_button3.setIcon(ms);
		        	}
		        	@Override
		        	public void mousePressed(MouseEvent e)
		        	{
		        		Music clickMusic= new Music("Click.mp3",false);
		        		clickMusic.start();
		        		try {
		        			Thread.sleep(200);
		        		}catch(InterruptedException ex)
		        		{
		        			
		        		}
		        		titleMusic.close();
		        		
		        	}
		        	
		        	
		        	
		        });
			
			exit_button3.setIcon(ex);
			exit_button3.setBounds(500, 10, 71, 71);
			exit_button3.setBorderPainted(false);
			exit_button3.setContentAreaFilled(false);
			exit_button3.setFocusPainted(false);
			exit_button3.setCursor(hand_cursor);
			exit_button3.setOpaque(false);
			
	       
			exit_button3.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		exit_button3.setIcon(exc);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		exit_button3.setIcon(ex);
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		Music clickMusic= new Music("Click.mp3",false);
	        		clickMusic.start();
	        		try {
	        			Thread.sleep(200);
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}
	        		System.exit(0);     		
	        		
	        	}
	        	
	        	
	        });
			
			next_button3.setIcon(n);
			next_button3.setBounds(340, 10, 71, 71);
			next_button3.setBorderPainted(false);
			next_button3.setContentAreaFilled(false);
			next_button3.setFocusPainted(false);
			next_button3.setCursor(hand_cursor);
			next_button3.setOpaque(false);
			next_button3.setVisible(false);
			
			next_button3.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				next_button3.setIcon(nc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				next_button3.setIcon(n);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		
	        		salt_page.setVisible(false);
	        		sugar_page.setVisible(true);
	        		    
			}
			
			});
			
			
			
			
				
			///////////////////////////////////////////////////////////////////////////////////
			
			sugar_label.setIcon(sugar);
			sugar_label.setBounds(430, 70, 186, 186);				
			
			flour_pour4.setIcon(flourpour4);
			flour_pour4.setBounds(101, 272, 392,392);	
			flour_pour4.setVisible(false);
			
			sugar_move.setIcon(sugargif);
			sugar_move.setBounds(200, 250, 300,300);	
			sugar_move.setVisible(false);
			
			music_stop_button4.setIcon(ms);
			music_stop_button4.setBounds(420, 10, 71, 71);
			music_stop_button4.setBorderPainted(false);
			music_stop_button4.setContentAreaFilled(false);
			music_stop_button4.setFocusPainted(false);
			music_stop_button4.setCursor(hand_cursor);
			music_stop_button4.setOpaque(false);
			
			
			music_stop_button4.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				music_stop_button4.setIcon(msc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				music_stop_button4.setIcon(ms);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
			Music clickMusic= new Music("Click.mp3",false);
			clickMusic.start();
			try {
			Thread.sleep(200);
			}catch(InterruptedException ex)
			{
			
			}
			titleMusic.close();
			
			}
			
			
			
			});
			
			exit_button4.setIcon(ex);
			exit_button4.setBounds(500, 10, 71, 71);
			exit_button4.setBorderPainted(false);
			exit_button4.setContentAreaFilled(false);
			exit_button4.setFocusPainted(false);
			exit_button4.setCursor(hand_cursor);
			exit_button4.setOpaque(false);
			
			
			exit_button4.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				exit_button4.setIcon(exc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				exit_button4.setIcon(ex);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
			try {
				Thread.sleep(200);
			}catch(InterruptedException ex)
			{
			
			}
				System.exit(0);     		
			
			}
			
			
			});
			
			next_button4.setIcon(n);
			next_button4.setBounds(340, 10, 71, 71);
			next_button4.setBorderPainted(false);
			next_button4.setContentAreaFilled(false);
			next_button4.setFocusPainted(false);
			next_button4.setCursor(hand_cursor);
			next_button4.setOpaque(false);
			next_button4.setVisible(false);
			
			next_button4.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				next_button4.setIcon(nc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				next_button4.setIcon(n);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		
	        		sugar_page.setVisible(false);
	        		oil_page.setVisible(true);
	        		    
			}
			
			});
			
			
			
			
			
			
			///////////////////////////////////////////////////////////////////////////////////
			
			
			oil_label.setIcon(oil);
			oil_label.setBounds(430, 70, 186, 186);				
			
			flour_pour5.setIcon(flourpour5);
			flour_pour5.setBounds(101, 272, 392,392);	
			flour_pour5.setVisible(false);	
			
			oil_move.setIcon(oilgif);
			oil_move.setBounds(200, 250, 300,300);	
			oil_move.setVisible(false);
			
			oil_music_stop_button.setIcon(ms);
			oil_music_stop_button.setBounds(420, 10, 71, 71);
			oil_music_stop_button.setBorderPainted(false);
			oil_music_stop_button.setContentAreaFilled(false);
			oil_music_stop_button.setFocusPainted(false);
			oil_music_stop_button.setCursor(hand_cursor);
			oil_music_stop_button.setOpaque(false);
			
			
			oil_music_stop_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				oil_music_stop_button.setIcon(msc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				oil_music_stop_button.setIcon(ms);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
			Music clickMusic= new Music("Click.mp3",false);
			clickMusic.start();
			try {
			Thread.sleep(200);
			}catch(InterruptedException ex)
			{
			
			}
			titleMusic.close();
			
			}
			
			
			
			});
			
			oil_exit_button.setIcon(ex);
			oil_exit_button.setBounds(500, 10, 71, 71);
			oil_exit_button.setBorderPainted(false);
			oil_exit_button.setContentAreaFilled(false);
			oil_exit_button.setFocusPainted(false);
			oil_exit_button.setCursor(hand_cursor);
			oil_exit_button.setOpaque(false);
			
			
			oil_exit_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				oil_exit_button.setIcon(exc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				oil_exit_button.setIcon(ex);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
			try {
				Thread.sleep(200);
			}catch(InterruptedException ex)
			{
			
			}
				System.exit(0);     		
			
			}
			
			
			});
			
			
			oil_next_button.setIcon(n);
			oil_next_button.setBounds(340, 10, 71, 71);
			oil_next_button.setBorderPainted(false);
			oil_next_button.setContentAreaFilled(false);
			oil_next_button.setFocusPainted(false);
			oil_next_button.setCursor(hand_cursor);
			oil_next_button.setOpaque(false);
			oil_next_button.setVisible(false);
			
			oil_next_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				oil_next_button.setIcon(nc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				oil_next_button.setIcon(n);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
			Music clickMusic= new Music("Click.mp3",false);
			clickMusic.start();
			try {
			Thread.sleep(200);
			}catch(InterruptedException ex)
			{
			
			}
				oil_page.setVisible(false);
				spread_page.setVisible(true);
			
			}
			
			
			
			});
			
			
			///////////////////////////////////////////////////////////////////////////////////
			
			
			
			music_stop_button5.setIcon(ms);
			music_stop_button5.setBounds(420, 10, 71, 71);
			music_stop_button5.setBorderPainted(false);
			music_stop_button5.setContentAreaFilled(false);
			music_stop_button5.setFocusPainted(false);
			music_stop_button5.setCursor(hand_cursor);
			music_stop_button5.setOpaque(false);
	       
			
			music_stop_button5.addMouseListener(new MouseAdapter() {
		        	
		        	@Override
		        	public void mouseEntered(MouseEvent e)
		        	{
		        		music_stop_button5.setIcon(msc);
		        	}
		        	
		        	@Override
		        	public void mouseExited(MouseEvent e)
		        	{
		        		music_stop_button5.setIcon(ms);
		        	}
		        	@Override
		        	public void mousePressed(MouseEvent e)
		        	{
		        		Music clickMusic= new Music("Click.mp3",false);
		        		clickMusic.start();
		        		try {
		        			Thread.sleep(200);
		        		}catch(InterruptedException ex)
		        		{
		        			
		        		}
		        		titleMusic.close();
		        		
		        	}
		        	
		        	
		        	
		        });
			
			exit_button5.setIcon(ex);
			exit_button5.setBounds(500, 10, 71, 71);
			exit_button5.setBorderPainted(false);
			exit_button5.setContentAreaFilled(false);
			exit_button5.setFocusPainted(false);
			exit_button5.setCursor(hand_cursor);
			exit_button5.setOpaque(false);
			
	       
			exit_button5.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		exit_button5.setIcon(exc);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		exit_button5.setIcon(ex);
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		Music clickMusic= new Music("Click.mp3",false);
	        		clickMusic.start();
	        		try {
	        			Thread.sleep(200);
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}
	        		System.exit(0);     		
	        		
	        	}
	        	
	        	
	        });
			
			
			next_button5.setIcon(n);
			next_button5.setBounds(340, 10, 71, 71);
			next_button5.setBorderPainted(false);
			next_button5.setContentAreaFilled(false);
			next_button5.setFocusPainted(false);
			next_button5.setCursor(hand_cursor);
			next_button5.setOpaque(false);
			next_button5.setVisible(false);
			
			next_button5.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				next_button5.setIcon(nc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				next_button5.setIcon(n);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				try {
				Thread.sleep(200);
				}catch(InterruptedException ex)
				{
				
				}
				
				
			}
			
			
			
			});
		
			
	
			
			
			
			
			
			///////////////////////////////////////////////////////////////////////////////////
			JLabel roller_label=new JLabel();
			roller_label.setIcon(spread_roller);
			roller_label.setBounds(0,150,600,600);		
			roller_label.setVisible(false);
			
			spread_button.setIcon(spread_dough1);
			spread_button.setBounds(86, 245, 428,428);
			spread_button.setBorderPainted(false);
			spread_button.setContentAreaFilled(false);
			spread_button.setFocusPainted(false);
			spread_button.setCursor(hand_cursor);
			spread_button.setOpaque(false);
		
			next_button6.setIcon(n);
			next_button6.setBounds(340, 10, 71, 71);
			next_button6.setBorderPainted(false);
			next_button6.setContentAreaFilled(false);
			next_button6.setFocusPainted(false);
			next_button6.setCursor(hand_cursor);
			next_button6.setOpaque(false);
			next_button6.setVisible(false);
			
			next_button6.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				next_button6.setIcon(nc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				next_button6.setIcon(n);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				try {
				Thread.sleep(200);
				}catch(InterruptedException ex)
				{
				
				}
				spread_page.setVisible(false);
				sauce_page.setVisible(true);
				
			}
			
			
			
			});
			
			
			roller_button8.setIcon(roller);
			roller_button8.setBounds(0, 230, 600,120);
			roller_button8.setBorderPainted(false);
			roller_button8.setContentAreaFilled(false);
			roller_button8.setFocusPainted(false);
			roller_button8.setCursor(hand_cursor);
			roller_button8.setOpaque(false);
			roller_button8.setVisible(false);

			roller_button8.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		roller_button8.setIcon(roller_click);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		roller_button8.setIcon(roller);
	        		
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		
	        		Music clickMusic= new Music("Click.mp3",false);
	        		clickMusic.start();
	        		
	        		
	        		Timer time=new Timer();
	    			TimerTask task=new TimerTask()
	    			{
	    				public void run()
	    				{
	    					if(timecount8<3)
	    					{
	    						Music clickMusic= new Music("dough.mp3",false);
	    		        		clickMusic.start();
	    		        		
	    						timecount8++;
	    						
	    						roller_button8.setVisible(false);
	    		        		roller_label.setVisible(true);  
	    		        		
	    					}
	    					
	    					else
	    					{
	    						time.cancel();
	    						
	    		        		roller_label.setVisible(false);  
	    		        		next_button6.setVisible(true);
	    					}
	    				}
	    			};time.schedule(task,1000,1000);	        		
	        		
	        		try {
	        			Thread.sleep(1000);
	        			
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}spread_button.setIcon(spread_dough9);
	        		
	        		
	        	}
	        	
	        });
			
			
			
			roller_button7.setIcon(roller);
			roller_button7.setBounds(0, 230, 600,120);
			roller_button7.setBorderPainted(false);
			roller_button7.setContentAreaFilled(false);
			roller_button7.setFocusPainted(false);
			roller_button7.setCursor(hand_cursor);
			roller_button7.setOpaque(false);
			roller_button7.setVisible(false);

			roller_button7.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		roller_button7.setIcon(roller_click);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		roller_button7.setIcon(roller);
	        		
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		
	        		Music clickMusic= new Music("Click.mp3",false);
	        		clickMusic.start();
	        		
	        		Timer time=new Timer();
	    			TimerTask task=new TimerTask()
	    			{
	    				public void run()
	    				{
	    					if(timecount7<3)
	    					{
	    						Music clickMusic= new Music("dough.mp3",false);
	    		        		clickMusic.start();
	    						timecount7++;
	    						
	    						roller_button7.setVisible(false);
	    		        		roller_label.setVisible(true);  
	    		        		
	    					}
	    					
	    					else
	    					{
	    						time.cancel();
	    						roller_button8.setVisible(true);
	    		        		roller_label.setVisible(false);  
	    						
	    					}
	    				}
	    			};time.schedule(task,1000,1000);	        		
	        		
	        		try {
	        			Thread.sleep(1000);
	        			
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}spread_button.setIcon(spread_dough8);
	        		
	        		
	        	}
	        	
	        });
			
			
			
			roller_button6.setIcon(roller);
			roller_button6.setBounds(0, 230, 600,120);
			roller_button6.setBorderPainted(false);
			roller_button6.setContentAreaFilled(false);
			roller_button6.setFocusPainted(false);
			roller_button6.setCursor(hand_cursor);
			roller_button6.setOpaque(false);
			roller_button6.setVisible(false);

			roller_button6.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		roller_button6.setIcon(roller_click);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		roller_button6.setIcon(roller);
	        		
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		
	        		Music clickMusic= new Music("Click.mp3",false);
	        		clickMusic.start();
	        		
	        		Timer time=new Timer();
	    			TimerTask task=new TimerTask()
	    			{
	    				public void run()
	    				{
	    					if(timecount6<3)
	    					{
	    						Music clickMusic= new Music("dough.mp3",false);
	    		        		clickMusic.start();
	    						timecount6++;
	    						
	    						roller_button6.setVisible(false);
	    		        		roller_label.setVisible(true);  
	    		        		
	    					}
	    					
	    					else
	    					{
	    						time.cancel();
	    						roller_button7.setVisible(true);
	    		        		roller_label.setVisible(false);  
	    						
	    					}
	    				}
	    			};time.schedule(task,1000,1000);	        		
	        		
	        		try {
	        			Thread.sleep(1000);
	        			
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}spread_button.setIcon(spread_dough7);
	        		
	        		
	        	}
	        	
	        });
			
			
			
			roller_button5.setIcon(roller);
			roller_button5.setBounds(0, 230, 600,120);
			roller_button5.setBorderPainted(false);
			roller_button5.setContentAreaFilled(false);
			roller_button5.setFocusPainted(false);
			roller_button5.setCursor(hand_cursor);
			roller_button5.setOpaque(false);
			roller_button5.setVisible(false);

			roller_button5.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		roller_button5.setIcon(roller_click);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		roller_button5.setIcon(roller);
	        		
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		
	        		Music clickMusic= new Music("Click.mp3",false);
	        		clickMusic.start();
	        		
	        		Timer time=new Timer();
	    			TimerTask task=new TimerTask()
	    			{
	    				public void run()
	    				{
	    					if(timecount5<3)
	    					{
	    						Music clickMusic= new Music("dough.mp3",false);
	    		        		clickMusic.start();
	    						timecount5++;
	    						
	    						roller_button5.setVisible(false);
	    		        		roller_label.setVisible(true);  
	    		        		
	    					}
	    					
	    					else
	    					{
	    						
	    						time.cancel();
	    						roller_button6.setVisible(true);
	    		        		roller_label.setVisible(false);  
	    						
	    					}
	    				}
	    			};time.schedule(task,1000,1000);	        		
	        		
	        		try {
	        			Thread.sleep(1000);
	        			
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}spread_button.setIcon(spread_dough6);
	        		
	        		
	        	}
	        	
	        });
			
			
			
			
			
			roller_button4.setIcon(roller);
			roller_button4.setBounds(0, 230, 600,120);
			roller_button4.setBorderPainted(false);
			roller_button4.setContentAreaFilled(false);
			roller_button4.setFocusPainted(false);
			roller_button4.setCursor(hand_cursor);
			roller_button4.setOpaque(false);
			roller_button4.setVisible(false);

			roller_button4.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		roller_button4.setIcon(roller_click);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		roller_button4.setIcon(roller);
	        		
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		
	        		Music clickMusic= new Music("Click.mp3",false);
	        		clickMusic.start();
	        		
	        		Timer time=new Timer();
	    			TimerTask task=new TimerTask()
	    			{
	    				public void run()
	    				{
	    					if(timecount4<3)
	    					{
	    						Music clickMusic= new Music("dough.mp3",false);
	    		        		clickMusic.start();
	    						timecount4++;
	    						
	    						roller_button4.setVisible(false);
	    		        		roller_label.setVisible(true);  
	    		        		
	    					}
	    					
	    					else
	    					{
	    						time.cancel();
	    						roller_button5.setVisible(true);
	    		        		roller_label.setVisible(false);  
	    						
	    					}
	    				}
	    			};time.schedule(task,1000,1000);	        		
	        		
	        		try {
	        			Thread.sleep(1000);
	        			
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}spread_button.setIcon(spread_dough5);
	        		
	        		
	        	}
	        	
	        });
			
			
			
			roller_button3.setIcon(roller);
			roller_button3.setBounds(0, 230, 600,120);
			roller_button3.setBorderPainted(false);
			roller_button3.setContentAreaFilled(false);
			roller_button3.setFocusPainted(false);
			roller_button3.setCursor(hand_cursor);
			roller_button3.setOpaque(false);
			roller_button3.setVisible(false);

			roller_button3.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		roller_button3.setIcon(roller_click);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		roller_button3.setIcon(roller);
	        		
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		
	        		Music clickMusic= new Music("Click.mp3",false);
	        		clickMusic.start();
	        		
	        		Timer time=new Timer();
	    			TimerTask task=new TimerTask()
	    			{
	    				public void run()
	    				{
	    					if(timecount3<3)
	    					{
	    						Music clickMusic= new Music("dough.mp3",false);
	    		        		clickMusic.start();
	    						timecount3++;
	    						
	    						roller_button3.setVisible(false);
	    		        		roller_label.setVisible(true);  
	    		        		
	    					}
	    					
	    					else
	    					{
	    						time.cancel();
	    						roller_button4.setVisible(true);
	    		        		roller_label.setVisible(false);  
	    						
	    					}
	    				}
	    			};time.schedule(task,1000,1000);	        		
	        		
	        		try {
	        			Thread.sleep(1000);
	        			
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}spread_button.setIcon(spread_dough4);
	        		
	        		
	        	}
	        	
	        });
			
			
			
			
			
			
			
						
			roller_button2.setIcon(roller);
			roller_button2.setBounds(0, 230, 600,120);
			roller_button2.setBorderPainted(false);
			roller_button2.setContentAreaFilled(false);
			roller_button2.setFocusPainted(false);
			roller_button2.setCursor(hand_cursor);
			roller_button2.setOpaque(false);
			roller_button2.setVisible(false);

			roller_button2.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		roller_button2.setIcon(roller_click);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		roller_button2.setIcon(roller);
	        		
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		
	        		Music clickMusic= new Music("Click.mp3",false);
	        		clickMusic.start();
	        		
	        		Timer time=new Timer();
	    			TimerTask task=new TimerTask()
	    			{
	    				public void run()
	    				{
	    					if(timecount2<3)
	    					{
	    						Music clickMusic= new Music("dough.mp3",false);
	    		        		clickMusic.start();
	    						timecount2++;
	    						
	    						roller_button2.setVisible(false);
	    		        		roller_label.setVisible(true);  
	    		        		
	    					}
	    					
	    					else
	    					{
	    						time.cancel();
	    						roller_button3.setVisible(true);
	    		        		roller_label.setVisible(false);  
	    						
	    					}
	    				}
	    			};time.schedule(task,1000,1000);	        		
	        		
	        		try {
	        			Thread.sleep(1000);
	        			
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}spread_button.setIcon(spread_dough3);
	        		
	        		
	        	}
	        	
	        });
			
			
			roller_button.setIcon(roller);
			roller_button.setBounds(0, 230, 600,120);
			roller_button.setBorderPainted(false);
			roller_button.setContentAreaFilled(false);
			roller_button.setFocusPainted(false);
			roller_button.setCursor(hand_cursor);
			roller_button.setOpaque(false);
			
			roller_button.addMouseListener(new MouseAdapter() {
	        	
				
				
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		roller_button.setIcon(roller_click);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		roller_button.setIcon(roller);
	        		
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		
	        		Music clickMusic= new Music("Click.mp3",false);
	        		clickMusic.start();
	        		
	        		Timer time=new Timer();
	    			TimerTask task=new TimerTask()
	    			{
	    				public void run()
	    				{
	    					if(timecount<3)
	    					{
	    						Music clickMusic= new Music("dough.mp3",false);
	    		        		clickMusic.start();
	    						timecount++;
	    						
	    						
	    						roller_button.setVisible(false);
	    		        		roller_label.setVisible(true);  
	    		        		
	    					}
	    					
	    					else
	    					{
	    						time.cancel();
	    						roller_button2.setVisible(true);
	    		        		roller_label.setVisible(false);  
	    						
	    					}
	    				}
	    			};time.schedule(task,1000,1000);	        		
	        		
	        		try {
	        			Thread.sleep(1000);
	        			
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}spread_button.setIcon(spread_dough2);
	        		
	        		
	        	}
	        	
	        });
			
			
		
			
			
			
			
			music_stop_button6.setIcon(ms);
			music_stop_button6.setBounds(420, 10, 71, 71);
			music_stop_button6.setBorderPainted(false);
			music_stop_button6.setContentAreaFilled(false);
			music_stop_button6.setFocusPainted(false);
			music_stop_button6.setCursor(hand_cursor);
			music_stop_button6.setOpaque(false);
	       
			
			music_stop_button6.addMouseListener(new MouseAdapter() {
		        	
		        	@Override
		        	public void mouseEntered(MouseEvent e)
		        	{
		        		music_stop_button6.setIcon(msc);
		        	}
		        	
		        	@Override
		        	public void mouseExited(MouseEvent e)
		        	{
		        		music_stop_button6.setIcon(ms);
		        	}
		        	@Override
		        	public void mousePressed(MouseEvent e)
		        	{
		        		Music clickMusic= new Music("Click.mp3",false);
		        		clickMusic.start();
		        		try {
		        			Thread.sleep(200);
		        		}catch(InterruptedException ex)
		        		{
		        			
		        		}
		        		titleMusic.close();
		        		
		        	}
		        	
		        	
		        	
		        });
			
			exit_button6.setIcon(ex);
			exit_button6.setBounds(500, 10, 71, 71);
			exit_button6.setBorderPainted(false);
			exit_button6.setContentAreaFilled(false);
			exit_button6.setFocusPainted(false);
			exit_button6.setCursor(hand_cursor);
			exit_button6.setOpaque(false);
			
	       
			exit_button6.addMouseListener(new MouseAdapter() {
	        	
	        	@Override
	        	public void mouseEntered(MouseEvent e)
	        	{
	        		exit_button6.setIcon(exc);
	        	}
	        	
	        	@Override
	        	public void mouseExited(MouseEvent e)
	        	{
	        		exit_button6.setIcon(ex);
	        	}
	        	@Override
	        	public void mousePressed(MouseEvent e)
	        	{
	        		Music clickMusic= new Music("Click.mp3",false);
	        		clickMusic.start();
	        		try {
	        			Thread.sleep(200);
	        		}catch(InterruptedException ex)
	        		{
	        			
	        		}
	        		System.exit(0);     		
	        		
	        	}
	        	
	        	
	        });
			
			
		
	
			
				
			///////////////////////////////////////////////////////////////////////////////////
			
			
			JLabel outline=new JLabel();
			outline.setIcon(sauce_outline);
			outline.setBounds(76,224,463,463);
			outline.setCursor(sauce_cursor);
			
			BufferedImage bi = new BufferedImage(415, 415, BufferedImage.TYPE_INT_ARGB );
	        
			
	        JLabel dough = new JLabel(new ImageIcon(bi) );				
			dough.setBounds(95,260, 415, 415);		
			dough.setCursor(sauce_cursor);
			
			Brush Tomato=new Brush();
			Tomato.setCursor(sauce_cursor);
			Tomato.setBounds(95,260, 415, 415);	
			
			
			dough.addMouseMotionListener( new MouseMotionListener() {
	            
	            public void mouseDragged(MouseEvent e) {
	                
	            	Tomato.xx=e.getX();
	            	Tomato.yy=e.getY();
	            	Tomato.repaint();                            
	            	Tomato.printAll(bi.getGraphics());              
	            }
	            
	            public void mouseMoved(MouseEvent e) {
	
	            }           
	        });
			

			
			
			music_stop_button7.setIcon(ms);
			music_stop_button7.setBounds(420, 10, 71, 71);
			music_stop_button7.setBorderPainted(false);
			music_stop_button7.setContentAreaFilled(false);
			music_stop_button7.setFocusPainted(false);
			music_stop_button7.setCursor(hand_cursor);
			music_stop_button7.setOpaque(false);
			
			
			music_stop_button7.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				music_stop_button7.setIcon(msc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				music_stop_button7.setIcon(ms);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				try {
				Thread.sleep(200);
				}catch(InterruptedException ex)
				{
				
				}
				titleMusic.close();
				
			}
			
			
			
			});
			
			exit_button7.setIcon(ex);
			exit_button7.setBounds(500, 10, 71, 71);
			exit_button7.setBorderPainted(false);
			exit_button7.setContentAreaFilled(false);
			exit_button7.setFocusPainted(false);
			exit_button7.setCursor(hand_cursor);
			exit_button7.setOpaque(false);
			
			
			exit_button7.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				exit_button7.setIcon(exc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				exit_button7.setIcon(ex);
			}
			@Override
				public void mousePressed(MouseEvent e)
				{
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				try {
				Thread.sleep(200);
				}catch(InterruptedException ex)
				{
				
				}
				System.exit(0);     		
				
			}
			
			
			});
			
			next_button7.setIcon(n);
			next_button7.setBounds(340, 10, 71, 71);
			next_button7.setBorderPainted(false);
			next_button7.setContentAreaFilled(false);
			next_button7.setFocusPainted(false);
			next_button7.setCursor(hand_cursor);
			next_button7.setOpaque(false);
			
			
			next_button7.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				next_button7.setIcon(nc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				next_button7.setIcon(n);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			ImageIO.write(bi, "PNG", new File("C:\\Users\\EX-A320M-GAMING\\eclipse-workspace\\Pizza\\images\\PizzaSauce.PNG"));
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} catch (IOException e1) {
						
						e1.printStackTrace();
						
					}
	        		
	        		
	        		
	        		sauce_page.setVisible(false);
	        		cheese_page.setVisible(true);
	        		
	        		
	        		
	        			     
			}
			
			});
			///////////////////////////////////////////////////////////////////////////////////
		
			JLabel cheese_outline=new JLabel();
			cheese_outline.setIcon(sauce_outline);
			cheese_outline.setBounds(76,224,463,463);				
			
			JLabel cheese_sauce = new JLabel(new ImageIcon(bi) );				
			cheese_sauce.setBounds(95,260, 415, 415);
			
			BufferedImage ci = new BufferedImage(415, 415, BufferedImage.TYPE_INT_ARGB );	        
			
	        JLabel cheese_on_dough = new JLabel(new ImageIcon(ci) );				
	        cheese_on_dough.setBounds(95,260, 415, 415);		
	       
			OnCheese cheeze=new OnCheese();			
			cheeze.setBounds(95,260, 415, 415);
			
			cheese_on_dough.addMouseListener(new MouseAdapter() {
	            
	           
				@Override
				public void mousePressed(MouseEvent e)
				{
					Music clickMusic= new Music("Click.mp3",false);
					clickMusic.start();
					
				
				
					cheeze.xx=e.getX();
					cheeze.yy=e.getY();
					cheeze.repaint();                            
					cheeze.printAll(ci.getGraphics());    }
				
	        });
			
			
			
			music_stop_button8.setIcon(ms);
			music_stop_button8.setBounds(420, 10, 71, 71);
			music_stop_button8.setBorderPainted(false);
			music_stop_button8.setContentAreaFilled(false);
			music_stop_button8.setFocusPainted(false);
			music_stop_button8.setCursor(hand_cursor);
			music_stop_button8.setOpaque(false);
			
			
			music_stop_button8.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				music_stop_button8.setIcon(msc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				music_stop_button8.setIcon(ms);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				try {
				Thread.sleep(200);
				}catch(InterruptedException ex)
				{
				
				}
				titleMusic.close();
				
			}
			
			
			
			});
			
			exit_button8.setIcon(ex);
			exit_button8.setBounds(500, 10, 71, 71);
			exit_button8.setBorderPainted(false);
			exit_button8.setContentAreaFilled(false);
			exit_button8.setFocusPainted(false);
			exit_button8.setCursor(hand_cursor);
			exit_button8.setOpaque(false);
			
			
			exit_button8.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				exit_button8.setIcon(exc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				exit_button8.setIcon(ex);
			}
			@Override
				public void mousePressed(MouseEvent e)
				{
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				try {
				Thread.sleep(200);
				}catch(InterruptedException ex)
				{
				
				}
				System.exit(0);     		
				
			}
			
			
			});
			
			next_button8.setIcon(n);
			next_button8.setBounds(340, 10, 71, 71);
			next_button8.setBorderPainted(false);
			next_button8.setContentAreaFilled(false);
			next_button8.setFocusPainted(false);
			next_button8.setCursor(hand_cursor);
			next_button8.setOpaque(false);
			
			
			next_button8.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				next_button8.setIcon(nc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				next_button8.setIcon(n);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		
	        		
	        		cheese_page.setVisible(false);
	        		
	        		if(Boolgogi_check==true)
	        		{
	        			boolgogi_page.setVisible(true);
	        			
	        		}
	        		
	        		else if(Pepperoni_check==true)
	        		{
	        			pepperoni_page.setVisible(true);
	        		}
	        		
	        		else if(Seafood_check==true)
	        		{
	        			seafood_page.setVisible(true);
	        		}
	        		
	        		
	        			     
			}
			
			});
			
			
			
			
			
			///////////////////////////////////////////////////////////////////////////////////
			
			JLabel boolgogi_outline=new JLabel();
			boolgogi_outline.setIcon(sauce_outline);
			boolgogi_outline.setBounds(76,224,463,463);	
			
			JLabel boolgogi_cheese = new JLabel(new ImageIcon(ci));				
			boolgogi_cheese.setBounds(95,260, 415, 415);
						
			JLabel boolgogi_sauce = new JLabel(new ImageIcon(bi));				
			boolgogi_sauce.setBounds(95,260, 415, 415);
							       
			BufferedImage b_p = new BufferedImage(415, 415, BufferedImage.TYPE_INT_ARGB );
    		
    		JLabel b_dough = new JLabel(new ImageIcon(b_p) );				
    		b_dough.setBounds(95,260, 415, 415);		
    		
			
			B_topping B_b=new B_topping();			
			B_b.setBounds(95,260, 415, 415);
    	
			
			b_dough.addMouseListener(new MouseAdapter() {
	            
	           
				@Override
				public void mousePressed(MouseEvent e)
				{
					Music clickMusic= new Music("Click.mp3",false);
					clickMusic.start();
					
					B_b.xx=e.getX();
	            	B_b.yy=e.getY();
	            	B_b.repaint();                            
	            	B_b.printAll(b_p.getGraphics());    }
				
	        });
			
			
			
			Boolgogi_button.setIcon(boolgogi);
			Boolgogi_button.setBounds(0,0,120,205);
			Boolgogi_button.setBorderPainted(false);
			Boolgogi_button.setContentAreaFilled(false);
			Boolgogi_button.setFocusPainted(false);
			Boolgogi_button.setCursor(hand_cursor);
			Boolgogi_button.setOpaque(false);
			
			
			Boolgogi_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				Music clickMusic= new Music("ping.mp3",false);
				clickMusic.start();
				Boolgogi_button.setIcon(boolgogi_click);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				Boolgogi_button.setIcon(boolgogi);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		B_Boolgogi_choose=true;       			
	        		B_Corn_choose=false;
	        		B_Paprika_choose=false;
	        		B_Onion_choose=false;
	        			     
			}
			
			});
			
			
			Corn_button.setIcon(corn);
			Corn_button.setBounds(115,0,120,205);
			Corn_button.setBorderPainted(false);
			Corn_button.setContentAreaFilled(false);
			Corn_button.setFocusPainted(false);
			Corn_button.setCursor(hand_cursor);
			Corn_button.setOpaque(false);
			
			
			Corn_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				Music clickMusic= new Music("ping.mp3",false);
				clickMusic.start();
				Corn_button.setIcon(corn_click);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				Corn_button.setIcon(corn);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		B_Boolgogi_choose=false;       			
	        		B_Corn_choose=true;
	        		B_Paprika_choose=false;
	        		B_Onion_choose=false;
	        			     
			}
			
			});
			
			
			BPaprika_button.setIcon(paprika);
			BPaprika_button.setBounds(240,0,120,205);
			BPaprika_button.setBorderPainted(false);
			BPaprika_button.setContentAreaFilled(false);
			BPaprika_button.setFocusPainted(false);
			BPaprika_button.setCursor(hand_cursor);
			BPaprika_button.setOpaque(false);
			
			
			BPaprika_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				Music clickMusic= new Music("ping.mp3",false);
				clickMusic.start();
				BPaprika_button.setIcon(paprika_click);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				BPaprika_button.setIcon(paprika);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		B_Boolgogi_choose=false;       			
	        		B_Corn_choose=false;
	        		B_Paprika_choose=true;
	        		B_Onion_choose=false;
	        			     
			}
			
			});
			
			
			Onion_button.setIcon(onion);
			Onion_button.setBounds(355,0,120,205);
			Onion_button.setBorderPainted(false);
			Onion_button.setContentAreaFilled(false);
			Onion_button.setFocusPainted(false);
			Onion_button.setCursor(hand_cursor);
			Onion_button.setOpaque(false);
			
			
			Onion_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				Music clickMusic= new Music("ping.mp3",false);
				clickMusic.start();
				Onion_button.setIcon(onion_click);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				Onion_button.setIcon(onion);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		B_Boolgogi_choose=false;       			
	        		B_Corn_choose=false;
	        		B_Paprika_choose=false;
	        		B_Onion_choose=true;
	        			    
			}
			
			});
			
			
			
			
			next_button9.setIcon(n);
			next_button9.setBounds(500, 10, 71, 71);
			next_button9.setBorderPainted(false);
			next_button9.setContentAreaFilled(false);
			next_button9.setFocusPainted(false);
			next_button9.setCursor(hand_cursor);
			next_button9.setOpaque(false);
			
			
			next_button9.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				next_button9.setIcon(nc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				next_button9.setIcon(n);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		boolgogi_page.setVisible(false);
	        		oven_boolgogi_page.setVisible(true);
	        		
			}
			
			});
			
			///////////////////////////////////////////////////////////////////////////////////
			
			JLabel pepperoni_outline=new JLabel();
			pepperoni_outline.setIcon(sauce_outline);
			pepperoni_outline.setBounds(76,224,463,463);
			
			JLabel pepperoni_cheese = new JLabel(new ImageIcon(ci));				
			pepperoni_cheese.setBounds(95,260, 415, 415);
			
			JLabel pepperoni_sauce = new JLabel(new ImageIcon(bi) );				
			pepperoni_sauce.setBounds(95,260, 415, 415);						
							       
			BufferedImage p_p = new BufferedImage(415, 415, BufferedImage.TYPE_INT_ARGB );
    		
    		JLabel p_dough = new JLabel(new ImageIcon(p_p) );				
    		p_dough.setBounds(95,260, 415, 415);		
    		p_dough.setCursor(sauce_cursor);
			
			P_topping P_b=new P_topping();			
			P_b.setBounds(95,260, 415, 415);
    	
			
			p_dough.addMouseListener(new MouseAdapter() {
	            
	           
				@Override
				public void mousePressed(MouseEvent e)
				{
					Music clickMusic= new Music("Click.mp3",false);
					clickMusic.start();
					
					P_b.xx=e.getX();
					P_b.yy=e.getY();
					P_b.repaint();                            
					P_b.printAll(p_p.getGraphics());    }
				
	        });
			
			
			Pepperoni_button.setIcon(pepperoni);
			Pepperoni_button.setBounds(0,0,120,205);
			Pepperoni_button.setBorderPainted(false);
			Pepperoni_button.setContentAreaFilled(false);
			Pepperoni_button.setFocusPainted(false);
			Pepperoni_button.setCursor(hand_cursor);
			Pepperoni_button.setOpaque(false);
			
			
			Pepperoni_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				Music clickMusic= new Music("ping.mp3",false);
				clickMusic.start();
				Pepperoni_button.setIcon(pepperoni_click);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				Pepperoni_button.setIcon(pepperoni);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		P_Pepperoni_choose=true;       			
	        		P_Mushroom_choose=false;
	        		P_Paprika_choose=false;
	        		P_Olive_choose=false;
	        			     
			}
			
			});
			
			
			
			PMushroom_button.setIcon(mushroom);
			PMushroom_button.setBounds(115,0,120,205);
			PMushroom_button.setBorderPainted(false);
			PMushroom_button.setContentAreaFilled(false);
			PMushroom_button.setFocusPainted(false);
			PMushroom_button.setCursor(hand_cursor);
			PMushroom_button.setOpaque(false);
			
			
			PMushroom_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				Music clickMusic= new Music("ping.mp3",false);
				clickMusic.start();
				PMushroom_button.setIcon(mushroom_click);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				PMushroom_button.setIcon(mushroom);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		P_Pepperoni_choose=false;       			
	        		P_Mushroom_choose=true;
	        		P_Paprika_choose=false;
	        		P_Olive_choose=false;
	        			     
			}
			
			});
						
			
    		PPaprika_button.setIcon(paprika);
    		PPaprika_button.setBounds(240,0,120,205);
    		PPaprika_button.setBorderPainted(false);
			PPaprika_button.setContentAreaFilled(false);
			PPaprika_button.setFocusPainted(false);
			PPaprika_button.setCursor(hand_cursor);
			PPaprika_button.setOpaque(false);
			
			
			PPaprika_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				Music clickMusic= new Music("ping.mp3",false);
				clickMusic.start();
				PPaprika_button.setIcon(paprika_click);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				PPaprika_button.setIcon(paprika);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		P_Pepperoni_choose=false;       			
	        		P_Mushroom_choose=false;
	        		P_Paprika_choose=true;
	        		P_Olive_choose=false;
	        			     
			}
			
			});
			
			
    		POlive_button.setIcon(olive);
    		POlive_button.setBounds(355,0,120,205);
    		POlive_button.setBorderPainted(false);
    		POlive_button.setContentAreaFilled(false);
			POlive_button.setFocusPainted(false);
			POlive_button.setCursor(hand_cursor);
			POlive_button.setOpaque(false);
			
			
			POlive_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				Music clickMusic= new Music("ping.mp3",false);
				clickMusic.start();
				POlive_button.setIcon(olive_click);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				POlive_button.setIcon(olive);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		P_Pepperoni_choose=false;       			
	        		P_Mushroom_choose=false;
	        		P_Paprika_choose=false;
	        		P_Olive_choose=true;
	        			    
			}
			
			});
			
			
			
			
			next_button10.setIcon(n);
			next_button10.setBounds(500, 10, 71, 71);
			next_button10.setBorderPainted(false);
			next_button10.setContentAreaFilled(false);
			next_button10.setFocusPainted(false);
			next_button10.setCursor(hand_cursor);
			next_button10.setOpaque(false);
			
			
			next_button10.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				next_button10.setIcon(nc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				next_button10.setIcon(n);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		pepperoni_page.setVisible(false);
	        		oven_pepperoni_page.setVisible(true);
	        		
			}
			
			});
			
			///////////////////////////////////////////////////////////////////////////////////
			
			JLabel seafood_outline=new JLabel();
			seafood_outline.setIcon(sauce_outline);
			seafood_outline.setBounds(76,224,463,463);	
			
			JLabel seafood_cheese = new JLabel(new ImageIcon(ci));				
			seafood_cheese.setBounds(95,260, 415, 415);
			
			JLabel seafood_sauce = new JLabel(new ImageIcon(bi) );				
			seafood_sauce.setBounds(95,260, 415, 415);
			
			BufferedImage s_p = new BufferedImage(415, 415, BufferedImage.TYPE_INT_ARGB );
    		
    		JLabel s_dough = new JLabel(new ImageIcon(s_p) );				
    		s_dough.setBounds(95,260, 415, 415);	
    		
			
    		S_topping S_b=new S_topping();			
			S_b.setBounds(95,260, 415, 415);
    	
			
			s_dough.addMouseListener(new MouseAdapter() {
	            
	           
				@Override
				public void mousePressed(MouseEvent e)
				{
					Music clickMusic= new Music("Click.mp3",false);
					clickMusic.start();
					
					S_b.xx=e.getX();
					S_b.yy=e.getY();
					S_b.repaint();                            
					S_b.printAll(s_p.getGraphics());    }
				
	        });
			
			
			Shrimp_button.setIcon(shrimp);
			Shrimp_button.setBounds(0,0,120,205);
			Shrimp_button.setBorderPainted(false);
			Shrimp_button.setContentAreaFilled(false);
			Shrimp_button.setFocusPainted(false);
			Shrimp_button.setCursor(hand_cursor);
			Shrimp_button.setOpaque(false);
			
			
			Shrimp_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				Music clickMusic= new Music("ping.mp3",false);
				clickMusic.start();
				Shrimp_button.setIcon(shrimp_click);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				Shrimp_button.setIcon(shrimp);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		S_Shrimp_choose=true;       			
	        		S_Mushroom_choose=false;
	        		S_Pineapple_choose=false;
	        		S_Olive_choose=false;
	        			     
			}
			
			});
			
			
			
			SMushroom_button.setIcon(mushroom);
			SMushroom_button.setBounds(115,0,120,205);
			SMushroom_button.setBorderPainted(false);
			SMushroom_button.setContentAreaFilled(false);
			SMushroom_button.setFocusPainted(false);
			SMushroom_button.setCursor(hand_cursor);
			SMushroom_button.setOpaque(false);
			
			
			SMushroom_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				Music clickMusic= new Music("ping.mp3",false);
				clickMusic.start();
				SMushroom_button.setIcon(mushroom_click);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				SMushroom_button.setIcon(mushroom);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		S_Shrimp_choose=false;       			
	        		S_Mushroom_choose=true;
	        		S_Pineapple_choose=false;
	        		S_Olive_choose=false;
	        			     
			}
			
			});
						
			
    		Pineapple_button.setIcon(pineapple);
    		Pineapple_button.setBounds(240,0,120,205);
    		Pineapple_button.setBorderPainted(false);
    		Pineapple_button.setContentAreaFilled(false);
    		Pineapple_button.setFocusPainted(false);
			Pineapple_button.setCursor(hand_cursor);
			Pineapple_button.setOpaque(false);
			
			
			Pineapple_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				Music clickMusic= new Music("ping.mp3",false);
				clickMusic.start();
				Pineapple_button.setIcon(pineapple_click);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				Pineapple_button.setIcon(pineapple);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		S_Shrimp_choose=false;       			
	        		S_Mushroom_choose=false;
	        		S_Pineapple_choose=true;
	        		S_Olive_choose=false;
	        			     
			}
			
			});
			
			
    		SOlive_button.setIcon(olive);
    		SOlive_button.setBounds(355,0,120,205);
    		SOlive_button.setBorderPainted(false);
    		SOlive_button.setContentAreaFilled(false);
    		SOlive_button.setFocusPainted(false);
    		SOlive_button.setCursor(hand_cursor);
    		SOlive_button.setOpaque(false);
			
			
    		SOlive_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				Music clickMusic= new Music("ping.mp3",false);
				clickMusic.start();
				SOlive_button.setIcon(olive_click);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				SOlive_button.setIcon(olive);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		S_Shrimp_choose=false;       			
	        		S_Mushroom_choose=false;
	        		S_Pineapple_choose=false;
	        		S_Olive_choose=true;
	        			    
			}
			
			});
			
			
			
			
			next_button11.setIcon(n);
			next_button11.setBounds(500, 10, 71, 71);
			next_button11.setBorderPainted(false);
			next_button11.setContentAreaFilled(false);
			next_button11.setFocusPainted(false);
			next_button11.setCursor(hand_cursor);
			next_button11.setOpaque(false);
			
			
			next_button11.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				next_button11.setIcon(nc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				next_button11.setIcon(n);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		seafood_page.setVisible(false);
	        		oven_seafood_page.setVisible(true);
	        		
			}
			
			});
			
			///////////////////////////////////////////////////////////////////////////////////
			
			JLabel Blight = new JLabel();	
			Blight.setIcon(oven_light);
			Blight.setBounds(174, 604, 258,117);	
			Blight.setVisible(false);
			
			JLabel Blight2 = new JLabel();	
			Blight2.setIcon(oven_light);
			Blight2.setBounds(174, 604, 258,117);	
			Blight2.setVisible(false);
			
			
			JLabel Blight3 = new JLabel();	
			Blight3.setIcon(oven_light);
			Blight3.setBounds(174, 604, 258,117);	
			Blight3.setVisible(false);
			
			JLabel Blight4 = new JLabel();	
			Blight4.setIcon(oven_light);
			Blight4.setBounds(174, 604, 258,117);	
			Blight4.setVisible(false);
			
			JLabel Blight5 = new JLabel();	
			Blight5.setIcon(oven_light);
			Blight5.setBounds(174, 604, 258,117);	
			Blight5.setVisible(false);
			
			JLabel Barrow=new JLabel();
			Barrow.setIcon(arrow);
			Barrow.setBounds(270, 475, 43,61);	
			
			next_button12.setIcon(n);
			next_button12.setBounds(500, 10, 71, 71);
			next_button12.setBorderPainted(false);
			next_button12.setContentAreaFilled(false);
			next_button12.setFocusPainted(false);
			next_button12.setCursor(hand_cursor);
			next_button12.setOpaque(false);
			next_button12.setVisible(false);
			
			next_button12.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				next_button12.setIcon(nc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				next_button12.setIcon(n);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		oven_boolgogi_page.setVisible(false);
	        		boolgogi_complete.setVisible(true);
	        		
	        		Music yeahMusic= new Music("yeah.mp3",false);			
	        		yeahMusic.start();
	        		
			}
			
			});
	
			
			
			boolgogi_oven_button.setIcon(oven_button);
			boolgogi_oven_button.setBounds(286,528,38,26);
			boolgogi_oven_button.setBorderPainted(false);
			boolgogi_oven_button.setContentAreaFilled(false);
			boolgogi_oven_button.setFocusPainted(false);
			boolgogi_oven_button.setCursor(hand_cursor);
			boolgogi_oven_button.setOpaque(false);
			
			
			boolgogi_oven_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				Music clickMusic= new Music("ping.mp3",false);
				clickMusic.start();
				boolgogi_oven_button.setIcon(oven_button_click);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				boolgogi_oven_button.setIcon(oven_button);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				boolgogi_oven_button.setVisible(false);	
				Barrow.setVisible(false);
				Music clockMusic= new Music("clock.mp3",false);
				clockMusic.start();
				
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		Timer time=new Timer();
	    			TimerTask task=new TimerTask()
	    			{
	    				
	    				
	    				public void run()
	    				{
	    					
	    					
	    					if(Bovencount<9)
	    					{
	    						Bovencount++;

	    						
	    						
	    		        		if(Bovencount==2)
	    		        		{
	    		        			Blight.setVisible(true);
	    		        			
	    		        		}
	    		        		
	    		        		else if(Bovencount==3)
	    		        		{
	    		        			Blight2.setVisible(true);
	    		        		}
	    		        		
	    		        		else if(Bovencount==4)
	    		        		{
	    		        			Blight3.setVisible(true);
	    		        		}
	    		        		
	    		        		else if(Bovencount==5)
	    		        		{
	    		        			Blight4.setVisible(true);
	    		        		}
	    		        		
	    		        		else if(Bovencount==6)
	    		        		{
	    		        			Blight5.setVisible(true);
	    		        		}
	    		        		
	    					}
	    					
	    					else
	    					{
	    						clockMusic.close();
	    						Music clickMusic= new Music("ding.mp3",false);
	    						clickMusic.start();
	    						time.cancel();
	    						next_button12.setVisible(true);	    						
	    						Blight.setVisible(false);	    						
	    						Blight2.setVisible(false);	    						
	    						Blight3.setVisible(false);	    						
	    						Blight4.setVisible(false);	    						
	    						Blight5.setVisible(false);
	    						
	    					}
	    				}
	    			};time.schedule(task,1000,1000);	       
	        		
	        		
			}
			
			});
			
			
			///////////////////////////////////////////////////////////////////////////////////
	
			JLabel Plight = new JLabel();	
			Plight.setIcon(oven_light);
			Plight.setBounds(174, 604, 258,117);	
			Plight.setVisible(false);
			
			JLabel Plight2 = new JLabel();	
			Plight2.setIcon(oven_light);
			Plight2.setBounds(174, 604, 258,117);	
			Plight2.setVisible(false);
			
			
			JLabel Plight3 = new JLabel();	
			Plight3.setIcon(oven_light);
			Plight3.setBounds(174, 604, 258,117);	
			Plight3.setVisible(false);
			
			JLabel Plight4 = new JLabel();	
			Plight4.setIcon(oven_light);
			Plight4.setBounds(174, 604, 258,117);	
			Plight4.setVisible(false);
			
			JLabel Plight5 = new JLabel();	
			Plight5.setIcon(oven_light);
			Plight5.setBounds(174, 604, 258,117);	
			Plight5.setVisible(false);
			
			JLabel Parrow=new JLabel();
			Parrow.setIcon(arrow);
			Parrow.setBounds(270, 475, 43,61);	
			
			next_button13.setIcon(n);
			next_button13.setBounds(500, 10, 71, 71);
			next_button13.setBorderPainted(false);
			next_button13.setContentAreaFilled(false);
			next_button13.setFocusPainted(false);
			next_button13.setCursor(hand_cursor);
			next_button13.setOpaque(false);
			next_button13.setVisible(false);
			
			next_button13.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				next_button13.setIcon(nc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				next_button13.setIcon(n);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		oven_pepperoni_page.setVisible(false);
	        		pepperoni_complete.setVisible(true);
	        		Music yeahMusic= new Music("yeah.mp3",false);			
	        		yeahMusic.start();
	        		
			}
			
			});
	
			
			
			
			
			pepperoni_oven_button.setIcon(oven_button);
			pepperoni_oven_button.setBounds(286,528,38,26);
			pepperoni_oven_button.setBorderPainted(false);
			pepperoni_oven_button.setContentAreaFilled(false);
			pepperoni_oven_button.setFocusPainted(false);
			pepperoni_oven_button.setCursor(hand_cursor);
			pepperoni_oven_button.setOpaque(false);
			
			
			pepperoni_oven_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				Music clickMusic= new Music("ping.mp3",false);
				clickMusic.start();
				pepperoni_oven_button.setIcon(oven_button_click);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				pepperoni_oven_button.setIcon(oven_button);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				pepperoni_oven_button.setVisible(false);	
				Parrow.setVisible(false);
				Music clockMusic= new Music("clock.mp3",false);
				clockMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		Timer time=new Timer();
	    			TimerTask task=new TimerTask()
	    			{
	    				public void run()
	    				{
	    					if(Povencount<9)
	    					{
	    						Povencount++;

	    		        		if(Povencount==2)
	    		        		{
	    		        			Plight.setVisible(true);
	    		        			
	    		        		}
	    		        		
	    		        		else if(Povencount==3)
	    		        		{
	    		        			Plight2.setVisible(true);
	    		        		}
	    		        		
	    		        		else if(Povencount==4)
	    		        		{
	    		        			Plight3.setVisible(true);
	    		        		}
	    		        		
	    		        		else if(Povencount==5)
	    		        		{
	    		        			Plight4.setVisible(true);
	    		        		}
	    		        		
	    		        		else if(Povencount==6)
	    		        		{
	    		        			Plight5.setVisible(true);
	    		        		}
	    		        		
	    					}
	    					
	    					else
	    					{
	    						clockMusic.close();
	    						Music clickMusic= new Music("ding.mp3",false);
	    						clickMusic.start();
	    						time.cancel();
	    						next_button13.setVisible(true);	    						
	    						Plight.setVisible(false);	    						
	    						Plight2.setVisible(false);	    						
	    						Plight3.setVisible(false);	    						
	    						Plight4.setVisible(false);	    						
	    						Plight5.setVisible(false);
	    						
	    					}
	    				}
	    			};time.schedule(task,1000,1000);	       
	        		
	        		
			}
			
			});
			
			
			
			
			
			
			
			///////////////////////////////////////////////////////////////////////////////////
			
	
			JLabel Slight = new JLabel();	
			Slight.setIcon(oven_light);
			Slight.setBounds(174, 604, 258,117);	
			Slight.setVisible(false);
			
			JLabel Slight2 = new JLabel();	
			Slight2.setIcon(oven_light);
			Slight2.setBounds(174, 604, 258,117);	
			Slight2.setVisible(false);
			
			
			JLabel Slight3 = new JLabel();	
			Slight3.setIcon(oven_light);
			Slight3.setBounds(174, 604, 258,117);	
			Slight3.setVisible(false);
			
			JLabel Slight4 = new JLabel();	
			Slight4.setIcon(oven_light);
			Slight4.setBounds(174, 604, 258,117);	
			Slight4.setVisible(false);
			
			JLabel Slight5 = new JLabel();	
			Slight5.setIcon(oven_light);
			Slight5.setBounds(174, 604, 258,117);	
			Slight5.setVisible(false);
			
			JLabel Sarrow=new JLabel();
			Sarrow.setIcon(arrow);
			Sarrow.setBounds(270, 475, 43,61);	
			
			next_button14.setIcon(n);
			next_button14.setBounds(500, 10, 71, 71);
			next_button14.setBorderPainted(false);
			next_button14.setContentAreaFilled(false);
			next_button14.setFocusPainted(false);
			next_button14.setCursor(hand_cursor);
			next_button14.setOpaque(false);
			next_button14.setVisible(false);
			
			next_button14.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				next_button14.setIcon(nc);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				next_button14.setIcon(n);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		oven_seafood_page.setVisible(false);
	        		seafood_complete.setVisible(true);
	        		Music yeahMusic= new Music("yeah.mp3",false);			
	        		yeahMusic.start();
	        		
	        		
			}
			
			});
	
			
			
			
			
			seafood_oven_button.setIcon(oven_button);
			seafood_oven_button.setBounds(286,528,38,26);
			seafood_oven_button.setBorderPainted(false);
			seafood_oven_button.setContentAreaFilled(false);
			seafood_oven_button.setFocusPainted(false);
			seafood_oven_button.setCursor(hand_cursor);
			seafood_oven_button.setOpaque(false);
			
			
			seafood_oven_button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				Music clickMusic= new Music("ping.mp3",false);
				clickMusic.start();
				seafood_oven_button.setIcon(oven_button_click);
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				seafood_oven_button.setIcon(oven_button);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				seafood_oven_button.setVisible(false);	
				Sarrow.setVisible(false);
				Music clockMusic= new Music("clock.mp3",false);
				clockMusic.start();
				
	        		try {
	        			Thread.sleep(200);
	        			
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
	        		
	        		Timer time=new Timer();
	    			TimerTask task=new TimerTask()
	    			{
	    				public void run()
	    				{
	    					if(Sovencount<9)
	    					{
	    						Sovencount++;

	    						
	    		        		if(Sovencount==2)
	    		        		{
	    		        			Slight.setVisible(true);
	    		        			
	    		        		}
	    		        		
	    		        		else if(Sovencount==3)
	    		        		{
	    		        			Slight2.setVisible(true);
	    		        		}
	    		        		
	    		        		else if(Sovencount==4)
	    		        		{
	    		        			Slight3.setVisible(true);
	    		        		}
	    		        		
	    		        		else if(Sovencount==5)
	    		        		{
	    		        			Slight4.setVisible(true);
	    		        		}
	    		        		
	    		        		else if(Sovencount==6)
	    		        		{
	    		        			Slight5.setVisible(true);
	    		        		}
	    		        		
	    					}
	    					
	    					else
	    					{
	    						clockMusic.close();
	    						Music clickMusic= new Music("ding.mp3",false);
	    						clickMusic.start();
	    						time.cancel();
	    						next_button14.setVisible(true);	    						
	    						Slight.setVisible(false);	    						
	    						Slight2.setVisible(false);	    						
	    						Slight3.setVisible(false);	    						
	    						Slight4.setVisible(false);	    						
	    						Slight5.setVisible(false);
	    						
	    					}
	    				}
	    			};time.schedule(task,1000,1000);	       
	        		
	        		
			}
			
			});
			
			
			///////////////////////////////////////////////////////////////////////////////////
			
		
			
			JLabel boolgogi_complete_outline=new JLabel();
			boolgogi_complete_outline.setIcon(complete_outline);
			boolgogi_complete_outline.setBounds(76,224,463,463);	
			
			JLabel boolgogi_complete_topping=new JLabel(new ImageIcon(b_p));		
			boolgogi_complete_topping.setBounds(76,224,463,463);	
    	
			///////////////////////////////////////////////////////////////////////////////////
			
			JLabel pepperoni_complete_outline=new JLabel();
			pepperoni_complete_outline.setIcon(complete_outline);
			pepperoni_complete_outline.setBounds(76,224,463,463);	
			
			JLabel pepperoni_complete_topping=new JLabel(new ImageIcon(p_p));		
			pepperoni_complete_topping.setBounds(76,224,463,463);	
    	
			///////////////////////////////////////////////////////////////////////////////////
			
			JLabel seafood_complete_outline=new JLabel();
			seafood_complete_outline.setIcon(complete_outline);
			seafood_complete_outline.setBounds(76,224,463,463);	
			
			JLabel seafood_complete_topping=new JLabel(new ImageIcon(s_p));		
			seafood_complete_topping.setBounds(76,224,463,463);	
    	
			///////////////////////////////////////////////////////////////////////////////////
			
			
			page1.add(start_button);	
			page1.add(name_label);	
			
			page2.add(pizza1);
			page2.add(pizza2);
			page2.add(pizza3);					
		
			flour_page.add(music_stop_button1);
			flour_page.add(exit_button1);
			flour_page.add(next_button1);
			flour_page.addMouseListener(new flour_mouse());
			flour_page.addMouseMotionListener(new flour_mouse());
			flour_page.add(flour_move);
			flour_page.add(flour_label);			
			flour_page.add(flour_pour);	
			
			
			water_page.add(music_stop_button2);
			water_page.add(exit_button2);
			water_page.add(next_button2);
			water_page.addMouseListener(new water_mouse());
			water_page.addMouseMotionListener(new water_mouse());
			water_page.add(water_move);
			water_page.add(water_label);			
			water_page.add(flour_pour2);	
			
			salt_page.add(music_stop_button3);
			salt_page.add(exit_button3);
			salt_page.add(next_button3);
			salt_page.addMouseListener(new salt_mouse());
			salt_page.addMouseMotionListener(new salt_mouse());
			salt_page.add(salt_move);	
			salt_page.add(salt_label);			
			salt_page.add(flour_pour3);	
			
			sugar_page.add(music_stop_button4);
			sugar_page.add(exit_button4);
			sugar_page.add(next_button4);
			sugar_page.addMouseListener(new sugar_mouse());
			sugar_page.addMouseMotionListener(new sugar_mouse());
			sugar_page.add(sugar_move);	
			sugar_page.add(sugar_label);			
			sugar_page.add(flour_pour4);	
			
			oil_page.add(oil_music_stop_button);
			oil_page.add(oil_exit_button);
			oil_page.add(oil_next_button);
			oil_page.addMouseListener(new oil_mouse());
			oil_page.addMouseMotionListener(new oil_mouse());
			oil_page.add(oil_move);	
			oil_page.add(oil_label);			
			oil_page.add(flour_pour5);	
			
			
			stir_page.add(music_stop_button5);
			stir_page.add(exit_button5);
			stir_page.add(next_button5);
			
			spread_page.add(music_stop_button6);
			spread_page.add(exit_button6);
			spread_page.add(next_button6);			
			spread_page.add(roller_button8);
			spread_page.add(roller_button7);	
			spread_page.add(roller_button6);
			spread_page.add(roller_button5);	
			spread_page.add(roller_button4);
			spread_page.add(roller_button3);	
			spread_page.add(roller_button2);
			spread_page.add(roller_button);	
			spread_page.add(roller_label);	
			spread_page.add(spread_button);
			
			sauce_page.add(music_stop_button7);
			sauce_page.add(exit_button7);
			sauce_page.add(next_button7);			
			sauce_page.add(outline);
			sauce_page.add(dough);
			sauce_page.add(Tomato);
			
			cheese_page.add(music_stop_button8);
			cheese_page.add(exit_button8);
			cheese_page.add(next_button8);			
			cheese_page.add(cheese_outline);
			cheese_page.add(cheese_on_dough);
			cheese_page.add(cheeze);
			cheese_page.add(cheese_sauce);
			
			boolgogi_page.add(Boolgogi_button);
			boolgogi_page.add(Corn_button);
			boolgogi_page.add(BPaprika_button);
			boolgogi_page.add(Onion_button);
			boolgogi_page.add(next_button9);
			boolgogi_page.add(boolgogi_outline);
			boolgogi_page.add(b_dough);
			boolgogi_page.add(B_b);	
			boolgogi_page.add(boolgogi_cheese);
			boolgogi_page.add(boolgogi_sauce);
			
			
			pepperoni_page.add(Pepperoni_button);
			pepperoni_page.add(PMushroom_button);
			pepperoni_page.add(PPaprika_button);
			pepperoni_page.add(POlive_button);
			pepperoni_page.add(next_button10);			
			pepperoni_page.add(pepperoni_outline);
			pepperoni_page.add(p_dough);
			pepperoni_page.add(P_b);	
			pepperoni_page.add(pepperoni_cheese);
			pepperoni_page.add(pepperoni_sauce);
			
			seafood_page.add(Shrimp_button);
			seafood_page.add(SMushroom_button);
			seafood_page.add(Pineapple_button);
			seafood_page.add(SOlive_button);
			seafood_page.add(next_button11);			
			seafood_page.add(seafood_outline);
			seafood_page.add(s_dough);
			seafood_page.add(S_b);	
			seafood_page.add(seafood_cheese);
			seafood_page.add(seafood_sauce);
			

			oven_boolgogi_page.add(Blight);
			oven_boolgogi_page.add(Blight2);
			oven_boolgogi_page.add(Blight3);
			oven_boolgogi_page.add(Blight4);
			oven_boolgogi_page.add(Blight5);
			oven_boolgogi_page.add(boolgogi_oven_button);
			oven_boolgogi_page.add(Barrow);
			oven_boolgogi_page.add(next_button12);
			
			oven_pepperoni_page.add(Plight);
			oven_pepperoni_page.add(Plight2);
			oven_pepperoni_page.add(Plight3);
			oven_pepperoni_page.add(Plight4);
			oven_pepperoni_page.add(Plight5);
			oven_pepperoni_page.add(pepperoni_oven_button);
			oven_pepperoni_page.add(Parrow);
			oven_pepperoni_page.add(next_button13);
			
			oven_seafood_page.add(Slight);
			oven_seafood_page.add(Slight2);
			oven_seafood_page.add(Slight3);
			oven_seafood_page.add(Slight4);
			oven_seafood_page.add(Slight5);
			oven_seafood_page.add(seafood_oven_button);
			oven_seafood_page.add(Sarrow);
			oven_seafood_page.add(next_button14);
			
			boolgogi_complete.add(boolgogi_complete_outline);
			boolgogi_complete.add(boolgogi_complete_topping);
			
			pepperoni_complete.add(pepperoni_complete_outline);
			pepperoni_complete.add(pepperoni_complete_topping);
			
			seafood_complete.add(seafood_complete_outline);
			seafood_complete.add(seafood_complete_topping);
	        this.repaint();
	        
	        
			
		}
	
	
		public void homeframe() {
			setTitle("같이 피자 목쟈");
			setSize(600,800);
			setResizable(false);
			setLocationRelativeTo(null);
			setLayout(null);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setFocusable(true);
		}
		
		
		/*class flour_page_Key extends KeyAdapter
		{
			@Override		
			public void keyPressed(KeyEvent k)
			{
				if(k.getKeyCode()==KeyEvent.VK_SPACE)
				{
					try {
	        			Thread.sleep(200);
	        			System.out.println("씨발련아");
	        			}catch(InterruptedException ex)
	        		{
	        			ex.printStackTrace();
	        		} 
					
				}
			}
			
			
		}*/
		class OnCheese extends JLabel{
	        
		    public int xx, yy;		   
		   
		    Image Topping_cheese = new ImageIcon(Main.class.getResource("../cheese/cheese_topping.png")).getImage();
		   
		    public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(Topping_cheese, xx-40,yy-40, null);
				
		    }   
		}
		
		
		class B_topping extends JLabel{
	        
		    public int xx, yy;		   
		   
		    Image Topping_boolgogi = new ImageIcon(Main.class.getResource("../boolgogi/boolgogi_topping.png")).getImage();
		    Image Topping_corn = new ImageIcon(Main.class.getResource("../boolgogi/corn_topping.png")).getImage();
		    Image Topping_paprika = new ImageIcon(Main.class.getResource("../boolgogi/paprika_topping.png")).getImage();
		    Image Topping_onion = new ImageIcon(Main.class.getResource("../boolgogi/onion_topping.png")).getImage();
		    
		    
		    public void paintComponent(Graphics g) {
				super.paintComponent(g);
				if(B_Boolgogi_choose==true)
				{
					g.drawImage(Topping_boolgogi, xx-40,yy-40, null);
				}
				
				else if(B_Corn_choose==true)
				{
					g.drawImage(Topping_corn, xx-40,yy-40, null);
				}
				
				else if(B_Paprika_choose==true)
				{
					g.drawImage(Topping_paprika, xx-40,yy-40, null);
				}
				
				else if(B_Onion_choose==true)
				{
					g.drawImage(Topping_onion, xx-40,yy-40, null);
				}
				
		        
		    }   
		}
		
		class P_topping extends JLabel{
	        
		    public int xx, yy;		   
		    
		    Image Topping_pepperoni = new ImageIcon(Main.class.getResource("../pepperoni/pepperoni_topping.png")).getImage();
		    Image Topping_mushroom = new ImageIcon(Main.class.getResource("../pepperoni/mushroom_topping.png")).getImage();
		    Image Topping_P_paprika = new ImageIcon(Main.class.getResource("../boolgogi/paprika_topping.png")).getImage();
		    Image Topping_olive = new ImageIcon(Main.class.getResource("../pepperoni/olive_topping.png")).getImage();
		    
		    
		    public void paintComponent(Graphics g) {
				super.paintComponent(g);
				if(P_Pepperoni_choose==true)
				{
					g.drawImage(Topping_pepperoni, xx-40,yy-40, null);
				}
				
				else if(P_Mushroom_choose==true)
				{
					g.drawImage(Topping_mushroom, xx-40,yy-40, null);
				}
				
				else if(P_Paprika_choose==true)
				{
					g.drawImage(Topping_P_paprika, xx-40,yy-40, null);
				}
				
				else if(P_Olive_choose==true)
				{
					g.drawImage(Topping_olive, xx-40,yy-40, null);
				}
				
		        
		    }   
		}
		
		class S_topping extends JLabel{
	        
		    public int xx, yy;		   
		    
		    Image Topping_shrimp = new ImageIcon(Main.class.getResource("../seafood/shrimp_topping.png")).getImage();
		    Image Topping_S_mushroom = new ImageIcon(Main.class.getResource("../pepperoni/mushroom_topping.png")).getImage();
		    Image Topping_pineapple = new ImageIcon(Main.class.getResource("../seafood/pineapple_topping.png")).getImage();
		    Image Topping_S_olive = new ImageIcon(Main.class.getResource("../pepperoni/olive_topping.png")).getImage();
		    
		    
		    public void paintComponent(Graphics g) {
				super.paintComponent(g);
				if(S_Shrimp_choose==true)
				{
					g.drawImage(Topping_shrimp, xx-40,yy-40, null);
				}
				
				else if(S_Mushroom_choose==true)
				{
					g.drawImage(Topping_S_mushroom, xx-40,yy-40, null);
				}
				
				else if(S_Pineapple_choose==true)
				{
					g.drawImage(Topping_pineapple, xx-40,yy-40, null);
				}
				
				else if(S_Olive_choose==true)
				{
					g.drawImage(Topping_S_olive, xx-40,yy-40, null);
				}
				
		        
		    }   
		}
		
		
	
		class Brush extends JLabel{
	        
		    public int xx, yy;
		    public Color col=new Color(255,55,25);
		   
		    
		    public void paint(Graphics g) {     
		    	super.paint(g);
		    	
		    		g.setColor( col );
		    		g.fillOval( xx, yy, 30, 30);
		    	
		        
		        
		    }   
		}
		
		class flour_mouse extends MouseAdapter implements MouseMotionListener{
			  public void mousePressed(MouseEvent e){ // 눌린순간
				  
				  
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();  
			   
				int x = e.getX()-40;
				   int y = e.getY()-40;
				   flour_label.setLocation(x, y); 
				   
				   Timer time=new Timer();
	    			TimerTask task=new TimerTask()
	    			{
	    				public void run()
	    				{
	    					count++;
	    					if(count<4)
	    					{
	    						flour_move.setVisible(true);
	    					}
	    					
	    					else
	    					{
	    						
	    						time.cancel();
	    						flour_move.setVisible(false);
	    						
	    					}
	    				}
	    		};time.schedule(task,400,1000);	
			   
			  
			   
			  }
			  public void mouseDragged(MouseEvent e){ // 드래그일시
			   int x = e.getX()-40;
			   int y = e.getY()-40;
			  
			   
			   flour_label.setLocation(x, y); 
			   
				if(e.getX()<300&&e.getY()<700)
			   {					   
					       
		        		
					
					
					flour_label.setVisible(false);
				   flour_pour.setVisible(true);	
				   next_button1.setVisible(true);
				   
				  
	        		
			   }
			   
			   
			  }
			  
			 
		}
		
		class water_mouse extends MouseAdapter implements MouseMotionListener{
			  public void mousePressed(MouseEvent e){ // 눌린순간
				  
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();  
				
				int x = e.getX()-40;
				int y = e.getY()-40;
				  
				water_label.setLocation(x, y); // 위치 조정	
				
				Timer time=new Timer();
    			TimerTask task=new TimerTask()
    			{
    				public void run()
    				{
    					count2++;
    					if(count2<4)
    					{
    						water_move.setVisible(true);
    					}
    					
    					else
    					{
    						
    						time.cancel();
    						water_move.setVisible(false);
    						
    					}
    				}
    		};time.schedule(task,400,1000);	
				
			   
			  }
			  public void mouseDragged(MouseEvent e){ // 드래그일시
			   int x = e.getX()-40;
			   int y = e.getY()-40;
			   water_label.setLocation(x, y); 
			   
			   if(e.getX()<300&&e.getY()<700)
			   {
				   
				   water_label.setVisible(false);
				   flour_pour2.setVisible(true);
				   next_button2.setVisible(true);
	        		
			   }
			   
			  
			   
			  }
			  
			 
		}
		
		class salt_mouse extends MouseAdapter implements MouseMotionListener{
			  public void mousePressed(MouseEvent e){ // 눌린순간
				  
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();  
			   int x = e.getX()-40;
			   int y = e.getY()-40;
			  
			   salt_label.setLocation(x, y); // 위치 조정		
			   
				Timer time=new Timer();
    			TimerTask task=new TimerTask()
    			{
    				public void run()
    				{
    					count3++;
    					if(count3<4)
    					{
    						salt_move.setVisible(true);
    					}
    					
    					else
    					{
    						
    						time.cancel();
    						salt_move.setVisible(false);
    						
    					}
    				}
    		};time.schedule(task,400,1000);	
			   
			  }
			  public void mouseDragged(MouseEvent e){ // 드래그일시
			   int x = e.getX()-40;
			   int y = e.getY()-40;
			   salt_label.setLocation(x, y); 
			   
			   if(e.getX()<300&&e.getY()<700)
			   {
				   
				   salt_label.setVisible(false);
				   flour_pour3.setVisible(true);
				   next_button3.setVisible(true);
				   
	        		
			   }
			   
			
       		
			   
			  }
			  
			 
		}
		
		class sugar_mouse extends MouseAdapter implements MouseMotionListener{
			  public void mousePressed(MouseEvent e){ // 눌린순간
				  
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();  
			   int x = e.getX()-40;
			   int y = e.getY()-40;
			  
			   sugar_label.setLocation(x, y); // 위치 조정	
			   
				Timer time=new Timer();
    			TimerTask task=new TimerTask()
    			{
    				public void run()
    				{
    					count4++;
    					if(count4<4)
    					{
    						sugar_move.setVisible(true);
    					}
    					
    					else
    					{
    						
    						time.cancel();
    						sugar_move.setVisible(false);
    						
    					}
    				}
    		};time.schedule(task,400,1000);	
			   
			  }
			  public void mouseDragged(MouseEvent e){ // 드래그일시
			   int x = e.getX()-40;
			   int y = e.getY()-40;
			   sugar_label.setLocation(x, y); 
			   
			   if(e.getX()<300&&e.getY()<700)
			   {
				   
				   sugar_label.setVisible(false);
				   flour_pour4.setVisible(true);				   
				   next_button4.setVisible(true);
	        		
			   }
			   
			  
			   
			  }
			  
			 
		}
		
		class oil_mouse extends MouseAdapter implements MouseMotionListener{
			  public void mousePressed(MouseEvent e){ // 눌린순간
				  
				Music clickMusic= new Music("Click.mp3",false);
				clickMusic.start();  
			   int x = e.getX()-40;
			   int y = e.getY()-40;
			  
			   oil_label.setLocation(x, y); // 위치 조정	
			   
				Timer time=new Timer();
    			TimerTask task=new TimerTask()
    			{
    				public void run()
    				{
    					count5++;
    					if(count5<4)
    					{
    						oil_move.setVisible(true);
    					}
    					
    					else
    					{
    						
    						time.cancel();
    						oil_move.setVisible(false);
    						
    					}
    				}
    		};time.schedule(task,400,1000);	
			   
			  }
			  public void mouseDragged(MouseEvent e){ // 드래그일시
			   int x = e.getX()-40;
			   int y = e.getY()-40;
			   oil_label.setLocation(x, y); 
			   
			   if(e.getX()<300&&e.getY()<700)
			   {
				   
				   oil_label.setVisible(false);
				   flour_pour5.setVisible(true);	
				   oil_next_button.setVisible(true);
				   
			   }
			   
			  
			   
			  }
			  
			 
		}
			 
		
		public static void main(String[] args){
			new Game();
			
		}
	}