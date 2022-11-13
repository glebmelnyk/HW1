package modificator;

import domain.Address;
import domain.Person;

public class BuildNumMod implements AddressModificator {
    @Override
    public boolean changeAddress(Address adress, Person person) {
        Address personAddress = person.getAdress();
        if (personAddress.getBuildingNumber() != 0) {
            return false;
        } else {
            personAddress.setBuildingNumber(adress.getBuildingNumber());
            return true;
        }
    }
}
