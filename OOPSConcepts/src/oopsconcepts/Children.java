package oopsconcepts;

public class Children extends Parent {

    public void inheritProperties() {
	super.setProperty("Bungalow");
	super.setImmovableProperty("100 Acres Farm Land");
	String prop = super.getProperty();
	String grandpaProp = super.getImmovableProperty();
	System.out.println(prop);
	System.out.println(grandpaProp);
    }

    @Override
    public String getProfession() {
	return "Software Developer";
    }
}
