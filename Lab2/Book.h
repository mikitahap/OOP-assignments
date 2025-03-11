#ifndef BOOK_H
#define BOOK_H

#include <iostream>
#include <string>

class Book {
private:
    std::string author;
    std::string title;

public:
    Book();
    Book(const std::string& author, const std::string& title);
    Book(std::string&& author, std::string&& title);

    std::string GetAuthor() const;
    std::string GetTitle() const;

    void SetAuthor(const std::string& new_author);
    void SetTitle(const std::string& new_title);

    void SetAuthor(std::string&& new_author);
    void SetTitle(std::string&& new_title);

    friend std::ostream& operator<<(std::ostream& os, const Book& book);

    Book(const Book& other);
    Book(Book&& other);
    Book& operator=(const Book& other);
    Book& operator=(Book&& other);

};

#endif