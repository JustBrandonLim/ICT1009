#pragma once

#include "Product.h"

class Product;

class Box {
private:
	double volume;
public:
	void setVolume(double);
	friend bool checkSize(Box, Product);
};