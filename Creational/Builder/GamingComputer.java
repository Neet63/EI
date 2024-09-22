package Creational.Builder;


public class GamingComputer extends ComputerBuilder {
    static int ID = 500; // Starting ID for Gaming Computers

    GamingComputer() {
        C1 = new Computer("Gaming");
        Conf_Id(); // Call to set ID during construction
    }

    void Conf_Id() {
        C1.setComputerID(ID);
        ID++; // Increment after assigning
    }

    void Conf_OSname() {
        C1.setOS("Windows 11");
    }

    void Conf_HDDSize() {
        C1.setHDD(2048);
    }

    void Conf_RAMSize() {
        C1.setRAM_Size(32);
    }

    void Conf_Proc_Type() {
        C1.setProcessor_type("i7");
    }

    void Conf_Proc_Make() {
        C1.setProcessor_make("Quad Core");
    }

    void Conf_MonitorSize() {
        C1.setMonitorSize(1980);
    }

    void Conf_MoniterType() {
        C1.setMonitorType("HDR");
    }

    void Conf_deviceDriver() {
        C1.setDeviceDriver("ABC");
    }
}