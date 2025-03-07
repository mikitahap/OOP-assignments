#include "Prostokat.h"
#include "Trojkat.h"
#include "Kolo.h"
#include <iostream>
#include <vector>

using namespace std;

int main() {
    vector<FiguraPlaska*> figury;

    figury.push_back(new Prostokat(5, 3));
    figury.push_back(new Trojkat(3, 4, 5));
    figury.push_back(new Kolo(4));

    cout << "\n===== Polimorfizm: Wywolanie metod przez wskaznik do klasy bazowej =====\n";

    for (FiguraPlaska* figura : figury) {
        cout << *figura << endl;
        cout << "Obwod: " << figura->Obwod() << endl;
        cout << "Pole: " << figura->Pole() << endl;
        cout << "---------------------------------" << endl;
    }

    for (FiguraPlaska* figura : figury) {
        delete figura;
    }

    return 0;
}