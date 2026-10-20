public class Main {

    public static void main(String[] args) {

        Cmodels model = new Cmodels();
        Cviews view = new Cviews();

        new Ccontroller(model, view);
    }
}