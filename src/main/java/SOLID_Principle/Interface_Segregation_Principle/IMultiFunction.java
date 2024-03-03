package SOLID_Principle.Interface_Segregation_Principle;

/*
Here multi function is interface which contain all the functionality of a xerox machine
But when it comes to office printers it might does not contain some of the functionality of Xerox
So we can face missing implementation which we try to call a function from main method.
 */
public interface IMultiFunction {

    public void print();
    public void getPrintSpoolDetails();
    public void scan();
    public void scanPhoto();
    public void fax();
    public void internetFax();
}

class XeroxWorkCentre implements IMultiFunction {
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

class HPPrinterScanner implements IMultiFunction {
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
        //no implementation
    }

    @Override
    public void internetFax() {
        //no implementation
    }
}

class CanonPrinter implements IMultiFunction {
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
        //no implementation
    }

    @Override
    public void scanPhoto() {
        //no implementation
    }

    @Override
    public void fax() {
        //no implementation
    }

    @Override
    public void internetFax() {
        //no implementation
    }
}
