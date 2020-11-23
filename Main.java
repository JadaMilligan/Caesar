package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner words = new Scanner(System.in);
        String message;
        int integer;
        // used to be Getnumber
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter an integer: ");
            integer = input.nextInt();
        } while (integer < 1 || integer > 25);

                do {
                    System.out.print("Enter your message: ");
                    message = words.nextLine();
                }while (message.equals("")); //add equals #s

        String ciphertext = encode(message, integer);

                int messagelen = message.length();
                //array
                char letters[] = new char[messagelen];
                for (int i = 0; i < messagelen; i++) {
                    letters[i] = message.charAt(i);
                }

                System.out.println("rotation: " + integer);
                System.out.println("plaintext: " + message);
                System.out.println("ciphertext: " + ciphertext);
            }

  static String encode (String pseudocode, int move) {
      pseudocode = pseudocode.toLowerCase();
      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      String ciphertext = "";

        for (int i = 0; i < pseudocode.length(); i++) {
            if(pseudocode.charAt(i) == ' ') {

                ciphertext += pseudocode.charAt(i);
                i++;
            }
            int currentL = alphabet.indexOf(pseudocode.charAt(i));
            int shift = (move + currentL)%26;
            char letterNew =alphabet.charAt(shift);
            ciphertext += letterNew;
        }
        return ciphertext;
    }
        }
