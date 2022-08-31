package string;

import java.lang.reflect.Array;

import org.testng.annotations.Test;

public class countWords {
	@Test
	public void example1() {
		String s1 = "Hi How are you...";
		//countWordsFromString(s1);

		int[] arr = {2,7,11,15};
		int target=9;

		int[] ar = countWordsFromString(arr, target);
		System.out.println(ar.toString());
	}

	private int[] countWordsFromString(int[] nums, int target){
		//private void countWordsFromString(String s1) {
		//		String[] str =  s1.split(" ");
		//		System.out.println(str.length);

		int i=0,j=0;
		while(i<nums.length-1 && j<nums.length-1){
			if(nums[i]+nums[j]==target){
				j++;
			}else if(nums[i]+nums[j]<target){
				j++; 
			}else{
				j++; 
			}
			return new int[] {i, j-1};
		}
		i++;
	}




}
