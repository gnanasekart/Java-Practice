package SOLID_Principle.Interface_Segregation_Principle;

public class XeroxWorkCentre_ISP implements IPrint,IScan,IFax {
    @Override
    public void print() {
        //Assume real code
    }

    @Override
    public void getPrintSpoolDetails() {
        //Assume real code
    }

    @Override
    public void scan() {
        //Assume real code
    }

    @Override
    public void scanPhoto() {
        //Assume real code
    }

    @Override
    public void fax() {
        //Assume real code
    }

    @Override
    public void internetFax() {
        //Assume real code
    }
}