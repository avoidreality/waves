import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Waves { 

    JFrame jframe = new JFrame("~~~Waves~~~");
	
	public void setupJFrame() { 
		jframe.setSize(1000, 500);
		jframe.setVisible(true);
		jframe.setLayout(new FlowLayout());
		
		WindowListener l = new WindowAdapter() { 
			public void windowClosing(WindowEvent e){
				
				System.exit(0);
			}
		};
		jframe.addWindowListener(l);
	
	}
	
	Waves() {
		setupJFrame();
		ImageIcon icon = new ImageIcon(this.getClass().getClassLoader().getResource("waves2.jpg"));
		JLabel jl = new JLabel("Waves", icon, JLabel.CENTER);
		jframe.getContentPane().add(jl);
		jframe.setVisible(true);
		
		
	}
	
	public static void main(String[] args){
		new Waves();
		
	}


}