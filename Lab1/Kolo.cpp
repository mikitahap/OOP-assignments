#include "Kolo.h"
#include <iostream>

using namespace std;

Kolo::Kolo(double r) : r(r) {
    cout << "Konstruktor Kola (r = " << r << ")" << endl;
}

double Kolo::GetR() const {
    return r;
}

void Kolo::SetR(double r) {
    this->r = r;
}

double Kolo::Obwod() {
    return 2 * 3.14 * r;
}

double Kolo::Pole() {
    return 3.14 * r * r;
}

void Kolo::Wypisz(std::ostream& out) const {
    out << "Kolo: r = " << r;
}

Kolo::~Kolo() {
    cout << "Destruktor Kola (r = " << r << ")" << endl;
}