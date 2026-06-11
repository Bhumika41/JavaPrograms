package searchalgorithm;
import java.util.Scanner;

public class TwoDLinearsearch{

public static int[] linearSearch(int[][] num,int target){
for(int i=0;i<num.length;i++){
for(int j=0;j<num[i].length;j++){
if(num[i][j]==target){
return new int[]{i,j};
}
}
}
return new int[]{-1,-1};
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int rows=sc.nextInt();
int[][] num=new int[rows][];
for(int i=0;i<rows;i++){
int cols=sc.nextInt();
num[i]=new int[cols];
for(int j=0;j<cols;j++){
num[i][j]=sc.nextInt();
}
}
int target=sc.nextInt();
int[] result=linearSearch(num,target);
if(result[0]!=-1){
System.out.println("Found at row "+result[0]+" col "+result[1]);
}else{
System.out.println("Not Found");
}
}
}