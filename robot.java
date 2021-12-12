import java.util.*;
public class robot{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
int input1=in.nextInt();
int input2=in.nextInt();
String input3=in.nextLine();
String input4=in.nextLine();
in.close();
String[] sp=input3.split("-");
String[] mp=input4.split(" ");
String Od=sp[2];
int x=Integer.parseInt(sp[0]);
int y=Integer.parseInt(sp[1]);
int f=0;
String result=x+"-"+y+"-ER";
for(int i=0;i<mp.length;i++){
  if(x<=input1&&y<=input2){
       if(Od=="E"){
           f=0;
           switch(mp[i]){
               case "R":{
                   f=1;
                   Od="S";
                   Od.toUpperCase();
                break;
               }
               case "L":{
                   f=2;
                   Od="N";
                   Od.toUpperCase();
                   break;
               }
               case "M":{
                   if(f==1){
                      y-=1;
                   }
                   else if(f==2){
                       y+=1;
                   }
				   else{
					   x+=1;
				   }
                   break;
               }
           }
       }
       else if(Od=="W"){
           f=0;
           switch(mp[i]){
               case "R":{
                   f=1;
                   Od="N";
                break;
               }
               case "L":{
                   f=2;
                   Od="S";
                   break;
               }
               case "M":{
                   if(f==1){
                      y+=1;
                   }
                   else if(f==2){
                       y-=1;
                   }
				   else{
					   x-=1;
				   }
                   break;
               }
           }
       }
       else if(Od=="S"){
             f=0;
           switch(mp[i]){
               case "R":{
                   f=1;
                   Od="W";
                   Od.toUpperCase();
                break;
               }
               case "L":{
                   f=2;
                   Od="E";
                   break;
               }
               case "M":{
                   if(f==1){
                      x-=1;
                   }
                   else if(f==2){
                       x+=1;
                   }
				   else{
					   y-=1;
				   }
                   break;
               }
           }
       }
       else{
          f=0;
           switch(mp[i]){
               case "R":{
                   f=1;
                   Od="E";
                break;
               }
               case "L":{
                   f=2;
                   Od="W";
                   break;
               }
               case "M":{
                   if(f==1){
                      x+=1;
                   }
                   else if(f==2){
                       x-=1;
                   }
				   else{
					   y+=1;
				   }
                   break;
               }
           }
   }
   
    result=x+"-"+y+"-"+Od;
   }
   else{
	  result=x+"-"+y+"-ER";
    
   }

}
System.out.println(result.toUpperCase());
}
}