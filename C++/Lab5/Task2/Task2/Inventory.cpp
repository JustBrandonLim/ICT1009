#include "Inventory.h"

Inventory::Inventory(const int stockNum, const int quantity, const double price)
{
	this->stockNum = stockNum;
	this->quantity = quantity;
	this->price = price;
}

void Inventory::setAllToZero() {
	stockNum = 0;
	quantity = 0;
	price = 0;
}

ostream& operator << (ostream& out, const Inventory& itm) {
	out << "id " << itm.stockNum << " quantity: " << itm.quantity << " price " << itm.price << endl;
	return out;
}

istream& operator >> (istream& in, Inventory& itm) {
	cout << "Enter id ";
	in >> itm.stockNum;
	if (itm.stockNum < 1 || itm.stockNum > 999)
		throw string("out of range");

	cout << "Enter quantity ";
	in >> itm.quantity;
	if (itm.quantity < 0)
		throw int(itm.quantity);

	cout << "Enter price ";
	in >> itm.price;
	if (itm.price > 1000.0)
		throw double(itm.price);

	return in;
}