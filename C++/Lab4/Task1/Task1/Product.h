#pragma once

#include "Box.h"

class Box;

class Product {
private:
	double length;
	double width;
	double depth;
public:
	void setDimensions(double, double, double);
	friend bool checkSize(Box, Product);
};