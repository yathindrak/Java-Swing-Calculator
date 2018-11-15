import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
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
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnDivide;
    private JButton btnEqual;

    //  buttons for additional functionality
    private JButton btnAC;
    private JButton btnPlusMinus;
    private JButton btnDecimal;
    private JButton btnModulus;

    // display
    private JTextField display;

    private Color clr;
    private Color rightBtnColor;

    // fonts
    private Font btnFont;
    private Font displayFont;

    static float num2;

    private Color overrallClr;


    public static void main(String args[])
    {
        new Calculator();
    }

    public Calculator() {
        super("Calc");
        // JFrame properties
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //JFrame
        setBounds(100,50,296,419);
        setResizable(false);

        showDisplay();
        showButtons();
    }

    private void showDisplay() {

        // init display
        display = new JTextField("0");

        // init fonts
        btnFont = new Font("Century",Font.PLAIN,20);

        displayFont = new Font("Times New Roman",Font.PLAIN,45);

        display.setBounds(1,0,289,100);
        display.setDisabledTextColor(Color.ORANGE);
        display.setFont(displayFont);
        display.setEditable(false);

        setLayout(null);

        setBackground(Color.gray);

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

        btnDivide = new JButton(" / ");
        btnMultiply = new JButton(" * ");
        btnMinus = new JButton(" - ");
        btnPlus = new JButton(" + ");
        btnEqual = new JButton("=");
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
        add(btnEqual);
        add(btnPlus);
        add(btnMinus);
        add(btnMultiply);
        add(btnDivide);
        add(display);
        add(btnAC);
        add(btnPlusMinus);
        add(btnDecimal);
        add(btnModulus);

        btnAC.setBounds(1,101,73,59);
        btnPlusMinus.setBounds(73,101,73,59);
        btnModulus.setBounds(145,101,73,59);

        btnFour.setBounds(1,216,74,60);
        btnFive.setBounds(73,216,73,59);
        btnSix.setBounds(145,216,73,59);

        btnSeven.setBounds(1,158,73,59);
        btnEight.setBounds(73,158,73,59);
        btnNine.setBounds(145,158,73,59);

        btnOne.setBounds(1,274,73,59);
        btnThree.setBounds(145,274,73,59);

        btnZero.setBounds(1,332,145,59);
        btnDecimal.setBounds(145,332,73,59);
        btnDivide.setBounds(217,100,73,59);

        btnTwo.setBounds(73,274,73,59);

        btnMultiply.setBounds(217,158,73,59);
        btnMinus.setBounds(217,216,73,59);
        btnPlus.setBounds(217,274,73,59);
        btnEqual.setBounds(217,332,73,59);

        overrallClr = new Color(224, 224, 224);
        rightBtnColor = new Color(255, 153, 51);

        btnOne.setBackground(overrallClr);
        btnTwo.setBackground(overrallClr);
        btnThree.setBackground(overrallClr);
        btnFour.setBackground(overrallClr);
        btnFive.setBackground(overrallClr);
        btnSix.setBackground(overrallClr);
        btnSeven.setBackground(overrallClr);
        btnEight.setBackground(overrallClr);
        btnNine.setBackground(overrallClr);
        btnZero.setBackground(overrallClr);

        btnModulus.setBackground(overrallClr);
        btnAC.setBackground(overrallClr);

        btnPlus.setBackground(rightBtnColor);
        btnMinus.setBackground(rightBtnColor);
        btnMultiply.setBackground(rightBtnColor);
        btnDivide.setBackground(rightBtnColor);

        btnPlusMinus.setBackground(overrallClr);
        btnDecimal.setBackground(overrallClr);
        btnEqual.setBackground(rightBtnColor);

        display.setHorizontalAlignment(display.RIGHT);

        btnOne.setFont(btnFont);
        btnTwo.setFont(btnFont);
        btnThree.setFont(btnFont);
        btnFour.setFont(btnFont);
        btnFive.setFont(btnFont);
        btnSix.setFont(btnFont);
        btnSeven.setFont(btnFont);
        btnEight.setFont(btnFont);
        btnNine.setFont(btnFont);
        btnZero.setFont(btnFont);
        btnPlus.setFont(btnFont);
        btnMinus.setFont(btnFont);
        btnMultiply.setFont(btnFont);
        btnDivide.setFont(btnFont);
        btnEqual.setFont(btnFont);

        btnPlusMinus.setFont(btnFont);
        btnDecimal.setFont(btnFont);
        btnModulus.setFont(btnFont);

        btnAC.setFont(btnFont);

        btnPlus.setForeground(overrallClr);
        btnMinus.setForeground(overrallClr);
        btnMultiply.setForeground(overrallClr);
        btnDivide.setForeground(overrallClr);
        btnEqual.setForeground(overrallClr);

        setBtnListeners();
    }

    private void setBtnListeners() {
        btnZero.addActionListener(e -> {
            String initial = this.display.getText();

            if(initial.equals("0")) {
                display.setText("0");
            } else {
                display.setText(initial + "0");
            }

            String num1 = this.display.getText();
            num2 = Float.parseFloat(num1);
        });

        btnOne.addActionListener(e -> {
            String txt = this.display.getText();
            if(txt.equals("0")) {
                display.setText("1");
            } else {
                this.display.setText(txt + "1");
            }
            String num1 = this.display.getText();
            num2 = Float.parseFloat(num1);
        });

        btnTwo.addActionListener(e -> {
            String txt = this.display.getText();
            if(txt.equals("0")) {
                display.setText("2");
            } else {
                this.display.setText(txt + "2");
            }
            String num1 = this.display.getText();
            num2 = Float.parseFloat(num1);
        });

        btnThree.addActionListener(e -> {
            String txt = this.display.getText();
            if(txt.equals("0")) {
                display.setText("3");
            } else {
                this.display.setText(txt + "3");
            }
            String num1 = this.display.getText();
            num2 = Float.parseFloat(num1);
        });

        btnFour.addActionListener(e -> {
            String txt = this.display.getText();
            if(txt.equals("0")) {
                display.setText("4");
            } else {
                this.display.setText(txt + "4");
            }
            String num1 = this.display.getText();
            num2 = Float.parseFloat(num1);
        });

        btnFive.addActionListener(e -> {
            String txt = this.display.getText();
            if(txt.equals("0")) {
                display.setText("5");
            } else {
                this.display.setText(txt + "5");
            }
            String num1 = this.display.getText();
            num2 = Float.parseFloat(num1);
        });

        btnSix.addActionListener(e -> {
            String txt = this.display.getText();
            if(txt.equals("0")) {
                display.setText("6");
            } else {
                this.display.setText(txt + "6");
            }
            String num1 = this.display.getText();
            num2 = Float.parseFloat(num1);
        });

        btnSeven.addActionListener(e -> {
            String txt = this.display.getText();
            if(txt.equals("0")) {
                display.setText("7");
            } else {
                this.display.setText(txt + "7");
            }
            String num1 = this.display.getText();
            num2 = Float.parseFloat(num1);
        });

        btnEight.addActionListener(e -> {
            String txt = this.display.getText();
            if(txt.equals("0")) {
                display.setText("8");
            } else {
                this.display.setText(txt + "8");
            }
            String num1 = this.display.getText();
            num2 = Float.parseFloat(num1);
        });

        btnNine.addActionListener(e -> {
            String txt = this.display.getText();
            if(txt.equals("0")) {
                display.setText("9");
            } else {
                this.display.setText(txt + "9");
            }
            String num1 = this.display.getText();
            num2 = Float.parseFloat(num1);
        });

        btnPlus.addActionListener(e -> {
            try{
                String num1 = this.display.getText();

                if (Float.parseFloat(num1.substring(num1.length() - 1)) != 0) {
                    display.setText(num1 + "+");
                }
            } catch (Exception ex){
                ex.printStackTrace();
            }
        });

        btnMinus.addActionListener(e -> {
            try{
                String num1 = this.display.getText();

                if (Float.parseFloat(num1.substring(num1.length() - 1)) != 0) {
                    display.setText(num1 + "-");
                }
            } catch (Exception ex){
                ex.printStackTrace();
            }
        });

        btnMultiply.addActionListener(e -> {
            try{
                String num1 = this.display.getText();

                if (Float.parseFloat(num1.substring(num1.length() - 1)) != 0) {
                    display.setText(num1 + "*");
                }
            } catch (Exception ex){
                ex.printStackTrace();
            }
        });

        btnDivide.addActionListener(e -> {
            try{
                String num1 = this.display.getText();

                if (Float.parseFloat(num1.substring(num1.length() - 1)) != 0) {
                    display.setText(num1 + "/");
                }
            } catch (Exception ex){
                ex.printStackTrace();
            }
        });

        btnModulus.addActionListener(e -> {
            try{
                String num1 = this.display.getText();

                if (Float.parseFloat(num1.substring(num1.length() - 1)) != 0) {
                    display.setText(num1 + "%");
                }
            } catch (Exception ex){
                ex.printStackTrace();
            }
        });

        btnAC.addActionListener(e -> {
            this.display.setText("0");
        });

        btnDecimal.addActionListener(e -> {
            try{
                String num1 = this.display.getText();

                if (Float.parseFloat(num1) == num2) {
                    display.setText(num1 + ".");
                }
            } catch (Exception ex){
                ex.printStackTrace();
            }
        });

        btnPlusMinus.addActionListener(e -> {
            try{
                String num1 = this.display.getText();

                float num = Float.parseFloat(num1);

                num *= -1;

                this.display.setText(String.valueOf(num));
            } catch (Exception ex){
                ex.printStackTrace();
            }
        });

        btnEqual.addActionListener(e -> {
            String txt = this.display.getText();
            String result = executeMathStatement(txt);
            display.setText(result);
        });

    }

    public String executeMathStatement(String str) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            return String.valueOf(engine.eval(str));
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return str;
    }

    public String removeLastStr(String str) {
        if (str != null && str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }
}
