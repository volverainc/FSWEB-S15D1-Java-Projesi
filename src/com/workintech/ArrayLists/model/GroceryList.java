package com.workintech.ArrayLists.model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class GroceryList {
    private static ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            try {System.out.println("Secenekler:");
            System.out.println("0 - Uygulamayi sonlandir.");
            System.out.println("1 - Eklenmesini istediğiniz elemanları giriniz.");
            System.out.println("2 - Cıkarılmasını istediğiniz elemanları giriniz.");
            System.out.println("3 - Listeyi goruntule");

            System.out.print("Secenegi giriniz: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Eklenmesini istediğiniz elemanları giriniz: ");
                    String itemsToAdd = scanner.nextLine();
                    addItems(itemsToAdd);
                    break;
                case 2:
                    System.out.print("Cıkarılmasını istediğiniz elemanları giriniz: ");
                    String itemsToRemove = scanner.nextLine();
                    removeItems(itemsToRemove);
                    break;
                case 3:
                    printSorted();
                    break;
                case 0:
                    System.out.println("Uygulama sonlandiriliyor.");
                    break;
                default:
                    System.out.println("Lutfen gecerli bir secenek giriniz.");
            }}
            catch (Exception ex){
                System.out.println(ex.getMessage());
                System.exit(0);
            }
        }

        scanner.close();
    }

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            String formattedItem = item.trim();
            if (formattedItem != null && !formattedItem.isEmpty() && !groceryList.contains(formattedItem)) {
                groceryList.add(formattedItem);
            }
        }
        Collections.sort(groceryList);
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            String formattedItem = item.trim();
            if (groceryList.contains(formattedItem)) {
                groceryList.remove(formattedItem);
            }
        }
        Collections.sort(groceryList);
    }

    public static void printSorted() {
        System.out.println("Grocery List:");
        for (String item : groceryList) {
            System.out.println(item);
        }
    }
}
