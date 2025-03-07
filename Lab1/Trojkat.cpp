#include "Trojkat.h"
#include <iostream>
#include <cmath>

using namespace std;

Trojkat::Trojkat(double a, double b, double c) : a(a), b(b), c(c) {
    cout << "Konstruktor Trojkata (" << a << ", " << b << ", " << c << ")" << endl;
}

double Trojkat::Obwod() { return a + b + c; }

double Trojkat::Pole() {
    double s = (a + b + c) / 2;
    return sqrt(s * (s - a) * (s - b) * (s - c));
}

void Trojkat::Wypisz(std::ostream& out) const {
    out << "Trojkat: a = " << a << ", b = " << b << ", c = " << c;
}

Trojkat::~Trojkat() {
    cout << "Destruktor Trojkata(" << a << ", " << b << ", " << c << ")" << endl;
}