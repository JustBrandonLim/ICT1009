#include "Vehicle.h"

ostream& operator<<(ostream& out, const Vehicle& vehicle) {
	Vehicle tmpVehicle = vehicle;
	out << " " << tmpVehicle.name << " " << tmpVehicle.price;
	return out;
}

void Vehicle::setVehicle(string name, double price) {
	this->name = name;
	this->price = price;
}
