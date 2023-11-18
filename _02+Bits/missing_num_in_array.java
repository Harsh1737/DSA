
public class missing_num_in_array 
{
    public static void main(String[] args)
    {
        System.out.print(get_missing_num());
    }
// n elements in range [1.. n+1] 
//Any 1 in range is missing
    public static int get_missing_num ()
    {
    	int arr[] = {1,5,6,4,3,2};
    	int res = 0;
    	for (int i=0;i<arr.length;i++){
    		res=res^arr[i];
    	}
    	for(int i=1;i<=arr.length+1;i++){
    		res^=i;
    	}
    	return res;
    }
}
