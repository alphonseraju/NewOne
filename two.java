package daliycodes;

public class two {
	public abstract class Shape {
	    abstract void draw();
	    
	    void resize() {
	        System.out.println("Resizing the shape");
	    }
	}

	public class Circle extends Shape {
	    @Override
	    void draw() {
	        System.out.println("Drawing a circle");
	    }
	}


}
