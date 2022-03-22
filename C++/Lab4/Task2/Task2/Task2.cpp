#include <iostream>

using namespace std;

#include "SailingBoat.h"

int main()
{
	SailingBoat boat1("SE", 660);
	SailingBoat boat2("IS", 880);
	double ratio;
	ratio = boat1 / boat2;
	cout << boat1.getName() << " " << int(ratio * 100) << "% dist of " << boat2.getName() << endl;
	cout << boat1;
	cout << boat2;
}