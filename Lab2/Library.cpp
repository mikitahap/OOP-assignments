#include "Library.h"

Library::Library() : books(nullptr), size(0) {}

Library::Library(std::initializer_list<Book> list) : size(list.size()) {
    books = new Book[size];
    std::size_t i = 0;
    for (const auto& book : list) {
        books[i++] = book;
    }
}

Library::Library(const Library& other) : size(other.size) {
    books = new Book[size];
    for (std::size_t i = 0; i < size; i++) {
        books[i] = other.books[i];
    }
}

Library::Library(Library&& other): books(other.books), size(other.size) {
    other.books = nullptr;
    other.size = 0;
}

Library& Library::operator=(const Library& other) {
    if (this != &other) {
        delete[] books;

        size = other.size;
        books = new Book[size];
        for (std::size_t i = 0; i < size; i++) {
            books[i] = other.books[i];
        }
    }
    return *this;
}

Library& Library::operator=(Library&& other) {
    if (this != &other) {
        delete[] books;

        books = other.books;
        size = other.size;

        other.books = nullptr;
        other.size = 0;
    }
    return *this;
}

Book& Library::operator[](std::size_t index) {
    return books[index];
}

const Book& Library::operator[](std::size_t index) const {
    return books[index];
}

std::size_t Library::GetSize() const {
    return size;
}

std::ostream& operator<<(std::ostream& os, const Library& lib) {
    for (std::size_t i = 0; i < lib.size; i++) {
        os << lib.books[i] << std::endl;
    }
    return os;
}

Library::~Library() {
    delete[] books;
}
