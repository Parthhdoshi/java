/*package whatever //do not write package name here */

import java.util.*;

class findelement {
	public static void main (String[] args) {
		//code
		int s[] = new int[100];
		Scanner cs = new Scanner(System.in);
// 		{ 82 927 282 546 930 68 371 531 124 363 328 435 422 70 43 199 803 369 387 815 368 85 28 887 171 212 789 568 874 230 926 336 60 541 764 997 430 847 957 59 493 125 920 88 168 427 374 314 306 538, 457, 12, 751, 858, 863, 325, 527, 92, 737, 916, 136, 337, 730, 981, 277, 896, 414, 179, 778, 691, 44, 316, 365, 583, 783, 173, 785, 506, 794, 650, 394, 23, 809};
		int n = s.length;
		for(int i=0;i<n;i++){
		    s[i] = cs.nextInt();
		}
		for(int i=0;i<n;i++){
		    int count = 0;
		    for(int j=0;j<n;j++){
		        if(s[i] > s[j]){
		         count++;   
		        }
		    }
		    if(count >= 2){
		        System.out.println(s[i] + " ");
		    }
		}
		cs.close();
	}
}