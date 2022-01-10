package com.sourav;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen  {
    public JPanel panel1;
    private JButton division;
    private JButton plus;
    private JButton multiply;
    private JButton minus;
    private JButton equal;
    private JButton del;
    private JButton ac;
    private JButton btn_7;
    private JButton btn_9;
    private JButton btn_8;
    private JButton btn_6;
    private JButton btn_5;
    private JButton btn_4;
    private JButton btn_3;
    private JButton btn_1;
    private JButton btn_pie;
    private JButton btn_;
    private JButton btn_0;
    private JPanel Control_btn;
    private JButton btn_2;
    private JPanel output;
    public JTextField input_txt;
    private JPanel numbers;
    private JPanel screen;
    public double ans =0 ,first,second;
//    public Variable variable  = new Variable();
    public Methods methods = new Methods();
    public AfterClick afterClick = new AfterClick(this);
    public Screen() {
        btn_0.addActionListener((ActionEvent e) ->
                afterClick.clicked("0")
        );
        btn_1.addActionListener((ActionEvent e) ->
                afterClick.clicked("1")
        );
        btn_2.addActionListener((ActionEvent e) ->
                afterClick.clicked("2")
        );
        btn_3.addActionListener((ActionEvent e) ->
                afterClick.clicked("3")
        );
        btn_4.addActionListener((ActionEvent e) ->
                afterClick.clicked("4")
        );
        btn_5.addActionListener((ActionEvent e) ->
                afterClick.clicked("5")
        );
        btn_6.addActionListener((ActionEvent e) ->
                afterClick.clicked("6")
        );
        btn_7.addActionListener((ActionEvent e) ->
                afterClick.clicked("7")
        );
        btn_8.addActionListener((ActionEvent e) ->
                afterClick.clicked("8")
        );
        btn_9.addActionListener((ActionEvent e) ->
                afterClick.clicked("9")
        );
        btn_.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = input_txt.getText();
                boolean checkDot = false;
                for(int i=0;i<a.length();i++){
                    if(a.charAt(i) == '+' || a.charAt(i)=='/' || a.charAt(i)=='-' || a.charAt(i)=='x'){
                        checkDot = false;
                    }
                    else if(a.charAt(i) == '.' ){
                        checkDot=true;
                    }
                }

                if(checkDot){

                }
                else{
                    input_txt.setText(input_txt.getText()+".");
                }
            }
        });
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String before_del = input_txt.getText();
                String after_del ="";
                String invalid = "Invalid Input";
                String infinity = "Infinity";
                if(before_del.equals(invalid)  || before_del.equals(infinity)){
                    input_txt.setText("0");
                }
                else{
                    int size = before_del.length();
                    if(size <2){
                        after_del+="0";
                    }
                    else{
                        after_del+=before_del.substring(0,before_del.length()-1);
                    }
                    input_txt.setText(after_del);
                }

            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText(input_txt.getText()+" + ");
                String input = input_txt.getText();
                int inOfPlus = methods.getIndexOfPlus(input);
                String output = input.substring(0,inOfPlus);
                try{
                    double a = Double.parseDouble(output);
                    first = a;
                }catch (Exception err){

                }
                System.out.println(first);
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText(input_txt.getText()+" - ");
                String input = input_txt.getText();
                int inOfMinus = methods.getIndexOfMinus(input);
                String output ="";
                if(inOfMinus>0)
                {
                    output += input.substring(0,inOfMinus);
                }

                try{
                    double a = Double.parseDouble(output);
                    first = a;
                }catch (Exception err){

                }

                System.out.println(first);
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText(input_txt.getText()+" / ");
                String input = input_txt.getText();
                int inOfDivisor = methods.getIndexOfDivisor(input);
                String output ="";
                if(inOfDivisor>0)
                {
                    output += input.substring(0,inOfDivisor);
                }
                try{
                    double a = Double.parseDouble(output);
                    first = a;
                }catch (Exception err){

                }
                System.out.println(first);
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText(input_txt.getText()+" x ");
                String input = input_txt.getText();
                int inOfMultification = methods.getIndexOfMultification(input);
                String output ="";
                if(inOfMultification>0)
                {
                    output += input.substring(0,inOfMultification);
                }
                try{
                    double a = Double.parseDouble(output);
                    first = a;
                }catch (Exception err){

                }
                System.out.println(first);
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = input_txt.getText();
                boolean valid = methods.validCheck(input);
                boolean lastValid = methods.lastValid(input);
                if(valid==false || lastValid == false){
                    input_txt.setText("Invalid Input");
                }
                else{
                    int indofOperator = methods.indOfOperator(input);
                    String output = input.substring(indofOperator,input.length());
                    double a = Double.parseDouble(output);
                    second = a;
                    char operationCheck = methods.operationCheck(input);
                    String outString;
                    if(operationCheck == '+'){
                        double out = first+second;
                        long comp = (long)out;
                        if(comp == out){
                            outString = Long.toString(comp);
                        }
                        else{
                            outString  = Double.toString(out);
                        }

                        input_txt.setText(outString);
                    }
                    else if(operationCheck == '-'){
                        double out = first - second;
                        long comp = (long)out;
                        if(comp == out){
                            outString = Long.toString(comp);
                        }
                        else{
                            outString  = Double.toString(out);
                        }

                        input_txt.setText(outString);
                    }
                    else if(operationCheck == 'x'){
                        double out = first * second;
                        long comp = (long)out;
                        if(comp == out){
                            outString = Long.toString(comp);
                        }
                        else{
                            outString  = Double.toString(out);
                        }

                        input_txt.setText(outString);
                    }
                    else if(operationCheck == '/'){
                        double out=0;
                        try{
                            out = first / second;
                        }catch (Exception err){
                            input_txt.setText("Invalid Input");
                        }
                        long comp = (long)out;
                        if(comp == out){
                            outString = Long.toString(comp);
                        }
                        else{
                            outString  = Double.toString(out);
                        }

                        input_txt.setText(outString);
                    }
                }


            }
        });
        ac.addActionListener((ActionEvent e) ->
                input_txt.setText("0")
        );

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public static void main(String[] args){
        JFrame frame  =new JFrame("Calculator");
        frame.setContentPane(new Screen().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setSize(580,550);
        frame.setVisible(true);
    }

}
