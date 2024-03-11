package numberSystem;

public class FlippingAnImage {
    public static void main(String[] args) {
        int [][] arr= {{1,1,0},{1,0,1},{0,0,0}};
        flipping(arr);
    }

    static void flipping(int [][] image){
        System.out.println("before flipping and inverting");
        for (int[] row:image ) {
            for (int i = 0; i < row.length ; i++) {
                System.out.print(row[i]);
            }
            System.out.println();
        }

        for (int[] row:image ) {
            for (int i = 0; i < (image[0].length + 1) / 2 ; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[image.length-i-1] ^ 1;
                row[image.length-i-1] = temp;
            }
        }
        System.out.println("after flipping and inverting");
        for (int[] row:image ) {
            for (int i = 0; i < row.length ; i++) {
                System.out.print(row[i]);
            }
            System.out.println();
        }


    }
}
