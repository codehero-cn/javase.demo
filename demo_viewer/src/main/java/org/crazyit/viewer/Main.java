package org.crazyit.viewer;

import javax.swing.JFrame;

/**
 * 图片浏览器入口类
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @author Kelvin Mak kelvin.mak125@gmail.com
 * @version  1.0
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class Main {
	public static void main(String[] args) {
		ViewerFrame f = new ViewerFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}