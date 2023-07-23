public class Main {

    public static void main(String[] args) {

        /* Declaração da classe notebook e
           criação do objeto notebook;
           impressão do objeto.
           Comentário feito dessa forma, apenas para mostrar exemplo de comentário.
        */

        Notebook notebook = new Notebook("Samsung", "I5", "16GB", "512GB SSD", "White", 2900.00);

        System.out.println("Notebook: " + " " +
                notebook.getBrand() + " " +
                notebook.getProcessor() + " " +
                notebook.getMemory() + " " +
                notebook.getHd() + " " +
                notebook.getColor() + " $" +
                notebook.getValue());

    }
}