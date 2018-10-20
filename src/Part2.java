import java.util.Scanner;

public class Part2 {
    String findSimpleGene(String dna, int startCodon, int stopCodon) {
        String dna2 = dna.toUpperCase();
        int startDna;
        int finishDna;
        if (dna2 == dna){
            startDna = dna.indexOf("ATG", startCodon);
            finishDna = dna.indexOf("TAA", stopCodon);
        } else {
            startDna = dna.indexOf("atg", startCodon);
            finishDna = dna.indexOf("taa", stopCodon);
        }

        if (startDna == -1 || finishDna == -1 || startDna +5 >= finishDna)
            return "empty " + "startDNA = " + startDna + " finishDNA = " + finishDna;
        return dna.substring(startDna,finishDna + 3);
    }
    public void testSimpleGene(String dna, int start, int finish){
        System.out.print(findSimpleGene(dna, start, finish));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String DNA = scan.nextLine();
        int start = scan.nextInt();
        int finish = scan.nextInt();
        Part2 test = new Part2();
        test.testSimpleGene(DNA, start, finish);
    }
}
