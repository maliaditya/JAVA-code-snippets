class Cricket{

	public static void main(String[] args) {
		
		Cricket test = new Cricket();
		Cricket oneDay = new Cricket();
		Cricket t20 = new Cricket();

		boolean res;

		res = test instanceof Cricket;

		System.out.println(res);
		System.out.println(oneDay instanceof Cricket);
		System.out.println(t20 instanceof Cricket);
		System.out.println(t20 instanceof Object);



	}
}