public class findoutlier{
	static int find(int[] integers){
	int[] outlier = new int[3];
	int result = 0;

	for(int i = 0; i<integers.length; i++){
		if(integers[i]%2 == 0){
			outlier[0] += 1;
			outlier[1] = integers[i];
		} else {
			outlier[2] = integers[i];
		}
	}

	if(outlier[0]>1){
		result = outlier[2];
	} else{
		result = outlier[1];
	}
	return result;

	}
}
