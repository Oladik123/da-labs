import javax.xml.bind.JAXBException;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws JAXBException {
        System.out.println(new App().getGreeting());
        NodeLoader nodeLoader = new NodeLoader();
        nodeLoader.loadNodesWithDifferentWays();
    }
}
