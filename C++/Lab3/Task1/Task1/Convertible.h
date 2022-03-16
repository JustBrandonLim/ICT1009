#pragma once

#include "Car.h"

class Convertible : virtual public Car {
private:
	bool isTopUp = true;
public:
	void putTopUp();
	void putTopDown();
	void showCar();
};