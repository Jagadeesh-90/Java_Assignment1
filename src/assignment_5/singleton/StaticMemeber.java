package assignment_5.singleton;

public class StaticMemeber {
    private  String name;
//    public StaticMember(String str){
//        this.name=str;
//    }
    public static StaticMemeber initializeString(String str){

        StaticMemeber obj= new StaticMemeber();
        obj.name=str;
        return obj;
    }
    public void printString(){

        System.out.println(name);
    }

}
