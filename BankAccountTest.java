
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {
	
	@Test
    public void test_nboperations_after_one_withdraw() {
		//GIVEN
        Bankaccount account = new Bankaccount(100.);
        BankaccountService accountService = new BankaccountService(account);

        //WHEN
        accountService.withdraw(10.);

        //THEN
        assertEquals(account.getOperations().size(),1);
    }
	
	@Test
    public void test_bankbalance_after_withdraw() {
		 //GIVEN
		 Bankaccount account = new Bankaccount(100.);
	     BankaccountService accountService = new BankaccountService(account);

	     //WHEN
	     accountService.withdraw(10.);
	     Double expectedResult = 90.;
	     
	     //THEN
	     assertEquals(account.getBankBalance().getAmount(),expectedResult);

    }
}
