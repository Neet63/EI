package Creational.Builder;

public class Computer {
        private int ComputerID;
        private String Computer_Type;
        private String OS;
        private int HDD;
        private int RAM_Size;
        private String Processor_make;
        private String Processor_type;
        private float MonitorSize;
        private String MonitorType;
        private String deviceDriver;
    
        Computer(String type){
            Computer_Type = type;
        }
    
        public void setComputerID(int computerID) {
            ComputerID = computerID;
        }
    
        public void setDeviceDriver(String deviceDriver) {
            this.deviceDriver = deviceDriver;
        }
        public void setComputer_Type(String computer_Type) {
            Computer_Type = computer_Type;
        }
        public void setHDD(int hDD) {
            HDD = hDD;
        }
        public void setMonitorSize(float monitorSize) {
            MonitorSize = monitorSize;
        }
        public void setMonitorType(String monitorType) {
            MonitorType = monitorType;
        }
        public void setOS(String oS) {
            OS = oS;
        }
        public void setProcessor_make(String processor_make) {
            Processor_make = processor_make;
        }
        public void setRAM_Size(int rAM_Size) {
            RAM_Size = rAM_Size;
        }
        public void setProcessor_type(String processor_type) {
            Processor_type = processor_type;
        }
    
    
        public int getComputerID() {
            return ComputerID;
        }
        public String getComputer_Type() {
            return Computer_Type;
        }
        public String getDeviceDriver() {
            return deviceDriver;
        }
        public int getHDD() {
            return HDD;
        }
        public float getMonitorSize() {
            return MonitorSize;
        }
        public String getMonitorType() {
            return MonitorType;
        }
        public String getOS() {
            return OS;
        }
        public String getProcessor_make() {
            return Processor_make;
        }
        public String getProcessor_type() {
            return Processor_type;
        }
        public int getRAM_Size() {
            return RAM_Size;
        }
        
    
        public String toString() {
            return "ID : " + ComputerID +" HDD : " + HDD + " Processor : " + Processor_type + "  " + Processor_make + " Ram Size : " + RAM_Size;
    
        }
    }
