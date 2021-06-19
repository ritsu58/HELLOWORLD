import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("イヌ");
		animals.add("ネコ");
		animals.add("ライオン");
		for(String i : animals) {
			System.out.println(i);
		}
    }
}