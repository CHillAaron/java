public class pythagoreanTherorem {
        public double calculateHypotenuse(int legA, int legB) {
            // the hypotenuse is the side across from the right angle. 
            double legC = Math.sqrt((legA * legA) + (legB * legB));
            return legC;
            // calculate the value of c given legA and legB
        }
}