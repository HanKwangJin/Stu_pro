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
	//첫번쨰
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

	// 가슴
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

	// 등

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

	// 하체
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
	
	
	
	
	// 푸쉬업
	JLabel pushupLabel = new JLabel(pushup);

	JLabel pushupLabel1_1 = new JLabel("▶푸쉬업");
	JLabel pushupLabel1_2 = new JLabel("→ 엎드린 자세로 머리부터 발끝까지 일직선을 만든다.");
	JLabel pushupLabel1_3 = new JLabel("→ 내려갈때 팔꿈치는 광배근 쪽에 가깝게 위치 시킨다.");
	JLabel pushupLabel1_4 = new JLabel("→ 내려갈때와 올라올때 속도감을 늦추면서 관절이 다치는걸 예방한다.");

	// 해머 체스트
	JLabel hammerLabel = new JLabel(hammer);
	JLabel hammerLabel1_1 = new JLabel("▶해머 스트렝스 체스트 머신");
	JLabel hammerLabel1_2 = new JLabel("→ 머신에 앉은뒤 바를 잡고 후인 하강 후 호흡을 잡는다.");
	JLabel hammerLabel1_3 = new JLabel("→ 후인 하강을 유지한체 대흉근을 느끼며 푸쉬해준다.");
	JLabel hammerLabel1_4 = new JLabel("→ 팔꿈치가 너무 뒤로 가지 않게 주의 해준다.");

	// 체스트 프레스
	JLabel chestPressLabel = new JLabel(chestPress);
	JLabel chestPressLabel1_1 = new JLabel("▶체스트 프레스");
	JLabel chestPressLabel1_2 = new JLabel("→ 머신에 앉은뒤 바를 잡고 후인 하강 후 호흡을 잡는다.");
	JLabel chestPressLabel1_3 = new JLabel("→ 후인 하강을 유지한체 대흉근을 느끼며 푸쉬해준다.");
	JLabel chestPressLabel1_4 = new JLabel("→ 팔꿈치가 어깨 아래에서 움직이고 자극을 많이 가져가도록 한다.");

	// 딥스
	JLabel dipsLabel = new JLabel(dips);
	JLabel dipsLabel1 = new JLabel("▶딥스");
	JLabel dipsLabel2 = new JLabel("→ 바에 올라간 다음 시선을 45도정도 아래를 본다.");
	JLabel dipsLabel3 = new JLabel("→ 내려가면서 팔꿈치를 90도 이상 굽히지 않는다.");
	JLabel dipsLabel4 = new JLabel("→ 올라오면서 어깨에 부담이 가지 않게 대흉근에 자극을 느낀다.");

	// 벤치프레스
	JLabel benchPressLabel = new JLabel(benchPress);
	JLabel benchPressLabel1 = new JLabel("▶벤치 프레스");
	JLabel benchPressLabel2 = new JLabel("→ 플랫 벤치에 누운뒤 후인하강후 허리에 아치를 준다.");
	JLabel benchPressLabel3 = new JLabel("→ 호흡을 잡고 바벨을 들어서 내릴때 팔꿈지는 바닥에 수직을 향하도록 한다.");
	JLabel benchPressLabel4 = new JLabel("→ 바벨은 가슴으로 떨어지고 올릴때 후인하강이 풀리지 않을 정도만 올려준다.");

	// 로우 케이블 플라이
	JLabel lowCableFlyLabel = new JLabel(lowcableFly);
	JLabel lowCableFlyLabel1 = new JLabel("▶로우 케이블 플라이");
	JLabel lowCableFlyLabel2 = new JLabel("→ 케이블을 가장 아래로 위치시켜준다음 후인하강을 잡는다.");
	JLabel lowCableFlyLabel3 = new JLabel("→ 케이블을 당겨 대흉근을 짜준다.");
	JLabel lowCableFlyLabel4 = new JLabel("→ 케이블을 놓을대 속도를 느리게 가져가며 자극을 느낀다.");

	// 인클라인덤벨프레스
	JLabel inclinedumbellLabel = new JLabel(inclinedumbell);
	JLabel inclinedumbellLabel1 = new JLabel("▶인클라인 덤벨 프레스");
	JLabel inclinedumbellLabel2 = new JLabel("→ 벤치의 각도를 자신에 맞게 높여준다음 앉아서 후인하강을 잡아준다.");
	JLabel inclinedumbellLabel3 = new JLabel("→ 덤벨을 자신에게 맞는 무게를 들어준다음 운동을 가져간다.");
//	JLabel inclinedumbellLabel4 = new JLabel("→ 팔꿈치가 어깨 아래에서 움직이고 자극을 많이 가져가도록 한다.");

	// 인클라인 덤벨 플라이
	JLabel inclineFlyLabel = new JLabel(inclineFly);
	JLabel inclineFlyLabel1 = new JLabel("▶인클라인 덤벨 플라이");
	JLabel inclineFlyLabel2 = new JLabel("→ 벤치 각도를 자신에게 맞게 조정후 앉아서 후인하강, 호흡을 잡는다.");
	JLabel inclineFlyLabel3 = new JLabel("→ 덤벨은 팔꿈치를 최대한 안굽힐수 있는 무게를 가져온다.");
	JLabel inclineFlyLabel4 = new JLabel("→ 그 후 플라이를 실행해준다.");

	//등
	//바벨로우
	JLabel barbelllowLabel = new JLabel(barbellLow);
	JLabel barbelllowLabel1 = new JLabel("▶바벨로우");
	JLabel barbelllowLabel2 = new JLabel("→ 발을 어깨 넓이로 벌린후 서서 바벨을 들고 허리를 45도로 숙인다.");
	JLabel barbelllowLabel3 = new JLabel("→ 복압을 준다음 바벨을 배꼽 방향으로 수직으로 가동을 가져간다.");
	JLabel barbelllowLabel4 = new JLabel("→ 부상을 조심하여 속도를 천천히 가져간다.");

	//친업
	JLabel chinupLabel = new JLabel(chinUp);
	JLabel chinupLabel1 = new JLabel("▶친업");
	JLabel chinupLabel2 = new JLabel("→ 풀업과 같은 자세지만 그립은 언더로 잡아준다.");
	JLabel chinupLabel3 = new JLabel("→ 후인하강후 어깨에 무리가 안가게 운동을 해준다.");
	JLabel chinupLabel4 = new JLabel("→ 광배근 하부쪽에 자극을 느껴주며 천천히 운동을 한다.");

	
	//덤벨로우
	JLabel dumbelllowLabel = new JLabel(dumbelllow);
	JLabel dumbelllowLabel1 = new JLabel("▶덤벨로우");
	JLabel dumbelllowLabel2 = new JLabel("→ 바벨로우와 다르게 가동범위를 많이 가져갈수 있다.");
	JLabel dumbelllowLabel3 = new JLabel("→ 자신에게 맞는 덤벨을 고른 다음 벤치에 손을 가져가서 허리를 지탱한다.");
	JLabel dumbelllowLabel4 = new JLabel("→ 후인하강후 광배근에 자극을 가져간다.");

	
	//로우풀
	JLabel lowpullLabel = new JLabel(lowpull);
	JLabel lowpullLabel1 = new JLabel("▶로우 풀");
	JLabel lowpullLabel2 = new JLabel("→ 머신에 앉은뒤 원하는 부위에 맞는 손잡이를 잡는다.");
	JLabel lowpullLabel3 = new JLabel("→ 가슴을 내밀고 복압을 잡은뒤 허리를 조금 움직이며 가동 범위를 넓힌다.");
	JLabel lowpullLabel4 = new JLabel("→ 광배근에 자극을 느끼며 천천히 운동한다.");

	//풀업
	JLabel pullupLabel = new JLabel(pullup);
	JLabel pullupLabel1 = new JLabel("▶풀업");
	JLabel pullupLabel2 = new JLabel("→ 후인하강후 어깨에 무리가 안가도록 한다.");
	JLabel pullupLabel3 = new JLabel("→ 운동을 할수 없거나 어깨에 무리가 갈경우 밴드를 사용한다.");
	JLabel pullupLabel4 = new JLabel("→ 명치 쪽이 아닌 가슴이 올라가도록 운동한다.");

	
	//데드리프트
	JLabel deadliftLabel = new JLabel(deadlift);
	JLabel deadliftLabel1 = new JLabel("▶데드리프트");
	JLabel deadliftLabel2 = new JLabel("→ 가슴을 열고 복압을 가져간 다음 바를 들어준다.");
	JLabel deadliftLabel3 = new JLabel("→ 내려갈때 숨을 참고 바를 몸과 가까이 위치시켜준다.");
	JLabel deadliftLabel4 = new JLabel("→ 허리가 아플경우 무게를 가볍게 해서 자세를 고친다.");
	
	//하체
	//바벨런지
	JLabel barbellrungeLabel = new JLabel(barbellrunge);
	JLabel barbellrungeLabel1 = new JLabel("▶바벨 런지");
	JLabel barbellrungeLabel2 = new JLabel("→ 가슴을 열고 복압을 가져간 다음 바를 들어준다.");
	JLabel barbellrungeLabel3 = new JLabel("→ 내려갈때 숨을 참고 바를 몸과 가까이 위치시켜준다.");
	JLabel barbellrungeLabel4 = new JLabel("→ 허리가 아플경우 무게를 가볍게 해서 자세를 고친다.");
	
	//힙스러스트
	JLabel hipthrustLabel = new JLabel(hipthrust);
	JLabel hipthrustLabel1 = new JLabel("▶힙 쓰러스트");
	JLabel hipthrustLabel2 = new JLabel("→ 가슴을 열고 복압을 가져간 다음 바를 들어준다.");
	JLabel hipthrustLabel3 = new JLabel("→ 내려갈때 숨을 참고 바를 몸과 가까이 위치시켜준다.");
	JLabel hipthrustLabel4 = new JLabel("→ 허리가 아플경우 무게를 가볍게 해서 자세를 고친다.");
	
	//레그익스텐션
	JLabel legextentionLabel = new JLabel(legextention);
	JLabel legextentionLabel1 = new JLabel("▶레그 익스텐션");
	JLabel legextentionLabel2 = new JLabel("→ 가슴을 열고 복압을 가져간 다음 바를 들어준다.");
	JLabel legextentionLabel3 = new JLabel("→ 내려갈때 숨을 참고 바를 몸과 가까이 위치시켜준다.");
	JLabel legextentionLabel4 = new JLabel("→ 허리가 아플경우 무게를 가볍게 해서 자세를 고친다.");
	
	//파워 레그프레스
	JLabel powerlegpressLabel = new JLabel(powerlegpress);
	JLabel powerlegpressLabel1 = new JLabel("▶파워 레그 프레스");
	JLabel powerlegpressLabel2 = new JLabel("→ 가슴을 열고 복압을 가져간 다음 바를 들어준다.");
	JLabel powerlegpressLabel3 = new JLabel("→ 내려갈때 숨을 참고 바를 몸과 가까이 위치시켜준다.");
	JLabel powerlegpressLabel4 = new JLabel("→ 허리가 아플경우 무게를 가볍게 해서 자세를 고친다.");
	
	//런지
	JLabel rungeLabel = new JLabel(runge);
	JLabel rungeLabel1 = new JLabel("▶런지");
	JLabel rungeLabel2 = new JLabel("→ 가슴을 열고 복압을 가져간 다음 바를 들어준다.");
	JLabel rungeLabel3 = new JLabel("→ 내려갈때 숨을 참고 바를 몸과 가까이 위치시켜준다.");
	JLabel rungeLabel4 = new JLabel("→ 허리가 아플경우 무게를 가볍게 해서 자세를 고친다.");
	
	//스플릿 런지
	JLabel splitsquatLabel = new JLabel(splitsquat);
	JLabel splitsquatLabel1 = new JLabel("▶스플릿 런지");
	JLabel splitsquatLabel2 = new JLabel("→ 가슴을 열고 복압을 가져간 다음 바를 들어준다.");
	JLabel splitsquatLabel3 = new JLabel("→ 내려갈때 숨을 참고 바를 몸과 가까이 위치시켜준다.");
	JLabel splitsquatLabel4 = new JLabel("→ 허리가 아플경우 무게를 가볍게 해서 자세를 고친다.");
	
	//스쿼트
	JLabel squatLabel = new JLabel(squat);
	JLabel squatLabel1 = new JLabel("▶스쿼트");
	JLabel squatLabel2 = new JLabel("→ 가슴을 열고 철추정렬뒤 복압을 잡고 바를 승모근에 걸어준다.");
	JLabel squatLabel3 = new JLabel("→ 내려갈때 숨을 참고 바를 몸과 가까이 위치시켜준다.");
	JLabel squatLabel4 = new JLabel("→ 허리가 아플경우 무게를 가볍게 해서 자세를 고친다.");
	//런닝
	JLabel runningLabel = new JLabel(running);
	JLabel runningLabel1 = new JLabel("▶런닝");
	JLabel runningLabel2 = new JLabel("→ 냅다 달린다.");
	JLabel runningLabel3 = new JLabel("→ 뒤꿈치가 안닿도록 해주는게 좋다.");
	JLabel runningLabel4 = new JLabel("→ 숨은 최대한 리듬감 있게 코로 호흡을 해준다.");
	//사이클
	JLabel cycleLabel = new JLabel(cycle);
	JLabel cycleLabel1 = new JLabel("▶사이클");
	JLabel cycleLabel2 = new JLabel("→ 냅다 밟는다.");
	JLabel cycleLabel3 = new JLabel("→ 심박수가 140이상 올라가야 지방이 타기 시작 하기 떄문에 멈추지 않는다.");
	JLabel cycleLabel4 = new JLabel("→ 허벅지가 타들어가는 느낌을 가져간다.");
	//버피테스트
	JLabel burpyLabel = new JLabel(burpy);
	JLabel burpyLabel1 = new JLabel("▶버피 테스트");
	JLabel burpyLabel2 = new JLabel("→ 서있는 자세에서 쭈그려 앉는다.");
	JLabel burpyLabel3 = new JLabel("→ 점프와 동시에 엎드려 뻗쳐 자세를 한다.");
	JLabel burpyLabel4 = new JLabel("→ 엎드려 뻗쳐 자세에서 일어나며 만세후 점프를 한다.");

	
	
	// 난이도 사진들
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

	// 운동할 부위 사진들
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

	// 난이도 버튼
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
	Font font = new Font("맑은 고딕", 0, 30);

	public ProjectEx() {
		frame.setTitle("철든남자");
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

	// 두 번째 프레임
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
		panel4.setLayout(new BorderLayout());
		panel4.setBounds(282, 151, 849, 520);
		panel4.setOpaque(true);
		panel4.setBackground(Color.black);
		image1.add(panel4);

		panel4.add(panel4_1, BorderLayout.NORTH);
		panel4.add(panel4_2, BorderLayout.CENTER);

		// 중,상,최상 버튼
		panel4_1.setLayout(new FlowLayout());
		panel4_1.setOpaque(true);
		panel4_1.setBackground(Color.black);

		nomalbutton.setBackground(Color.WHITE);
		panel4_1.add(nomalbutton);

		hardButton.setBackground(Color.GREEN);
		panel4_1.add(hardButton);

		sohardButton.setBackground(Color.RED);
		panel4_1.add(sohardButton);

		// 가슴 중,상,최상
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

		// panel4_2_1 안의 내용
		// 가슴 운동 중
		panel4_2_1.setOpaque(true);
		panel4_2_1.setBackground(Color.black);
		panel4_2_1.setLayout(null);

		// 레이블 푸쉬업
		panel4_2_1.add(pushupLabel);
		panel4_2_1.add(pushupLabel1_1);
		panel4_2_1.add(pushupLabel1_2);
		panel4_2_1.add(pushupLabel1_3);
		panel4_2_1.add(pushupLabel1_4);

		// 설명 1,2,3,4
		pushupLabel.setBounds(40, 40, 120, 120);

		pushupLabel1_1.setBounds(200, 40, 400, 20);
		pushupLabel1_1.setForeground(Color.red);

		pushupLabel1_2.setBounds(200, 70, 400, 20);
		pushupLabel1_2.setForeground(Color.white);

		pushupLabel1_3.setBounds(200, 100, 400, 20);
		pushupLabel1_3.setForeground(Color.white);

		pushupLabel1_4.setBounds(200, 130, 400, 20);
		pushupLabel1_4.setForeground(Color.white);

		// 레이블 해머체스트

		panel4_2_1.add(hammerLabel);
		hammerLabel.setBounds(40, 180, 120, 120);

		// 헤머 체스트 설명 1,2,3,4
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

		// 레이블 체스트 프레스
		panel4_2_1.add(chestPressLabel);
		chestPressLabel.setBounds(40, 320, 120, 120);

		// 체스트 프레스 설명 1,2,3,4
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

		// 가슴 운동 상
		panel4_2_2.setOpaque(true);
		panel4_2_2.setBackground(Color.black);
		panel4_2_2.setLayout(null);

		// 벤치 프레스
		panel4_2_2.add(benchPressLabel);
		panel4_2_2.add(benchPressLabel1);
		panel4_2_2.add(benchPressLabel2);
		panel4_2_2.add(benchPressLabel3);
		panel4_2_2.add(benchPressLabel4);

		// 설명 1,2,3,4
		benchPressLabel.setBounds(40, 40, 120, 120);

		benchPressLabel1.setBounds(200, 40, 400, 20);
		benchPressLabel1.setForeground(Color.red);

		benchPressLabel2.setBounds(200, 70, 400, 20);
		benchPressLabel2.setForeground(Color.white);

		benchPressLabel3.setBounds(200, 100, 400, 20);
		benchPressLabel3.setForeground(Color.white);

		benchPressLabel4.setBounds(200, 130, 400, 20);
		benchPressLabel4.setForeground(Color.white);

		// 딥스

		panel4_2_2.add(dipsLabel);
		dipsLabel.setBounds(40, 180, 120, 120);

		// 딥스 설명 1,2,3,4
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

		// 레이블 체스트 프레스
		panel4_2_2.add(lowCableFlyLabel);
		lowCableFlyLabel.setBounds(40, 320, 120, 120);

		// 체스트 프레스 설명 1,2,3,4
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

		// 가슴 운동 최상
		panel4_2_3.setOpaque(true);
		panel4_2_3.setBackground(Color.black);
		panel4_2_3.setLayout(null);

		// 벤치 프레스
		panel4_2_3.add(inclinedumbellLabel);
		inclinedumbellLabel.setBounds(40, 40, 120, 120);

		panel4_2_3.add(inclinedumbellLabel1);
		panel4_2_3.add(inclinedumbellLabel2);
		panel4_2_3.add(inclinedumbellLabel3);
//		panel4_2_3.add(inclinedumbellLabel4);

		// 설명 1,2,3,4

		inclinedumbellLabel1.setBounds(200, 40, 400, 20);
		inclinedumbellLabel1.setForeground(Color.red);

		inclinedumbellLabel2.setBounds(200, 70, 400, 20);
		inclinedumbellLabel2.setForeground(Color.white);

		inclinedumbellLabel3.setBounds(200, 100, 400, 20);
		inclinedumbellLabel3.setForeground(Color.white);

		// 딥스

		panel4_2_3.add(inclineFlyLabel);
		inclineFlyLabel.setBounds(40, 180, 120, 120);

		// 딥스 설명 1,2,3,4
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

		// 레이블 체스트 프레스
//		panel4_2_3.add(lowCableFlyLabel);
//		chestPressLabel.setBounds(40, 320, 120, 120);
//		
//		//체스트 프레스 설명 1,2,3,4
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
		
		//로우풀
		panel5_2_1.setOpaque(true);
		panel5_2_1.setBackground(Color.black);
		panel5_2_1.setLayout(null);

		panel5_2_1.add(lowpullLabel);
		panel5_2_1.add(lowpullLabel1);
		panel5_2_1.add(lowpullLabel2);
		panel5_2_1.add(lowpullLabel3);
		panel5_2_1.add(lowpullLabel4);

		// 설명 1,2,3,4
		lowpullLabel.setBounds(40, 40, 120, 120);

		lowpullLabel1.setBounds(200, 40, 400, 20);
		lowpullLabel1.setForeground(Color.red);

		lowpullLabel2.setBounds(200, 70, 400, 20);
		lowpullLabel2.setForeground(Color.white);

		lowpullLabel3.setBounds(200, 100, 400, 20);
		lowpullLabel3.setForeground(Color.white);

		lowpullLabel4.setBounds(200, 130, 400, 20);
		lowpullLabel4.setForeground(Color.white);
		
		//풀업
		panel5_2_1.setOpaque(true);
		panel5_2_1.setBackground(Color.black);
		panel5_2_1.setLayout(null);
		
		panel5_2_1.add(pullupLabel);
		panel5_2_1.add(pullupLabel1);
		panel5_2_1.add(pullupLabel2);
		panel5_2_1.add(pullupLabel3);
		panel5_2_1.add(pullupLabel4);
		
		// 설명 1,2,3,4
		pullupLabel.setBounds(40, 180, 120, 120);
		
		pullupLabel1.setBounds(200, 180, 400, 20);
		pullupLabel1.setForeground(Color.red);
		
		pullupLabel2.setBounds(200, 210, 400, 20);
		pullupLabel2.setForeground(Color.white);
		
		pullupLabel3.setBounds(200, 240, 400, 20);
		pullupLabel3.setForeground(Color.white);
		
		pullupLabel4.setBounds(200, 270, 400, 20);
		pullupLabel4.setForeground(Color.white);
		
		//친업
		panel5_2_2.setOpaque(true);
		panel5_2_2.setBackground(Color.black);
		panel5_2_2.setLayout(null);
		
		panel5_2_2.add(chinupLabel);
		panel5_2_2.add(chinupLabel1);
		panel5_2_2.add(chinupLabel2);
		panel5_2_2.add(chinupLabel3);
		panel5_2_2.add(chinupLabel4);
		
		// 설명 1,2,3,4
		chinupLabel.setBounds(40, 40, 120, 120);
		
		chinupLabel1.setBounds(200, 40, 400, 20);
		chinupLabel1.setForeground(Color.red);
		
		chinupLabel2.setBounds(200, 70, 400, 20);
		chinupLabel2.setForeground(Color.white);
		
		chinupLabel3.setBounds(200, 100, 400, 20);
		chinupLabel3.setForeground(Color.white);
		
		chinupLabel4.setBounds(200, 130, 400, 20);
		chinupLabel4.setForeground(Color.white);

		
		//데드리프트
		panel5_2_2.setOpaque(true);
		panel5_2_2.setBackground(Color.black);
		panel5_2_2.setLayout(null);
		
		panel5_2_2.add(deadliftLabel);
		panel5_2_2.add(deadliftLabel1);
		panel5_2_2.add(deadliftLabel2);
		panel5_2_2.add(deadliftLabel3);
		panel5_2_2.add(deadliftLabel4);
		
		// 설명 1,2,3,4
		deadliftLabel.setBounds(40, 180, 120, 120);
		
		deadliftLabel1.setBounds(200, 180, 400, 20);
		deadliftLabel1.setForeground(Color.red);
		
		deadliftLabel2.setBounds(200, 210, 400, 20);
		deadliftLabel2.setForeground(Color.white);
		
		deadliftLabel3.setBounds(200, 240, 400, 20);
		deadliftLabel3.setForeground(Color.white);
		
		deadliftLabel4.setBounds(200, 270, 400, 20);
		deadliftLabel4.setForeground(Color.white);
		
		//바벨로우
		panel5_2_3.setOpaque(true);
		panel5_2_3.setBackground(Color.black);
		panel5_2_3.setLayout(null);
		
		panel5_2_3.add(barbelllowLabel);
		panel5_2_3.add(barbelllowLabel1);
		panel5_2_3.add(barbelllowLabel2);
		panel5_2_3.add(barbelllowLabel3);
		panel5_2_3.add(barbelllowLabel4);
		
		// 설명 1,2,3,4
		barbelllowLabel.setBounds(40, 40, 120, 120);
		
		barbelllowLabel1.setBounds(200, 40, 400, 20);
		barbelllowLabel1.setForeground(Color.red);
		
		barbelllowLabel2.setBounds(200, 70, 400, 20);
		barbelllowLabel2.setForeground(Color.white);
		
		barbelllowLabel3.setBounds(200, 100, 400, 20);
		barbelllowLabel3.setForeground(Color.white);
		
		barbelllowLabel4.setBounds(200, 130, 400, 20);
		barbelllowLabel4.setForeground(Color.white);
		
		//덤벨로우
		panel5_2_3.setOpaque(true);
		panel5_2_3.setBackground(Color.black);
		panel5_2_3.setLayout(null);
		
		panel5_2_3.add(dumbelllowLabel);
		panel5_2_3.add(dumbelllowLabel1);
		panel5_2_3.add(dumbelllowLabel2);
		panel5_2_3.add(dumbelllowLabel3);
		panel5_2_3.add(dumbelllowLabel4);
		
		// 설명 1,2,3,4
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
		
		//런지
		panel6_2_1.add(rungeLabel);
		rungeLabel.setBounds(40, 40, 120, 120);
		
		//헤머 체스트 설명 1,2,3,4
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
		
		//레그 익스텐션
		panel6_2_1.add(legextentionLabel);
		legextentionLabel.setBounds(40, 180, 120, 120);
		
		//헤머 체스트 설명 1,2,3,4
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
		
		//힙스러스트
		panel6_2_1.add(hipthrustLabel);
		hipthrustLabel.setBounds(40, 320, 120, 120);
		
		//헤머 체스트 설명 1,2,3,4
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
		
		
		//스쿼트
		panel6_2_2.add(squatLabel);
		squatLabel.setBounds(40, 40, 120, 120);
		
		//헤머 체스트 설명 1,2,3,4
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
		
		//레그 익스텐션
		panel6_2_2.add(powerlegpressLabel);
		powerlegpressLabel.setBounds(40, 180, 120, 120);
		
		//헤머 체스트 설명 1,2,3,4
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
		
		//바벨런지
		panel6_2_3.add(barbellrungeLabel);
		barbellrungeLabel.setBounds(40, 40, 120, 120);
		
		//헤머 체스트 설명 1,2,3,4
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
		
		//레그 익스텐션
		panel6_2_3.add(splitsquatLabel);
		splitsquatLabel.setBounds(40, 180, 120, 120);
		
		//헤머 체스트 설명 1,2,3,4
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
		//런닝
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
		
		//사이클
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
		
		//버피
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
