
public class WrapperClassConvert {

	public static void main(String[] args) {
	     int object = 10;
	     CovertToWrapper(object);

		}

		private static Integer CovertToWrapper(int object) {
			Integer b = Integer.valueOf(object);
			Float c = Float.valueOf(object);
			
				if (b instanceof Integer) {
					System.out.println(b);
				}else
				{
					System.out.println("Give proper primitive as input");
				}
		
			return b;
		}

}
