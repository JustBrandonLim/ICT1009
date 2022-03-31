#pragma once

#include <iostream>

using namespace std;

class Vehicle
{
private:
	friend ostream& operator<<(ostream&, const Vehicle&);
	string name;
	double price;
public:
	void setVehicle(string, double);
};

