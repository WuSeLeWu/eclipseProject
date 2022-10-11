package interfaces;

public class CustomerManager {

	private ICustomerDal _customerDal;

	public CustomerManager(ICustomerDal customerDal) {

		this._customerDal = customerDal;
	}

	public void add() {
		// iş kodları
		_customerDal.add();
	}
}
