#include "Car.h"

void Car::turnIgnitionOn() {
	this->isIgnitionOn = true;
}

void Car::turnIgnitionOff() {
	this->isIgnitionOn = false;
	this->setSpeed(0);
}

void Car::setSpeed(int speed) {
	if (!this->isIgnitionOn)
		this->speed = 0;
	else
	{
		if (speed > 65)
			this->speed = 65;
		else
			this->speed = speed;
	}
}

void Car::showCar() {
	if (this->isIgnitionOn)
		cout << "Ignition is on. " << "Speed is " << this->speed << "mph." << endl;
	else
		cout << "Ignition is off. " << "Speed is " << this->speed << "mph." << endl;
}