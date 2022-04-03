package Enum2;

public enum Status {
    NEW("Nowe"), PAID("Opłacone"), SHIPPED("Wysłane"), DELIVERED("Dostarczone"), CANCELLED("Anulowane");

    private final String descripton;

    private Status(String description){
        this.descripton = description;
    }

    public String getDescripton() {
        return descripton;
    }

    @Override
    public String toString() {
        return descripton;
    }

    public static Status fromName(String name){
        Status[] values = values();
        for (Status status: values
             ) {
            if(status.name().equals(name)){
                return status;
            }
        }
        return null;
    }
}
