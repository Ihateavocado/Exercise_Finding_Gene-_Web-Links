import java.util.Scanner;

public class Part1 {
    String findSimpleGene(String dna) {
        int startDna = dna.indexOf("ATG");
        int finishDna = dna.indexOf("TAA");
        if (startDna == -1 || finishDna == -1 || startDna +5 >= finishDna)
            return "empty " + "startDNA = " + startDna + " finishDNA = " + finishDna;
        return dna.substring(startDna,finishDna + 3);
    }
    public void testSimpleGene(String dna){
        System.out.print(findSimpleGene(dna));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String DNA = scan.nextLine();
        Part1 test = new Part1();
        test.testSimpleGene(DNA);
    }
}
