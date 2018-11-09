import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame{

    // buttons for numbers
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnSix;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnZero;

    // buttons for operations
    private JButton btnoPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnoDivide;
    private JButton btnoEqual;

    //  buttons for additional functionality
    private JButton btnAC;
    private JButton btnPlusMinus;
    private JButton btnDecimal;
    private JButton btnModulus;

    // display
    private JTextField display;


    static Color clr;
    private Color rightBtnColor;

    static StringBuffer br = new StringBuffer();
    static StringBuffer br1 = new StringBuffer();


    static int number1;
    static int number2;
    static int result=0;
    static String no1;
    static String no2;
    static JButton bx;
    static String ans;

    // fonts
    private Font f;
    private Font f1;
    private Font f2;
    static String str;
    static String newstr;

    static float  n2;

    static int len;
    static int newlen;
    static int t1len;


    public static void main(String args[])
    {
        new Calculator();
    }

    public Calculator() {
        super("Calc");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //JFrame
        setBounds(100,50,296,419);
        setResizable(false);


        showDisplay();
        showButtons();
    }

    private void showDisplay() {

        display = new JTextField("0");

        // fonts
        f = new Font("Century",Font.PLAIN,20);
        f1 = new Font("Times New Roman",Font.PLAIN,45);
        f2 = new Font("Times New Roman",Font.PLAIN,25);

        display.setBounds(1,0,289,100);
        display.setDisabledTextColor(Color.ORANGE);
        display.setFont(f1);


        Container c = getContentPane();
        c.setLayout(null);

        setBackground(Color.gray);
        c.setBackground(Color.gray);

//        display.setBackground(clr);
        display.setForeground(Color.black);
    }

    private void showButtons() {

        // instantiate buttons
        btnOne = new JButton("1");
        btnTwo = new JButton("2");
        btnThree = new JButton("3");
        btnFour = new JButton("4");
        btnFive = new JButton("5");
        btnSix = new JButton("6");
        btnSeven = new JButton("7");
        btnEight = new JButton("8");
        btnNine = new JButton("9");
        btnZero = new JButton("0");

        btnoDivide = new JButton(" / ");
        btnMultiply = new JButton(" * ");
        btnMinus = new JButton(" - ");
        btnoPlus = new JButton(" + ");
        btnoEqual = new JButton("=");
        btnAC = new JButton("C");

        btnPlusMinus = new JButton("+/-");
        btnDecimal = new JButton(".");
        btnModulus = new JButton("%");

        add(btnOne);
        add(btnTwo);
        add(btnThree);
        add(btnFour);
        add(btnFive);
        add(btnSix);
        add(btnSeven);
        add(btnEight);
        add(btnNine);
        add(btnZero);
        add(btnoEqual);
        add(btnoPlus);
        add(btnMinus);
        add(btnMultiply);
        add(btnoDivide);
        add(display);
        add(btnAC);
        add(btnPlusMinus);
        add(btnDecimal);
        add(btnModulus);




        ImageIcon icon = new ImageIcon("cal.png");
        setIconImage(icon.getImage());



        btnAC.setBounds(1,100,72,58);
        btnPlusMinus.setBounds(73,100,72,58);
        btnModulus.setBounds(145,100,72,58);

        btnFour.setBounds(1,216,72,58);
        btnFive.setBounds(73,216,72,58);
        btnSix.setBounds(145,216,72,58);

        btnSeven.setBounds(1,158,72,58);
        btnEight.setBounds(73,158,72,58);
        btnNine.setBounds(145,158,72,58);

        btnOne.setBounds(1,274,72,58);
        btnThree.setBounds(145,274,72,58);

        btnZero.setBounds(1,332,144,58);
        btnDecimal.setBounds(145,332,72,58);
        btnoDivide.setBounds(217,100,72,58);

        btnTwo.setBounds(73,274,72,58);

        btnMultiply.setBounds(217,158,72,58);
        btnMinus.setBounds(217,216,72,58);
        btnoPlus.setBounds(217,274,72,58);
        btnoEqual.setBounds(217,332,72,58);

        Color col = new Color(224, 224, 224);
        rightBtnColor = new Color(255, 153, 51);

        btnOne.setBackground(col);
        btnTwo.setBackground(col);
        btnThree.setBackground(col);
        btnFour.setBackground(col);
        btnFive.setBackground(col);
        btnSix.setBackground(col);
        btnSeven.setBackground(col);
        btnEight.setBackground(col);
        btnNine.setBackground(col);
        btnZero.setBackground(col);

        btnModulus.setBackground(col);
        btnAC.setBackground(col);

        btnoPlus.setBackground(rightBtnColor);
        btnMinus.setBackground(rightBtnColor);
        btnMultiply.setBackground(rightBtnColor);
        btnoDivide.setBackground(rightBtnColor);

        btnPlusMinus.setBackground(col);
        btnDecimal.setBackground(col);
        btnoEqual.setBackground(rightBtnColor);

        display.setHorizontalAlignment(display.RIGHT);

        btnOne.setFont(f);
        btnTwo.setFont(f);
        btnThree.setFont(f);
        btnFour.setFont(f);
        btnFive.setFont(f);
        btnSix.setFont(f);
        btnSeven.setFont(f);
        btnEight.setFont(f);
        btnNine.setFont(f);
        btnZero.setFont(f);
        btnoPlus.setFont(f);
        btnMinus.setFont(f);
        btnMultiply.setFont(f);
        btnoDivide.setFont(f);
        btnoEqual.setFont(f);

        btnPlusMinus.setFont(f);
        btnDecimal.setFont(f);
        btnModulus.setFont(f);

        btnAC.setFont(f);

        btnoPlus.setForeground(col);
        btnMinus.setForeground(col);
        btnMultiply.setForeground(col);
        btnoDivide.setForeground(col);
        btnoEqual.setForeground(col);
    }
}
