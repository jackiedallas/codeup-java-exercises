package Shapes;



    public abstract class Quadrilateral extends Shape {

        protected double length;
        protected double width;



        public Quadrilateral(double length, double width) {
            this.width = length;
            this.length = width;
        }

        public Quadrilateral(double singleSide){
            this.length = singleSide;
            this.width = singleSide;
        }



        public abstract void setWidth(double width);
        public abstract void setLength(double length);

        public double getLength() {
            return this.length;
        }

        public double getWidth() {
            return this.width;
        }


}
