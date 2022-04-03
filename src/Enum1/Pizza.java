package Enum1;

public enum Pizza {
    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, false, true),
    PROSCIUTTO(true, true, true, false);

    private boolean sauce;
    private boolean cheese;
    private boolean ham;
    private boolean mushrooms;

    private Pizza(boolean sauce, boolean cheese, boolean ham, boolean mushrooms){
        this.sauce = sauce;
        this.cheese = cheese;
        this.ham = ham;
        this.mushrooms = mushrooms;
    }

    @Override
    public String toString() {
        String result = "{";
        if(sauce){ result+="sos pomidorowy,";}
        if(cheese){ result+="ser,";}
        if(ham){ result+="szynka,";}
        if(mushrooms){ result+="pieczarki";}
        result+="}";
        return result;
    }

    public static Pizza fromOrdinal(int ordinal){
        Pizza[] values = values();
        for (Pizza pizza: values
             ) {
            if(ordinal == pizza.ordinal()){
                return pizza;
            }
        }
        return null;
    }
}
