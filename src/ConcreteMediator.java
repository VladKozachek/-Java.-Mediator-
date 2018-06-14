import java.util.ArrayList;

public class ConcreteMediator implements Mediatior {
  private   ArrayList<Colegue> collegues = new ArrayList();

    public void addCollege(Colegue c){
        collegues.add(c);
    }

    @Override
    public void sendMessage(Colegue colegue, String message) {
       for (Colegue item: collegues){
           item.getMessage(message);
       }
    }
}
