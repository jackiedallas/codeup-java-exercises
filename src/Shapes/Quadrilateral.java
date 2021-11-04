package Shapes;



    abstract class Quadrilateral extends Shape {

        protected double length;
        protected double width;

        public Quadrilateral(double length, double width) {
            this.width = length;
            this.length = width;
        }

        public abstract void setWidth(double width);



        public abstract void setLength(double length);

        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }


}
