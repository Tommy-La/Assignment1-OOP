package utility;

import java.util.Comparator;

import shape.Shape;

public class BaseAreaComparator implements Comparator<Shape>{
	@Override
	public int compare(Shape s1, Shape s2) {
		if (s1.getBaseArea() > s2.getBaseArea()) {
			return 1;
		}
		else if (s1.getBaseArea() < s2.getBaseArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
}
