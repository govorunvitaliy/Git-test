public class Cycle {
	public static void main(String args[]){
	/*	int[] m = new int[5];
		for(int x=0;x<5;x++){
			m[x]=x;
			System.out.println(m[x]);
		}*/
		int[][] m = {{1,4,6},{8,9},{2,5,3}};
		
		for(int row=0;row<m.length;row++){
			for(int col=0;col<m[row].length;col++){
				System.out.print(m[row][col] +"  ");
				try{
					Thread.sleep(1500);
				}catch(Exception e){}
			}
			System.out.println();
		}
	}
}