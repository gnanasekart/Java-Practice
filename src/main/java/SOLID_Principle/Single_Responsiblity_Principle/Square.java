package SOLID_Principle.Single_Responsiblity_Principle;


/*
Cohesion
    - It is the degree to which the various parts of a software component are related.
    - Used to perform the specialized tasks (single task) instead of multiple tasks with a single java class.
    - This class is the example for low cohesion because it contains all the methods like multiple tasks.
    - once the methods are seperated into two or many different class to maintain respective methods
        then it is high cohesion
    - Single responsibility Principle we should always aim for high Cohesion with in the component (class).
        Responsibility - Class Square = Measurements of Squares
        class squareUI = rendering images of squares


 */
public class Square {

    int side=5;

    public int calculateArea() {
        return side * side;
    }

    public int calculatePerimeter() {
        return side * 4;
    }

//    public void draw(){
//        if(highResolutionMonitor){
//            //render a high resolution
//        } else {
//            //render normal image
//        }
//    }
//
//    public void rotate(int degree) {
//        //Rotate the image of the square clockwise to the required degree & re-render
//    }
}
