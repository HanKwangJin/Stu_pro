package MYProJect;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class ExProject {

	private JFrame frame = new JFrame();
	private JTextField nameField;
	private JTextField kgField;
	private JTextField kyField;
	private String name;
	private String kg;
	private String ky;
	private String nanido;
	private String time;
	private String persent1;
	private String persent2;
	private double goodkg;
	private ButtonGroup group = new ButtonGroup();
	JRadioButton[] bodys = new JRadioButton[3];
	JButton button1;
	JButton button2;
	JButton button3;

	ImageIcon tohard = new ImageIcon("images/hard.png");
	Image tohard1 = tohard.getImage();
	Image tohard2 = tohard1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
	ImageIcon tohard3 = new ImageIcon(tohard2);

	ImageIcon sohard = new ImageIcon("images/har.png");
	Image sohard1 = sohard.getImage();
	Image sohard2 = sohard1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
	ImageIcon sohard3 = new ImageIcon(sohard2);

	ImageIcon nomal = new ImageIcon("images/nomall.png");
	Image nomal1 = nomal.getImage();
	Image nomal2 = nomal1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
	ImageIcon nomal3 = new ImageIcon(nomal2);

	ImageIcon cheseimage = new ImageIcon("images/chest1.png");
	Image cheseimage1 = cheseimage.getImage();
	Image cheseimage2 = cheseimage1.getScaledInstance(849, 520, java.awt.Image.SCALE_SMOOTH);
	ImageIcon cheseimage3 = new ImageIcon(cheseimage2);
	ImagePanel chestimage = new ImagePanel(cheseimage3.getImage());

	ImageIcon lowerimage1 = new ImageIcon("images/lower1.jpg");
	Image lowerimage2 = lowerimage1.getImage();
	Image lowerimage3 = lowerimage2.getScaledInstance(849, 520, java.awt.Image.SCALE_SMOOTH);
	ImageIcon lowerimage4 = new ImageIcon(lowerimage3);
	ImagePanel lowerimage = new ImagePanel(lowerimage4.getImage());

	ImageIcon backimage1 = new ImageIcon("images/back1.jpg");
	Image backimage2 = backimage1.getImage();
	Image backimage3 = backimage2.getScaledInstance(849, 520, java.awt.Image.SCALE_SMOOTH);
	ImageIcon backimage4 = new ImageIcon(backimage3);
	ImagePanel backimage = new ImagePanel(backimage4.getImage());
//	

	private JPanel panel1;
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	private JPanel panel5 = new JPanel();
	private JPanel panel6 = new JPanel();
	private JPanel panel7 = new JPanel();
	ImagePanel image1 = new ImagePanel(new ImageIcon("C:/JavaSF/workspace/JavaSF/images/Projectdck.jpg").getImage());
	ImagePanel image = new ImagePanel(new ImageIcon("C:/JavaSF/workspace/JavaSF/images/Pro.jpg").getImage());
	Font font = new Font("맑은 고딕", 0, 30);

	public ExProject() {
		frame.setTitle("철든남자");
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setSize(image.getWidth(), image.getHeight());

		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.add(image);
		panel1.setSize(image.getWidth(), image.getHeight());

//		panel1.setBounds(282, 151, 849, 520);
		panel1.setBackground(Color.black);

		panel2.setVisible(false);
		panel3.setVisible(false);

		nameField = new JTextField();
		nameField.setBounds(533, 215, 284, 54);
		nameField.setOpaque(true);
		nameField.setBackground(Color.darkGray);
		nameField.setForeground(Color.white);
		nameField.setFont(font);
		image.add(nameField);
		nameField.setColumns(10);
		nameField.setFocusable(true);

		kgField = new JTextField();
		kgField.setBounds(533, 280, 284, 54);
		kgField.setOpaque(true);
		kgField.setBackground(Color.darkGray);
		kgField.setForeground(Color.white);
		kgField.setFont(font);
		image.add(kgField);
		kgField.setColumns(10);
		kgField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				kg = kgField.getText();
			}
		});

		kyField = new JTextField();
		kyField.setBounds(533, 345, 284, 54);
		kyField.setOpaque(true);
		kyField.setBackground(Color.darkGray);
		kyField.setForeground(Color.white);
		kyField.setFont(font);
		image.add(kyField);
		kyField.setColumns(10);
		kyField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ky = kyField.getText();
			}
		});

		ImageIcon thinbody = new ImageIcon("images/thin.jpg");
		Image thinbody1 = thinbody.getImage();
		Image thinbody2 = thinbody1.getScaledInstance(140, 160, java.awt.Image.SCALE_SMOOTH);
		ImageIcon thinbody3 = new ImageIcon(thinbody2);

		ImageIcon nomalbody = new ImageIcon("images/nomal.jpg");
		Image nomalbody1 = nomalbody.getImage();
		Image nomalbody2 = nomalbody1.getScaledInstance(140, 160, java.awt.Image.SCALE_SMOOTH);
		ImageIcon nomalbody3 = new ImageIcon(nomalbody2);

		ImageIcon bodyy = new ImageIcon("images/body.jpg");
		Image body1 = bodyy.getImage();
		Image body2 = body1.getScaledInstance(140, 160, java.awt.Image.SCALE_SMOOTH);
		ImageIcon body3 = new ImageIcon(body2);

		ImageIcon hard0 = new ImageIcon("images/hard.png");
		Image hard1 = hard0.getImage();
		Image hard2 = hard1.getScaledInstance(140, 160, java.awt.Image.SCALE_SMOOTH);
		ImageIcon hard3 = new ImageIcon(hard2);

		ImageIcon har0 = new ImageIcon("images/har.png");
		Image har1 = har0.getImage();
		Image har2 = har1.getScaledInstance(140, 160, java.awt.Image.SCALE_SMOOTH);
		ImageIcon har3 = new ImageIcon(har2);

		ImageIcon nomall0 = new ImageIcon("images/nomall.png");
		Image nomall1 = nomall0.getImage();
		Image nomall2 = nomall1.getScaledInstance(140, 160, java.awt.Image.SCALE_SMOOTH);
		ImageIcon nomall3 = new ImageIcon(nomall2);

		ImageIcon[] icons = { thinbody3, nomalbody3, body3 };

		for (int i = 0; i < 3; i++) {
			bodys[i] = new JRadioButton(icons[i]);
			group.add(bodys[i]);
			bodys[i].setBorderPainted(true);
			image.add(bodys[i]);
			bodys[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					if (bodys[0].isSelected()) {
						nanido = "중급";
						time = "1시간";
						persent1 = "50";
						persent2 = "50";
					} else if (bodys[1].isSelected()) {
						nanido = "상급";
						time = "2시간";
						persent1 = "40";
						persent2 = "60";
					} else if (bodys[2].isSelected()) {
						nanido = "최상급";
						time = "3시간 이상";
						persent1 = "30";
						persent2 = "70";
					}
				}
			});
		}

		bodys[0].setBounds(389, 438, 146, 119);

		bodys[1].setBounds(589, 438, 146, 119);

		bodys[2].setBounds(789, 438, 146, 119);

		bodys[0].setBorderPainted(true);
		bodys[0].setSelectedIcon(nomall3);

		bodys[1].setBorderPainted(true);
		bodys[1].setSelectedIcon(har3);

		bodys[2].setBorderPainted(true);
		bodys[2].setSelectedIcon(hard3);

		// 버튼
		JButton inButton = new JButton("정보 입력");
		inButton.setBounds(495, 590, 146, 39);
		inButton.setBackground(Color.black);
		inButton.setForeground(Color.white);
		image.add(inButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (nameField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력하세요", "근손실 경보", JOptionPane.ERROR_MESSAGE);
				} else if (kgField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "몸무게를 입력하세요", "근손실 경보", JOptionPane.ERROR_MESSAGE);
				} else if (kyField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "신장을 입력하세요", "근손실 경보", JOptionPane.ERROR_MESSAGE);
				} else {
					name = nameField.getText();
					kg = kgField.getText();
					ky = kyField.getText();

					panel1.setVisible(false);
					panel2.setVisible(true);
					second(name, kg, ky);
				}

			}
		});

		JButton exitButton = new JButton("나가기");
		exitButton.setBounds(694, 590, 146, 39);
		exitButton.setBackground(Color.black);
		exitButton.setForeground(Color.white);
		image.add(exitButton);

		exitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				exitButton.setVisible(false);
				JOptionPane.showMessageDialog(null, "어딜가 운동해야지 ^^", "근손실 경보", JOptionPane.ERROR_MESSAGE);
			}
		});
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel1);
	}

//		panel2.setBounds(282, 151, 849, 520);
//		panel2.setLayout(null);
//		panel2.setBackground(Color.black);

//		panel4.setBounds(282, 151, 849, 520);
//		panel4.setLayout(null);
//		panel4.setBackground(Color.black);

//		panel5.setBounds(282, 151, 849, 520);
//		panel5.setLayout(null);
//		panel5.setBackground(Color.black);

//		panel6.setBounds(282, 151, 849, 520);
//		panel6.setLayout(null);
//		panel6.setBackground(Color.black);

//		panel7.setBounds(282, 151, 849, 520);
//		panel7.setLayout(null);
//		panel7.setBackground(Color.black);

	// 두 번째 프레임
	void second(String name, String kg, String ky) {
		frame.getContentPane().add(panel2);
		panel2.add(image1);
		panel2.setSize(image1.getWidth(), image1.getHeight());
		panel3.setBounds(282, 151, 849, 520);
		panel3.setLayout(new GridLayout(5, 1));
		panel3.setOpaque(true);
		panel3.setBackground(Color.black);
		image1.add(panel3);
		panel3.setVisible(true);

		Font font1 = new Font("휴먼 엑스포", 0, 30);

		// 원본
		JLabel label1 = new JLabel(name + "님의 키는 " + ky + "이고," + "몸무게는 " + kg + "입니다.");
		label1.setFont(font1);
		label1.setForeground(Color.WHITE);
		panel3.add(label1);

		String str1;
		double num = Integer.parseInt(ky);
		int num1 = Integer.parseInt(kg);
		goodkg = (num * 0.01) * (num * 0.01) * 22;
		int num2 = (int) goodkg;
		int num3 = num1 - num2;
		int num4 = num2 - num1;
		int num5;
		if (num2 < num1) {
			str1 = "감량";
			num5 = num3;
		} else {
			str1 = "증량";
			num5 = num4;
		}
		JLabel label2 = new JLabel("적정 몸무게는 약 " + num2 + "kg이고, " + str1 + "해야될 무게는 " + num5 + "kg입니다.");
		label2.setFont(font1);
		label2.setForeground(Color.WHITE);
		panel3.add(label2);

		//
		JLabel label3 = new JLabel("원하시는 몸의 난이도는 " + nanido + "입니다.");
		label3.setFont(font1);
		label3.setForeground(Color.WHITE);
		panel3.add(label3);

		JLabel label4 = new JLabel("추천 운동시간은 " + time + " 이며,");
		label4.setFont(font1);
		label4.setForeground(Color.WHITE);
		panel3.add(label4);

		JLabel label5 = new JLabel("유산소 웨이트 비율은 " + "유산소 :" + persent1 + "% 웨이트 " + persent2 + "% 입니다.");
		label5.setFont(font1);
		label5.setForeground(Color.WHITE);
		label5.setBackground(Color.BLACK);
		panel3.add(label5);

//		JTextArea area= new JTextArea();
//		area.append(nameField.getText());
//		area.append(kg);
//		area.append(kyField.getText());
//		area.setForeground(Color.white);
//		area.setBackground(Color.black);
//		area.setEditable(false);
//		panel3.add(area);

		JButton chest = new JButton("가슴");
		chest.setBounds(45, 120, 160, 40);
		chest.setForeground(Color.white);
		chest.setBackground(Color.black);
		chest.setFont(font1);
		image1.add(chest);

		JButton back = new JButton("등");
		back.setBounds(45, 190, 160, 40);
		back.setForeground(Color.white);
		back.setBackground(Color.black);
		back.setFont(font1);
		image1.add(back);

		JButton lower = new JButton("하체");
		lower.setBounds(45, 260, 160, 40);
		lower.setForeground(Color.white);
		lower.setBackground(Color.black);
		lower.setFont(font1);
		image1.add(lower);

		JButton run = new JButton("유산소");
		run.setBounds(45, 330, 160, 40);
		run.setForeground(Color.white);
		run.setBackground(Color.black);
		run.setFont(font1);
		image1.add(run);

		JButton returnButton = new JButton("되돌아가기");
		returnButton.setBounds(45, 400, 160, 40);
		returnButton.setFont(new Font("휴먼 엑스포", 0, 20));
		returnButton.setForeground(Color.white);
		returnButton.setBackground(Color.black);
		image1.add(returnButton);
		returnButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				panel1.setVisible(true);
				panel3.removeAll();
				panel3.setVisible(true);
			}
		});
		chest.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel4Ex();
			}
		});
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel5Ex();

			}
		});
		lower.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel6Ex();
			}
		});
		run.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel7Ex();
			}
		});

	}

	public static void main(String[] args) {
		new ProjectEx();
	}

	void panel4Ex() {
		panel4.setVisible(true);
		panel3.setVisible(false);
		panel5.setVisible(false);
		panel6.setVisible(false);
		panel7.setVisible(false);

		panel4.setLayout(new BorderLayout());
		panel4.setBounds(282, 151, 849, 520);
		panel4.setOpaque(true);
//		panel4.setBackground(Color.black);
		panel4.setBackground(Color.green);
		image1.add(panel4);

		JPanel panel4_1 = new JPanel();
		panel4_1.setLayout(new FlowLayout());
		panel4_1.setOpaque(true);
//		panel4_1.setBackground(Color.black);
		panel4_1.setBackground(Color.yellow);

		JPanel panel4_2 = new JPanel();
		panel4_2.setOpaque(true);
//		panel4_2.setBackground(Color.black);
		panel4_2.setBackground(Color.magenta);
		panel4_2.add(chestimage);

		JButton nomalbutton = new JButton(nomal3);
		nomalbutton.setBackground(Color.WHITE);
		panel4_1.add(nomalbutton);

		JButton hardButton = new JButton(tohard3);
		hardButton.setBackground(Color.GREEN);
		panel4_1.add(hardButton);

		JButton sohardButton = new JButton(sohard3);
		sohardButton.setBackground(Color.RED);
		panel4_1.add(sohardButton);

		nomalbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		hardButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		sohardButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		panel4.add(panel4_1, BorderLayout.NORTH);
		panel4.add(panel4_2, BorderLayout.CENTER);

	}

	void panel5Ex() {
		panel5.setVisible(true);
		panel3.setVisible(false);
		panel4.setVisible(false);
		panel6.setVisible(false);
		panel7.setVisible(false);

		JPanel panel5_1 = new JPanel();
		panel5_1.setLayout(new FlowLayout());
		panel5_1.setOpaque(true);
		panel5_1.setBackground(Color.black);

		JPanel panel5_2 = new JPanel();
		panel5_2.setOpaque(true);
		panel5_2.setBackground(Color.black);
		panel5_2.add(backimage);

		image1.add(panel5);

		panel5.setLayout(new BorderLayout());
		panel5.setBounds(282, 151, 849, 520);
		panel5.setOpaque(true);
		panel5.setBackground(Color.black);

		JButton nomalbutton = new JButton(nomal3);
		nomalbutton.setBackground(Color.WHITE);
		panel5_1.add(nomalbutton);

		JButton hardButton = new JButton(tohard3);
		hardButton.setBackground(Color.GREEN);
		panel5_1.add(hardButton);

		JButton sohardButton = new JButton(sohard3);
		sohardButton.setBackground(Color.RED);
		panel5_1.add(sohardButton);

		nomalbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		hardButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		sohardButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		panel5.add(panel5_1, BorderLayout.NORTH);
		panel5.add(panel5_2, BorderLayout.CENTER);

	}

	void panel6Ex() {
		panel6.setVisible(true);
		panel3.setVisible(false);
		panel4.setVisible(false);
		panel5.setVisible(false);
		panel7.setVisible(false);

		JPanel panel6_1 = new JPanel();
		panel6_1.setLayout(new FlowLayout());
		panel6_1.setOpaque(true);
		panel6_1.setBackground(Color.black);

		JPanel panel6_2 = new JPanel();
		panel6_2.setOpaque(true);
		panel6_2.setBackground(Color.black);
		panel6_2.add(lowerimage);
		image1.add(panel6);

		panel6.setLayout(new BorderLayout());
		panel6.setBounds(282, 151, 849, 520);
		panel6.setOpaque(true);
		panel6.setBackground(Color.black);

		JButton nomalbutton = new JButton(nomal3);
		nomalbutton.setBackground(Color.WHITE);
		panel6_1.add(nomalbutton);

		JButton hardButton = new JButton(tohard3);
		hardButton.setBackground(Color.GREEN);
		panel6_1.add(hardButton);

		JButton sohardButton = new JButton(sohard3);
		sohardButton.setBackground(Color.RED);
		panel6_1.add(sohardButton);

		nomalbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		hardButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		sohardButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		panel6.add(panel6_1, BorderLayout.NORTH);
		panel6.add(panel6_2, BorderLayout.CENTER);

	}

	void panel7Ex() {
		panel7.setVisible(true);
		panel3.setVisible(false);
		panel4.setVisible(false);
		panel5.setVisible(false);
		panel6.setVisible(false);

		panel7.setLayout(new BorderLayout());
		panel7.setBounds(282, 151, 849, 520);
		panel7.setOpaque(true);
		panel7.setBackground(Color.black);

		JPanel panel7_1 = new JPanel();
		panel7_1.setLayout(new FlowLayout());
		panel7_1.setOpaque(true);
		panel7_1.setBackground(Color.black);

		JPanel panel7_2 = new JPanel();
		panel7_1.setLayout(new GridBagLayout());
		panel7_1.setOpaque(true);
		panel7_1.setBackground(Color.black);

		image1.add(panel7);

		JButton nomalbutton = new JButton(nomal3);
		nomalbutton.setBackground(Color.WHITE);
		panel7_1.add(nomalbutton);

		JButton hardButton = new JButton(tohard3);
		hardButton.setBackground(Color.GREEN);
		panel7_1.add(hardButton);

		JButton sohardButton = new JButton(sohard3);
		sohardButton.setBackground(Color.RED);
		panel7_1.add(sohardButton);

		nomalbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		hardButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		sohardButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		panel7.add(panel7_1, BorderLayout.NORTH);
		panel7.add(panel7_2, BorderLayout.CENTER);

	}

	class ImagePanel extends JPanel {

		private Image image;

		public ImagePanel(Image image) {
			this.image = image;
			setSize(new Dimension(image.getWidth(null), image.getHeight(null)));
			setPreferredSize(new Dimension(image.getWidth(null), image.getHeight(null)));
			setLayout(null);
		}

		public int getWidth() {
			return image.getWidth(null);
		}

		public int getHeight() {
			return image.getHeight(null);
		}

		public void paintComponent(Graphics g) {
			g.drawImage(image, 0, 0, null);
		}
	}
}
