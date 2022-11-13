package modificator;


import domain.Address;
import domain.Person;

public class PostalCodeModImpl implements AddressModificator {

    @Override
    public boolean changeAddress(Address address, Person person) {
        Address personAddress = person.getAdress();
        if (personAddress.getPostalCode() != 0) {
            return false;
        } else {
            personAddress.setPostalCode(address.getPostalCode());
            return true;
        }

    }
}
