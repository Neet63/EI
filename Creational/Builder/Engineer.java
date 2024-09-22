package Creational.Builder;

public class Engineer {
    private ComputerBuilder BuildComputer;

    Engineer(ComputerBuilder CB){
        this.BuildComputer = CB;
    }

    public void setBuildComputer(ComputerBuilder CB){
        BuildComputer = CB;
    }

    public Computer getComputer(){
        return BuildComputer.getComputer();
    }

    public void Conf_Computer(){
        BuildComputer.Conf_HDDSize();
        BuildComputer.Conf_Id();
        BuildComputer.Conf_MoniterType();
        BuildComputer.Conf_MonitorSize();
        BuildComputer.Conf_OSname();
        BuildComputer.Conf_Proc_Make();
        BuildComputer.Conf_Proc_Type();
        BuildComputer.Conf_RAMSize();
        BuildComputer.Conf_deviceDriver();
    }
}
