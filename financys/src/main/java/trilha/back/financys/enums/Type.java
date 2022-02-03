package trilha.back.financys.enums;

import trilha.back.financys.exceptions.NotFoundParamException;

public enum Type {

    revenue("revenue"), expense("expense");

    private String type;

    private Type(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }

    public static Type valueOfType(String name){
        for(Type value: Type.values()){
            if(name == value.getType())
                return value;
        }
        throw new NotFoundParamException("Tipo inválido");
    }
}
