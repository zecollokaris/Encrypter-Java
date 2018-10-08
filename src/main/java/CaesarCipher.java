import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
//        Set in input options which user will choose inputs which will match functions set
        System.out.print("1. Encryption\n2.Decryption\nChoose(1,2): ");

//        Imported Scanner Which allow us to get user input using (Scanner)
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

//        Loop For ENCRYPTION & DECRYPTION OPTIONS!

//        IF USER CHOOSES OPTION 1:
        if (choice == 1) {
            System.out.println("Encryption");
            in.nextLine();

//            Section to Get user Input
            System.out.println("Type In An Input In LOWER Case!");
            System.out.print("Enter Input: ");
            String msg = in.nextLine();

//            Add Number Input Options!
            //Due to 26 being length of alphabet
            System.out.print("Enter Key only (0-25): ");
            int key = in.nextInt();


            String encrypMsg = "";

            for (int i = 0; i < msg.length(); i++) {

                if ((int) msg.charAt(i) == 32) {
                    encrypMsg += (char) 32;

                } else if ((int) msg.charAt(i) + key > 122) {
                    int temp = ((int) msg.charAt(i) + key) - 122;
                    encrypMsg += (char) (96 + temp);

                } else if ((int) msg.charAt(i) + key > 90 && (int) msg.charAt(i) < 96) {
                    int temp = ((int) msg.charAt(i) + key) - 90;
                    encrypMsg += (char) (64 + temp);

                } else {
                    encrypMsg += (char) ((int) msg.charAt(i) + key);

                }
            }
            System.out.println(encrypMsg);


        } else if (choice == 2) {
            System.out.println("Decryption");
            in.nextLine();

//            Print to prompt user info!
            System.out.println("Message can be upper or Lower case Alphabet.");
            System.out.println("Enter Previously Encrypted Text!");
//            Take In user Input for decrepting text!
            String encypText = in.nextLine();

//            Take In User Input for number!
            System.out.println("Enter Decryption Key (0-25)");
            int dcyptkey = in.nextInt();

            String decrypMsg = "";

            for (int i = 0; i < encypText.length(); i++){

                if((int)encypText.charAt(i) == 32){
                    decrypMsg += (char)32;
                } else if (((int)encypText.charAt(i)- dcyptkey) < 97 && ((int)encypText.charAt(i) - dcyptkey) > 90) {

                    int temp = ((int)encypText.charAt(i) - dcyptkey) + 26;
                    decrypMsg += (char)temp;
                } else if ((encypText.charAt(i) - dcyptkey) < 65) {

                    int temp = ((int)encypText.charAt(i) - dcyptkey) + 26;
                    decrypMsg += (char) temp;
                } else {
                    decrypMsg += (char)((int)encypText.charAt(i) - dcyptkey);
                }

            }
            System.out.println(decrypMsg);



        } else {
            System.out.println("Wrong Choice!");
        }

    }
}