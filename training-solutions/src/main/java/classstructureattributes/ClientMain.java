package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner systemInScanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Az Ön Neve?");
        client.name = systemInScanner.nextLine();

        System.out.println("Az Ön Címe?");
        client.address = systemInScanner.nextLine();

        System.out.println("Az Ön születési éve?");
        client.yOb = systemInScanner.nextInt();

        System.out.println("#Név:"+client.name + " #Született:"+client.yOb + " #Cím:" + client.address);
    }
}
