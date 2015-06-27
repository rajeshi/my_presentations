package oopsconcepts;

public class Parent extends GrandParent {
    private String property;
   
    public String getProperty() {
	return property;
    }

    public void setProperty(String movableProperty) {
	this.property = movableProperty;
    }

    @Override
    public String getProfession() {
	return "Income Tax Consultant";
    }
}
