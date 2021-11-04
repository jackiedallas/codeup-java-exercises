package Shapes;



    public abstract class Quadrilateral extends Shape {

        protected double length;
        protected double width;


        // constructor
        public Quadrilateral(double length, double width) {
            this.width = length;
            this.length = width;
        }

        // setters
        public abstract void setWidth(double width);
        public abstract void setLength(double length);


        // getters
        public double getLength() {
            return this.length;
        }

        public double getWidth() {
            return this.width;
        }


}
