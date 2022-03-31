#include "Inventory.h"

int main() {
	const int NUM = 2;
	Inventory item[NUM];
	int x;
	for (x = 0; x < NUM; ++x) {
		try {
			cin >> item[x];
		}
		catch (const string msg) {
			cout << msg << endl;
			item[x].setAllToZero();
		}
		catch (const int quantity) {
			cout << "negative" << endl;
			item[x].setAllToZero();
		}
		catch (const double price) {
			cout << "too high" << endl;
			item[x].setAllToZero();
		}
	}
	for (x = 0; x < NUM; ++x)
		cout << item[x];

	return 0;
}
