import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.HashSet;

class Codechef
{
    public static int findFirstDuplicate(int arr[]){
        
        for(int i=0;i<arr.length;i++){
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[i]==arr[j]){
		            return arr[i];
		        }
		    }
		    	if(arr[i]==2)
		            break;
		}
		return -1;
    }
    
    public static int findFirstDuplicateHashset(int[] arr) {
        HashSet<Integer> seen=new HashSet<>();
        int duplicate=-1;
        
        for(int num:arr){
            if(seen.contains(num)){
                duplicate=num;
                break;
            }
            seen.add(num);
        }
        return duplicate;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[]={1,2,3,2,5};
		
		int duplicate=findFirstDuplicateHashset(arr);
		System.out.println(duplicate);
		
	

	}
}
