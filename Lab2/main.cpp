#include <iostream>
#include "Book.h"
#include "Library.h"

int main() {
    std::cout << "Book:" << std::endl;

    std::string a = "Adam Mickiewicz", t = "Pan Tadeusz";

    Book e;
    std::cout << "e: " << e << std::endl;

    Book b1 = {a, t};
    std::cout << "b1: " << b1 << std::endl;

    Book b2 = {"J.D. Rowling", "Harry Potter"};
    std::cout << "b2: " << b2 << std::endl;

    Book b3 = b1;
    std::cout << "b3: " << b3 << " b1: " << b1 << std::endl;

    e = std::move(b2);
    std::cout << "e: " << e << " b2: " << b2 << std::endl;

    e.SetAuthor("Fiodor Dostojewski");
    std::cout << "e: " << e << std::endl;

    e.SetTitle("Zbrodnia i kara");
    std::cout << "e: " << e << std::endl;

    std::cout << "\nLibrary:" << std::endl;

    Library e_lib;
    std::cout << "e: " << e_lib << std::endl;

    Library l1 = {{"J.D. Rowling", "Harry Potter"},
                  {"Mark Twain", "Pamiętnik Ewy"},
                  {"Andrzej Sapkowski", "Wiedźmin"}};
    std::cout << "l1: " << l1 << std::endl;

    Library l2;
    std::cout << "l2: " << l2 << std::endl;

    l2 = Library({{"Lew Tołstoj", "Wojna i pokój"}, {"George Orwell", "1984"}});
    std::cout << "l2: " << l2 << std::endl;

    e_lib = std::move(l2);
    std::cout << "e: " << e_lib << " l2: " << l2 << std::endl;

    l1[0] = std::move(e_lib[1]);
    std::cout << "l1: " << l1 << " e: " << e_lib << std::endl;

    return 0;
}
