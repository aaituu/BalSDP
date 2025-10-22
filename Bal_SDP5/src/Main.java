import facade.ConverterFacade;

public class Main {
    public static void main(String[] args) {
        ConverterFacade facade = new ConverterFacade();

        System.out.println("\n--- Example 1 ---");
        facade.convertFile("C:/docs/report.docx", "docx", "pdf", "C:/docs/report.pdf");

        System.out.println("\n--- Example 2 ---");
        facade.convertFile("C:/docs/manual.txt", "txt", "pdf", "C:/docs/manual.pdf");

    }
}
