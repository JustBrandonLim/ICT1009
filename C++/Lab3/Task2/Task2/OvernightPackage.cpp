#include "OvernightPackage.h"

OvernightPackage::OvernightPackage(const string& senderName, const string& senderAddress, const string& senderCity, const string& senderState, int senderZIP,
	const string& recipientName, const string& recipientAddress, const string& recipientCity, const string& recipientState, int recipientZIP, double weight, double costPerKg, double overnightFeePerKg) : Package(senderName, senderAddress, senderCity, senderState, senderZIP,
		recipientName, recipientAddress, recipientCity, recipientState, recipientZIP, weight, costPerKg)
{
	this->overnightFeePerKg = overnightFeePerKg;
}

void OvernightPackage::setOvernightFeePerKg(double overnightFeePerKg)
{
	this->overnightFeePerKg = overnightFeePerKg;
}

double OvernightPackage::getOvernightFeePerKg() const
{
	return this->overnightFeePerKg;
}

double OvernightPackage::calculateCost() const
{
	return Package::calculateCost() + (this->getWeight() * this->getOvernightFeePerKg());
}
