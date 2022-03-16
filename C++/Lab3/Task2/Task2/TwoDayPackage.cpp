#include "TwoDayPackage.h"

TwoDayPackage::TwoDayPackage(const string& senderName, const string& senderAddress, const string& senderCity, const string& senderState, int senderZIP,
	const string& recipientName, const string& recipientAddress, const string& recipientCity, const string& recipientState, int recipientZIP, double weight, double costPerKg, double flatFee) : Package(senderName, senderAddress, senderCity, senderState, senderZIP,
		recipientName, recipientAddress, recipientCity, recipientState, recipientZIP, weight, costPerKg)
{
	this->flatFee = flatFee;
}

void TwoDayPackage::setFlatFee(double flatFee)
{
	this->flatFee = flatFee;
}

double TwoDayPackage::getFlatFee() const
{
	return this->flatFee;
}

double TwoDayPackage::calculateCost() const
{
	return Package::calculateCost() + this->flatFee;
}
