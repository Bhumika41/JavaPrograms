package searchalgorithm;

import java.util.Scanner;
public class linearstring{
public static int linearSearch(String str,char target){
for(int i=0;i<str.length();i++){
if(str.charAt(i)==target){
return i;
}
}
return -1;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
char target=sc.next().charAt(0);
System.out.println(linearSearch(s,target));
}
}