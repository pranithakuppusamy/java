import java.util.*;
public class UserIDGeneration{
public static void main(String args[]){
    boolean f=true;
    while(f){
    Scanner sc = new Scanner(System.in);
    System.out.print("First_Name = ");
    String fn=sc.nextLine();
    System.out.print("Last_Name = ");
    String ln = sc.nextLine();
    System.out.print("PIN = ");
    int pin = sc.nextInt();
    if(pin<0){
        System.out.println("Negative pin! not supported");
        continue;
    }
    System.out.print("N = ");
    int n=sc.nextInt();
    int length = String.valueOf(pin).length();
    if(length>=n&&n>0){
        userIdGeneration(fn,ln,pin,n);
    }
    else{
       
        System.out.println("ERROR");
    }
    sc.close();
    f=false;
}
}
public static void userIdGeneration(String input1,String input2,int input3,int input4 ){
    String Sn,Ln,output1="",o="";
    char output;
    ArrayList <Integer> arr = new ArrayList<>();
    ArrayList <String> arr1 = new ArrayList<>();
    if(input1.length()==input2.length()){
        String i1=input1.toUpperCase();
        String i2=input2.toUpperCase();
        int i=0;
        for(;i<input1.length();i++){
            if(i1.substring(i,i+1).equals(i2.substring(i,i+1)))continue;
            else break;
        }
        if(i==input1.length()){
            i--;
        }
        char ch = i1.charAt(i); 
        int in1 = (int) ch; 
        char ch1 = i2.charAt(i); 
        int in2 = (int) ch1; 
        if(in1<in2){
           Sn = input1;
           Ln = input2;
        }
        else{
            Sn = input2;
            Ln = input1;
        }
         output1=Sn.substring(Sn.length()-1)+Ln;
    }
    else{
        if(input1.length()<input2.length()){
            Sn=input1;
            Ln=input2;
        }
        else{
            Sn=input2;
            Ln=input1;
        }
        output1=Sn.substring(Sn.length()-1)+Ln;
    }
    while(input3!=0){
        int rem =0;
        rem=input3%10;
        arr.add(rem);
        input3/=10;
    }
    int r = arr.get(input4-1);
    Collections.reverse(arr);
    int ar = arr.get(input4-1);
    output1+=ar+""+r;
    for(int j=0;j<output1.length();j++){
        arr1.add(output1.substring(j,j+1));
        char c=arr1.get(j).charAt(0);
        if(Character.isUpperCase(c)){
          output=Character.toLowerCase(c);
          o+=String.valueOf(output);
        }
        else{
            output=Character.toUpperCase(c);
            o+=String.valueOf(output);
        } }
    System.out.println("user-id = "+o);
}}