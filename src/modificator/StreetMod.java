package modificator;

import domain.Address;
import domain.Person;

public class StreetMod implements AddressModificator {
    @Override
    public boolean changeAddress(Address address, Person person) {
        Address personAddress = person.getAdress();
        if (personAddress.getStreet() != (null)) {
            return false;
        } else {
            personAddress.setStreet(address.getStreet());
            return true;
        }
    }
}
