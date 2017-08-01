import java.time.LocalDateTime;

public class BankaccountService {
	
	Bankaccount account;
    	
	public BankaccountService(Bankaccount account) {
		this.account = account;
	}
	
	public Double withdraw(Double withdrawAmount) {
        account.addOperation(new Operation(withdrawAmount, OperationType.WITHDRAW, LocalDateTime.now()));
        
        return account.getBankBalance().substract(withdrawAmount);
    }

}