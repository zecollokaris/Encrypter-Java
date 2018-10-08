import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
//        Set in input options which user will choose inputs which will match functions set
        System.out.println(" __ __ __   ______   __       ______   ______   ___ __ __   ______   __       \n" +
                "/_//_//_/\\ /_____/\\ /_/\\     /_____/\\ /_____/\\ /__//_//_/\\ /_____/\\ /__/\\     \n" +
                "\\:\\\\:\\\\:\\ \\\\::::_\\/_\\:\\ \\    \\:::__\\/ \\:::_ \\ \\\\::\\| \\| \\ \\\\::::_\\/_\\.:\\ \\    \n" +
                " \\:\\\\:\\\\:\\ \\\\:\\/___/\\\\:\\ \\    \\:\\ \\  __\\:\\ \\ \\ \\\\:.      \\ \\\\:\\/___/\\\\::\\ \\   \n" +
                "  \\:\\\\:\\\\:\\ \\\\::___\\/_\\:\\ \\____\\:\\ \\/_/\\\\:\\ \\ \\ \\\\:.\\-/\\  \\ \\\\::___\\/_\\__\\/_  \n" +
                "   \\:\\\\:\\\\:\\ \\\\:\\____/\\\\:\\/___/\\\\:\\_\\ \\ \\\\:\\_\\ \\ \\\\. \\  \\  \\ \\\\:\\____/\\ /__/\\ \n" +
                "    \\_______\\/ \\_____\\/ \\_____\\/ \\_____\\/ \\_____\\/ \\__\\/ \\__\\/ \\_____\\/ \\__\\/ \n" +
                "                                                                              ");
        System.out.println("1. ENCRYPT TEXT!\n2.DECRYPT TEST!\nCHOOSE(1 or 2): Then Press enter!");


//        Imported Scanner Which allow us to get user input using (Scanner)
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

//        Loop For ENCRYPTION & DECRYPTION OPTIONS!

//        IF USER CHOOSES OPTION 1:
        if (choice == 1) {
            System.out.println("                                  _            \n" +
                    "                                 | |           \n" +
                    "  ___ _ __   ___ _ __ _   _ _ __ | |_ ___ _ __ \n" +
                    " / _ \\ '_ \\ / __| '__| | | | '_ \\| __/ _ \\ '__|\n" +
                    "|  __/ | | | (__| |  | |_| | |_) | ||  __/ |   \n" +
                    " \\___|_| |_|\\___|_|   \\__, | .__/ \\__\\___|_|   \n" +
                    "                       __/ | |                 \n" +
                    "                      |___/|_|                 ");
            in.nextLine();

//            Section to Get user Input
            System.out.println("TYPE SENTENCE TO ENCRYPT! ");

            System.out.println("Then Press enter!");
            System.out.println("    ");
            System.out.println("    ");
            String msg = in.nextLine();

//            Add Number Input Options!
            //Due to 26 being length of alphabet
            System.out.println("    ");
            System.out.println("    ");
            System.out.println("ENTER ENCRYPTION NUMBER KEY!  (0-25) ONLY!: ");
            System.out.println("Then Press enter!");
            System.out.println("    ");
            System.out.println("    ");
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
            System.out.println("    ");
            System.out.println("REMEMBER TO KEEP YOUR ENCRYPTION KEY SAFE FOR DECRYPTING SOON!");
            System.out.println("    ");

            System.out.println("  ............ ENCRYPTING..  ");
            System.out.println("    ");
            System.out.println("    ");
            System.out.println("▓█████  ███▄    █  ▄████▄   ██▀███ ▓██   ██▓ ██▓███  ▄▄▄█████▓▓█████ ▓█████▄    \n" +
                    "▓█   ▀  ██ ▀█   █ ▒██▀ ▀█  ▓██ ▒ ██▒▒██  ██▒▓██░  ██▒▓  ██▒ ▓▒▓█   ▀ ▒██▀ ██▌   \n" +
                    "▒███   ▓██  ▀█ ██▒▒▓█    ▄ ▓██ ░▄█ ▒ ▒██ ██░▓██░ ██▓▒▒ ▓██░ ▒░▒███   ░██   █▌   \n" +
                    "▒▓█  ▄ ▓██▒  ▐▌██▒▒▓▓▄ ▄██▒▒██▀▀█▄   ░ ▐██▓░▒██▄█▓▒ ▒░ ▓██▓ ░ ▒▓█  ▄ ░▓█▄   ▌   \n" +
                    "░▒████▒▒██░   ▓██░▒ ▓███▀ ░░██▓ ▒██▒ ░ ██▒▓░▒██▒ ░  ░  ▒██▒ ░ ░▒████▒░▒████▓    \n" +
                    "░░ ▒░ ░░ ▒░   ▒ ▒ ░ ░▒ ▒  ░░ ▒▓ ░▒▓░  ██▒▒▒ ▒▓▒░ ░  ░  ▒ ░░   ░░ ▒░ ░ ▒▒▓  ▒    \n" +
                    " ░ ░  ░░ ░░   ░ ▒░  ░  ▒     ░▒ ░ ▒░▓██ ░▒░ ░▒ ░         ░     ░ ░  ░ ░ ▒  ▒    \n" +
                    "   ░      ░   ░ ░ ░          ░░   ░ ▒ ▒ ░░  ░░         ░         ░    ░ ░  ░    \n" +
                    "   ░  ░         ░ ░ ░         ░     ░ ░                          ░  ░   ░       \n" +
                    "                  ░                 ░ ░                               ░         ");

            System.out.println("    ");
            System.out.println("    ");
            System.out.println("YOUR TEXT HAS BEEN ENCRYPTED ");
            System.out.println("    ");
            System.out.println("    ");
            System.out.print(".....ENCRYPTED TEXT! ==>       ");
            System.out.print(encrypMsg);
            System.out.println("    ");
            System.out.println("    ");



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