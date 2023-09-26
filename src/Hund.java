public abstract class Hund {

    public Bellverhalten bellverhalten;

    public void setBellverhalten(Bellverhalten bellverhalten) {
        this.bellverhalten = bellverhalten;
    }

    public Bellverhalten getBellverhalten() {
        return bellverhalten;
    }

    public void bellen(){
        bellverhalten.bellen();
    }

}
