package Lab4;

class plate{
    double length;
    double width;
    public plate(double length, double width){
        this.length = length;
        this.width = width;
        System.out.println("Plate created with dimensions: Length = " + length + ", Width = " + width);
    }
}

class box extends plate{
    double height;
    public box(double length, double width, double height){
        super(length, width);
        this.height = height;
        System.out.println("Box created with dimensions: Length = " + length + ", Width = " + width + ", Height = " + height);
    }
}

class woodBox extends box{
    double thick;
    public woodBox(double length, double width,double height, double thick){
        super(length, width, height);
        this.thick = thick;
        System.out.println("WoodBox created with dimensions: Length = " + length + ", Width = " + width + ", Height = " + height + ", Thickness = " + thick);
    }
}

public class plates_box {
}
