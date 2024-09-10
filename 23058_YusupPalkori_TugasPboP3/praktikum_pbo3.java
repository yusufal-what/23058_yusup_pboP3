public class LaguBingo{

    public static void main(String[] args) {
        String[] bingo = {"B", "I", "N", "G", "O"};
        
        for (int i = 0; i <= bingo.length; i++) {
            // Mencetak dua baris pertama dari lagu untuk setiap iterasi
            System.out.println("Ada seorang petani yang punya anjing,");
            System.out.println("Dan nama anjing itu adalah Bingo.");

            // Mencetak huruf atau tepukan tangan yang sesuai
            for (int j = 0; j < bingo.length; j++) {
                if (j < i) {
                    System.out.print("(tepuk)");
                } else {
                    System.out.print(bingo[j]);
                }
                if (j < bingo.length - 1) {
                    System.out.print("-");
                }
            }
            System.out.println("O"); // Menutup setiap baris dengan "O"

            // Ulangi baris dengan tepukan tangan
            for (int j = 0; j < bingo.length; j++) {
                if (j < i) {
                    System.out.print("(tepuk)");
                } else {
                    System.out.print(bingo[j]);
                }
                if (j < bingo.length - 1) {
                    System.out.print("-");
                }
            }
            System.out.println("O");

            // Mencetak baris terakhir untuk setiap iterasi
            System.out.println("Dan nama anjing itu adalah Bingo.\n");
        }
    }
}