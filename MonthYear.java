import java.util.*;
import java.util.regex.Pattern;
public class MonthYear{
public static int output2;
public static void main(String[] args) {
boolean f= true;
while(f) {
Scanner in = new Scanner(System.in);
System.out.println("input => ");
StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();
ArrayList<String> input1 = new ArrayList<String>();
System.out.print("Enter the Start Year:");
String sy = in.nextLine();
         if(sy.length()!=4)
        continue;
         
         System.out.print("Enter the End Year:");
         String ey = in.nextLine();
         if(ey.length()!=4)
            continue;
         System.out.print("Enter the Shuffled:");
         String sm=in.nextLine();
         if(sm.length()==7) {
         for (int i=0; i<sm.length(); i++)
          {
         if (Character.isDigit(sm.charAt(i)))
              num.append(sm.charAt(i));
          else if(Character.isAlphabetic(sm.charAt(i)))
                alpha.append(sm.charAt(i));
           else
                 special.append(sm.charAt(i));
        }
         if(special.length()==0) {
         if(alpha.length()==3){
         f=false;
         }
         else {
         System.out.print("Please enter correct month");
         continue;
         }
         }
         else {
         System.out.println("Only Numbers and Characters are allowed");
         continue;
         }
           }
       else{
             continue;
         }
         
         f=false;
         input1.add(sy);
         input1.add(ey);
         input1.add(alpha.toString());
         input1.add(num.toString());
         System.out.println("Output1 => "+monthYear (input1 ));
         System.out.println("Output2 => "+ output2);
        
        
in.close();
}
}
public static ArrayList<String> monthYear( ArrayList<String> input1 ){
ArrayList<Integer> arr = new ArrayList<Integer>();
ArrayList<Integer> arr1 = new ArrayList<Integer>();
ArrayList<Integer> arr2 = new ArrayList<Integer>();
ArrayList<String> output1 = new ArrayList<String>();
String O="";
String lo="";
int sy=Integer.parseInt(input1.get(0));
int ey=Integer.parseInt(input1.get(1));
int y=Integer.parseInt(input1.get(3));
int ay=0,by=0;
while(y!=0) {
int rem=0;
rem= y%10;
arr1.add(rem);
ay+=rem;
y/=10;
}

for(int i=sy;i<=ey;i++){
int j=i;
by=0;
while(j!=0) {
int rem1=0;
rem1= j%10;
by+=rem1;
j/=10;
}
   if(by==ay){
 arr.add(i);
   }
}
for(int i=0;i<arr.size();i++) {
int count = 0;
int in=arr.get(i);
while(in!=0) {
int re = 0;
re = in%10;
for(int j=0;j<arr1.size();j++) {
  if(re==arr1.get(j)) {
  count++;
  }
}
in/=10; 
}
if(count==4) {
arr2.add(arr.get(i));
}
}
//String things begins
String str =(input1.get(2)).toUpperCase();
String s1;
int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0,count12=0;
boolean b1=Pattern.compile(str).matcher("JAN").matches();  
boolean b2=Pattern.compile(str).matcher("FEB").matches();  
boolean b3=Pattern.compile(str).matcher("MAR").matches();  
boolean b4=Pattern.compile(str).matcher("APR").matches();  
boolean b5=Pattern.compile(str).matcher("MAY").matches();  
boolean b6=Pattern.compile(str).matcher("JUN").matches();  
boolean b7=Pattern.compile(str).matcher("JUL").matches();  
boolean b8=Pattern.compile(str).matcher("AUG").matches();  
boolean b9=Pattern.compile(str).matcher("SEP").matches();  
boolean b10=Pattern.compile(str).matcher("OCT").matches();  
boolean b11=Pattern.compile(str).matcher("NOV").matches();  
boolean b12=Pattern.compile(str).matcher("DEC").matches();  
if(b1||b2||b3||b4||b5||b6||b7||b8||b9||b10||b11||b12) {
  O = str;
}
else {
char[] str_arr = new char[3];
for(int s=0;s<3;s++) {
   s1="";
str_arr[s]=str.charAt(s);
   s1 = Character.toString(str_arr[s]);
   if(s1.equalsIgnoreCase("J")||s1.equalsIgnoreCase("A")||s1.equalsIgnoreCase("N")) {
    count1++;
   }
   if(s1.equalsIgnoreCase("F")||s1.equalsIgnoreCase("E")||s1.equalsIgnoreCase("B")) {
    count2++;
   }
   if(s1.equalsIgnoreCase("M")||s1.equalsIgnoreCase("A")||s1.equalsIgnoreCase("R")) {
    count3++;
   }
   if(s1.equalsIgnoreCase("A")||s1.equalsIgnoreCase("P")||s1.equalsIgnoreCase("R")) {
    count4++;
   }
   if(s1.equalsIgnoreCase("M")||s1.equalsIgnoreCase("A")||s1.equalsIgnoreCase("Y")) {
    count5++;
   }
   if(s1.equalsIgnoreCase("J")||s1.equalsIgnoreCase("U")||s1.equalsIgnoreCase("N")) {
    count6++;
   }
   if(s1.equalsIgnoreCase("J")||s1.equalsIgnoreCase("U")||s1.equalsIgnoreCase("L")) {
    count7++;
   }
   if(s1.equalsIgnoreCase("A")||s1.equalsIgnoreCase("U")||s1.equalsIgnoreCase("G")) {
    count8++;
   }
   if(s1.equalsIgnoreCase("S")||s1.equalsIgnoreCase("E")||s1.equalsIgnoreCase("P")) {
    count9++;
   }
   if(s1.equalsIgnoreCase("O")||s1.equalsIgnoreCase("C")||s1.equalsIgnoreCase("T")) {
    count10++;
   }
   if(s1.equalsIgnoreCase("N")||s1.equalsIgnoreCase("O")||s1.equalsIgnoreCase("V")) {
    count11++;
   }
   if(s1.equalsIgnoreCase("D")||s1.equalsIgnoreCase("E")||s1.equalsIgnoreCase("C")) {
    count12++;
   }
}
if(count1==3)O="JAN";
if(count2==3)O="FEB";
if(count3==3)O="MAR";
if(count4==3)O="APR";
if(count5==3)O="MAY";
if(count6==3)O="JUN";
if(count7==3)O="JUL";
if(count8==3)O="AUG";
if(count9==3)O="SEP";
if(count10==3)O="OCT";
if(count11==3)O="NOV";
if(count12==3)O="DEC";
}
ArrayList<Integer> se=new ArrayList<>();
for(int p=0;p<arr2.size();p++) {
    int in1=arr2.get(p);
    se.clear();
    while(in1!=0) {
    int re = 0;
    re = in1%10;
    se.add(re);
    in1/=10; 
    }
    Set<Integer> s = new LinkedHashSet<Integer>(se);  
    if(s.size()==4){
      for(int g=s.size()-1;g>=0;g--){
        se.toString();
        lo+=se.get(g);
      }
      String S = O+"/"+lo;
      output1.add(S);
      lo="";
    }
   }
output2 =output1.size();
return output1;
}
}

