package Creational.Builder;


public class ServerComputer extends ComputerBuilder {
    static int ID = 100; // Starting ID for Server Computers

    ServerComputer() {
        C1 = new Computer("Server");
        Conf_Id(); // Call to set ID during construction
    }

    void Conf_Id() {
        C1.setComputerID(ID);
        ID++; // Increment after assigning
    }

    void Conf_OSname() {
        C1.setOS("Windows 10");
    }

    void Conf_HDDSize() {
        C1.setHDD(1024);
    }

    void Conf_RAMSize() {
        C1.setRAM_Size(64);
    }

    void Conf_Proc_Type() {
        C1.setProcessor_type("i9");
    }

    void Conf_Proc_Make() {
        C1.setProcessor_make("Double Core");
    }

    void Conf_MonitorSize() {
        C1.setMonitorSize(1980);
    }

    void Conf_MoniterType() {
        C1.setMonitorType("HD");
    }

    void Conf_deviceDriver() {
        C1.setDeviceDriver("Xyz");
    }

    
}
