#include "Convertible.h"

void Convertible::putTopUp() {
	this->isTopUp = true;
}

void Convertible::putTopDown() {
	this->isTopUp = false;
}

void Convertible::showCar() {
	Car::showCar();
	if (this->isTopUp)
		cout << "Top is up." << endl;
	else
		cout << "Top is down." << endl;
}