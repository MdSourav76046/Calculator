package com.sourav;
import java.util.*;
public class Methods {
    public String afterClick(String s){
        String ok = "";
        boolean f = true;
        int ind = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0' && f){
                ind++;
            }
            else f = false;
        }
        if(ind == s.length()) return "0";
        return s.substring(ind,s.length());
    }
    public int checkForDot(String s){
        return s.indexOf('.');
    }
    public boolean validCheck(String s){
        boolean f = true;
        for(int i=0;i<s.length()-1;i++){
            if((s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '/' || s.charAt(i) == 'x') && f==true){
                f = false;
            }
            else if((s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '/' || s.charAt(i) == 'x') && f==false){
                return false;
            }
        }
        return true;
    }
    public int getIndexOfPlus(String s){
        return s.indexOf('+')-1;
    }
    public int getIndexOfMinus(String s){
        return s.indexOf('-')-1;
    }
    public int getIndexOfMultification(String s){
        return s.indexOf('x')-1;
    }
    public int getIndexOfDivisor(String s){
        return s.indexOf('/')-1;
    }
    public boolean lastValid(String s){
        int sz = s.length()-1;
        char c = s.charAt(sz);
        if(c=='x' || c=='+' || c == '/' || c == '-'){
            return false;
        }
        return true;
    }
    public int indOfOperator(String s){
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '+' || c=='-' || c=='/' || c=='x'){
                return i+2;
            }
        }
        return 0;
    }
    public char operationCheck(String s){
        int into = s.indexOf('x');
        if(into!=-1) return 'x';
        int div = s.indexOf('/');
        if(div!=-1) return '/';
        int add = s.indexOf('+');
        if(add!=-1) return '+';
        return '-';

    }


}
