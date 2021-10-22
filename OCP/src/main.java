import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class main {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		
		Predicate<Animal> checker = b->b.canHop();
		Consumer<Integer> consumer = x -> x.doubleValue();
		Supplier<Integer> random = () ->  new Random().nextInt();
		Comparator<Integer> ints = (i1, i2) -> i1 * i2;
		

		System.out.println(random.get());
		System.out.println(ints.compare(3, 9));

	}

	
	
}
