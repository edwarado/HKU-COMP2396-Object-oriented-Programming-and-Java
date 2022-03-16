import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main {
  int score_dealer = 0;
  int score_temp_dealer = 0;
  int score_player = 0;
  int score_temp_player = 0;
  String image4_filename = "";
  String image5_filename = "";
  String image6_filename = "";

  static int reset = 0;

  int replace_times = 0;

	static String[] cards = {"card_11.gif", "card_12.gif", "card_13.gif", "card_14.gif", "card_15.gif", "card_16.gif","card_17.gif", "card_18.gif", "card_19.gif","card_21.gif", "card_22.gif", "card_23.gif", "card_24.gif.", "card_25.gif", "card_26.gif","card_27.gif", "card_28.gif", "card_29.gif","card_31.gif", "card_32.gif", "card_33.gif", "card_34.gif", "card_35.gif", "card_36.gif","card_37.gif", "card_38.gif", "card_39.gif","card_41.gif", "card_42.gif", "card_43.gif", "card_44.gif", "card_45.gif", "card_46.gif","card_47.gif", "card_48.gif", "card_49.gif", "card_110.gif","card_111.gif", "card_112.gif", "card_113.gif", "card_210.gif","card_211.gif", "card_212.gif", "card_213.gif","card_310.gif","card_311.gif", "card_312.gif", "card_313.gif","card_410.gif","card_411.gif", "card_412.gif", "card_413.gif"};

  static String[] cards_10 = {"card_111.gif", "card_112.gif", "card_113.gif", "card_211.gif", "card_212.gif", "card_213.gif","card_311.gif", "card_312.gif", "card_313.gif","card_411.gif", "card_412.gif", "card_413.gif"};

  static String[] card1 = {"card_11.gif", "card_21.gif", "card_31.gif", "card_41.gif"};

  static String[] card2 = {"card_12.gif", "card_22.gif", "card_32.gif", "card_42.gif"};

  static String[] card3 = {"card_13.gif", "card_23.gif", "card_33.gif", "card_43.gif"};

  static String[] card4 = {"card_14.gif", "card_24.gif", "card_34.gif", "card_44.gif"};

  static String[] card5 = {"card_15.gif", "card_25.gif", "card_35.gif", "card_45.gif"};

  static String[] card6 = {"card_16.gif", "card_26.gif", "card_36.gif", "card_46.gif"};

  static String[] card7 = {"card_17.gif", "card_27.gif", "card_37.gif", "card_47.gif"};

  static String[] card8 = {"card_18.gif", "card_28.gif", "card_38.gif", "card_48.gif"};

  static String[] card9 = {"card_19.gif", "card_29.gif", "card_39.gif", "card_49.gif"};

  JPanel panel = new JPanel();
  JFrame frame = new JFrame();

  JPanel MainPanel = new JPanel();
  JPanel DealerPanel = new JPanel();
  JPanel PlayerPanel = new JPanel();
  JPanel RpCardBtnPanel = new JPanel();
  JPanel ButtonPanel = new JPanel();
  JPanel InfoPanel = new JPanel();

  JLabel label_Image1 = new JLabel();
  JLabel label_Image2 = new JLabel();
  JLabel label_Image3 = new JLabel();
  JLabel label_Image4 = new JLabel();
  JLabel label_Image5 = new JLabel();
  JLabel label_Image6 = new JLabel();

  JButton btn_rpcard1 = new JButton("Replace Card 1");
  JButton btn_rpcard2 = new JButton("Replace Card 2");
  JButton btn_rpcard3 = new JButton("Replace Card 3");
  JButton Start = new JButton("Start");
  JButton Result = new JButton("Result");

  JLabel label_bet = new JLabel("Bet: $");

  JLabel label_info1 = new JLabel("Please place your bet!");
  JLabel label_money1 = new JLabel("0");
  JLabel label_info2 = new JLabel("Amount of money you have: $");
  JLabel label_money2 = new JLabel("100");

  JTextField txt_inputbet = new JTextField(10);

  ImageIcon Image1 = new ImageIcon("card_back.gif");
  ImageIcon Image2 = new ImageIcon("card_back.gif");
  ImageIcon Image3 = new ImageIcon("card_back.gif");
  ImageIcon Image4 = new ImageIcon("card_back.gif");
  ImageIcon Image5 = new ImageIcon("card_back.gif");
  ImageIcon Image6 = new ImageIcon("card_back.gif");


  public void go() {
    MainPanel.setLayout(new GridLayout(5,1));
    MainPanel.add(DealerPanel);
    MainPanel.add(PlayerPanel);
    MainPanel.add(RpCardBtnPanel);
    MainPanel.add(ButtonPanel);
    MainPanel.add(InfoPanel);
    // Repeat this for other sub-panels
    // Optional background color setting
    DealerPanel.setBackground(Color.green);
    PlayerPanel.setBackground(Color.green);
    RpCardBtnPanel.setBackground(Color.green);

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(MainPanel);
    frame.setTitle("A Simple Card Game");
    frame.setSize(400, 700);
    frame.setVisible(true);

    label_Image1.setIcon(Image1);
    label_Image2.setIcon(Image2);
    label_Image3.setIcon(Image3);
    label_Image4.setIcon(Image4);
    label_Image5.setIcon(Image5);
    label_Image6.setIcon(Image6);

    DealerPanel.add(label_Image1);
    DealerPanel.add(label_Image2);
    DealerPanel.add(label_Image3);
    PlayerPanel.add(label_Image4);
    PlayerPanel.add(label_Image5);
    PlayerPanel.add(label_Image6);

    RpCardBtnPanel.add(btn_rpcard1);
    RpCardBtnPanel.add(btn_rpcard2);
    RpCardBtnPanel.add(btn_rpcard3);

    ButtonPanel.add(label_bet);
    ButtonPanel.add(txt_inputbet);
    ButtonPanel.add(txt_inputbet);
    ButtonPanel.add(Start);
    ButtonPanel.add(Result);

    InfoPanel.add(label_info1);
    InfoPanel.add(label_money1);    
    InfoPanel.add(label_info2);
    InfoPanel.add(label_money2);  

    Start.addActionListener(new Start());
    Result.addActionListener(new Result());
    btn_rpcard1.addActionListener(new btn_rpcard1());
    btn_rpcard2.addActionListener(new btn_rpcard2());
    btn_rpcard3.addActionListener(new btn_rpcard3());

  }

  public static void main(String[] args) {
    List<String> intList = Arrays.asList(cards);
    Collections.shuffle(intList);
    intList.toArray(cards);


    Main run = new Main();
    run.go();
  }

  class Start implements ActionListener{
    public void actionPerformed(ActionEvent event){
      int i = Integer.parseInt(txt_inputbet.getText());
      int j = Integer.parseInt(label_money2.getText());

      if (i < 0){
        JOptionPane.showMessageDialog(null, "WARNING: The bet you place must be a postive integer!", "InfoBox: " + "Message", JOptionPane.INFORMATION_MESSAGE);
      }
      else if (i > j){
        JOptionPane.showMessageDialog(null, "WARNING: You cannot bet larger than your total amount", "InfoBox: " + "Message", JOptionPane.INFORMATION_MESSAGE);
      }
      else {
        Image4 = new ImageIcon(cards[3]);
        Image5 = new ImageIcon(cards[4]);
        Image6 = new ImageIcon(cards[5]);
        image4_filename = cards[3];
        image5_filename = cards[4];
        image6_filename = cards[5];
        label_Image4.setIcon(Image4);
        label_Image5.setIcon(Image5);
        label_Image6.setIcon(Image6);
        label_info1.setText("Your current bet is: $");
        label_money1.setText(txt_inputbet.getText());
        frame.repaint();
      }

    }
  }

  class Result implements ActionListener{
    public void actionPerformed(ActionEvent event){
      Image1 = new ImageIcon(cards[0]);
      Image2 = new ImageIcon(cards[1]);
      Image3 = new ImageIcon(cards[2]);
      label_Image1.setIcon(Image1);
      label_Image2.setIcon(Image2);
      label_Image3.setIcon(Image3);
      frame.repaint();

      if (Arrays.asList(cards_10).contains(cards[0])){
        score_dealer = score_dealer + 10;
      }

      if (Arrays.asList(cards_10).contains(cards[1])){
        score_dealer = score_dealer + 10;
      }

      if (Arrays.asList(cards_10).contains(cards[2])){
        score_dealer = score_dealer + 10;
      }

      if (Arrays.asList(card1).contains(cards[0])){
        score_temp_dealer = score_temp_dealer + 1;
      }
      if (Arrays.asList(card1).contains(cards[1])){
        score_temp_dealer = score_temp_dealer + 1;
      }
      if (Arrays.asList(card1).contains(cards[2])){
        score_temp_dealer = score_temp_dealer + 1;
      }

      if (Arrays.asList(card2).contains(cards[0])){
        score_temp_dealer = score_temp_dealer + 2;
      }
      if (Arrays.asList(card2).contains(cards[1])){
        score_temp_dealer = score_temp_dealer + 2;
      }
      if (Arrays.asList(card2).contains(cards[2])){
        score_temp_dealer = score_temp_dealer + 2;
      }

      if (Arrays.asList(card3).contains(cards[0])){
        score_temp_dealer = score_temp_dealer + 3;
      }
      if (Arrays.asList(card3).contains(cards[1])){
        score_temp_dealer = score_temp_dealer + 3;
      }
      if (Arrays.asList(card3).contains(cards[2])){
        score_temp_dealer = score_temp_dealer + 3;
      }  

      if (Arrays.asList(card4).contains(cards[0])){
        score_temp_dealer = score_temp_dealer + 4;
      }
      if (Arrays.asList(card4).contains(cards[1])){
        score_temp_dealer = score_temp_dealer + 4;
      }
      if (Arrays.asList(card4).contains(cards[2])){
        score_temp_dealer = score_temp_dealer + 4;
      }

      if (Arrays.asList(card5).contains(cards[0])){
        score_temp_dealer = score_temp_dealer + 5;
      }
      if (Arrays.asList(card5).contains(cards[1])){
        score_temp_dealer = score_temp_dealer + 5;
      }
      if (Arrays.asList(card5).contains(cards[2])){
        score_temp_dealer = score_temp_dealer + 5;
      }

      if (Arrays.asList(card6).contains(cards[0])){
        score_temp_dealer = score_temp_dealer + 6;
      }
      if (Arrays.asList(card6).contains(cards[1])){
        score_temp_dealer = score_temp_dealer + 6;
      }
      if (Arrays.asList(card6).contains(cards[2])){
        score_temp_dealer = score_temp_dealer + 6;
      }

      if (Arrays.asList(card7).contains(cards[0])){
        score_temp_dealer = score_temp_dealer + 7;
      }
      if (Arrays.asList(card7).contains(cards[1])){
        score_temp_dealer = score_temp_dealer + 7;
      }
      if (Arrays.asList(card7).contains(cards[2])){
        score_temp_dealer = score_temp_dealer + 7;
      }  

      if (Arrays.asList(card8).contains(cards[0])){
        score_temp_dealer = score_temp_dealer + 8;
      }
      if (Arrays.asList(card8).contains(cards[1])){
        score_temp_dealer = score_temp_dealer + 8;
      }
      if (Arrays.asList(card8).contains(cards[2])){
        score_temp_dealer = score_temp_dealer + 8;
      }

      if (Arrays.asList(card9).contains(cards[0])){
        score_temp_dealer = score_temp_dealer + 9;
      }
      if (Arrays.asList(card9).contains(cards[1])){
        score_temp_dealer = score_temp_dealer + 9;
      }
      if (Arrays.asList(card9).contains(cards[2])){
        score_temp_dealer = score_temp_dealer + 9;
      }

      score_dealer = score_dealer + score_temp_dealer%10;



      if (Arrays.asList(cards_10).contains(image4_filename)){
        score_player = score_player + 10;
      }

      if (Arrays.asList(cards_10).contains(image5_filename)){
        score_player = score_player + 10;
      }

      if (Arrays.asList(cards_10).contains(image6_filename)){
        score_player = score_player + 10;
      }

      if (Arrays.asList(card1).contains(image4_filename)){
        score_temp_player = score_temp_player + 1;
      }
      if (Arrays.asList(card1).contains(image5_filename)){
        score_temp_player = score_temp_player + 1;
      }
      if (Arrays.asList(card1).contains(image6_filename)){
        score_temp_player = score_temp_player + 1;
      }

      if (Arrays.asList(card2).contains(image4_filename)){
        score_temp_player = score_temp_player + 2;
      }
      if (Arrays.asList(card2).contains(image5_filename)){
        score_temp_player = score_temp_player + 2;
      }
      if (Arrays.asList(card2).contains(image6_filename)){
        score_temp_player = score_temp_player + 2;
      }

      if (Arrays.asList(card3).contains(image4_filename)){
        score_temp_player = score_temp_player + 3;
      }
      if (Arrays.asList(card3).contains(image5_filename)){
        score_temp_player = score_temp_player + 3;
      }
      if (Arrays.asList(card3).contains(image6_filename)){
        score_temp_player = score_temp_player + 3;
      }  

      if (Arrays.asList(card4).contains(image4_filename)){
        score_temp_player = score_temp_player + 4;
      }
      if (Arrays.asList(card4).contains(image5_filename)){
        score_temp_player = score_temp_player + 4;
      }
      if (Arrays.asList(card4).contains(image6_filename)){
        score_temp_player = score_temp_player + 4;
      }

      if (Arrays.asList(card5).contains(image4_filename)){
        score_temp_player = score_temp_player + 5;
      }
      if (Arrays.asList(card5).contains(image5_filename)){
        score_temp_player = score_temp_player + 5;
      }
      if (Arrays.asList(card5).contains(image6_filename)){
        score_temp_player = score_temp_player + 5;
      }

      if (Arrays.asList(card6).contains(image4_filename)){
        score_temp_player = score_temp_player + 6;
      }
      if (Arrays.asList(card6).contains(image5_filename)){
        score_temp_player = score_temp_player + 6;
      }
      if (Arrays.asList(card6).contains(image6_filename)){
        score_temp_player = score_temp_player + 6;
      }

      if (Arrays.asList(card7).contains(image4_filename)){
        score_temp_player = score_temp_player + 7;
      }
      if (Arrays.asList(card7).contains(image5_filename)){
        score_temp_player = score_temp_player + 7;
      }
      if (Arrays.asList(card7).contains(image6_filename)){
        score_temp_player = score_temp_player + 7;
      }  

      if (Arrays.asList(card8).contains(image4_filename)){
        score_temp_player = score_temp_player + 8;
      }
      if (Arrays.asList(card8).contains(image5_filename)){
        score_temp_player = score_temp_player + 8;
      }
      if (Arrays.asList(card8).contains(image6_filename)){
        score_temp_player = score_temp_player + 8;
      }

      if (Arrays.asList(card9).contains(image4_filename)){
        score_temp_player = score_temp_player + 9;
      }
      if (Arrays.asList(card9).contains(image5_filename)){
        score_temp_player = score_temp_player + 9;
      }
      if (Arrays.asList(card9).contains(image6_filename)){
        score_temp_player = score_temp_player + 9;
      }
      score_player = score_player + score_temp_player%10;

      if (score_dealer >= score_player){
        JOptionPane.showMessageDialog(null, "Sorry! The dealer wins this round!", "InfoBox: " + "Message", JOptionPane.INFORMATION_MESSAGE);
        Integer temp0 = Integer.parseInt(label_money2.getText()) - Integer.parseInt(label_money1.getText());
        label_money2.setText(temp0.toString());

        label_money1.setText("0");
        Image1 = new ImageIcon("card_back.gif");
        Image2 = new ImageIcon("card_back.gif");
        Image3 = new ImageIcon("card_back.gif");
        Image4 = new ImageIcon("card_back.gif");
        Image5 = new ImageIcon("card_back.gif");
        Image6 = new ImageIcon("card_back.gif");
        label_Image1.setIcon(Image1);
        label_Image2.setIcon(Image2);
        label_Image3.setIcon(Image3);
        label_Image4.setIcon(Image4);
        label_Image5.setIcon(Image5);
        label_Image6.setIcon(Image6);
        replace_times = 0;
        txt_inputbet.setText("");
        List<String> intList = Arrays.asList(cards);
        Collections.shuffle(intList);
        intList.toArray(cards);

        score_dealer = 0;
        score_temp_dealer = 0;
        score_player = 0;
        score_temp_player = 0;
        image4_filename = "";
        image5_filename = "";
        image6_filename = "";

        if (Integer.parseInt(label_money2.getText()) == 0) {
          JOptionPane.showMessageDialog(null, "GameOver! You have no more money! Please start a new game", "InfoBox: " + "Message", JOptionPane.INFORMATION_MESSAGE); 
          Main run = new Main();
          run.go();         
        }
        frame.repaint();
        reset = 1;
        
      }

      if (score_dealer < score_player){
        JOptionPane.showMessageDialog(null, "Congratulations! You win this round!", "InfoBox: " + "Message", JOptionPane.INFORMATION_MESSAGE);    
        Integer temp1 = Integer.parseInt(label_money2.getText()) + Integer.parseInt(label_money1.getText());
        label_money2.setText(temp1.toString()); 

        label_money1.setText("0");
        Image1 = new ImageIcon("card_back.gif");
        Image2 = new ImageIcon("card_back.gif");
        Image3 = new ImageIcon("card_back.gif");
        Image4 = new ImageIcon("card_back.gif");
        Image5 = new ImageIcon("card_back.gif");
        Image6 = new ImageIcon("card_back.gif");
        label_Image1.setIcon(Image1);
        label_Image2.setIcon(Image2);
        label_Image3.setIcon(Image3);
        label_Image4.setIcon(Image4);
        label_Image5.setIcon(Image5);
        label_Image6.setIcon(Image6);
        replace_times = 0;
        txt_inputbet.setText("");
        List<String> intList = Arrays.asList(cards);
        Collections.shuffle(intList);
        intList.toArray(cards);
        
        score_dealer = 0;
        score_temp_dealer = 0;
        score_player = 0;
        score_temp_player = 0;
        image4_filename = "";
        image5_filename = "";
        image6_filename = "";
        frame.repaint();
      }
      reset = 1;

    }
  }

  class btn_rpcard1 implements ActionListener{
    public void actionPerformed(ActionEvent event){
      if (replace_times <= 1){
        Image4 = new ImageIcon(cards[6+replace_times]);
        image4_filename = cards[6+replace_times];
        label_Image4.setIcon(Image4);
        frame.repaint();
        replace_times++;
      }
    }
  }

  class btn_rpcard2 implements ActionListener{
    public void actionPerformed(ActionEvent event){
      if (replace_times <= 1){
        Image5 = new ImageIcon(cards[6+replace_times]);
        image5_filename = cards[6+replace_times];
        label_Image5.setIcon(Image5);
        frame.repaint();
        replace_times++;
      }
    }
  }

  class btn_rpcard3 implements ActionListener{
    public void actionPerformed(ActionEvent event){
      if (replace_times <= 1){
        Image6 = new ImageIcon(cards[6+replace_times]);
        image6_filename = cards[6+replace_times];
        label_Image6.setIcon(Image6);
        frame.repaint();
        replace_times++;
      }
    }
  }
}