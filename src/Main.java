public class Main {
    public static void main(String[] args) {

        Hund bodo = new Dackel();
        Hund jack = new Dalmatiner();
        Hund russel = new Pitbull();

        bodo.setBellverhalten(new LeisesBellen());
        bodo.bellen();
        jack.setBellverhalten(new LeisesBellen());
        jack.bellen();
        russel.setBellverhalten(new LautesBellen());
        russel.bellen();
        System.out.println("Schnautze russel!");
        russel.setBellverhalten(new LeisesBellen());
        russel.bellen();

    }
}