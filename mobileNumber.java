import java.util.*;
import java.util.regex.*;
public class mobileNumber {
public static void main(String[]args) {
  Scanner in=new Scanner(System.in);
  boolean f=false;
  while(!f) {
  System.out.print("Mobile number: ");
  long input=in.nextLong();
  int len=String.valueOf(input).length();
  if(len!=10) {
 System.out.println("Enter the valid mobile number: ");
 continue;
  }
  f=true;
  System.out.println(fancyNumber(input));
  }
  in.close();
}
public static String fancyNumber(long input) {
String str=Long.toString(input);
String Output;
boolean t1=false,t2=false,t3=false;
int count=1;
String arr[]=str.split(""),str1,str2;
for(int i=0;i<arr.length-2;i++){
Pattern p = Pattern.compile("\\b([0-9])\\1\\1+\\b");
str1=str.substring(i, i+3);
Matcher m = p.matcher(str1);
if(m.matches()){
t1=true;
break;
}
} 
for(int i=0;i<arr.length-2;i++) {
str2=str.substring(i,i+3);
int a=Integer.parseInt(str2.substring(0,1));
int b=Integer.parseInt(str2.substring(1,2));
int c=Integer.parseInt(str2.substring(2,3));
if((a+1==b)&&(b+1==c)) {
t2=true; 
    }else if((a-1==b)&&(b-1==c)){
        t2=true; 
 }
}
for(int j=0;j<arr.length;j++){
     count=1;
for(int k=j+1;k<arr.length;k++) {
if(arr[j].equals(arr[k])) {
count++;
}
}
if(count>3) {
t3=true;
}
}
if(t1==true||t2==true||t3==true) {
Output="Yes";
}else {
Output="No";
}
return ("Output: "+ Output);

}
}
