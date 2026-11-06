public class HelloWorld {
    public static void main(String[] args) {
        // Funzionalità dal branch master: stampa i processori disponibili
        System.out.println("Available processors: " + Runtime.getRuntime().availableProcessors());
        
        // Funzionalità dal branch feature: stampa l'autore
        System.out.println("Author: APICe"); // Oppure il nome dell'autore presente nel branch feature
    }
}