package bubble.test.ex02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {
	
	private JLabel backgroundMap;
	private Player player;
	
	public BubbleFrame() {
		initObject();
		initSetting();
		setVisible(true);
	}
	
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap);
		//backgroundMap.setSize(100, 100);
		//backgroundMap.setLocation(300, 300);
		//add(backgroundMap); //JFrame에 Label을 그린다
		
		player = new Player();
		add(player);
		
	}
	
	private void initSetting() {		
		setSize(1000, 640);
		setLayout(null); //absolute layout (자유롭게 그리기)
		setLocationRelativeTo(null); //JFrame을 가운데에 위치 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼으로 JVM 같이 종료
	}
	
	public static void main(String[] args) {
		new BubbleFrame();
	}
}
;;
