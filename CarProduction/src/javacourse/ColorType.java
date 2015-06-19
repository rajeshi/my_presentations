package javacourse;

public enum ColorType {
    
    WHITE("White"),
    BLACK("Black"),
    IVORY_SILVER("Ivory Silver"),
    RED("Red");
    
    private final String color;

    private ColorType(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public static void printAllAvailableColors() {
        for (ColorType ct : ColorType.values()) {
            System.out.println(ct.getColor());
        }
    }
}
