package ua.org.oa.metalfan0991;

/*
 * ����� PieceWorker - �������� ����������� �������� ����� �� 
 ���������� ������������� �������;
 */

public class PieceWorker extends Employee {

	int countDetails; // ���������� ������������� �������
	int priceDetail; // �������� �� ���� ������������� �������

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
