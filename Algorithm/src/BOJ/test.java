package BOJ;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		int re = 0;
		for(int i=0; i<5; i++)
		{
			num[i] = ++i;
		}
		for(int n : num)
		{
			System.out.print(n+ " ");
		}
	}

}
