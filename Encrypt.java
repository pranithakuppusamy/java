import java.util.*;
public class Encrypt {
public static void main(String[] args) {
int key=0;
String CA=" ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String SA=" abcdefghijklmnopqrstuvwxyz";
String S="";
Scanner in=new Scanner(System.in);
System.out.print("input => ");
String input = in.nextLine();
String[] str=input.split(" ");
String[] s=new String[1000];
String[] s1=new String[1000];
String wbc;
String wac;
ArrayList <String> str1=new ArrayList<>();
for(int i=0;i<str.length;i++) {
wbc="";
wac="";
int p=str[i].indexOf(",");
if(p>0) {
wbc=str[i].substring(0,p+1);
wac=str[i].substring(p+1,str[i].length());
str1.add(wbc);
for(int i1=0;i1<wac.length();i1++) {
key=0;
String sp=String.valueOf(wac.charAt(wac.length()-1));
if(sp.matches("[A-Z]+")) {
key=CA.indexOf(sp);
s[i1]=wac.substring(i1,i1+1);
if(s[i1].equals(sp)) {
str1.add(sp);
continue;
}
else {
    char c=s[i1].charAt(0);
    int index=Math.abs(CA.indexOf(c)-key);
    String ch=CA.substring(index,index+1);
    str1.add(ch);
}
}
else if(sp.matches("[a-z]+")){
 key=SA.indexOf(sp);
s[i1]=wac.substring(i1,i1+1);
if(s[i1].equals(sp)) {
str1.add(sp);
continue;
}
else {
    char c=s[i1].charAt(0);
    int index=Math.abs(SA.indexOf(c)-key);
    String ch=SA.substring(index,index+1);
    str1.add(ch);
}
}
else{
    str1.add(wac);
    break;
}
}
}
else {
    for(int i1=0;i1<str[i].length();i1++) {
        key=0;
        String sp=String.valueOf(str[i].charAt(str[i].length()-1));
        if(sp.matches("[A-Z]+")) {
        key=CA.indexOf(sp);
        s1[i1]=str[i].substring(i1,i1+1);
        if(s1[i1].equals(sp)) {
        str1.add(sp);
        continue;
        }
        else {
            char c=s1[i1].charAt(0);
            int index=Math.abs(CA.indexOf(c)-key);
            String ch=CA.substring(index,index+1);
            str1.add(ch);
        }
        }
        else if(sp.matches("[a-z]+")){
         key=SA.indexOf(sp);
        s1[i1]=str[i].substring(i1,i1+1);
        if(s1[i1].equals(sp)) {
        str1.add(sp);
        continue;
        }
        else {
            char c=s1[i1].charAt(0);
            int index=Math.abs(SA.indexOf(c)-key);
            String ch=SA.substring(index,index+1);
            str1.add(ch);
        }
        }
        else{
            str1.add(str[i]);
            break;
        }
        }
    }
}
for(int j=0;j<str1.size();j++){
    S+=str1.get(j);
}
System.out.print("Output => "+S);
in.close();
}  
}
