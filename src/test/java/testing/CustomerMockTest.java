package testing;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class CustomerMockTest {
	@Test
	public void test() {
	    Customer mockedCustomer = mock(Customer.class);
	    when(mockedCustomer.getUniqueId()).thenReturn(23);
	    int id = mockedCustomer.getUniqueId();
	    int id2 = mockedCustomer.getUniqueId();
	    verify(mockedCustomer, times(2)).getUniqueId();
	}
}
