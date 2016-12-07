import java.util.*;
class SC { 
  public static void main(String args[]){ 
    Scanner str = new Scanner(System.in);
    String a="";
	  String s="";
    System.out.println("\n\t\t Welcome TO String Cryptography System\n");
    System.out.println("\n Enter a String");
    a=str.nextLine();
    int n=a.length();
    int i;
		System.out.println("\n Enter the Key = ");
		int key = str.nextInt();
		System.out.println("Encrypted value = ");
    for(i=0;i<n;++i){
      char pass = a.charAt(i);
			int tmp = (int)pass - key;
			char pass1 = (char)tmp;
			System.out.print(pass1);
    }
  }
}
