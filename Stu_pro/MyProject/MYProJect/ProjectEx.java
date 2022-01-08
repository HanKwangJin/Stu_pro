package MYProJect;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class ProjectEx {

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
	//ù����
	ImageIcon running1 = new ImageIcon("images/running.PNG");
	Image running2 = running1.getImage();
	Image running3 = running2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon running = new ImageIcon(running3);
	
	ImageIcon burpy1 = new ImageIcon("images/burpy.JPG");
	Image burpy2 = burpy1.getImage();
	Image burpy3 = burpy2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon burpy = new ImageIcon(burpy3);
	
	ImageIcon cycle1 = new ImageIcon("images/sycle.PNG");
	Image cycle2 = cycle1.getImage();
	Image cycle3 = cycle2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon cycle = new ImageIcon(cycle3);

	// ����
	ImageIcon chestPress1 = new ImageIcon("images/chestPress.JPG");
	Image chestPress2 = chestPress1.getImage();
	Image chestPress3 = chestPress2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon chestPress = new ImageIcon(chestPress3);

	ImageIcon hemmer1 = new ImageIcon("images/hemmaer.JPG");
	Image hemmer2 = hemmer1.getImage();
	Image hemmer3 = hemmer2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon hammer = new ImageIcon(hemmer3);

	ImageIcon pushup1 = new ImageIcon("images/pushup.JPG");
	Image pushup2 = pushup1.getImage();
	Image pushup3 = pushup2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon pushup = new ImageIcon(pushup3);

	ImageIcon benchPress1 = new ImageIcon("images/benchPress.JPG");
	Image benchPress2 = benchPress1.getImage();
	Image benchPress3 = benchPress2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon benchPress = new ImageIcon(benchPress3);

	ImageIcon lowcableFly1 = new ImageIcon("images/lowcableFly.JPG");
	Image lowcableFly2 = lowcableFly1.getImage();
	Image lowcableFly3 = lowcableFly2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon lowcableFly = new ImageIcon(lowcableFly3);

	ImageIcon dips1 = new ImageIcon("images/dips.JPG");
	Image dips2 = dips1.getImage();
	Image dips3 = dips2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon dips = new ImageIcon(dips3);

	ImageIcon inclinedumbell1 = new ImageIcon("images/inclinedumbell.JPG");
	Image inclinedumbell2 = inclinedumbell1.getImage();
	Image inclinedumbell3 = inclinedumbell2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon inclinedumbell = new ImageIcon(inclinedumbell3);

	ImageIcon inclineFly1 = new ImageIcon("images/inclineFly.JPG");
	Image inclineFly2 = inclineFly1.getImage();
	Image inclineFly3 = inclineFly2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon inclineFly = new ImageIcon(inclineFly3);

	// ��

	ImageIcon barbellLow1 = new ImageIcon("images/barbelllow.JPG");
	Image barbellLow2 = barbellLow1.getImage();
	Image barbellLow3 = barbellLow2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon barbellLow = new ImageIcon(barbellLow3);

	ImageIcon chinUp1 = new ImageIcon("images/chinup.JPG");
	Image chinUp2 = chinUp1.getImage();
	Image chinUp3 = chinUp2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon chinUp = new ImageIcon(chinUp3);

	ImageIcon dumbelllow1 = new ImageIcon("images/dumbelllow.JPG");
	Image dumbelllow2 = dumbelllow1.getImage();
	Image dumbelllow3 = dumbelllow2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon dumbelllow = new ImageIcon(dumbelllow3);

	ImageIcon lowpull1 = new ImageIcon("images/lowpull.JPG");
	Image lowpull2 = lowpull1.getImage();
	Image lowpull3 = lowpull2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon lowpull = new ImageIcon(lowpull3);

	ImageIcon pullup1 = new ImageIcon("images/pullup.JPG");
	Image pullup2 = pullup1.getImage();
	Image pullup3 = pullup2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon pullup = new ImageIcon(pullup3);

	ImageIcon deadlift1 = new ImageIcon("images/deadlift.JPG");
	Image deadlift2 = deadlift1.getImage();
	Image deadlift3 = deadlift2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon deadlift = new ImageIcon(deadlift3);

	// ��ü
	ImageIcon hipthrust1 = new ImageIcon("images/hipthrust.JPG");
	Image hipthrust2 = hipthrust1.getImage();
	Image hipthrust3 = hipthrust2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon hipthrust = new ImageIcon(hipthrust3);

	
	ImageIcon legextention1 = new ImageIcon("images/legextention.JPG");
	Image legextention2 = legextention1.getImage();
	Image legextention3 = legextention2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon legextention = new ImageIcon(legextention3);
	
	
	ImageIcon powerlegpress1 = new ImageIcon("images/powerlegpress.JPG");
	Image powerlegpress2 = powerlegpress1.getImage();
	Image powerlegpress3 = powerlegpress2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon powerlegpress = new ImageIcon(powerlegpress3);
	
	
	ImageIcon squat1 = new ImageIcon("images/squat.JPG");
	Image squat2 = squat1.getImage();
	Image squat3 = squat2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon squat = new ImageIcon(squat3);
	
	
	ImageIcon splitsquat1 = new ImageIcon("images/splitsquat.JPG");
	Image splitsquat2 = splitsquat1.getImage();
	Image splitsquat3 = splitsquat2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon splitsquat = new ImageIcon(splitsquat3);
	
	
	ImageIcon barbellrunge1 = new ImageIcon("images/barbellrunge.JPG");
	Image barbellrunge2 = barbellrunge1.getImage();
	Image barbellrunge3 = barbellrunge2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon barbellrunge = new ImageIcon(barbellrunge3);
	
	ImageIcon runge1 = new ImageIcon("images/runge.JPG");
	Image runge2 = runge1.getImage();
	Image runge3 = runge2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	ImageIcon runge = new ImageIcon(runge3);
	
	
	
	
	// Ǫ����
	JLabel pushupLabel = new JLabel(pushup);

	JLabel pushupLabel1_1 = new JLabel("��Ǫ����");
	JLabel pushupLabel1_2 = new JLabel("�� ���帰 �ڼ��� �Ӹ����� �߳����� �������� �����.");
	JLabel pushupLabel1_3 = new JLabel("�� �������� �Ȳ�ġ�� ����� �ʿ� ������ ��ġ ��Ų��.");
	JLabel pushupLabel1_4 = new JLabel("�� ���������� �ö�ö� �ӵ����� ���߸鼭 ������ ��ġ�°� �����Ѵ�.");

	// �ظ� ü��Ʈ
	JLabel hammerLabel = new JLabel(hammer);
	JLabel hammerLabel1_1 = new JLabel("���ظ� ��Ʈ���� ü��Ʈ �ӽ�");
	JLabel hammerLabel1_2 = new JLabel("�� �ӽſ� ������ �ٸ� ��� ���� �ϰ� �� ȣ���� ��´�.");
	JLabel hammerLabel1_3 = new JLabel("�� ���� �ϰ��� ������ü ������� ������ Ǫ�����ش�.");
	JLabel hammerLabel1_4 = new JLabel("�� �Ȳ�ġ�� �ʹ� �ڷ� ���� �ʰ� ���� ���ش�.");

	// ü��Ʈ ������
	JLabel chestPressLabel = new JLabel(chestPress);
	JLabel chestPressLabel1_1 = new JLabel("��ü��Ʈ ������");
	JLabel chestPressLabel1_2 = new JLabel("�� �ӽſ� ������ �ٸ� ��� ���� �ϰ� �� ȣ���� ��´�.");
	JLabel chestPressLabel1_3 = new JLabel("�� ���� �ϰ��� ������ü ������� ������ Ǫ�����ش�.");
	JLabel chestPressLabel1_4 = new JLabel("�� �Ȳ�ġ�� ��� �Ʒ����� �����̰� �ڱ��� ���� ���������� �Ѵ�.");

	// ����
	JLabel dipsLabel = new JLabel(dips);
	JLabel dipsLabel1 = new JLabel("������");
	JLabel dipsLabel2 = new JLabel("�� �ٿ� �ö� ���� �ü��� 45������ �Ʒ��� ����.");
	JLabel dipsLabel3 = new JLabel("�� �������鼭 �Ȳ�ġ�� 90�� �̻� ������ �ʴ´�.");
	JLabel dipsLabel4 = new JLabel("�� �ö���鼭 ����� �δ��� ���� �ʰ� ����ٿ� �ڱ��� ������.");

	// ��ġ������
	JLabel benchPressLabel = new JLabel(benchPress);
	JLabel benchPressLabel1 = new JLabel("����ġ ������");
	JLabel benchPressLabel2 = new JLabel("�� �÷� ��ġ�� ����� �����ϰ��� �㸮�� ��ġ�� �ش�.");
	JLabel benchPressLabel3 = new JLabel("�� ȣ���� ��� �ٺ��� �� ������ �Ȳ����� �ٴڿ� ������ ���ϵ��� �Ѵ�.");
	JLabel benchPressLabel4 = new JLabel("�� �ٺ��� �������� �������� �ø��� �����ϰ��� Ǯ���� ���� ������ �÷��ش�.");

	// �ο� ���̺� �ö���
	JLabel lowCableFlyLabel = new JLabel(lowcableFly);
	JLabel lowCableFlyLabel1 = new JLabel("���ο� ���̺� �ö���");
	JLabel lowCableFlyLabel2 = new JLabel("�� ���̺��� ���� �Ʒ��� ��ġ�����ش��� �����ϰ��� ��´�.");
	JLabel lowCableFlyLabel3 = new JLabel("�� ���̺��� ��� ������� ¥�ش�.");
	JLabel lowCableFlyLabel4 = new JLabel("�� ���̺��� ������ �ӵ��� ������ �������� �ڱ��� ������.");

	// ��Ŭ���δ���������
	JLabel inclinedumbellLabel = new JLabel(inclinedumbell);
	JLabel inclinedumbellLabel1 = new JLabel("����Ŭ���� ���� ������");
	JLabel inclinedumbellLabel2 = new JLabel("�� ��ġ�� ������ �ڽſ� �°� �����ش��� �ɾƼ� �����ϰ��� ����ش�.");
	JLabel inclinedumbellLabel3 = new JLabel("�� ������ �ڽſ��� �´� ���Ը� ����ش��� ��� ��������.");
//	JLabel inclinedumbellLabel4 = new JLabel("�� �Ȳ�ġ�� ��� �Ʒ����� �����̰� �ڱ��� ���� ���������� �Ѵ�.");

	// ��Ŭ���� ���� �ö���
	JLabel inclineFlyLabel = new JLabel(inclineFly);
	JLabel inclineFlyLabel1 = new JLabel("����Ŭ���� ���� �ö���");
	JLabel inclineFlyLabel2 = new JLabel("�� ��ġ ������ �ڽſ��� �°� ������ �ɾƼ� �����ϰ�, ȣ���� ��´�.");
	JLabel inclineFlyLabel3 = new JLabel("�� ������ �Ȳ�ġ�� �ִ��� �ȱ����� �ִ� ���Ը� �����´�.");
	JLabel inclineFlyLabel4 = new JLabel("�� �� �� �ö��̸� �������ش�.");

	//��
	//�ٺ��ο�
	JLabel barbelllowLabel = new JLabel(barbellLow);
	JLabel barbelllowLabel1 = new JLabel("���ٺ��ο�");
	JLabel barbelllowLabel2 = new JLabel("�� ���� ��� ���̷� ������ ���� �ٺ��� ��� �㸮�� 45���� ���δ�.");
	JLabel barbelllowLabel3 = new JLabel("�� ������ �ش��� �ٺ��� ��� �������� �������� ������ ��������.");
	JLabel barbelllowLabel4 = new JLabel("�� �λ��� �����Ͽ� �ӵ��� õõ�� ��������.");

	//ģ��
	JLabel chinupLabel = new JLabel(chinUp);
	JLabel chinupLabel1 = new JLabel("��ģ��");
	JLabel chinupLabel2 = new JLabel("�� Ǯ���� ���� �ڼ����� �׸��� ����� ����ش�.");
	JLabel chinupLabel3 = new JLabel("�� �����ϰ��� ����� ������ �Ȱ��� ��� ���ش�.");
	JLabel chinupLabel4 = new JLabel("�� ����� �Ϻ��ʿ� �ڱ��� �����ָ� õõ�� ��� �Ѵ�.");

	
	//�����ο�
	JLabel dumbelllowLabel = new JLabel(dumbelllow);
	JLabel dumbelllowLabel1 = new JLabel("�������ο�");
	JLabel dumbelllowLabel2 = new JLabel("�� �ٺ��ο�� �ٸ��� ���������� ���� �������� �ִ�.");
	JLabel dumbelllowLabel3 = new JLabel("�� �ڽſ��� �´� ������ �� ���� ��ġ�� ���� �������� �㸮�� �����Ѵ�.");
	JLabel dumbelllowLabel4 = new JLabel("�� �����ϰ��� ����ٿ� �ڱ��� ��������.");

	
	//�ο�Ǯ
	JLabel lowpullLabel = new JLabel(lowpull);
	JLabel lowpullLabel1 = new JLabel("���ο� Ǯ");
	JLabel lowpullLabel2 = new JLabel("�� �ӽſ� ������ ���ϴ� ������ �´� �����̸� ��´�.");
	JLabel lowpullLabel3 = new JLabel("�� ������ ���а� ������ ������ �㸮�� ���� �����̸� ���� ������ ������.");
	JLabel lowpullLabel4 = new JLabel("�� ����ٿ� �ڱ��� ������ õõ�� ��Ѵ�.");

	//Ǯ��
	JLabel pullupLabel = new JLabel(pullup);
	JLabel pullupLabel1 = new JLabel("��Ǯ��");
	JLabel pullupLabel2 = new JLabel("�� �����ϰ��� ����� ������ �Ȱ����� �Ѵ�.");
	JLabel pullupLabel3 = new JLabel("�� ��� �Ҽ� ���ų� ����� ������ ����� ��带 ����Ѵ�.");
	JLabel pullupLabel4 = new JLabel("�� ��ġ ���� �ƴ� ������ �ö󰡵��� ��Ѵ�.");

	
	//���帮��Ʈ
	JLabel deadliftLabel = new JLabel(deadlift);
	JLabel deadliftLabel1 = new JLabel("�����帮��Ʈ");
	JLabel deadliftLabel2 = new JLabel("�� ������ ���� ������ ������ ���� �ٸ� ����ش�.");
	JLabel deadliftLabel3 = new JLabel("�� �������� ���� ���� �ٸ� ���� ������ ��ġ�����ش�.");
	JLabel deadliftLabel4 = new JLabel("�� �㸮�� ���ð�� ���Ը� ������ �ؼ� �ڼ��� ��ģ��.");
	
	//��ü
	//�ٺ�����
	JLabel barbellrungeLabel = new JLabel(barbellrunge);
	JLabel barbellrungeLabel1 = new JLabel("���ٺ� ����");
	JLabel barbellrungeLabel2 = new JLabel("�� ������ ���� ������ ������ ���� �ٸ� ����ش�.");
	JLabel barbellrungeLabel3 = new JLabel("�� �������� ���� ���� �ٸ� ���� ������ ��ġ�����ش�.");
	JLabel barbellrungeLabel4 = new JLabel("�� �㸮�� ���ð�� ���Ը� ������ �ؼ� �ڼ��� ��ģ��.");
	
	//��������Ʈ
	JLabel hipthrustLabel = new JLabel(hipthrust);
	JLabel hipthrustLabel1 = new JLabel("���� ������Ʈ");
	JLabel hipthrustLabel2 = new JLabel("�� ������ ���� ������ ������ ���� �ٸ� ����ش�.");
	JLabel hipthrustLabel3 = new JLabel("�� �������� ���� ���� �ٸ� ���� ������ ��ġ�����ش�.");
	JLabel hipthrustLabel4 = new JLabel("�� �㸮�� ���ð�� ���Ը� ������ �ؼ� �ڼ��� ��ģ��.");
	
	//�����ͽ��ټ�
	JLabel legextentionLabel = new JLabel(legextention);
	JLabel legextentionLabel1 = new JLabel("������ �ͽ��ټ�");
	JLabel legextentionLabel2 = new JLabel("�� ������ ���� ������ ������ ���� �ٸ� ����ش�.");
	JLabel legextentionLabel3 = new JLabel("�� �������� ���� ���� �ٸ� ���� ������ ��ġ�����ش�.");
	JLabel legextentionLabel4 = new JLabel("�� �㸮�� ���ð�� ���Ը� ������ �ؼ� �ڼ��� ��ģ��.");
	
	//�Ŀ� ����������
	JLabel powerlegpressLabel = new JLabel(powerlegpress);
	JLabel powerlegpressLabel1 = new JLabel("���Ŀ� ���� ������");
	JLabel powerlegpressLabel2 = new JLabel("�� ������ ���� ������ ������ ���� �ٸ� ����ش�.");
	JLabel powerlegpressLabel3 = new JLabel("�� �������� ���� ���� �ٸ� ���� ������ ��ġ�����ش�.");
	JLabel powerlegpressLabel4 = new JLabel("�� �㸮�� ���ð�� ���Ը� ������ �ؼ� �ڼ��� ��ģ��.");
	
	//����
	JLabel rungeLabel = new JLabel(runge);
	JLabel rungeLabel1 = new JLabel("������");
	JLabel rungeLabel2 = new JLabel("�� ������ ���� ������ ������ ���� �ٸ� ����ش�.");
	JLabel rungeLabel3 = new JLabel("�� �������� ���� ���� �ٸ� ���� ������ ��ġ�����ش�.");
	JLabel rungeLabel4 = new JLabel("�� �㸮�� ���ð�� ���Ը� ������ �ؼ� �ڼ��� ��ģ��.");
	
	//���ø� ����
	JLabel splitsquatLabel = new JLabel(splitsquat);
	JLabel splitsquatLabel1 = new JLabel("�����ø� ����");
	JLabel splitsquatLabel2 = new JLabel("�� ������ ���� ������ ������ ���� �ٸ� ����ش�.");
	JLabel splitsquatLabel3 = new JLabel("�� �������� ���� ���� �ٸ� ���� ������ ��ġ�����ش�.");
	JLabel splitsquatLabel4 = new JLabel("�� �㸮�� ���ð�� ���Ը� ������ �ؼ� �ڼ��� ��ģ��.");
	
	//����Ʈ
	JLabel squatLabel = new JLabel(squat);
	JLabel squatLabel1 = new JLabel("������Ʈ");
	JLabel squatLabel2 = new JLabel("�� ������ ���� ö�����ĵ� ������ ��� �ٸ� �¸�ٿ� �ɾ��ش�.");
	JLabel squatLabel3 = new JLabel("�� �������� ���� ���� �ٸ� ���� ������ ��ġ�����ش�.");
	JLabel squatLabel4 = new JLabel("�� �㸮�� ���ð�� ���Ը� ������ �ؼ� �ڼ��� ��ģ��.");
	//����
	JLabel runningLabel = new JLabel(running);
	JLabel runningLabel1 = new JLabel("������");
	JLabel runningLabel2 = new JLabel("�� ���� �޸���.");
	JLabel runningLabel3 = new JLabel("�� �ڲ�ġ�� �ȴ굵�� ���ִ°� ����.");
	JLabel runningLabel4 = new JLabel("�� ���� �ִ��� ���밨 �ְ� �ڷ� ȣ���� ���ش�.");
	//����Ŭ
	JLabel cycleLabel = new JLabel(cycle);
	JLabel cycleLabel1 = new JLabel("������Ŭ");
	JLabel cycleLabel2 = new JLabel("�� ���� ��´�.");
	JLabel cycleLabel3 = new JLabel("�� �ɹڼ��� 140�̻� �ö󰡾� ������ Ÿ�� ���� �ϱ� ������ ������ �ʴ´�.");
	JLabel cycleLabel4 = new JLabel("�� ������� Ÿ���� ������ ��������.");
	//�����׽�Ʈ
	JLabel burpyLabel = new JLabel(burpy);
	JLabel burpyLabel1 = new JLabel("������ �׽�Ʈ");
	JLabel burpyLabel2 = new JLabel("�� ���ִ� �ڼ����� �ޱ׷� �ɴ´�.");
	JLabel burpyLabel3 = new JLabel("�� ������ ���ÿ� ����� ���� �ڼ��� �Ѵ�.");
	JLabel burpyLabel4 = new JLabel("�� ����� ���� �ڼ����� �Ͼ�� ������ ������ �Ѵ�.");

	
	
	// ���̵� ������
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

	// ��� ���� ������
	ImageIcon cheseimage = new ImageIcon("images/chest1.png");
	Image cheseimage1 = cheseimage.getImage();
	Image cheseimage2 = cheseimage1.getScaledInstance(849, 520, java.awt.Image.SCALE_SMOOTH);
	ImageIcon cheseimage3 = new ImageIcon(cheseimage2);
	JLabel chestLabel = new JLabel(cheseimage3);

	ImageIcon lowerimage1 = new ImageIcon("images/lower1.jpg");
	Image lowerimage2 = lowerimage1.getImage();
	Image lowerimage3 = lowerimage2.getScaledInstance(849, 520, java.awt.Image.SCALE_SMOOTH);
	ImageIcon lowerimage4 = new ImageIcon(lowerimage3);
	JLabel lowerLabel = new JLabel(lowerimage4);

	ImageIcon backimage1 = new ImageIcon("images/back1.jpg");
	Image backimage2 = backimage1.getImage();
	Image backimage3 = backimage2.getScaledInstance(849, 520, java.awt.Image.SCALE_SMOOTH);
	ImageIcon backimage4 = new ImageIcon(backimage3);
	JLabel backLabel = new JLabel(backimage4);
//	
	JPanel panel4_1 = new JPanel();
	JPanel panel4_2 = new JPanel();
	JPanel panel4_2_5 = new JPanel();
	JPanel panel5_1 = new JPanel();
	JPanel panel5_2 = new JPanel();
	JPanel panel6_1 = new JPanel();
	JPanel panel6_2 = new JPanel();
	JPanel panel7_1 = new JPanel();
	JPanel panel7_2 = new JPanel();

	JPanel panel4_2_1 = new JPanel();
	JPanel panel4_2_2 = new JPanel();
	JPanel panel4_2_3 = new JPanel();

	JPanel panel5_2_1 = new JPanel();
	JPanel panel5_2_2 = new JPanel();
	JPanel panel5_2_3 = new JPanel();

	JPanel panel6_2_1 = new JPanel();
	JPanel panel6_2_2 = new JPanel();
	JPanel panel6_2_3 = new JPanel();

	JPanel panel7_2_1 = new JPanel();
	JPanel panel7_2_2 = new JPanel();
	JPanel panel7_2_3 = new JPanel();

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

	// ���̵� ��ư
	JButton nomalbutton = new JButton(nomal3);
	JButton hardButton = new JButton(sohard3);
	JButton sohardButton = new JButton(tohard3);

	private JPanel panel1;
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	private JPanel panel5 = new JPanel();
	private JPanel panel6 = new JPanel();
	private JPanel panel7 = new JPanel();
	ImagePanel image1 = new ImagePanel(new ImageIcon("C:/JavaSF/workspace/JavaSF/images/Projectdck.jpg").getImage());
	ImagePanel image = new ImagePanel(new ImageIcon("C:/JavaSF/workspace/JavaSF/images/Pro.jpg").getImage());
	Font font = new Font("���� ���", 0, 30);

	public ProjectEx() {
		frame.setTitle("ö�糲��");
		frame.setLayout(null);
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

//		ImageIcon thinbody = new ImageIcon("images/thin.jpg");
//		Image thinbody1 = thinbody.getImage();
//		Image thinbody2 = thinbody1.getScaledInstance(140, 160, java.awt.Image.SCALE_SMOOTH);
//		ImageIcon thinbody3 = new ImageIcon(thinbody2);
//
//		ImageIcon nomalbody = new ImageIcon("images/nomal.jpg");
//		Image nomalbody1 = nomalbody.getImage();
//		Image nomalbody2 = nomalbody1.getScaledInstance(140, 160, java.awt.Image.SCALE_SMOOTH);
//		ImageIcon nomalbody3 = new ImageIcon(nomalbody2);
//
//		ImageIcon bodyy = new ImageIcon("images/body.jpg");
//		Image body1 = bodyy.getImage();
//		Image body2 = body1.getScaledInstance(140, 160, java.awt.Image.SCALE_SMOOTH);
//		ImageIcon body3 = new ImageIcon(body2);
//
//		ImageIcon hard0 = new ImageIcon("images/hard.png");
//		Image hard1 = hard0.getImage();
//		Image hard2 = hard1.getScaledInstance(140, 160, java.awt.Image.SCALE_SMOOTH);
//		ImageIcon hard3 = new ImageIcon(hard2);
//
//		ImageIcon har0 = new ImageIcon("images/har.png");
//		Image har1 = har0.getImage();
//		Image har2 = har1.getScaledInstance(140, 160, java.awt.Image.SCALE_SMOOTH);
//		ImageIcon har3 = new ImageIcon(har2);
//
//		ImageIcon nomall0 = new ImageIcon("images/nomall.png");
//		Image nomall1 = nomall0.getImage();
//		Image nomall2 = nomall1.getScaledInstance(140, 160, java.awt.Image.SCALE_SMOOTH);
//		ImageIcon nomall3 = new ImageIcon(nomall2);

//		ImageIcon[] icons = { thinbody3, nomalbody3, body3 };

		for (int i = 0; i < 3; i++) {
			bodys[i] = new JRadioButton(icons[i]);
			group.add(bodys[i]);
			bodys[i].setBorderPainted(true);
			image.add(bodys[i]);
			bodys[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					if (bodys[0].isSelected()) {
						nanido = "�߱�";
						time = "1�ð�";
						persent1 = "50";
						persent2 = "50";
					} else if (bodys[1].isSelected()) {
						nanido = "���";
						time = "2�ð�";
						persent1 = "40";
						persent2 = "60";
					} else if (bodys[2].isSelected()) {
						nanido = "�ֻ��";
						time = "3�ð� �̻�";
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

		// ��ư
		JButton inButton = new JButton("���� �Է�");
		inButton.setBounds(495, 590, 146, 39);
		inButton.setBackground(Color.black);
		inButton.setForeground(Color.white);
		image.add(inButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (nameField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�̸��� �Է��ϼ���", "�ټս� �溸", JOptionPane.ERROR_MESSAGE);
				} else if (kgField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�����Ը� �Է��ϼ���", "�ټս� �溸", JOptionPane.ERROR_MESSAGE);
				} else if (kyField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "������ �Է��ϼ���", "�ټս� �溸", JOptionPane.ERROR_MESSAGE);
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

		JButton exitButton = new JButton("������");
		exitButton.setBounds(694, 590, 146, 39);
		exitButton.setBackground(Color.black);
		exitButton.setForeground(Color.white);
		image.add(exitButton);

		exitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				exitButton.setVisible(false);
				JOptionPane.showMessageDialog(null, "����� ��ؾ��� ^^", "�ټս� �溸", JOptionPane.ERROR_MESSAGE);
			}
		});
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel1);
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

	// �� ��° ������
	void second(String name, String kg, String ky) {
		frame.add(panel2);
		panel2.add(image1);
		panel2.setSize(image1.getWidth(), image1.getHeight());
		panel3.setBounds(282, 151, 849, 520);
		panel3.setLayout(new GridLayout(5, 1));
		panel3.setOpaque(true);
		panel3.setBackground(Color.black);
		image1.add(panel3);
		panel3.setVisible(true);

		Font font1 = new Font("�޸� ������", 0, 30);

		// ����
		JLabel label1 = new JLabel(name + "���� Ű�� " + ky + "�̰�," + "�����Դ� " + kg + "�Դϴ�.");
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
			str1 = "����";
			num5 = num3;
		} else {
			str1 = "����";
			num5 = num4;
		}
		JLabel label2 = new JLabel("���� �����Դ� �� " + num2 + "kg�̰�, " + str1 + "�ؾߵ� ���Դ� " + num5 + "kg�Դϴ�.");
		label2.setFont(font1);
		label2.setForeground(Color.WHITE);
		panel3.add(label2);

		//
		JLabel label3 = new JLabel("���Ͻô� ���� ���̵��� " + nanido + "�Դϴ�.");
		label3.setFont(font1);
		label3.setForeground(Color.WHITE);
		panel3.add(label3);

		JLabel label4 = new JLabel("��õ ��ð��� " + time + " �̸�,");
		label4.setFont(font1);
		label4.setForeground(Color.WHITE);
		panel3.add(label4);

		JLabel label5 = new JLabel("����� ����Ʈ ������ " + "����� :" + persent1 + "% ����Ʈ " + persent2 + "% �Դϴ�.");
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

		JButton chest = new JButton("����");
		chest.setBounds(45, 120, 160, 40);
		chest.setForeground(Color.white);
		chest.setBackground(Color.black);
		chest.setFont(font1);
		image1.add(chest);

		JButton back = new JButton("��");
		back.setBounds(45, 190, 160, 40);
		back.setForeground(Color.white);
		back.setBackground(Color.black);
		back.setFont(font1);
		image1.add(back);

		JButton lower = new JButton("��ü");
		lower.setBounds(45, 260, 160, 40);
		lower.setForeground(Color.white);
		lower.setBackground(Color.black);
		lower.setFont(font1);
		image1.add(lower);

		JButton run = new JButton("�����");
		run.setBounds(45, 330, 160, 40);
		run.setForeground(Color.white);
		run.setBackground(Color.black);
		run.setFont(font1);
		image1.add(run);

		JButton returnButton = new JButton("�ǵ��ư���");
		returnButton.setBounds(45, 400, 160, 40);
		returnButton.setFont(new Font("�޸� ������", 0, 20));
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
		panel4.setLayout(new BorderLayout());
		panel4.setBounds(282, 151, 849, 520);
		panel4.setOpaque(true);
		panel4.setBackground(Color.black);
		image1.add(panel4);

		panel4.add(panel4_1, BorderLayout.NORTH);
		panel4.add(panel4_2, BorderLayout.CENTER);

		// ��,��,�ֻ� ��ư
		panel4_1.setLayout(new FlowLayout());
		panel4_1.setOpaque(true);
		panel4_1.setBackground(Color.black);

		nomalbutton.setBackground(Color.WHITE);
		panel4_1.add(nomalbutton);

		hardButton.setBackground(Color.GREEN);
		panel4_1.add(hardButton);

		sohardButton.setBackground(Color.RED);
		panel4_1.add(sohardButton);

		// ���� ��,��,�ֻ�
		panel4_1.setVisible(true);
		panel4_2.setVisible(true);
		panel4_2_5.setVisible(true);

		panel4_2_1.setVisible(false);
		panel4_2_2.setVisible(false);
		panel4_2_3.setVisible(false);

		panel3.setVisible(false);
		panel5.setVisible(false);
		panel6.setVisible(false);
		panel7.setVisible(false);

		panel4_2.add(chestLabel);
		panel4_2.setOpaque(true);
		panel4_2.setBackground(Color.black);

//		panel4_2.add(panel4_2_1);
//		panel4_2.add(panel4_2_2);
//		panel4_2.add(panel4_2_3);

		// panel4_2_1 ���� ����
		// ���� � ��
		panel4_2_1.setOpaque(true);
		panel4_2_1.setBackground(Color.black);
		panel4_2_1.setLayout(null);

		// ���̺� Ǫ����
		panel4_2_1.add(pushupLabel);
		panel4_2_1.add(pushupLabel1_1);
		panel4_2_1.add(pushupLabel1_2);
		panel4_2_1.add(pushupLabel1_3);
		panel4_2_1.add(pushupLabel1_4);

		// ���� 1,2,3,4
		pushupLabel.setBounds(40, 40, 120, 120);

		pushupLabel1_1.setBounds(200, 40, 400, 20);
		pushupLabel1_1.setForeground(Color.red);

		pushupLabel1_2.setBounds(200, 70, 400, 20);
		pushupLabel1_2.setForeground(Color.white);

		pushupLabel1_3.setBounds(200, 100, 400, 20);
		pushupLabel1_3.setForeground(Color.white);

		pushupLabel1_4.setBounds(200, 130, 400, 20);
		pushupLabel1_4.setForeground(Color.white);

		// ���̺� �ظ�ü��Ʈ

		panel4_2_1.add(hammerLabel);
		hammerLabel.setBounds(40, 180, 120, 120);

		// ��� ü��Ʈ ���� 1,2,3,4
		panel4_2_1.add(hammerLabel1_1);
		panel4_2_1.add(hammerLabel1_2);
		panel4_2_1.add(hammerLabel1_3);
		panel4_2_1.add(hammerLabel1_4);

		hammerLabel1_1.setForeground(Color.red);
		hammerLabel1_1.setBounds(200, 180, 400, 20);

		hammerLabel1_2.setForeground(Color.white);
		hammerLabel1_2.setBounds(200, 210, 400, 20);

		hammerLabel1_3.setForeground(Color.white);
		hammerLabel1_3.setBounds(200, 240, 400, 20);

		hammerLabel1_4.setForeground(Color.white);
		hammerLabel1_4.setBounds(200, 270, 400, 20);

		// ���̺� ü��Ʈ ������
		panel4_2_1.add(chestPressLabel);
		chestPressLabel.setBounds(40, 320, 120, 120);

		// ü��Ʈ ������ ���� 1,2,3,4
		panel4_2_1.add(chestPressLabel1_1);
		panel4_2_1.add(chestPressLabel1_2);
		panel4_2_1.add(chestPressLabel1_3);
		panel4_2_1.add(chestPressLabel1_4);

		chestPressLabel1_1.setForeground(Color.red);
		chestPressLabel1_1.setBounds(200, 320, 400, 20);

		chestPressLabel1_2.setForeground(Color.white);
		chestPressLabel1_2.setBounds(200, 350, 400, 20);

		chestPressLabel1_3.setForeground(Color.white);
		chestPressLabel1_3.setBounds(200, 380, 400, 20);

		chestPressLabel1_4.setForeground(Color.white);
		chestPressLabel1_4.setBounds(200, 410, 400, 20);

		// ���� � ��
		panel4_2_2.setOpaque(true);
		panel4_2_2.setBackground(Color.black);
		panel4_2_2.setLayout(null);

		// ��ġ ������
		panel4_2_2.add(benchPressLabel);
		panel4_2_2.add(benchPressLabel1);
		panel4_2_2.add(benchPressLabel2);
		panel4_2_2.add(benchPressLabel3);
		panel4_2_2.add(benchPressLabel4);

		// ���� 1,2,3,4
		benchPressLabel.setBounds(40, 40, 120, 120);

		benchPressLabel1.setBounds(200, 40, 400, 20);
		benchPressLabel1.setForeground(Color.red);

		benchPressLabel2.setBounds(200, 70, 400, 20);
		benchPressLabel2.setForeground(Color.white);

		benchPressLabel3.setBounds(200, 100, 400, 20);
		benchPressLabel3.setForeground(Color.white);

		benchPressLabel4.setBounds(200, 130, 400, 20);
		benchPressLabel4.setForeground(Color.white);

		// ����

		panel4_2_2.add(dipsLabel);
		dipsLabel.setBounds(40, 180, 120, 120);

		// ���� ���� 1,2,3,4
		panel4_2_2.add(dipsLabel);
		panel4_2_2.add(dipsLabel1);
		panel4_2_2.add(dipsLabel2);
		panel4_2_2.add(dipsLabel3);
		panel4_2_2.add(dipsLabel4);

		dipsLabel1.setForeground(Color.red);
		dipsLabel1.setBounds(200, 180, 400, 20);

		dipsLabel2.setForeground(Color.white);
		dipsLabel2.setBounds(200, 210, 400, 20);

		dipsLabel3.setForeground(Color.white);
		dipsLabel3.setBounds(200, 240, 400, 20);

		dipsLabel4.setForeground(Color.white);
		dipsLabel4.setBounds(200, 270, 400, 20);

		// ���̺� ü��Ʈ ������
		panel4_2_2.add(lowCableFlyLabel);
		lowCableFlyLabel.setBounds(40, 320, 120, 120);

		// ü��Ʈ ������ ���� 1,2,3,4
		panel4_2_2.add(lowCableFlyLabel1);
		panel4_2_2.add(lowCableFlyLabel2);
		panel4_2_2.add(lowCableFlyLabel3);
		panel4_2_2.add(lowCableFlyLabel4);

		lowCableFlyLabel1.setForeground(Color.red);
		lowCableFlyLabel1.setBounds(200, 320, 400, 20);

		lowCableFlyLabel2.setForeground(Color.white);
		lowCableFlyLabel2.setBounds(200, 350, 400, 20);

		lowCableFlyLabel3.setForeground(Color.white);
		lowCableFlyLabel3.setBounds(200, 380, 400, 20);

		lowCableFlyLabel4.setForeground(Color.white);
		lowCableFlyLabel4.setBounds(200, 410, 400, 20);

		// ���� � �ֻ�
		panel4_2_3.setOpaque(true);
		panel4_2_3.setBackground(Color.black);
		panel4_2_3.setLayout(null);

		// ��ġ ������
		panel4_2_3.add(inclinedumbellLabel);
		inclinedumbellLabel.setBounds(40, 40, 120, 120);

		panel4_2_3.add(inclinedumbellLabel1);
		panel4_2_3.add(inclinedumbellLabel2);
		panel4_2_3.add(inclinedumbellLabel3);
//		panel4_2_3.add(inclinedumbellLabel4);

		// ���� 1,2,3,4

		inclinedumbellLabel1.setBounds(200, 40, 400, 20);
		inclinedumbellLabel1.setForeground(Color.red);

		inclinedumbellLabel2.setBounds(200, 70, 400, 20);
		inclinedumbellLabel2.setForeground(Color.white);

		inclinedumbellLabel3.setBounds(200, 100, 400, 20);
		inclinedumbellLabel3.setForeground(Color.white);

		// ����

		panel4_2_3.add(inclineFlyLabel);
		inclineFlyLabel.setBounds(40, 180, 120, 120);

		// ���� ���� 1,2,3,4
		panel4_2_3.add(inclineFlyLabel1);
		panel4_2_3.add(inclineFlyLabel2);
		panel4_2_3.add(inclineFlyLabel3);
		panel4_2_3.add(inclineFlyLabel4);

		inclineFlyLabel1.setForeground(Color.red);
		inclineFlyLabel1.setBounds(200, 180, 400, 20);

		inclineFlyLabel2.setForeground(Color.white);
		inclineFlyLabel2.setBounds(200, 210, 400, 20);

		inclineFlyLabel3.setForeground(Color.white);
		inclineFlyLabel3.setBounds(200, 240, 400, 20);

		inclineFlyLabel4.setForeground(Color.white);
		inclineFlyLabel4.setBounds(200, 270, 400, 20);

		// ���̺� ü��Ʈ ������
//		panel4_2_3.add(lowCableFlyLabel);
//		chestPressLabel.setBounds(40, 320, 120, 120);
//		
//		//ü��Ʈ ������ ���� 1,2,3,4
//		panel4_2_3.add(lowCableFlyLabel1);
//		panel4_2_3.add(lowCableFlyLabel2);
//		panel4_2_3.add(lowCableFlyLabel3);
//		panel4_2_3.add(lowCableFlyLabel4);
//		
//		lowCableFlyLabel1.setForeground(Color.red);
//		lowCableFlyLabel1.setBounds(200, 320, 300, 20);
//		
//		lowCableFlyLabel2.setForeground(Color.white);
//		lowCableFlyLabel2.setBounds(200, 350, 300, 20);
//		
//		lowCableFlyLabel3.setForeground(Color.white);
//		lowCableFlyLabel3.setBounds(200, 380, 300, 20);
//		
//		lowCableFlyLabel4.setForeground(Color.white);
//		lowCableFlyLabel4.setBounds(200, 410, 350, 20);

		nomalbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel4_2.setVisible(false);
				panel4_2_2.setVisible(false);
				panel4_2_3.setVisible(false);
				panel4_2_5.setVisible(false);
				panel4.add(panel4_2_1, BorderLayout.CENTER);
				panel4_2_1.setVisible(true);
			}
		});
		hardButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel4_2.setVisible(false);
				panel4_2_1.setVisible(false);
				panel4_2_3.setVisible(false);
				panel4_2_5.setVisible(false);
				panel4.add(panel4_2_2, BorderLayout.CENTER);
				panel4_2_2.setVisible(true);
			}
		});
		sohardButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel4_2.setVisible(false);
				panel4_2_1.setVisible(false);
				panel4_2_2.setVisible(false);
				panel4_2_5.setVisible(false);
				panel4.add(panel4_2_3, BorderLayout.CENTER);
				panel4_2_3.setVisible(true);
			}
		});

	}

	void panel5Ex() {
//		panel5_1.removeAll();
//		JButton nomalbutton = new JButton(nomal3);
//		JButton hardButton = new JButton(sohard3);
//		JButton sohardButton = new JButton(tohard3);
		panel3.setVisible(false);
		panel4.setVisible(false);
		panel6.setVisible(false);
		panel7.setVisible(false);
		panel5.setVisible(true);
		panel5_1.setVisible(true);
		panel5_2.setVisible(true);
		panel5.setLayout(new BorderLayout());
		panel5.setBounds(282, 151, 849, 520);
		panel5.setOpaque(true);
		panel5.setBackground(Color.black);
		image1.add(panel5);

		panel5.add(panel5_1, BorderLayout.NORTH);
		panel5.add(panel5_2, BorderLayout.CENTER);

		panel5_1.setLayout(new FlowLayout());
		panel5_1.setOpaque(true);
		panel5_1.setBackground(Color.black);

		nomalbutton.setBackground(Color.WHITE);
		panel5_1.add(nomalbutton);

		hardButton.setBackground(Color.GREEN);
		panel5_1.add(hardButton);

		sohardButton.setBackground(Color.RED);
		panel5_1.add(sohardButton);

		panel5_2.add(backLabel);
		panel5_2.setOpaque(true);
		panel5_2.setBackground(Color.black);
		
		panel5_2.add(panel5_2_1);
		panel5_2.add(panel5_2_2);
		panel5_2.add(panel5_2_3);
		
		//�ο�Ǯ
		panel5_2_1.setOpaque(true);
		panel5_2_1.setBackground(Color.black);
		panel5_2_1.setLayout(null);

		panel5_2_1.add(lowpullLabel);
		panel5_2_1.add(lowpullLabel1);
		panel5_2_1.add(lowpullLabel2);
		panel5_2_1.add(lowpullLabel3);
		panel5_2_1.add(lowpullLabel4);

		// ���� 1,2,3,4
		lowpullLabel.setBounds(40, 40, 120, 120);

		lowpullLabel1.setBounds(200, 40, 400, 20);
		lowpullLabel1.setForeground(Color.red);

		lowpullLabel2.setBounds(200, 70, 400, 20);
		lowpullLabel2.setForeground(Color.white);

		lowpullLabel3.setBounds(200, 100, 400, 20);
		lowpullLabel3.setForeground(Color.white);

		lowpullLabel4.setBounds(200, 130, 400, 20);
		lowpullLabel4.setForeground(Color.white);
		
		//Ǯ��
		panel5_2_1.setOpaque(true);
		panel5_2_1.setBackground(Color.black);
		panel5_2_1.setLayout(null);
		
		panel5_2_1.add(pullupLabel);
		panel5_2_1.add(pullupLabel1);
		panel5_2_1.add(pullupLabel2);
		panel5_2_1.add(pullupLabel3);
		panel5_2_1.add(pullupLabel4);
		
		// ���� 1,2,3,4
		pullupLabel.setBounds(40, 180, 120, 120);
		
		pullupLabel1.setBounds(200, 180, 400, 20);
		pullupLabel1.setForeground(Color.red);
		
		pullupLabel2.setBounds(200, 210, 400, 20);
		pullupLabel2.setForeground(Color.white);
		
		pullupLabel3.setBounds(200, 240, 400, 20);
		pullupLabel3.setForeground(Color.white);
		
		pullupLabel4.setBounds(200, 270, 400, 20);
		pullupLabel4.setForeground(Color.white);
		
		//ģ��
		panel5_2_2.setOpaque(true);
		panel5_2_2.setBackground(Color.black);
		panel5_2_2.setLayout(null);
		
		panel5_2_2.add(chinupLabel);
		panel5_2_2.add(chinupLabel1);
		panel5_2_2.add(chinupLabel2);
		panel5_2_2.add(chinupLabel3);
		panel5_2_2.add(chinupLabel4);
		
		// ���� 1,2,3,4
		chinupLabel.setBounds(40, 40, 120, 120);
		
		chinupLabel1.setBounds(200, 40, 400, 20);
		chinupLabel1.setForeground(Color.red);
		
		chinupLabel2.setBounds(200, 70, 400, 20);
		chinupLabel2.setForeground(Color.white);
		
		chinupLabel3.setBounds(200, 100, 400, 20);
		chinupLabel3.setForeground(Color.white);
		
		chinupLabel4.setBounds(200, 130, 400, 20);
		chinupLabel4.setForeground(Color.white);

		
		//���帮��Ʈ
		panel5_2_2.setOpaque(true);
		panel5_2_2.setBackground(Color.black);
		panel5_2_2.setLayout(null);
		
		panel5_2_2.add(deadliftLabel);
		panel5_2_2.add(deadliftLabel1);
		panel5_2_2.add(deadliftLabel2);
		panel5_2_2.add(deadliftLabel3);
		panel5_2_2.add(deadliftLabel4);
		
		// ���� 1,2,3,4
		deadliftLabel.setBounds(40, 180, 120, 120);
		
		deadliftLabel1.setBounds(200, 180, 400, 20);
		deadliftLabel1.setForeground(Color.red);
		
		deadliftLabel2.setBounds(200, 210, 400, 20);
		deadliftLabel2.setForeground(Color.white);
		
		deadliftLabel3.setBounds(200, 240, 400, 20);
		deadliftLabel3.setForeground(Color.white);
		
		deadliftLabel4.setBounds(200, 270, 400, 20);
		deadliftLabel4.setForeground(Color.white);
		
		//�ٺ��ο�
		panel5_2_3.setOpaque(true);
		panel5_2_3.setBackground(Color.black);
		panel5_2_3.setLayout(null);
		
		panel5_2_3.add(barbelllowLabel);
		panel5_2_3.add(barbelllowLabel1);
		panel5_2_3.add(barbelllowLabel2);
		panel5_2_3.add(barbelllowLabel3);
		panel5_2_3.add(barbelllowLabel4);
		
		// ���� 1,2,3,4
		barbelllowLabel.setBounds(40, 40, 120, 120);
		
		barbelllowLabel1.setBounds(200, 40, 400, 20);
		barbelllowLabel1.setForeground(Color.red);
		
		barbelllowLabel2.setBounds(200, 70, 400, 20);
		barbelllowLabel2.setForeground(Color.white);
		
		barbelllowLabel3.setBounds(200, 100, 400, 20);
		barbelllowLabel3.setForeground(Color.white);
		
		barbelllowLabel4.setBounds(200, 130, 400, 20);
		barbelllowLabel4.setForeground(Color.white);
		
		//�����ο�
		panel5_2_3.setOpaque(true);
		panel5_2_3.setBackground(Color.black);
		panel5_2_3.setLayout(null);
		
		panel5_2_3.add(dumbelllowLabel);
		panel5_2_3.add(dumbelllowLabel1);
		panel5_2_3.add(dumbelllowLabel2);
		panel5_2_3.add(dumbelllowLabel3);
		panel5_2_3.add(dumbelllowLabel4);
		
		// ���� 1,2,3,4
		dumbelllowLabel.setBounds(40, 180, 120, 120);
		
		dumbelllowLabel1.setBounds(200, 180, 400, 20);
		dumbelllowLabel1.setForeground(Color.red);
		
		dumbelllowLabel2.setBounds(200, 210, 400, 20);
		dumbelllowLabel2.setForeground(Color.white);
		
		dumbelllowLabel3.setBounds(200, 240, 400, 20);
		dumbelllowLabel3.setForeground(Color.white);
		
		dumbelllowLabel4.setBounds(200, 270, 400, 20);
		dumbelllowLabel4.setForeground(Color.white);
		
		
		
		nomalbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel5_2.setVisible(false);
				panel5_2_2.setVisible(false);
				panel5_2_3.setVisible(false);
				panel5.add(panel5_2_1, BorderLayout.CENTER);
				panel5_2_1.setVisible(true);
			}
		});
		hardButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel5_2.setVisible(false);
				panel5_2_1.setVisible(false);
				panel5_2_3.setVisible(false);
				panel5.add(panel5_2_2, BorderLayout.CENTER);
				panel5_2_2.setVisible(true);
			}
		});
		sohardButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel5_2.setVisible(false);
				panel5_2_1.setVisible(false);
				panel5_2_2.setVisible(false);
				panel5.add(panel5_2_3, BorderLayout.CENTER);
				panel5_2_3.setVisible(true);
			}
		});

	}

	void panel6Ex() {
//		panel6_1.removeAll();
		panel6.setVisible(true);
		panel6_1.setVisible(true);
		panel6_2.setVisible(true);
		panel3.setVisible(false);
		panel4.setVisible(false);
		panel5.setVisible(false);
		panel7.setVisible(false);
		
		panel6_2_1.setLayout(null);
		panel6_2_1.setOpaque(true);
		panel6_2_1.setBackground(Color.black);
		panel6_2_2.setLayout(null);
		panel6_2_2.setOpaque(true);
		panel6_2_2.setBackground(Color.black);
		panel6_2_3.setLayout(null);
		panel6_2_3.setOpaque(true);
		panel6_2_3.setBackground(Color.black);

		panel6.setLayout(new BorderLayout());
		panel6.setBounds(282, 151, 849, 520);
		panel6.setOpaque(true);
		panel6.setBackground(Color.black);
		
		panel6_1.setLayout(new FlowLayout());
		panel6_1.setOpaque(true);
		panel6_1.setBackground(Color.black);
		
		nomalbutton.setBackground(Color.WHITE);
		panel6_1.add(nomalbutton);
		
		hardButton.setBackground(Color.GREEN);
		panel6_1.add(hardButton);
		
		sohardButton.setBackground(Color.RED);
		panel6_1.add(sohardButton);

		panel6_2.setOpaque(true);
		panel6_2.setBackground(Color.black);
		panel6_2.add(lowerLabel);
		image1.add(panel6);
		
		panel6_2.add(panel6_2_1);
		panel6_2.add(panel6_2_2);
		panel6_2.add(panel6_2_3);
		
		//����
		panel6_2_1.add(rungeLabel);
		rungeLabel.setBounds(40, 40, 120, 120);
		
		//��� ü��Ʈ ���� 1,2,3,4
		panel6_2_1.add(rungeLabel1);
		panel6_2_1.add(rungeLabel2);
		panel6_2_1.add(rungeLabel3);
		panel6_2_1.add(rungeLabel4);
		
		rungeLabel1.setForeground(Color.red);
		rungeLabel1.setBounds(200, 40, 400, 20);
		
		rungeLabel2.setForeground(Color.white);
		rungeLabel2.setBounds(200, 70, 400, 20);
		
		rungeLabel3.setForeground(Color.white);
		rungeLabel3.setBounds(200, 100, 400, 20);
		
		rungeLabel4.setForeground(Color.white);
		rungeLabel4.setBounds(200, 130, 400, 20);
		
		//���� �ͽ��ټ�
		panel6_2_1.add(legextentionLabel);
		legextentionLabel.setBounds(40, 180, 120, 120);
		
		//��� ü��Ʈ ���� 1,2,3,4
		panel6_2_1.add(legextentionLabel1);
		panel6_2_1.add(legextentionLabel2);
		panel6_2_1.add(legextentionLabel3);
		panel6_2_1.add(legextentionLabel4);
		
		legextentionLabel1.setForeground(Color.red);
		legextentionLabel1.setBounds(200, 180, 400, 20);
		
		legextentionLabel2.setForeground(Color.white);
		legextentionLabel2.setBounds(200, 210, 400, 20);
		
		legextentionLabel3.setForeground(Color.white);
		legextentionLabel3.setBounds(200, 240, 400, 20);
		
		legextentionLabel4.setForeground(Color.white);
		legextentionLabel4.setBounds(200, 270, 400, 20);
		
		//��������Ʈ
		panel6_2_1.add(hipthrustLabel);
		hipthrustLabel.setBounds(40, 320, 120, 120);
		
		//��� ü��Ʈ ���� 1,2,3,4
		panel6_2_1.add(hipthrustLabel1);
		panel6_2_1.add(hipthrustLabel2);
		panel6_2_1.add(hipthrustLabel3);
		panel6_2_1.add(hipthrustLabel4);
		
		hipthrustLabel1.setForeground(Color.red);
		hipthrustLabel1.setBounds(200, 320, 400, 20);
		
		hipthrustLabel2.setForeground(Color.white);
		hipthrustLabel2.setBounds(200, 350, 400, 20);
		
		hipthrustLabel3.setForeground(Color.white);
		hipthrustLabel3.setBounds(200, 380, 400, 20);
		
		hipthrustLabel4.setForeground(Color.white);
		hipthrustLabel4.setBounds(200, 410, 400, 20);
		
		
		//����Ʈ
		panel6_2_2.add(squatLabel);
		squatLabel.setBounds(40, 40, 120, 120);
		
		//��� ü��Ʈ ���� 1,2,3,4
		panel6_2_2.add(squatLabel1);
		panel6_2_2.add(squatLabel2);
		panel6_2_2.add(squatLabel3);
		panel6_2_2.add(squatLabel4);
		
		squatLabel1.setForeground(Color.red);
		squatLabel1.setBounds(200, 40, 400, 20);
		
		squatLabel2.setForeground(Color.white);
		squatLabel2.setBounds(200, 70, 400, 20);
		
		squatLabel3.setForeground(Color.white);
		squatLabel3.setBounds(200, 100, 400, 20);
		
		squatLabel4.setForeground(Color.white);
		squatLabel4.setBounds(200, 130, 400, 20);
		
		//���� �ͽ��ټ�
		panel6_2_2.add(powerlegpressLabel);
		powerlegpressLabel.setBounds(40, 180, 120, 120);
		
		//��� ü��Ʈ ���� 1,2,3,4
		panel6_2_2.add(powerlegpressLabel1);
		panel6_2_2.add(powerlegpressLabel2);
		panel6_2_2.add(powerlegpressLabel3);
		panel6_2_2.add(powerlegpressLabel4);
		
		powerlegpressLabel1.setForeground(Color.red);
		powerlegpressLabel1.setBounds(200, 180, 400, 20);
		
		powerlegpressLabel2.setForeground(Color.white);
		powerlegpressLabel2.setBounds(200, 210, 400, 20);
		
		powerlegpressLabel3.setForeground(Color.white);
		powerlegpressLabel3.setBounds(200, 240, 400, 20);
		
		powerlegpressLabel4.setForeground(Color.white);
		powerlegpressLabel4.setBounds(200, 270, 400, 20);
		
		//�ٺ�����
		panel6_2_3.add(barbellrungeLabel);
		barbellrungeLabel.setBounds(40, 40, 120, 120);
		
		//��� ü��Ʈ ���� 1,2,3,4
		panel6_2_3.add(barbellrungeLabel1);
		panel6_2_3.add(barbellrungeLabel2);
		panel6_2_3.add(barbellrungeLabel3);
		panel6_2_3.add(barbellrungeLabel4);
		
		barbellrungeLabel1.setForeground(Color.red);
		barbellrungeLabel1.setBounds(200, 40, 400, 20);
		
		barbellrungeLabel2.setForeground(Color.white);
		barbellrungeLabel2.setBounds(200, 70, 400, 20);
		
		barbellrungeLabel3.setForeground(Color.white);
		barbellrungeLabel3.setBounds(200, 100, 400, 20);
		
		barbellrungeLabel4.setForeground(Color.white);
		barbellrungeLabel4.setBounds(200, 130, 400, 20);
		
		//���� �ͽ��ټ�
		panel6_2_3.add(splitsquatLabel);
		splitsquatLabel.setBounds(40, 180, 120, 120);
		
		//��� ü��Ʈ ���� 1,2,3,4
		panel6_2_3.add(splitsquatLabel1);
		panel6_2_3.add(splitsquatLabel2);
		panel6_2_3.add(splitsquatLabel3);
		panel6_2_3.add(splitsquatLabel4);
		
		splitsquatLabel1.setForeground(Color.red);
		splitsquatLabel1.setBounds(200, 180, 400, 20);
		
		splitsquatLabel2.setForeground(Color.white);
		splitsquatLabel2.setBounds(200, 210, 400, 20);
		
		splitsquatLabel3.setForeground(Color.white);
		splitsquatLabel3.setBounds(200, 240, 400, 20);
		
		splitsquatLabel4.setForeground(Color.white);
		splitsquatLabel4.setBounds(200, 270, 400, 20);
		
		


		nomalbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel6_2.setVisible(false);
				panel6_2_2.setVisible(false);
				panel6_2_3.setVisible(false);
				panel6.add(panel6_2_1, BorderLayout.CENTER);
				panel6_2_1.setVisible(true);
			}
		});
		hardButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel6_2.setVisible(false);
				panel6_2_1.setVisible(false);
				panel6_2_3.setVisible(false);
				panel6.add(panel6_2_2, BorderLayout.CENTER);
				panel6_2_2.setVisible(true);
			}
		});
		sohardButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel6_2.setVisible(false);
				panel6_2_1.setVisible(false);
				panel6_2_2.setVisible(false);
				panel6.add(panel6_2_3, BorderLayout.CENTER);
				panel6_2_3.setVisible(true);
			}
		});

		panel6.add(panel6_1, BorderLayout.NORTH);
		panel6.add(panel6_2, BorderLayout.CENTER);

	}

	void panel7Ex() {
		panel7_1.removeAll();
		panel7.setVisible(true);
		panel3.setVisible(false);
		panel4.setVisible(false);
		panel5.setVisible(false);
		panel6.setVisible(false);

		panel7.setLayout(new BorderLayout());
		panel7.setBounds(282, 151, 849, 520);
		panel7.setOpaque(true);
		panel7.setBackground(Color.black);

		panel7_1.setLayout(new FlowLayout());
		panel7_1.setOpaque(true);
		panel7_1.setBackground(Color.black);

		panel7_2.setLayout(null);
		panel7_2.setOpaque(true);
		panel7_2.setBackground(Color.black);

		image1.add(panel7);

		nomalbutton.setBackground(Color.WHITE);
		panel7_1.add(nomalbutton);

		hardButton.setBackground(Color.GREEN);
		panel7_1.add(hardButton);

		sohardButton.setBackground(Color.RED);
		panel7_1.add(sohardButton);
		//����
		panel7_2.add(runningLabel);
		runningLabel.setBounds(40, 40, 120, 120);
		
		panel7_2.add(runningLabel1);
		panel7_2.add(runningLabel2);
		panel7_2.add(runningLabel3);
		panel7_2.add(runningLabel4);
		
		runningLabel1.setForeground(Color.red);
		runningLabel1.setBounds(200, 40, 400, 20);
		
		runningLabel2.setForeground(Color.white);
		runningLabel2.setBounds(200, 70, 400, 20);
		
		runningLabel3.setForeground(Color.white);
		runningLabel3.setBounds(200, 100, 400, 20);
		
		runningLabel4.setForeground(Color.white);
		runningLabel4.setBounds(200, 130, 400, 20);
		
		//����Ŭ
		panel7_2.add(cycleLabel);
		cycleLabel.setBounds(40, 180, 120, 120);
		
		panel7_2.add(cycleLabel1);
		panel7_2.add(cycleLabel2);
		panel7_2.add(cycleLabel3);
		panel7_2.add(cycleLabel4);
		
		cycleLabel1.setForeground(Color.red);
		cycleLabel1.setBounds(200, 180, 400, 20);
		
		cycleLabel2.setForeground(Color.white);
		cycleLabel2.setBounds(200, 210, 400, 20);
		
		cycleLabel3.setForeground(Color.white);
		cycleLabel3.setBounds(200, 240, 400, 20);
		
		cycleLabel4.setForeground(Color.white);
		cycleLabel4.setBounds(200, 270, 400, 20);
		
		//����
		panel7_2.add(burpyLabel);
		burpyLabel.setBounds(40, 320, 120, 120);
		
		panel7_2.add(burpyLabel1);
		panel7_2.add(burpyLabel2);
		panel7_2.add(burpyLabel3);
		panel7_2.add(burpyLabel4);
		
		burpyLabel1.setForeground(Color.red);
		burpyLabel1.setBounds(200, 320, 400, 20);
		
		burpyLabel2.setForeground(Color.white);
		burpyLabel2.setBounds(200, 350, 400, 20);
		
		burpyLabel3.setForeground(Color.white);
		burpyLabel3.setBounds(200, 380, 400, 20);
		
		burpyLabel4.setForeground(Color.white);
		burpyLabel4.setBounds(200, 410, 400, 20);

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
