Arrays.sort(arr);
    	Arrays.sort(dep);
    	
    	int plat = 1;
    	int max = 1;
    	int i=0, j=0;
    	
    	while(i<n && j<n) {
    	    if(arr[i] <= dep[j]) {
    	        plat++; i++;
    	    } else {
    	        plat--; j++;
    	    }
    	    if(plat > max) max = plat;
    	}
    	
    	return max;
// Example 1:

// Input: n = 6 
// arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
// dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
// Output: 3
// Explanation: 
// Minimum 3 platforms are required to 
// safely arrive and depart all trains.
// Example 2:

// Input: n = 3
// arr[] = {0900, 1100, 1235}
// dep[] = {1000, 1200, 1240}
// Output: 1
// Explanation: Only 1 platform is required to 
// safely manage the arrival and departure 
// of all trains. 
