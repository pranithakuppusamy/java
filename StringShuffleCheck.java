import java.util.*;
public class StringShuffleCheck {
 public static String output1="";
 public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Input=> ");
    ArrayList<String> arrList=new ArrayList<String>();
    System.out.print("String1= ");
    String string1=in.nextLine();
    arrList.add(string1);
    System.out.print("String2= ");
    String string2=in.nextLine();
    arrList.add(string2);
    System.out.print("String3= ");
    String string3=in.nextLine();
    arrList.add(string3);
    System.out.print("String4= ");
    String string4=in.nextLine();
    arrList.add(string4);
    stringShuffleCheck(arrList);
    System.out.println("output=> "+ output1);
          in.close();
 }
 public static void stringShuffleCheck(ArrayList<String> arrayList) {
String s1=arrayList.get(0);
String s2=arrayList.get(1);
String s3=arrayList.get(2);
String s4=arrayList.get(3);
String s=s1+s2+s3;
int count =0,count1=0,count2=0,count3=0;
ArrayList<String> arr1= new ArrayList<String>();
ArrayList<String> arr= new ArrayList<String>();
if(s4.length()!=s.length()) {
output1="invalid shuffle String";
}
else {
   for(int i=0;i<s4.length();i++) {
   arr1.add(Character.toString(s4.charAt(i)));
    }
  for(int i1=0;i1<s.length();i1++) {
arr.add(Character.toString(s.charAt(i1)));
  for(int i2=0;i2<s.length();i2++) {
     if(arr.get(i1).equals(arr1.get(i2))){
  count++;
break;
 }
    }
   }
  if(count==s.length()) {
    for(int n=0;n<s1.length();n++) {
      for(int na=0;na<s1.length();na++){
      if(arr.get(n).equals(arr1.get(na))) {
      count1++;
      }
      }
      }
      for(int n1=s1.length();n1<s1.length()+s2.length();n1++) {
      for(int nb=s1.length();nb<s1.length()+s2.length();nb++){
      if(arr.get(n1).equals(arr1.get(nb))) {
      count2++;
      }
      }
      }
      for(int n2=s2.length();n2<s.length();n2++) {
        for(int nc=s2.length();nc<s.length();nc++) {
      if(arr.get(n2).equals(arr1.get(nc))) {
      count3++;
      }
      }
      }
      if(count1!=0&&count2!=0&&count3!=0)
        output1="Valid shuffle String";
      else
        output1="invalid shuffle String";
        
      
     //output1="Valid shuffle String";
    }
  else {
   output1="invalid shuffle String";
 }

}
}
}
