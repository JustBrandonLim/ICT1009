#include <iostream>

using namespace std;

#include "Box.h"
#include "Product.h"

bool checkSize(Box box, Product product) {
    if (product.length * product.width * product.depth < box.volume)
        return true;
    else
        return false;
}

int main()
{
	double vol, l, w, d;

	Box box;
	Product product;

	cout << "Vol: ";
	cin >> vol;
	box.setVolume(vol);

	cout << "L W D: ";
	cin >> l;
	cin >> w;
	cin >> d;

	product.setDimensions(l, w, d);

	cout << "Fit? " << checkSize(box, product) << endl;
	return 0;
}
