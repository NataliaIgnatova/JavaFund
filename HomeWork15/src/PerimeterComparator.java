import java.util.Comparator;

public class PerimeterComparator implements Comparator<Figure>{

	@Override
	public int compare(Figure fig1, Figure fig2) {
		// TODO Auto-generated method stub
		return (int) (fig1.calcPerimeter()-fig2.calcPerimeter());
	}
	
}
