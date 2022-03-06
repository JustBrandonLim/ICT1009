// Task1.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include<iostream>
#include<string>

using namespace std;

class Pizza {
private:
    string topping; 
    int diameter; 
    double price;
    const static string STTOP;
    const static int STSIZE;
    const static double STPRICE;
public:
    Pizza(const string = STTOP, const int = STSIZE, const double = STPRICE);
    void setValues();
    void displayValues();
};

const string Pizza::STTOP = "cheese";
const int Pizza::STSIZE = 12;
const double Pizza::STPRICE = 8.99;

Pizza::Pizza(const string topping, const int diameter, const double price) {
    this->topping = topping;
    this->diameter = diameter;
    this->price = price;
}

void Pizza::setValues() {
    string newTopping;
    int newSize;
    cout << "Topping ";
    cin >> newTopping;

    cout << "Size ";
    cin >> newSize;

    this->topping = newTopping;
    this->diameter = newSize;
    if (this->topping != Pizza::STTOP)
        this->price += 1.0;
    if (this->diameter != Pizza::STSIZE)
        this->price += 1.5;
}

void Pizza::displayValues() {
    cout << this->diameter << " " << this->topping << " " << this->price << endl;
}

int main() {
    Pizza stdPizza;
    Pizza special("pineapple");
    Pizza deluxeSpecial("sausage", 16);
    Pizza veryDeluxeSpecial("lobster", 20, 17.99);
    cout << "Standard "; stdPizza.displayValues();
    cout << "Special "; special.displayValues();
    cout << "Deluxe "; deluxeSpecial.displayValues();
    cout << "Very Deluxe "; veryDeluxeSpecial.displayValues();
    stdPizza.setValues(); cout << "New "; stdPizza.displayValues();
    return 0;
}