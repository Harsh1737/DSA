public class Odd_occurance_in_array 
{ 
    public static void main(String[] args){
    	System.out.print(odd_times_occuring_num());
    }


//naive
    public static int odd_times_occuring_num(){
        int arr[] = {1,2,3,4,2,5,4,3,1};
		for (int i=0; i<arr.length;i++){
			int count =0;
			for (int j=0; j<arr.length;j++){
				if (arr[i]==arr[j])	count++;
			}
			if (count %2!=0) return arr[i];
		}
		return -1;    	
    }

    
//optimised

    public static int odd_times_occuring_num_O(){
    	
        int arr[] = {1,2,3,4,4,3,1};

    	int res = 0; 										//arr[0]^0 = arr[0]
    	for (int i=0;i<arr.length ;i++ ) {
    		res^=arr[i];
    	}
    	return res;
    }
}