package javacourse;

public class Counter {

    private static Counter instance;
    private static int counter;

    private Counter() {
    }

    public static Counter createInstance() {
	if (instance == null) {
	    instance = new Counter();
	    counter = 0;
	}
	return instance;
    }

    public void updateCounter() {
	counter++;
    }

    public int getCounter() {
	return counter;
    }
}
