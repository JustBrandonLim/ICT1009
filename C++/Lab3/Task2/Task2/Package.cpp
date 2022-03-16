#include "Package.h"
#include "Package.h"

Package::Package(const string& senderName, const string& senderAddress, const string& senderCity, const string& senderState, int senderZIP,
	const string& recipientName, const string& recipientAddress, const string& recipientCity, const string& recipientState, int recipientZIP, double weight, double costPerKg)
{
	/*
	string senderName;
    string senderAddress;
    string senderCity;
    string senderState;
    int senderZIP;
    string recipientName;
    string recipientAddress;
    string recipientCity;
    string recipientState;
    int recipientZIP;

    double weight;
    double costPerKg;
	*/

	this->senderName = senderName;
	this->senderAddress = senderAddress;
	this->senderCity = senderCity;
	this->senderState = senderState;
	this->senderZIP = senderZIP;
	
	this->recipientName = recipientName;
	this->recipientAddress = recipientAddress;
	this->recipientCity = recipientCity;
	this->recipientState = recipientState;
	this->recipientZIP = recipientZIP;

	this->weight = weight;
	this->costPerKg = costPerKg;
}

Package::Package()
{
}

void Package::setSenderName(const string& senderName)
{
	this->senderName = senderName;
}

string Package::getSenderName() const
{
	return this->senderName;
}

void Package::setSenderAddress(const string& senderAddress)
{
	this->senderAddress = senderAddress;
}

string Package::getSenderAddress() const
{
	return this->senderAddress;
}

void Package::setSenderCity(const string& senderCity)
{
	this->senderCity = senderCity;
}

string Package::getSenderCity() const
{
	return this->senderCity;
}

void Package::setSenderState(const string& senderState)
{
	this->senderState = senderState;
}

string Package::getSenderState() const
{
	return this->senderState;
}

void Package::setSenderZIP(int senderZIP)
{
	this->senderZIP = senderZIP;
}

int Package::getSenderZIP() const
{
	return this->senderZIP;
}

void Package::setRecipientName(const string& recipientName)
{
	this->recipientName = recipientName;
}

string Package::getRecipientName() const
{
	return this->recipientName;
}

void Package::setRecipientAddress(const string& recipientAddress)
{
	this->recipientAddress = recipientAddress;
}

string Package::getRecipientAddress() const
{
	return this->recipientAddress;
}

void Package::setRecipientCity(const string& recipientCity)
{
	this->recipientCity = recipientCity;
}

string Package::getRecipientCity() const
{
	return this->recipientCity;
}

void Package::setRecipientState(const string& recipientState)
{
	this->recipientState = recipientState;
}

string Package::getRecipientState() const
{
	return this->recipientState;
}

void Package::setRecipientZIP(int recipientZIP)
{
	this->recipientZIP = recipientZIP;
}

int Package::getRecipientZIP() const
{
	return this->recipientZIP;
}

void Package::setWeight(double weight)
{
	this->weight = weight;
}

double Package::getWeight() const
{
	return this->weight;
}

void Package::setCostPerKg(double costPerKg)
{
	this->costPerKg = costPerKg;
}

double Package::getCostPerKg() const
{
	return this->costPerKg;
}

double Package::calculateCost() const
{
	return this->getWeight() * this->getCostPerKg();
}
