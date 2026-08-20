public class RunMasina {
    public static void main(String[] args) {

        // obiect al clasei masina
        // instanta a clasei Masina
        // obiect referential al clasei Masina
        // exemplar de clasa Masina
        // referinta a clasei Masina
        Masina masina = new Masina();
        Masina masina2 = new Masina();
        Masina masina3 = new Masina();

        masina.model = "Mercedes";
        masina2.model = "Audi";
        masina3.model = "BMW";

        masina.claxoneaza();
        masina2.claxoneaza();
        masina3.claxoneaza();

    }
}
