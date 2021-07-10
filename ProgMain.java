import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProgMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		List<Autobuz> a = new ArrayList<Autobuz>();

		Autobuz a1 = new Autobuz(1982, "Aliosa", 10, 2, new int[] { 1, 2 });
		Autobuz a2 = new Autobuz(1984, "Alioel", 10, 3, new int[] { 1, 2, 3 });
		Autobuz a6 = new Autobuz(1993, "mama", 10, 3, new int[] { 1, 2, 3 });
		Autobuz a7 = new Autobuz(1998, "Tata", 10, 3, new int[] { 1, 2, 3 });

		a.add(a1);
		a.add(a2);
		a.add(a6);
		a.add(a7);

		List<Autobuz> sortat = new ArrayList<>();

		sortat = a.stream().filter(autobuz -> autobuz.an >= 1990).collect(Collectors.toList());

		Autobuz a3 = a2.myClone();
		Autobuz a4 = (Autobuz) a2.clone();
		System.out.println(a4.toString());

		/*Autobuz a5 = new Autobuz(1984, "Alioel", 10, 3, new int[] { 1, 2, 3 });
		for (Autobuz autobuz : a) {
			System.out.println(autobuz.toString());
		}*/

		for (Autobuz autobuz : sortat) {
			System.out.println(autobuz.toString());
		}
	}
}
