public class nthRank{

	static String getNthRank(String st, int[] we, int n){
		String[] name = st.toLowerCase().split(",");

		if(name.length == we.length){
			for(int i = 0; i< name.length; i++){
				int sum = name[i].chars().reduce(0, Integer::sum);
				sum -= ((96*name[i].length()) - name[i].length());
				System.out.println(sum);
			}
		}

		return "";
	}
}
