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
    private JTextField input_txt;
    private JPanel numbers;
    private JPanel screen;
    public double ans =0,first,second;
    public boolean inRange = true;
//    public Variable variable  = new Variable();
    public Methods methods = new Methods();
    public Screen() {
        btn_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText(input_txt.getText()+"0");
            }
        });
        btn_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText(input_txt.getText()+"1");
            }
        });
        btn_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText(input_txt.getText()+"2");
                String s = input_txt.getText();
                String output = methods.afterClick(s);
                if(output.length()==0){
                    input_txt.setText(input_txt.getText()+"0");
                }else{
                    input_txt.setText(output);
                }
            }
        });
        btn_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText(input_txt.getText()+"3");
                String s = input_txt.getText();
                String output = methods.afterClick(s);
                if(output.length()==0){
                    input_txt.setText(input_txt.getText()+"0");
                }else{
                    input_txt.setText(output);
                }
            }
        });
        btn_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText(input_txt.getText()+"4");
                String s = input_txt.getText();
                String output = methods.afterClick(s);
                if(output.length()==0){
                    input_txt.setText(input_txt.getText()+"0");
                }else{
                    input_txt.setText(output);
                }
            }
        });
        btn_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText(input_txt.getText()+"5");
                String s = input_txt.getText();
                String output = methods.afterClick(s);
                if(output.length()==0){
                    input_txt.setText(input_txt.getText()+"0");
                }else{
                    input_txt.setText(output);
                }
            }
        });
        btn_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText(input_txt.getText()+"6");
                String s = input_txt.getText();
                String output = methods.afterClick(s);
                if(output.length()==0){
                    input_txt.setText(input_txt.getText()+"0");
                }else{
                    input_txt.setText(output);
                }
            }
        });
        btn_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText(input_txt.getText()+"7");
                String s = input_txt.getText();
                String output = methods.afterClick(s);
                if(output.length()==0){
                    input_txt.setText(input_txt.getText()+"0");
                }else{
                    input_txt.setText(output);
                }
            }
        });
        btn_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText(input_txt.getText()+"8");
                String s = input_txt.getText();
                String output = methods.afterClick(s);
                if(output.length()==0){
                    input_txt.setText(input_txt.getText()+"0");
                }else{
                    input_txt.setText(output);
                }
            }
        });
        btn_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText(input_txt.getText()+"9");
                String s = input_txt.getText();
                String output = methods.afterClick(s);
                if(output.length()==0){
                    input_txt.setText(input_txt.getText()+"0");
                }else{
                    input_txt.setText(output);
                }
            }
        });
        btn_.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            input_txt.setText(input_txt.getText()+".");
            }
        });
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String before_del = input_txt.getText();
                String after_del ="";
                int size = before_del.length();
                if(size <2){
                    after_del+="0";
                }
                else{
                    after_del+=before_del.substring(0,before_del.length()-1);
                }
                input_txt.setText(after_del);
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText(input_txt.getText()+" + ");
                String input = input_txt.getText();
                int indOfDot = methods.checkForDot(input);
                int inOfPlus = methods.getIndexOfPlus(input);
                String output = input.substring(0,inOfPlus);
                System.out.println(indOfDot);
//                if(indOfDot==-1){
////                    if(input.length()>18){
////                        inRange = false;
////                    }
//                    double a =  Double.parseDouble(output);                        ans = a;
//                }
//                else{
////                    if(indOfDot>18){
////                        inRange = false;
////                    }
//                }
                double a = Double.parseDouble(output);
                first = a;
                System.out.println(first);
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = input_txt.getText();
                boolean valid = methods.validCheck(input);
                boolean lastValid = methods.lastValid(input);
                System.out.println(valid +" " + lastValid);
                if(valid==false || lastValid == false){
                    input_txt.setText("Invalid Input");
                }
                else{
                    int indofOperator = methods.indOfOperator(input);
                    String output = input.substring(indofOperator,input.length());
                    System.out.println(output);
                    double a = Double.parseDouble(output);
                    second = a;
                    System.out.println(a);
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
                }


            }
        });
        ac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_txt.setText("0");
            }
        });
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
