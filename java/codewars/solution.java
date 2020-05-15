public class solution{


	public static void main(String[] args){
		twoSums_codewars();
	}

	public static void findParityOutlier_codewars(){
		findoutlier fo = new findoutlier();
		int[] exampleTest1 =  {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
		System.out.println(fo.find(exampleTest1));
	}

	public static void nextBiggerNum_codewars(){
		nextBiggerNum nbn = new nextBiggerNum();
		nbn.findNbn(12);
	}

	public static void camelCasing_codewars(){
		camelcasing c = new camelcasing();
		System.out.println(c.breakCamel("thisIsCamelCasing!"));	
	}

	public static void nthRank_codewars(){
		nthRank r = new nthRank();

		String st = "This,Is,The,Test";
		int[] we =  {1,2,3,4};
		int  n = 4;
		r.getNthRank(st,we,n);
	}

	public static void twoSums_codewars(){

		twoSums s = new twoSums();

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int target = 19;
		s.calcTwoSums(arr,target);

	}

}

