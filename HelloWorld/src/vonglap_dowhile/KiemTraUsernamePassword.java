package vonglap_dowhile;

import java.util.Scanner;

public class KiemTraUsernamePassword {
	public static void main(String[] args) {
        int username = 123, password = 123456;
        int guessUser, guessPass;
        Scanner scanner = new Scanner(System.in);
         
        do {
            System.out.println("Nhập vào username: ");
            guessUser = scanner.nextInt();
            System.out.println("Nhập vào password: ");
            guessPass = scanner.nextInt();
        } while((username != guessUser) || (password != guessPass));
     
        System.out.println("Welcome " + guessUser);
    }

}
