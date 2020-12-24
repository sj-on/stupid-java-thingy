package dummy;

interface Sister {
	void whoAmI();
	void whatISay();
}

interface Mother extends Sister{
	void whoIsMother();
	void goToOffice();
}
