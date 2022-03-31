// Task1.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "Vehicle.h"

template<class T>
class Array
{
private:
	T* data;
	int size;
public:
	Array(T* data, int s);
	void showList();
	void showFirst();
};

template<class T>
Array<T>::Array(T* data, int size) {
	this->data = data;
	this->size = size;
}

template<class T>
void Array<T>::showList() {
	cout << "showList()";
	for (int i = 0; i < this->size; i++) {
		cout << this->data[i];
	}
	cout << endl;
}

template<class T>
void Array<T>::showFirst() {
	cout << "showFirst()";
	cout << this->data[0];
}

int main()
{
	int arrayElements;
	Vehicle cars[2];
	cars[0].setVehicle("McQueen", 1111);
	cars[1].setVehicle("Mater", 22222);

	arrayElements = sizeof(cars) / sizeof(cars[0]);
	Array<Vehicle> arrayOfVehicles(cars, arrayElements);

	arrayOfVehicles.showList();
	arrayOfVehicles.showFirst();

	return 0;
}
