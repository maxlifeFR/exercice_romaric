package com.romaric;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			client nom =new client();
			Scanner reponse =new Scanner(System.in);
			System.out.println("bienvenue sur l'application de compte bancaire");
			System.out.println("menu");
			int choix=0;
			while (choix != 6) {
				System.out.println(" 1-creation de votre compte client" + " 2-creation d'un compte Courant" + "3-creation d'un compte Epargnea partir de 100€ " + "4-creation de virement" + "5-retirer de l'argent");
				System.out.println("entrer votre votre choix");
				choix = reponse.nextInt();
				choixClient(choix);
				
			}

		}
		
		public static void choixClient(int choix) {
			switch (choix) {
			case 1:
				System.out.println("1-creation de votre compte client");
				
				break;
			case 2:
				System.out.println("2-creation d'un compte Courant");
				
				break;
			case 3:
				System.out.println("3-creation d'un compte Epargnea partir de 100€");
				
				break;
			case 4:
				System.out.println("4-creation de virement");
				
				break;
			case 5:
				System.out.println("5-retirer de l'argent");
				
				break;
				
			default:
				break;
			}
			System.out.println("au revoir");
			System.exit(0);
		}
	}