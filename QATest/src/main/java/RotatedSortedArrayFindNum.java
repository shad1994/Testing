
public class RotatedSortedArrayFindNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  5,6,9,12,13,15,1 
		int index=findNum(new int[] {5,6,9,12,13,15,1 }, 0, 6, 9);
		System.out.println(index);
	}
	
	
	public static int findNum(int[] n,int start,int end,int num) {
		while (end >= start) {
		
			int mid=(start+end)/2;
			
			if(n[mid]==num) {
				return mid;
			}
			if(n[start]<=n[mid]) {
				if(num >= n[start] && num<=n[mid]) {
					end =mid-1;
				}else
					start = mid+1;
			}
			else
			{
				if(num >n[mid] && num<=n[end]) {
					start = mid+1;
				}else
					end = mid-1;
			}
		}
		return -1;
	}
}
