import java.util.*;
public class encryption {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("input1 => ");
        int N=in.nextInt();
        System.out.print("input2 => ");
        int K=in.nextInt();
        System.out.print("input3 => ");
        in.nextLine();
        String input=in.nextLine();
        String output="";
        String CA=" ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String SA=" abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        ArrayList<String> S=new ArrayList<>();
        String[] str=input.split("");
        for(int j=0;j<N;j++){
            int key=0;
            if(str[j].matches("[a-z]+")){
               key=SA.indexOf(str[j])+K;
               while(key>26){
                   key%=26;
               }
               S.add(SA.substring(key,key+1));
            }
            else if(str[j].matches("[A-Z]+")){
                key=CA.indexOf(str[j])+K;
                while(key>26){
                    key%=26;
                }
                S.add(CA.substring(key,key+1));
            }
            else if(str[j].matches("[0-9]+")){
                key=num.indexOf(str[j])+K;
                while(key>9){
                     key%=9;
                }
                S.add(num.substring(key, key+1));
            }
            else{
                S.add(str[j]);
            }
        }
        for(int i=0;i<N;i++){
            output+=S.get(i);
        }
        System.out.println(output);
        in.close();
    }
}
