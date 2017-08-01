import java.util.ArrayList;
import java.util.List;

public class Bankaccount {
	
	private List<Operation> operations;	
	private BankBalance bankbalance;

	public Bankaccount( Double amount) {
		this.operations = new ArrayList<>();
		this.bankbalance = new BankBalance(amount);
	}
	
	public List<Operation> getOperations() {
		return operations;
	}
	
	public void addOperation(Operation operation) {
        getOperations().add(operation);
    }
	
	public BankBalance getBankBalance(){
		return bankbalance;
	}	
	

}
