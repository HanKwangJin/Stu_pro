package MYProJect;

import java.awt.*;

import javax.swing.*;

public class MyProjectWritePage extends JFrame{
	public JLabel titleLabel=new JLabel("��ٴ���");
	public JLabel nameLabel =new JLabel("�̸�");
	public JTextField nameText=new JTextField(10);
	public JLabel keyLabel =new JLabel("Ű");
	public JTextField keyText=new JTextField(10);
	public JLabel kgLabel =new JLabel("������");
	public JTextField kgText=new JTextField(10);
	public JButton exitButton = new JButton("������");
	public JButton inButton = new JButton("�����Է�");
	public JFrame background = new JFrame();
	JPanel j1=new JPanel();
	JPanel j2=new JPanel();
	JPanel j3=new JPanel();
	Container c=getContentPane();
	ButtonGroup group= new ButtonGroup();
	JRadioButton thinBody =new JRadioButton("����źź��");
	JRadioButton nomalBody =new JRadioButton("�����");
	JRadioButton bodybuilder =new JRadioButton("�������");
	
	
	public MyProjectWritePage() {
//		c.setLayout();
		setTitle("���� �Է�â!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new BorderLayout());
		j2.setLayout(null);
		j1.setBackground(Color.black);
		j2.setBackground(Color.black);
		j3.setBackground(Color.black);
		c.setBackground(Color.black);
		nameLabel.setForeground(Color.white);
		keyLabel.setForeground(Color.white);
		kgLabel.setForeground(Color.white);
		titleLabel.setForeground(Color.white);
		titleLabel.setFont(titleLabel.getFont().deriveFont(25.0f));
		
		j1.add(titleLabel);
		titleLabel.setHorizontalAlignment(titleLabel.CENTER);
		c.add(titleLabel,BorderLayout.NORTH);
		
		j2.add(nameLabel);
		nameLabel.setBounds(140, 20, 80, 70);
		j2.add(nameText);
		nameText.setBounds(200, 42, 100, 20);
		
		
		j2.add(keyLabel);
		keyLabel.setBounds(140, 60, 80, 70);
		j2.add(keyText);
		keyText.setBounds(200, 82, 100, 20);
		
		j2.add(kgLabel);
		kgLabel.setBounds(140, 100, 80, 70);
		j2.add(kgText);
		kgText.setBounds(200, 122, 100, 20);
		
		nameLabel.setHorizontalAlignment(nameLabel.CENTER);
		kgLabel.setHorizontalAlignment(kgLabel.CENTER);
		keyLabel.setHorizontalAlignment(keyLabel.CENTER);
		c.add(j2,BorderLayout.CENTER);
		
//		üũ�ڽ� ����
		j3.setLayout(null);
		
		
		j3.add(exitButton);
		j3.add(inButton);
		c.add(j3,BorderLayout.SOUTH);
		
		setLocationRelativeTo(null);
		setSize(500,400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MyProjectWritePage();
	}
}
