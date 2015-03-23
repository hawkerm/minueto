package org.minueto.sample.image;
/**
 * @(#)ArcDemo.java        1.00 12/11/2013
 *
 * Minueto - The Game Development Framework 
 * Copyright (c) 2004-2013 McGill University
 * 3480 University Street, Montreal, Quebec H3A 2A7
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 **/
 
import org.minueto.MinuetoColor;
import org.minueto.image.MinuetoCircle;
import org.minueto.image.MinuetoFont;
import org.minueto.image.MinuetoImage;
import org.minueto.image.MinuetoText;
import org.minueto.window.MinuetoFrame;
import org.minueto.window.MinuetoWindow;

/**
 * Sample that draws a growing Arc.
 *
 * @since 2.1
 **/
public class ArcDemo {	
	
	public ArcDemo() {
		 
		MinuetoWindow window;			// The Minueto window
		MinuetoImage circle;
		MinuetoImage circle2;
		 		
		int r = 0;						// Rotation angle + size
	
		// Create a 640 by 480 window
		window = new MinuetoFrame(640, 480, true);
				
		// Show the game window.
		window.setVisible(true);
		
		circle = new MinuetoCircle(52, MinuetoColor.BLUE, true);
		circle2 = new MinuetoCircle(108, 108, MinuetoColor.GREEN, true);
		
		// Game/rendering loop
		while(true) {
		
			// Clear the window.
			window.clear();
		
			// Change the rotation angle. Our demo does a demonstration
			// of rotation by changing the rotation angle at each frame.			
			r++;
			if (r > 360) { r = 0; }
		
			window.draw(circle2, 50, 50); // Remember the drawing coordinate is the top-left
			window.draw(circle, 52, 52);			
			
			// Draw the transformed image.
			// Note: Normally it's better to create a single image and reuse it
			// we're going to be changing parameters all the time though
			window.draw(new MinuetoText("S: " + r + " Ang: " + r, MinuetoFont.DefaultFont, MinuetoColor.RED), 54, 34);
			window.draw(new MinuetoCircle(50, MinuetoColor.RED, true, r, r), 54, 54);
			
			window.draw(new MinuetoText("S: 0 Ang: " + r, MinuetoFont.DefaultFont, MinuetoColor.GREEN), 164, 34);
			window.draw(new MinuetoCircle(50, MinuetoColor.GREEN, true, 0, r), 164, 54);

			window.draw(new MinuetoText("S: -" + r + " Ang: 135", MinuetoFont.DefaultFont, MinuetoColor.GREEN), 164, 284);
			window.draw(new MinuetoCircle(50, MinuetoColor.GREEN, true, -r, 135), 164, 164);
			
			window.draw(new MinuetoText("S: " + r + " Ang: 90", MinuetoFont.DefaultFont, MinuetoColor.BLUE), 274, 34);
			window.draw(new MinuetoCircle(50, MinuetoColor.BLUE, true, r, 90), 274, 54);
			
			window.draw(new MinuetoText("S: " + r + " Ang: -135", MinuetoFont.DefaultFont, MinuetoColor.BLUE), 274, 284);
			window.draw(new MinuetoCircle(50, MinuetoColor.BLUE, true, r, -135), 274, 164);
			
			// Render all graphics in the back buffer.
			window.render();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}		
							
	}
	
	/**
	 * We need this to make our demo runnable from the command line.
	 **/
	public static void main(String[] args) {
	
		@SuppressWarnings("unused")
		ArcDemo arcExample = new ArcDemo();
	}
	
}
