package trilha.back.financys.enums;

public enum Type {
    REVENUE("revenue"),
    EXPENSE("expense");
    private String type;

    private Type(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
}
