#ifndef LIBRARY_H
#define LIBRARY_H

#include "Book.h"
#include <iostream>
#include <initializer_list>

class Library {
private:
    Book* books;
    std::size_t size;
public:
    Library();

    Library(std::initializer_list<Book> list);

    Library(const Library& other);
    Library(Library&& other);

    Library& operator=(const Library& other);
    Library& operator=(Library&& other);

    Book& operator[](std::size_t index);
    const Book& operator[](std::size_t index) const;

    std::size_t GetSize() const;

    friend std::ostream& operator<<(std::ostream& os, const Library& lib);

    ~Library();
};

#endif
