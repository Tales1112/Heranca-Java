package entities;

public final class ImportedProduct extends Product {
	private double customsFee;

	public ImportedProduct(String name, Double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return customsFee + price;
	}

	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" ");
		sb.append("$" + totalPrice());
		sb.append(" ");
		sb.append("CustomsFee:" + "$" + customsFee);
		return sb.toString();
	}

}
