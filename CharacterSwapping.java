import java.util.*;
public class CharacterSwapping {
public static void main(String[] args) {
int l=0;
String s="",s1="";
String listString="" ;
int c=0;
System.out.print("Input1 => ");
Scanner sc = new Scanner(System.in);
String sentence = sc.nextLine();
List<String> str_arr = new ArrayList<>();
List<String> str_arr1 = new ArrayList<>();
List<String> str_arr2 = new ArrayList<>();
ArrayList <String> arr = new ArrayList<>();
String[] ar = sentence.split(" ");
if(ar.length%2==0) {
 for(int j=0; j<ar.length-1;j++) {
   if(ar[j].length()==ar[j+1].length()) {
     arr.add(ar[j+1]);
     arr.add(ar[j]);
     }
    else {
      s="";
      s1="";
      str_arr.clear();
      str_arr1 = Arrays.asList(ar[j].split(""));
      str_arr2 =Arrays.asList(ar[j+1].split(""));
      str_arr.addAll(str_arr1);
      str_arr.addAll(str_arr2);
      if(str_arr1.size()<str_arr2.size()){c=str_arr1.size();}
      else {c=str_arr2.size(); }
     for(int j1=0;j1<c;j1++)
        Collections.swap(str_arr,j1,j1+str_arr1.size());
     for(int p=0;p<str_arr1.size();p++) {
        s+=str_arr.get(p);
       }
     for(int p=str_arr1.size();p<str_arr.size();p++) {
       s1+=str_arr.get(p);
      }
    }
    if(str_arr1.size()>str_arr2.size()){
     listString+=s.substring(0,c)+" "+s.substring(c,str_arr1.size())+s1+" ";
    }
    else{
      listString+=s.substring(0,c)+" "+s1.substring(c,str_arr2.size())+s1.substring(0, c)+" ";
    }
     j++;
    }
   System.out.println("Output => "+listString);
  }
else {
  for(int j=0; j<ar.length-2;j++) {
    if(ar[j].length()==ar[j+1].length()) {
      arr.add(ar[j+1]);
      arr.add(ar[j]);
      }
     else {
       s="";
       s1="";
       str_arr.clear();
       str_arr1 = Arrays.asList(ar[j].split(""));
       str_arr2 =Arrays.asList(ar[j+1].split(""));
       str_arr.addAll(str_arr1);
       str_arr.addAll(str_arr2);
       if(str_arr1.size()<str_arr2.size()){c=str_arr1.size();}
       else {c=str_arr2.size(); }
      for(int j1=0;j1<c;j1++)
         Collections.swap(str_arr,j1,j1+str_arr1.size());
      for(int p=0;p<str_arr1.size();p++) {
         s+=str_arr.get(p);
        }
      for(int p=str_arr1.size();p<str_arr.size();p++) {
        s1+=str_arr.get(p);
       }
     }
     if(str_arr1.size()>str_arr2.size()){
      listString+=s.substring(0,c)+" "+s.substring(c,str_arr1.size())+s1+" ";
     }
     else{
       listString+=s.substring(0,c)+" "+s1.substring(c,str_arr2.size())+s1.substring(0, c)+" ";
     }
      j++;
      l=j;
     }
    String[] a=ar[l+1].split("");
    String t="";
    for(int p=a.length-1;p>=0;p--){
      t+=a[p];
    }
  System.out.println("Output=> "+listString+" "+t);
 }
 sc.close();
}
}