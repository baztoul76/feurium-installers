package fr.launcherInstaller;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

public class InstallerWindow extends JFrame{
  JPanel pan = new JPanel();
  public InstallerWindow(String title, int size1, int size2) {
    this.setTitle(title);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(size1, size2);
    this.setLocationRelativeTo(null);
    pan.setBackground(Color.CYAN);
    
    this.setVisible(true);
  }
}
