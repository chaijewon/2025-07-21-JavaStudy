package com.sist.commons;
import java.awt.*;

import javax.swing.ImageIcon;
public class Commons {
  public static Image getImage(ImageIcon icon,
		  int width,int height)
  {
	  return icon.getImage().getScaledInstance(width, 
			  height, Image.SCALE_SMOOTH);
  }
}
