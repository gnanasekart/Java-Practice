package SOLID_Principle.Single_Responsiblity_Principle;

public class SquareUI {

    int side = 5;

    public void draw(){
        boolean highResolutionMonitor = true;
        if(highResolutionMonitor){
            //render a high resolution
        } else {
            //render normal image
        }
    }

    public void rotate(int degree) {
        //Rotate the image of the square clockwise to the required degree & re-render
    }
}
