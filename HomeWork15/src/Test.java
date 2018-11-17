import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Figure> figures = new ArrayList<>();
		Square square = new Square(5, 3);
		Square nSquare = new Square(4, 2);
		Circle circle = new Circle(6);
		Circle nCircle = new Circle(3);

		figures.add(square);
		figures.add(nSquare);
		figures.add(circle);
		figures.add(nCircle);

		Comparator comparator = new PerimeterComparator();

		for (Figure figure : figures) {
			System.out.println(figure);
		}

		Collections.sort(figures, comparator);

		System.out.println("After sort");

		for (Figure figure : figures) {
			System.out.println(figure);
		}
		
		Set<Figure> treeSet = new TreeSet<>(comparator);
		Queue<Figure> priorityQueue = new PriorityQueue<>(comparator);
		treeSet.addAll(figures);
		priorityQueue.addAll(figures);
		
		System.out.println("TreeSet:");
		for(Figure figure:treeSet){
			System.out.println(figure);
		}
		
		System.out.println("PriorityQueue:");
		for(Figure figure:priorityQueue){
			System.out.println(figure);
		}
		

	}

}
