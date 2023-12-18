public class MethodsMethods {

	public static void main(String[] args) { // icyHot problem in warmup-1 section, codingbat dot com
		MethodsMethods m = new MethodsMethods();
		System.out.println(m.icyHot(2, 120));
	}

	public boolean icyHot(int temp1, int temp2) {
		if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
			return true;
		} else {
			return false;
		}
	}
}
