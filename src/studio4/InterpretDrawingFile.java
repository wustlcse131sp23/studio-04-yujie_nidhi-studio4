package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		
//		rectangle 255 109 182 true 0.5 0.5 0.2 0.2
		String shape=in.next();
		int r=in.nextInt();
		int g=in.nextInt();
		int b=in.nextInt();
		boolean filled=in.nextBoolean();
		double x=in.nextDouble();
		double y=in.nextDouble();
		double halfW=in.nextDouble();
		double halfH=in.nextDouble();
		StdDraw.setPenColor(r, g, b);
		StdDraw.setPenRadius(0.1);
		if (shape.equals("rectangle") ) {
			if (filled==true) {
				StdDraw.filledRectangle(x, y, halfW, halfH);
			}else {
				StdDraw.rectangle(x, y, halfW, halfH);
			}
		}
		if (shape.equals("ellipse")){
			if (filled==true) {
				StdDraw.filledEllipse(x, y, halfW, halfH);
			}else {
				StdDraw.ellipse(x, y, halfW, halfH);
			}
		}
		
//		StdDraw.ellipse(x, y, halfW, halfH);
//		System.out.print(r);
		

		
	}
}
