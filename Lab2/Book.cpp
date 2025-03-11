#include "Book.h"

Book::Book() : author("Unknown"), title("Untitled") {}

Book::Book(const std::string& author, const std::string& title)
    : author(author), title(title) {}

Book::Book(std::string&& author, std::string&& title)
    : author(std::move(author)), title(std::move(title)) {}

std::string Book::GetAuthor() const { return author; }
std::string Book::GetTitle() const { return title; }

void Book::SetAuthor(const std::string& new_author) { author = new_author; }
void Book::SetTitle(const std::string& new_title) { title = new_title; }

void Book::SetAuthor(std::string&& new_author) { author = std::move(new_author); }
void Book::SetTitle(std::string&& new_title) { title = std::move(new_title); }

Book::Book(const Book& other) : author(other.author), title(other.title) {}

Book::Book(Book&& other)
    : author(std::move(other.author)), title(std::move(other.title)) {}

Book& Book::operator=(const Book& other) {
    if (this != &other) {
        author = other.author;
        title = other.title;
    }
    return *this;
}

Book& Book::operator=(Book&& other) {
    if (this != &other) {
        author = std::move(other.author);
        title = std::move(other.title);
    }
    return *this;
}

std::ostream& operator<<(std::ostream& os, const Book& book) {
    os << "Book{Author: " << book.author << ", Title: " << book.title << "}";
    return os;
}