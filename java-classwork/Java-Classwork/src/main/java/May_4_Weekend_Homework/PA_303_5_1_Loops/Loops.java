package May_4_Weekend_Homework.PA_303_5_1_Loops;

public class Loops {


    public static void main(String[] args) {

        int tableSize = 10;


        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
    //spiked in difficulty
    //used ChatGPT
}

