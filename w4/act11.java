package w4;

public class Act11 {
    public static void main(String[] args) {
    
        int row = 5; // so hang cua nua dau kim tu thap
        
        // first-half pyramid
        for (int i = 1; i <= 2*row - 1; i += 2) { // tang 2 * -> row*2
            for (int j = 1; j <= i; j++) { // i + 1 -> j loop them 1 vong -> tang 1 *
                System.out.print("* ");
            }
            System.out.println();
        }

        //second-half pyramid
        for (int i = 2*row - 3; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++) { // i - 1 -> j loop them 1 vong -> giam 1 *
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
