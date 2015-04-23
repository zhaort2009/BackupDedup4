/*
 * CreateVolume.java
 *
 * Created on __DATE__, __TIME__
 */

package frame;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.opendedup.sdfs.VolumeConfigWriter;

/**
 *
 * @author  __USER__
 */
public class CreateVolume extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//volume
	static String vol_name = null;
	static String vol_cap;
	static String exp_chunk_size;
	static String vol_type;
	static String RL;
	static String vol_location;
	boolean is_local = true;
	int size_unit_type;//单位代表 0:MB ,1:GB,2:TB.

	/** Creates new form CreateVolume */
	public CreateVolume() {
		this.setTitle("创建卷");
		initComponents();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		//	this.setPreferredSize(new Dimension(d.width*3/7,   d.height/2)); 
		this.setSize(720, 600);
		this.setLocation(d.width / 2 - 720 / 2, d.height / 2 - 600 / 2);
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager
					.getSystemLookAndFeelClassName());
			javax.swing.SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			try {
				javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager
						.getCrossPlatformLookAndFeelClassName());
				javax.swing.SwingUtilities.updateComponentTreeUI(this);
			} catch (Exception e1) {
				// TODO: handle exception
				e1.printStackTrace();
			}
		}
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jFileChooser1 = new javax.swing.JFileChooser();
		jPanel19 = new javax.swing.JPanel();
		jPanel58 = new javax.swing.JPanel();
		jLabel28 = new javax.swing.JLabel();
		jPanel21 = new javax.swing.JPanel();
		jLabel13 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jPanel22 = new javax.swing.JPanel();
		jLabel14 = new javax.swing.JLabel();
		jPanel45 = new javax.swing.JPanel();
		jCheckBox1 = new javax.swing.JCheckBox();
		jCheckBox2 = new javax.swing.JCheckBox();
		jCheckBox3 = new javax.swing.JCheckBox();
		jCheckBox4 = new javax.swing.JCheckBox();
		jCheckBox5 = new javax.swing.JCheckBox();
		jPanel23 = new javax.swing.JPanel();
		jLabel15 = new javax.swing.JLabel();
		jPanel46 = new javax.swing.JPanel();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jPanel24 = new javax.swing.JPanel();
		jLabel17 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jComboBox1 = new javax.swing.JComboBox();
		jPanel25 = new javax.swing.JPanel();
		jLabel18 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jLabel19 = new javax.swing.JLabel();
		jPanel26 = new javax.swing.JPanel();
		jPanel47 = new javax.swing.JPanel();
		jPanel48 = new javax.swing.JPanel();
		jButton13 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jSeparator5 = new javax.swing.JSeparator();
		jPanel1 = new javax.swing.JPanel();
		jLabel16 = new javax.swing.JLabel();
		jTextField8 = new javax.swing.JTextField();
		jLabel20 = new javax.swing.JLabel();
		jButton14 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		jPanel58.setMaximumSize(new java.awt.Dimension(32767, 320));
		jPanel58.setPreferredSize(new java.awt.Dimension(320, 100));

		jLabel28.setFont(new java.awt.Font("宋体", 0, 14));
		jLabel28.setText("\u521b\u5efa\u5377");

		javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(
				jPanel58);
		jPanel58.setLayout(jPanel58Layout);
		jPanel58Layout.setHorizontalGroup(jPanel58Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 896,
				Short.MAX_VALUE).addGroup(
				jPanel58Layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						jPanel58Layout.createSequentialGroup().addGap(0, 0,
								Short.MAX_VALUE).addComponent(jLabel28).addGap(
								0, 0, Short.MAX_VALUE))));
		jPanel58Layout.setVerticalGroup(jPanel58Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 85,
				Short.MAX_VALUE).addGroup(
				jPanel58Layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						jPanel58Layout.createSequentialGroup().addGap(0, 0,
								Short.MAX_VALUE).addComponent(jLabel28).addGap(
								0, 0, Short.MAX_VALUE))));

		jPanel21.setMaximumSize(new java.awt.Dimension(2147483647, 40));
		jPanel21.setPreferredSize(new java.awt.Dimension(100, 40));
		jPanel21.setLayout(new javax.swing.BoxLayout(jPanel21,
				javax.swing.BoxLayout.LINE_AXIS));

		jLabel13.setFont(new java.awt.Font("宋体", 0, 14));
		jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel13.setText("\u5377\u540d");
		jLabel13.setFocusable(false);
		jLabel13.setMaximumSize(new java.awt.Dimension(240, 21));
		jLabel13.setPreferredSize(new java.awt.Dimension(120, 21));
		jPanel21.add(jLabel13);

		jTextField5.setFont(new java.awt.Font("宋体", 0, 14));
		jTextField5.setMaximumSize(new java.awt.Dimension(280, 21));
		jTextField5.setPreferredSize(new java.awt.Dimension(120, 21));
		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});
		jPanel21.add(jTextField5);

		jPanel22.setMaximumSize(new java.awt.Dimension(32764, 400));
		jPanel22.setPreferredSize(new java.awt.Dimension(100, 40));
		jPanel22.setLayout(new javax.swing.BoxLayout(jPanel22,
				javax.swing.BoxLayout.LINE_AXIS));

		jLabel14.setFont(new java.awt.Font("宋体", 0, 14));
		jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel14.setText("\u5377\u7c7b\u578b");
		jLabel14.setMaximumSize(new java.awt.Dimension(240, 21));
		jLabel14.setPreferredSize(new java.awt.Dimension(120, 21));
		jPanel22.add(jLabel14);

		jPanel45.setMaximumSize(new java.awt.Dimension(280, 50));
		jPanel45.setLayout(new javax.swing.BoxLayout(jPanel45,
				javax.swing.BoxLayout.LINE_AXIS));

		jCheckBox1.setText("FSP");
		jCheckBox1.setMaximumSize(new java.awt.Dimension(120, 21));
		jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox1ActionPerformed(evt);
			}
		});
		jPanel45.add(jCheckBox1);

		jCheckBox2.setText("SIS");
		jCheckBox2.setMaximumSize(new java.awt.Dimension(120, 23));
		jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox2ActionPerformed(evt);
			}
		});
		jPanel45.add(jCheckBox2);

		jCheckBox3.setText("SW");
		jCheckBox3.setMaximumSize(new java.awt.Dimension(120, 23));
		jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox3ActionPerformed(evt);
			}
		});
		jPanel45.add(jCheckBox3);

		jCheckBox4.setText("CDC");
		jCheckBox4.setMaximumSize(new java.awt.Dimension(120, 23));
		jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox4ActionPerformed(evt);
			}
		});
		jPanel45.add(jCheckBox4);

		jCheckBox5.setText("SDFS");
		jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox5ActionPerformed(evt);
			}
		});
		jPanel45.add(jCheckBox5);

		jPanel22.add(jPanel45);

		jPanel23.setMaximumSize(new java.awt.Dimension(32674, 400));
		jPanel23.setPreferredSize(new java.awt.Dimension(100, 40));
		jPanel23.setLayout(new javax.swing.BoxLayout(jPanel23,
				javax.swing.BoxLayout.LINE_AXIS));

		jLabel15.setFont(new java.awt.Font("宋体", 0, 14));
		jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel15.setText("\u8fdc\u7a0b/\u672c\u5730");
		jLabel15.setMaximumSize(new java.awt.Dimension(240, 21));
		jLabel15.setPreferredSize(new java.awt.Dimension(120, 21));
		jPanel23.add(jLabel15);

		jPanel46.setMaximumSize(new java.awt.Dimension(280, 50));
		jPanel46.setLayout(new javax.swing.BoxLayout(jPanel46,
				javax.swing.BoxLayout.LINE_AXIS));

		jRadioButton1.setFont(new java.awt.Font("宋体", 0, 14));
		jRadioButton1.setText("Remote Volume");
		jRadioButton1.setMaximumSize(new java.awt.Dimension(240, 23));
		jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton1ActionPerformed(evt);
			}
		});
		jPanel46.add(jRadioButton1);

		jRadioButton2.setFont(new java.awt.Font("宋体", 0, 14));
		jRadioButton2.setText("Local Volume");
		jRadioButton2.setMaximumSize(new java.awt.Dimension(240, 23));
		jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton2ActionPerformed(evt);
			}
		});
		jPanel46.add(jRadioButton2);

		jPanel23.add(jPanel46);

		jPanel24.setMaximumSize(new java.awt.Dimension(2147483647, 400));
		jPanel24.setPreferredSize(new java.awt.Dimension(100, 40));
		jPanel24.setLayout(new javax.swing.BoxLayout(jPanel24,
				javax.swing.BoxLayout.LINE_AXIS));

		jLabel17.setFont(new java.awt.Font("宋体", 0, 14));
		jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel17.setText("\u5377\u5927\u5c0f");
		jLabel17.setMaximumSize(new java.awt.Dimension(240, 21));
		jLabel17.setPreferredSize(new java.awt.Dimension(120, 21));
		jPanel24.add(jLabel17);

		jTextField6.setFont(new java.awt.Font("宋体", 0, 14));
		jTextField6.setMaximumSize(new java.awt.Dimension(200, 21));
		jTextField6.setPreferredSize(new java.awt.Dimension(80, 21));
		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField6ActionPerformed(evt);
			}
		});
		jPanel24.add(jTextField6);

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"MB", "GB", "TB" }));
		jComboBox1.setMaximumSize(new java.awt.Dimension(80, 21));
		jComboBox1.setPreferredSize(new java.awt.Dimension(80, 21));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});
		jPanel24.add(jComboBox1);

		jPanel25.setMaximumSize(new java.awt.Dimension(2147483647, 400));
		jPanel25.setPreferredSize(new java.awt.Dimension(100, 40));
		jPanel25.setLayout(new javax.swing.BoxLayout(jPanel25,
				javax.swing.BoxLayout.LINE_AXIS));

		jLabel18.setFont(new java.awt.Font("宋体", 0, 14));
		jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel18.setText("\u671f\u671b\u5206\u5757\u5927\u5c0f");
		jLabel18.setMaximumSize(new java.awt.Dimension(240, 21));
		jLabel18.setPreferredSize(new java.awt.Dimension(120, 21));
		jPanel25.add(jLabel18);

		jTextField7.setFont(new java.awt.Font("宋体", 0, 14));
		jTextField7.setMaximumSize(new java.awt.Dimension(200, 21));
		jTextField7.setPreferredSize(new java.awt.Dimension(120, 21));
		jTextField7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField7ActionPerformed(evt);
			}
		});
		jPanel25.add(jTextField7);

		jLabel19.setFont(new java.awt.Font("宋体", 0, 14));
		jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel19.setText("\u5355\u4f4d:KB");
		jLabel19.setMaximumSize(new java.awt.Dimension(80, 21));
		jPanel25.add(jLabel19);

		jPanel26.setMaximumSize(new java.awt.Dimension(32764, 120));
		jPanel26.setPreferredSize(new java.awt.Dimension(100, 60));
		jPanel26.setLayout(new javax.swing.BoxLayout(jPanel26,
				javax.swing.BoxLayout.LINE_AXIS));

		jPanel47.setMaximumSize(new java.awt.Dimension(240, 40));

		javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(
				jPanel47);
		jPanel47.setLayout(jPanel47Layout);
		jPanel47Layout.setHorizontalGroup(jPanel47Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 240,
				Short.MAX_VALUE));
		jPanel47Layout.setVerticalGroup(jPanel47Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 40,
				Short.MAX_VALUE));

		jPanel26.add(jPanel47);

		jPanel48.setMaximumSize(new java.awt.Dimension(160, 40));
		jPanel48.setPreferredSize(new java.awt.Dimension(122, 100));

		jButton13.setFont(new java.awt.Font("宋体", 0, 14));
		jButton13.setText("\u53d6\u6d88");
		jButton13.setMaximumSize(new java.awt.Dimension(200, 23));
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton13ActionPerformed(evt);
			}
		});

		jButton12.setFont(new java.awt.Font("宋体", 0, 14));
		jButton12.setText("\u521b\u5efa");
		jButton12.setMaximumSize(new java.awt.Dimension(200, 23));
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
					try {
						jButton12ActionPerformed(evt);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		});

		javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(
				jPanel48);
		jPanel48.setLayout(jPanel48Layout);
		jPanel48Layout
				.setHorizontalGroup(jPanel48Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel48Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jButton12,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton13,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(22, Short.MAX_VALUE)));
		jPanel48Layout
				.setVerticalGroup(jPanel48Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel48Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel48Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton12,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																23,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton13,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																23,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jPanel26.add(jPanel48);

		jSeparator5.setMaximumSize(new java.awt.Dimension(2147483647, 500));
		jSeparator5.setPreferredSize(new java.awt.Dimension(327670, 100));

		jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1,
				javax.swing.BoxLayout.LINE_AXIS));

		jLabel16.setFont(new java.awt.Font("宋体", 0, 14));
		jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel16.setText("\u5377\u4f4d\u7f6e");
		jLabel16.setMaximumSize(new java.awt.Dimension(240, 21));
		jLabel16.setPreferredSize(new java.awt.Dimension(120, 21));
		jPanel1.add(jLabel16);

		jTextField8.setFont(new java.awt.Font("宋体", 0, 14));
		jTextField8.setMaximumSize(new java.awt.Dimension(280, 21));
		jTextField8.setPreferredSize(new java.awt.Dimension(120, 21));
		jTextField8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField8ActionPerformed(evt);
			}
		});
		jPanel1.add(jTextField8);

		jLabel20.setFont(new java.awt.Font("宋体", 0, 14));
		jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel20.setMaximumSize(new java.awt.Dimension(10, 21));
		jLabel20.setPreferredSize(new java.awt.Dimension(10, 21));
		jPanel1.add(jLabel20);

		jButton14.setFont(new java.awt.Font("宋体", 0, 14));
		jButton14.setText("\u9009\u62e9");
		jButton14.setMaximumSize(new java.awt.Dimension(80, 23));
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton14);

		javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(
				jPanel19);
		jPanel19.setLayout(jPanel19Layout);
		jPanel19Layout
				.setHorizontalGroup(jPanel19Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel19Layout
										.createSequentialGroup()
										.addGroup(
												jPanel19Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jPanel1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																896,
																Short.MAX_VALUE)
														.addComponent(
																jSeparator5,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																896,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel19Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																		.addComponent(
																				jPanel58,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				896,
																				Short.MAX_VALUE)
																		.addComponent(
																				jPanel22,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				720,
																				Short.MAX_VALUE)
																		.addComponent(
																				jPanel23,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				720,
																				Short.MAX_VALUE)
																		.addComponent(
																				jPanel21,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				720,
																				Short.MAX_VALUE))
														.addComponent(
																jPanel24,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																896,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel19Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jPanel26,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				886,
																				Short.MAX_VALUE))
														.addComponent(
																jPanel25,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																896,
																Short.MAX_VALUE))
										.addContainerGap()));
		jPanel19Layout
				.setVerticalGroup(jPanel19Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel19Layout
										.createSequentialGroup()
										.addComponent(
												jPanel58,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												85,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel21,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												38,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel22,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel23,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												53,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel24,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												62,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel25,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												62,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												jPanel26,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												63,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												jSeparator5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												142,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 906,
				Short.MAX_VALUE).addGroup(
				layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						layout.createSequentialGroup().addGap(0, 0,
								Short.MAX_VALUE).addComponent(jPanel19,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								0, 0, Short.MAX_VALUE))));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 590,
				Short.MAX_VALUE).addGroup(
				layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						layout.createSequentialGroup().addGap(0, 0,
								Short.MAX_VALUE).addComponent(jPanel19,
								javax.swing.GroupLayout.PREFERRED_SIZE, 590,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								0, 0, Short.MAX_VALUE))));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		File file = null;
		jFileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);//set file selection mode:we only can select directory.
		int returnVal = jFileChooser1.showOpenDialog(new javax.swing.JFrame());
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			file = jFileChooser1.getSelectedFile();
			jTextField8.setText(file.getAbsolutePath());
		}
	}

	private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (jCheckBox5.isSelected()) {
			jCheckBox1.setSelected(false);
			jCheckBox2.setSelected(false);
			jCheckBox3.setSelected(false);
			jCheckBox4.setSelected(false);
			jTextField7.setVisible(true);
			vol_type = "sdfs";
		}
		if (!jTextField6.isVisible()) {
			jTextField6.setVisible(true);
			jTextField7.setVisible(true);
		}
	}

	private void formWindowClosing(java.awt.event.WindowEvent evt) {
		// TODO add your handling code here:
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		// volume capacity
		if (jComboBox1.getSelectedIndex() == 0) {
			vol_cap = jTextField6.getText().trim() + "MB";
		} else if (jComboBox1.getSelectedIndex() == 1) {
			vol_cap = jTextField6.getText().trim() + "GB";
		} else if (jComboBox1.getSelectedIndex() == 2) {
			vol_cap = jTextField6.getText().trim() + "TB";
		}
	}

	private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (jTextField7.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "请输入卷分块大小！");
		} else {
			exp_chunk_size = jTextField7.getText().trim();
		}
	}

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (jTextField5.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "请输入卷名！");
		} else {
			vol_name = jTextField5.getText().trim();
		}
	}

	private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (jRadioButton2.isSelected()) {
			jRadioButton1.setSelected(false);

			this.is_local = true;
		}
	}

	private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (jRadioButton1.isSelected()) {
			jRadioButton2.setSelected(false);

			this.is_local = false;
		}
	}

	private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (jCheckBox4.isSelected()) {
			jTextField6.setVisible(true);
			jTextField7.setVisible(true);
			jCheckBox1.setSelected(false);
			jCheckBox2.setSelected(false);
			jCheckBox3.setSelected(false);
			jCheckBox5.setSelected(false);
			this.vol_type = "cdc";
		}
	}

	private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (!jTextField6.isVisible()) {
			jTextField6.setVisible(true);

		}
		if (jCheckBox3.isSelected()) {
			jTextField7.setVisible(true);
			jCheckBox1.setSelected(false);
			jCheckBox2.setSelected(false);
			jCheckBox4.setSelected(false);
			jCheckBox5.setSelected(false);
			vol_type = "sw";
		}
	}

	private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (jCheckBox2.isSelected()) {
			jTextField6.setVisible(true);
			jTextField7.setVisible(false);
			jCheckBox1.setSelected(false);
			jCheckBox3.setSelected(false);
			jCheckBox4.setSelected(false);
			jCheckBox5.setSelected(false);
			vol_type = "sis";
		}
	}

	private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (jCheckBox1.isSelected()) {
			jCheckBox2.setSelected(false);
			jCheckBox3.setSelected(false);
			jCheckBox4.setSelected(false);
			jCheckBox5.setSelected(false);
			jTextField7.setVisible(true);
			vol_type = "fsp";
		}
		if (!jTextField6.isVisible()) {
			jTextField6.setVisible(true);
			jTextField7.setVisible(true);
		}

	}

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt)
			throws IOException {
		// TODO add your handling code here:
		// TODO add your handling code here:
		if (jComboBox1.getSelectedIndex() == 0) {
			vol_cap = jTextField6.getText().trim() + "MB";
		} else if (jComboBox1.getSelectedIndex() == 1) {
			vol_cap = jTextField6.getText().trim() + "GB";
		} else if (jComboBox1.getSelectedIndex() == 2) {
			vol_cap = jTextField6.getText().trim() + "TB";
		}
		VolumeConfigWriter wr = new VolumeConfigWriter();
		vol_name = jTextField5.getText().trim();
		vol_location = jTextField8.getText().trim();
		if(wr.checkExistenceofVolume(vol_name)){
			JOptionPane.showMessageDialog(null,"The "+vol_name+" exists in backupdedup system!\nPlease change another one.");
		}else{
			if (jCheckBox1.isSelected() || jCheckBox3.isSelected()
					|| jCheckBox4.isSelected() || jCheckBox5.isSelected()) {
				exp_chunk_size = jTextField7.getText().trim();
				wr.writeVolumeConfigToFile(vol_name, vol_location, vol_cap, exp_chunk_size,
						vol_type, this.is_local);
			} else
				wr.writeVolumeConfigToFile(vol_name, vol_location, vol_cap, "4", vol_type,
						this.is_local);
			jTextField5.setText(null);
			jTextField6.setText(null);
			jTextField7.setText(null);
			jTextField8.setText(null);

			jCheckBox1.setSelected(false);
			jCheckBox2.setSelected(false);
			jCheckBox3.setSelected(false);
			jCheckBox4.setSelected(false);
			jRadioButton1.setSelected(false);
			jRadioButton2.setSelected(false);
			MainFrame.initvolumeinfo();
		}	
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jTextField5.setText(null);
		jCheckBox1.setSelected(false);
		jCheckBox2.setSelected(false);
		jCheckBox3.setSelected(false);
		jCheckBox4.setSelected(false);
		jRadioButton1.setSelected(false);
		jRadioButton2.setSelected(false);
		jTextField6.setText(null);
		jTextField7.setText(null);
	}

	public String[] getvolume() {
		if (is_local)
			RL = "local";
		else
			RL = "remote";
		return new String[] { vol_name, vol_cap, exp_chunk_size, vol_type, RL };
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CreateVolume().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JCheckBox jCheckBox2;
	private javax.swing.JCheckBox jCheckBox3;
	private javax.swing.JCheckBox jCheckBox4;
	private javax.swing.JCheckBox jCheckBox5;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JFileChooser jFileChooser1;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel19;
	private javax.swing.JPanel jPanel21;
	private javax.swing.JPanel jPanel22;
	private javax.swing.JPanel jPanel23;
	private javax.swing.JPanel jPanel24;
	private javax.swing.JPanel jPanel25;
	private javax.swing.JPanel jPanel26;
	private javax.swing.JPanel jPanel45;
	private javax.swing.JPanel jPanel46;
	private javax.swing.JPanel jPanel47;
	private javax.swing.JPanel jPanel48;
	private javax.swing.JPanel jPanel58;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JSeparator jSeparator5;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	// End of variables declaration//GEN-END:variables

}