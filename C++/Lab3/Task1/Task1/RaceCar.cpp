#include "RaceCar.h"

void RaceCar::setSpeed(int speed) {
	if (!this->isIgnitionOn)
		this->speed = 0;
	else
	{
		if (speed > 200)
			this->speed = 200;
		else
			this->speed = speed;
	}
}