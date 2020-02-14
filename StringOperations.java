import java.util.*;
import java.io.*;

class StringOperation{
	
	public void compare(String a,String b){
		if(a.equals(b)){
			System.out.println("It is equal");
		}
		else{
			System.out.println("It is not equal");
		}
	}

	public void palindrome(String data){
		StringBuffer sb = new StringBuffer(data);
		String str1 = sb.reverse().toString();
		
		if(data.equals(str1)){
			System.out.println("It is a plaindrome");
		}
		else{
			System.out.println("Not a plaindrome");
		}
	}
	
	public void substring(String a,String b){
		int occ = 0;
		for(int i=0;i<a.length();i++){
			int temp = 0;
			if(a.charAt(i) == b.charAt(temp)){
				for(int j=0;j<b.length();j++){
					if(j == b.length()-1){
						occ++;
					}		
				}
				temp++;
			}
		}
		System.out.println("Occuraces : "  + occ );
	}
	/*
	public void replacement(String a,String b,String c){

		for(int i=0;i<b.length();i++){
			a = a.replaceAll(b,c);
		}
		System.out.println("The Correct Updated Word is : ");
		System.out.println(a); 
	}
	
	public void replacement1(String a,String b,String c){
		
		for(int i=0;i<a.length();i++){
			int temp = 0;
			if(a.charAt(i) == b.charAt(temp)){
				for(int j=0;j<b.length();j++){
					a.replace(b.charAt(j),c.charAt(j));
					i++;	
				}
			}
		}
		
		System.out.println("The Correct Output : ");
		
		for(int i=0;i<a.length();i++){
			System.out.print(a.charAt(i));
		}	
	}
	
		*/
	public void replacement(String a,String b,String c){ 
		String result = a.replace(b,c);
		System.out.println(result);
	}
	
	public void delete(String a,String b){ 
		int indexf = 0;
		
		for(int i=0;i<a.length();i++){
			int temp = 0;
			if(a.charAt(i) == b.charAt(temp)){
				indexf = i;			
			}
		}
		
		StringBuffer data = new StringBuffer(a);
		//data = a;
		int indexl = indexf + (b.length());
		System.out.println(indexf + indexl);
		
		StringBuffer result = new StringBuffer();
		
		result = data.delete(indexf,indexl);
		System.out.println(result);
		
		}
}


class prac6{
	public static void main(String[] args) throws IOException {
	
		StringOperation so = new StringOperation();
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.) Find string is palindrome or not \n2.) To compare two strings \n3.) Find number of occurrences of a substring within a string \n4.) To  replace substring with other string");
		System.out.print("Select Option : ");
		int option = sc.nextInt();
		
		
		
		switch(option){
			case 1:
				System.out.print("Enter data");
				String x = sc.next();
				so.palindrome(x);
				break;
			case 2:
				System.out.print("String 1");
				String y = sc.next();
				System.out.print("String 2");
				String z = sc.next();
				so.compare(y,z);
				break;
			case 3:
				System.out.println("Enter a string"); 
				String s1 = ob.readLine();
				System.out.print("Enter Sub - String : ");
				String s2 = ob.readLine();
				so.substring(s1,s2);
				break;
			case 4:
				System.out.print("Enter String : ");
				String val1 = sc.next();
				System.out.print("Enter Sub - String : ");
				String val2 = sc.next();
				System.out.print("Enter replacement : ");
				String val3 = sc.next();
				so.replacement(val1,val2,val3);
				break;
			case 5:
				System.out.print("Enter String : ");
				String d1 = sc.next();
				System.out.print("Enter String to delete : ");
				String d2 = sc.next();
				so.delete(d1,d2);
				break;
				
		}
	
	}
}