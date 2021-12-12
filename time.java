import java.util.*;
public class time {
		public static void main(String[] args) {
		boolean f=true;
		while(f) {
     	Scanner in = new Scanner(System.in);
     	System.out.print("Enter the Four Digits of the Time : ");
     	int[] arr=new int[4];
     	for(int i=0;i<4;i++) {
     		arr[i]=in.nextInt();
     		if(arr[i]<0||arr[i]>9) {
     			System.out.println("Positive and One Digit values only allowed !");
     			f=false;
     			break;
     		}
     	}
     	if(f) {
     	System.out.println("Output = "+possibleTime(arr));
     	f=false;
     	}
     	else {
     		f=true;
     		continue;
     	}
     	in.close();
		}
	}
  public static String possibleTime(int[] time) {
	  String dd="";
	  int o1=0,o2=0;
	  int l=2,l1=1;
	  String result="";
	  ArrayList<String> ars=new ArrayList<>();
	  ArrayList<String> arl=new ArrayList<>();
	  for(int i=0;i<time.length;i++) {
		  for(int j=0;j<time.length;j++) {
			  if(i!=j) {
				  dd=time[i]+""+time[j];
				  if(Integer.parseInt(dd)<24) {
					  ars.add(dd);
				  }
				  else if(Integer.parseInt(dd)>24 && Integer.parseInt(dd)<60) {
					  arl.add(dd);
				  }
				  else {
					  continue;
				  }
			  }
			
		  }
	  }
	  Arrays.sort(ars.toArray());
	  Arrays.sort(arl.toArray());
	  if(arl.size()==0&&ars.size()==0) {
		  return("-1");
	  }
	  else if(arl.size()==0) {
		  int sd=Integer.parseInt(ars.get(ars.size()-1));
		  o2=sd;
		  int sd1 = sd%10;
		  int sd2= sd/10;
		  int count=0;
		  while(l<=arl.size()) {
		  count=0;
		  int bd=Integer.parseInt(ars.get(ars.size()-l));
		  int bd1=bd%10;
		  int bd2=bd/10;
		  if(sd1==bd1||sd1==bd2) {
			  count++;
		  }
		  else if(sd2==bd1||sd2==bd2) {
			  count++;
		  }
		  if(count==0) {
			  	o1=bd;
			  	break;
		  }
		  l++;
		  }
		  if(o1==0) {
			  o1=o2;
		  }
		  result=o1+":"+o2;
		  return(result);
		  
	  }
	  else if(ars.size()==0) {
		  return("-1");
	  }
	  else{
		  int sd=Integer.parseInt(ars.get(ars.size()-1));
		  int sd1 = sd%10;
		  int sd2= sd/10;
		  int count=0;
		  while(l1<=arl.size()) {
			  count=0;
		  int bd=Integer.parseInt(arl.get(arl.size()-l1));
		  int bd1=bd%10;
		  int bd2=bd/10;
		  if(sd1==bd1||sd1==bd2) {
			  count++;
		  }
		  else if(sd2==bd1||sd2==bd2) {
			  count++;
		  }
		  if(count==0) {
			  	o2=bd;
			  	break;
		  }
		  l1++;
		  }
		  result=sd+":"+o2;;
		  return(result);
	  }
  }

}
