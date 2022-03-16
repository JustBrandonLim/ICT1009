#pragma once

#include <iostream>

using namespace std;

class Car {
protected:
	bool isIgnitionOn = false;
	int speed;
public:
	void turnIgnitionOn();
	void turnIgnitionOff();
	void setSpeed(int);
	void showCar();
};