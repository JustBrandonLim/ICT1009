#pragma once

#include <iostream>
#include <string>

using namespace std;

class Inventory {
	friend ostream& operator << (ostream&, const Inventory&);
	friend istream& operator >> (istream&, Inventory&);
private:
	int stockNum;
	int quantity;
	double price;
public:
	Inventory(const int = 0, const int = 0, const double = 0.0);
	void setAllToZero();
};

