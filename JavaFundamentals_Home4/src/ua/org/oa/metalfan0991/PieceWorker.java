package ua.org.oa.metalfan0991;

/*
 * класс PieceWorker - служащим начисляется сдельная плата по 
 количеству изготовленных изделий;
 */

public class PieceWorker extends Employee {

	int countDetails; // количество изготовленных изделий
	int priceDetail; // расценка за одно изготовленное изделие

	public PieceWorker(String firstName, String secondName, int countDetails,
			int priceDetail) {
		super(firstName, secondName);
		setCountDetails(countDetails);
		setPriceDetail(priceDetail);
	}

	public int getCountDetails() {
		return countDetails;
	}

	public void setCountDetails(int countDetails) {
		this.countDetails = countDetails;
	}

	public int getPriceDetail() {
		return priceDetail;
	}

	public void setPriceDetail(int priceDetail) {
		this.priceDetail = priceDetail;
	}

	@Override
	double calculateSalary() {
		return getCountDetails() * getPriceDetail();
	}

	@Override
	public String toString() {
		return "PieceWorker [getCountDetails = " + getCountDetails()
				+ ", getPriceDetail = " + getPriceDetail()
				+ ", getFirstName = " + getFirstName() + ", getSecondName = "
				+ getSecondName() + "]";
	}

}
