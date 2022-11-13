package modificator;

import domain.Address;
import domain.Person;

public class CountryMod implements AddressModificator {

    @Override
    public boolean changeAddress(Address address, Person person) {
        Address personAddress = person.getAdress();
        if (personAddress.getCountry() != null) {
            return false;
        } else {
            personAddress.setCountry(address.getCountry());
            return true;
        }
    }
}
