package classes;

public class Rettangolo {
        private int height;
        private int width;

        public Rettangolo(int height, int width){
            this.height = height;
            this.width = width;
        }

        private int perimeter(){
            return this.height*2+this.width*2;
        }
        private int area(){
            return this.height*this.width;
        }

        public void stampaRettangolo() {
            System.out.println("Area: " + area() + "\nPerimeter: " + perimeter());
        }

        public void stampaDueRettangoli(Rettangolo secondRect) {
            System.out.println("First rectangle:\n\tArea: " + area() + "\n\tPerimeter: " + perimeter());
            System.out.println("Second rectangle:\n\tArea: " + secondRect.area() + "\n\tPerimeter: " + secondRect.perimeter());
            int sumOfAreas = area()+ secondRect.area();
            int sumOfPerimeters = perimeter()+ secondRect.perimeter();
            System.out.println("Sum of areas: " + sumOfAreas);
            System.out.println("Sum of perimeters: " + sumOfPerimeters);
        }
}
