package modificator;

import domain.Address;
import domain.Person;

public interface AddressModificator {
    boolean changeAddress(Address adress, Person person);
}
