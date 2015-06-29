package oopsconcepts;

public class GrandParent {
    private String immovableProperty;
    protected String nextGenProperty;

    public GrandParent() {
	PrivateClass clazz = new PrivateClass();
	clazz.setPrivateField("Test Private Field");
	ProtectedClass anotherClazz = new ProtectedClass();
	anotherClazz.setProtectedField("Test Private Field");
    }
    
    public String getImmovableProperty() {
	return immovableProperty;
    }

    public void setImmovableProperty(String immovableProperty) {
	this.immovableProperty = immovableProperty;
    }

    public String getProfession() {
	return "Government Clerk";
    }
}
