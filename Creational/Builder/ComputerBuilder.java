package Creational.Builder;


public abstract class ComputerBuilder{
    Computer C1;

    public Computer getComputer(){
        return C1;
    }

    abstract void Conf_Id();
    abstract void Conf_OSname();
    abstract void Conf_HDDSize();
    abstract void Conf_RAMSize();
    abstract void Conf_Proc_Type();
    abstract void Conf_Proc_Make();
    abstract void Conf_MonitorSize();
    abstract void Conf_MoniterType();
    abstract void Conf_deviceDriver();
  
}
