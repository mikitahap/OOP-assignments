#include "Prostokat.h"
#include <iostream>

using namespace std;

Prostokat::Prostokat(double a, double b) : a(a), b(b) {
    cout << "Konstruktor Prostokata(" << a << ", " << b << ")" << endl;
}

double Prostokat::Obwod() { return 2 * (a + b); }
double Prostokat::Pole() { return a * b; }

void Prostokat::Wypisz(std::ostream& out) const {
    out << "Prostokat: a = " << a << ", b = " << b;
}

Prostokat::~Prostokat() {
    cout << "Destruktor Prostokata(" << a << ", " << b << ")" << endl;
}