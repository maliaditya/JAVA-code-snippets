class Ternary{

	public static void main(String[] args) {
		
		int x =25;
		int y = 30;
		int z = 22;
		int ans = 0;
		String res = null;


		// result = (x>y) ? x : y;
		// System.out.println("result: " + result);

		
		res = (x>y) ? "x is small " : "y is greater " ;
		System.out.println(res);

		ans = (x>y) ? ((x>z)?x:z) : ((y>z)? y:z);
		System.out.println(ans);
	}
}