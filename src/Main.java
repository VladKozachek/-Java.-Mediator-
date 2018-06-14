public class Main {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator=new ConcreteMediator();
        Colegue collegue1=new ConcreteColegue(concreteMediator);
        Colegue collegue2=new ConcreteColegue(concreteMediator);
        Colegue collegue3=new ConcreteColegue(concreteMediator);
        concreteMediator.addCollege(collegue1);
        concreteMediator.addCollege(collegue2);
        concreteMediator.addCollege(collegue3);

        collegue1.sendMessage("Привет");
    }
}
