public class ConcreteColegue implements Colegue  {
    Mediatior mediatior;

    public ConcreteColegue(Mediatior mediatior) {
        this.mediatior = mediatior;
    }

    @Override
    public void sendMessage(String message) {
        mediatior.sendMessage(this,message);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("User получает сообщение " +message);
    }
}
