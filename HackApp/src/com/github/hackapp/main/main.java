package com.github.hackapp.main;

import java.awt.EventQueue;

import com.github.hackapp.manager.FrameManager;
import com.github.hackapp.swing.MainWindowFrame;

public class main {

	@SuppressWarnings("all")
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindowFrame frame = new MainWindowFrame();
					FrameManager.addFrame("main", frame);
					FrameManager.setInitialFrame("main");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
