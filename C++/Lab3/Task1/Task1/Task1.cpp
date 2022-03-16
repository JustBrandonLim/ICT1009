#include <iostream>

#include "Car.h"
#include "Convertible.h"
#include "RaceCar.h"
#include "ConvertibleRaceCar.h"

using namespace std;

int main()
{
    /*
    Car myCar;
    myCar.turnIgnitionOn(); myCar.setSpeed(35); myCar.showCar();
    myCar.setSpeed(80); myCar.showCar();
    myCar.turnIgnitionOff(); myCar.showCar();
    */

    /*
    Convertible myCar;
    myCar.turnIgnitionOn(); myCar.setSpeed(35); myCar.putTopDown(); myCar.showCar();
    myCar.setSpeed(80); myCar.showCar();
    myCar.putTopUp(); myCar.turnIgnitionOff(); myCar.showCar();
    */

    /*
    Car aCar;
    RaceCar aRaceCar;
    aCar.turnIgnitionOn(); aCar.setSpeed(100);
    cout << "A car at 100 mph: "; aCar.showCar();
    aRaceCar.turnIgnitionOn(); aRaceCar.setSpeed(100);
    cout << "A race car at 100 mph: "; aRaceCar.showCar();
    */

    /*
    ConvertibleRaceCar aCar;
    aCar.turnIgnitionOn();
    */

    ConvertibleRaceCar aCar;
    aCar.turnIgnitionOn(); aCar.setSpeed(30);
    cout << "Car set to 30 mph:" << endl; aCar.showCar(); cout << endl;

    aCar.putTopDown(); aCar.setSpeed(80);
    cout << "Car set to 80 mph with top down:" << endl;
    aCar.showCar(); cout << endl;

    aCar.putTopUp(); aCar.setSpeed(250);
    cout << "Car set to 250 mph with top up:" << endl;
    aCar.showCar(); cout << endl;
}