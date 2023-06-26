package java8;

public class patient {
    private int id;
    private String name;
    private String disease;
    private int amount;
	public patient() {
		super();
	}
	public patient(int id, String name, String disease, int amount) {
		super();
		this.id = id;
		this.name = name;
		this.disease = disease;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "patient [id=" + id + ", name=" + name + ", disease=" + disease + ", amount=" + amount + "]";
	}
    
}
