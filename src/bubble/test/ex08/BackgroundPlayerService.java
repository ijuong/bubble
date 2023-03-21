 package bubble.test.ex08;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

//background에서 계속 관찰
public class BackgroundPlayerService implements Runnable {

	private BufferedImage image;
	private Player player;
	
	
	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("image/backgroundMapService.png"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public void run() {
		// 색상확인
		while(true) {
			Color leftColor = new Color(image.getRGB(player.getX() - 10, player.getY() + 25));
			Color rightColor = new Color(image.getRGB(player.getX() + 50 + 15, player.getY() + 25));
			int bottomColor = image.getRGB(player.getX() + 10, player.getY() + 50 - 5)
							+ image.getRGB(player.getX() + 50 - 10, player.getY() + 50 - 5);
			//System.out.println("leftColor 색상: " + leftColor);
			//System.out.println("rightColor 색상: " + rightColor);
			
			//바닥충돌 확인
			if(bottomColor != -2) {
				//System.out.println("bottom color : " + bottomColor);
				//System.out.println("바닥에 충돌함");
				player.setDown(false);
			}
			
			//외벽충돌 확인 
			if(leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				//System.out.println("왼쪽 벽에 충돌함");
				player.setLeftWallCrash(true);
				player.setLeft(false);
			}else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				//System.out.println("오른쪽 벽에 충돌함");
				player.setRightWallCrash(true);
				player.setRight(false);
			}else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);				
			}
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
