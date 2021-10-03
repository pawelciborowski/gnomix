package pl.clockworkjava.gnomix.ui.text;

import pl.clockworkjava.gnomix.domain.book.BookService;

import java.util.Scanner;

public class TexetMainView {

    private BookService bookService = new BookService();

    public void init() {
        System.out.println("GNOMIX - System do zarządzania zbiorami bibliotecznymi.");
        System.out.println("Wybierz operację");
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option != 0){
            System.out.println("1. Dodaj nową książkę");
            System.out.println("0. Wyjdź z systemu");
            option = Integer.parseInt(scanner.nextLine());

            if (option == 1){
                this.handleCreateNewBook(scanner);
            } else if (option == 0){
                System.out.println("Kończę działanie systemu, do zo. :) ");
            }
        }
    }

    private void handleCreateNewBook(Scanner scanner) {
        System.out.println("Podaj tytuł książki");
        String title = scanner.nextLine();
        this.bookService.createNewBook(title);
    }

}
