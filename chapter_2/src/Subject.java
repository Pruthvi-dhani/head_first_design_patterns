// strive for loosely coupled designs between objects that interact
// observer pattern keeping objects in the know
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
