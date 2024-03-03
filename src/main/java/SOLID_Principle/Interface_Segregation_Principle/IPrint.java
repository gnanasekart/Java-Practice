package SOLID_Principle.Interface_Segregation_Principle;

/*
From previous interface IMultiFunction, here the functionality is seperated based on devices.
based on device specification we can implement the valid interface.
 */
public interface IPrint {
    public void print();
    public void getPrintSpoolDetails();
}

interface IScan {
    public void scan();
    public void scanPhoto();
}

interface IFax {
    public void fax();
    public void internetFax();
}
