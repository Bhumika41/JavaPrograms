package arrays;

import java.util.HashMap;
import java.util.Arrays;
public class Twosumhash{
public static void main(String[] args){
Twosumhash obj=new Twosumhash();
int[] nums={2,7,11,15};
int target=9;
int[] result=obj.twoSum(nums,target);
System.out.println(Arrays.toString(result));
}
public int[] twoSum(int[] nums,int target){
HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++){
int res=target-nums[i];
if(map.containsKey(res)){
return new int[]{map.get(res),i};
}
map.put(nums[i],i);
}
return new int[]{};
}
}