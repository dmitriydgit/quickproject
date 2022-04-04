public class Main {
    public static void main(String[] args) {

        App app = new App();
        System.out.println(app.makeResponce("404 not found"));

        Service service = new Service();
        System.out.println(service.getInt(22));

        System.out.println("I#m just a quickproject, I need to be pushed on Github");
        System.out.println("I make new commit/changes");
        System.out.println("New line 1");
        System.out.println("New line 2");

    }
}
