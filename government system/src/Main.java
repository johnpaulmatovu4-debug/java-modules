import id.*;
import passport.*;
import tax.*;
import business.*;

public class Main {
    public static void main(String[]args){
        infoID identity = new infoID();
        idservices idservice = new idservices();
        passportissuance issuance = new passportissuance();
        passportinfo details = new passportinfo();
        taxfare taxation = new taxfare();
        taxinfo info = new taxinfo();
        businessDept bus = new businessDept();
        businessinfo businfo = new businessinfo();

        idservice.registerID();
        identity.showiddetails();
        details.showpassportinfo();
        issuance.passportstatus();
        taxation.computetax();
        info.showtaxdetails();
        bus.businessrequest();
        businfo.businessdetails();
    }
}
