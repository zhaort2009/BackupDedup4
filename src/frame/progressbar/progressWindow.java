/*
 * Window.java
 *
 * Created on __DATE__, __TIME__
 */

package frame.progressbar;

import java.util.concurrent.locks.ReentrantLock;

import javax.swing.UIManager;

/**
 *
 * @author  __USER__
 */
public class progressWindow extends javax.swing.JFrame {
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
//		java.awt.EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				new progressWindow().setVisible(true);
//			}
//		});
		progressWindow pw = new progressWindow();
		pw.setMax(1024);
		pw.setProgress(0);
		pw.setVisible(true);
		for(int i=0;i<1024*1024*60;i++){
			pw.setCurrentFile("file: "+ i);
			pw.setProgress(pw.getProgress()+ (i<<10));
		}
		pw.dispose();
	}

	{
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Creates new form Window */
	public progressWindow() {
		initComponents();
		
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jProgressBar1 = new javax.swing.JProgressBar();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		setTitle("Backup in progress...");
		setMinimumSize(new java.awt.Dimension(400, 70));
		setResizable(false);
		getContentPane().setLayout(
				new org.netbeans.lib.awtextra.AbsoluteLayout());

		jProgressBar1.setPreferredSize(new java.awt.Dimension(300, 20));
		getContentPane().add(
				jProgressBar1,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490,
						20));

		jLabel1.setText(null);
		getContentPane().add(
				jLabel1,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 490,
						20));
		jLabel1.getAccessibleContext().setAccessibleName("");

		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize();
		setBounds((screenSize.width - 516) / 2, (screenSize.height - 88) / 2,
				516, 88);
	}// </editor-fold>
	//GEN-END:initComponents

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JProgressBar jProgressBar1;

	// End of variables declaration//GEN-END:variables

	public void setCurrentFile(String value) {
		jLabel1.setText(value);
	}

	public void setProgress(int value) {
		if (value <= jProgressBar1.getMaximum()) {
			jProgressBar1.setValue(value);
		}
	}
    ReentrantLock progressbarlock = new ReentrantLock();
	public int getProgress() {
		return jProgressBar1.getValue();
	}

	public void setMax(int value) {
		jProgressBar1.setMaximum(value);
	}
}