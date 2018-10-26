//comment one
//comment two
//comment three
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.jpg", 300, 100);
		add(robot);
		GLabel label = new GLabel("abc", 200, 400);
		add(label);
	}
}