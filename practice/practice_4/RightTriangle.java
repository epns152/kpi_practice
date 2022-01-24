package practice.practice_4;

public class RightTriangle {
    double firstLeg, secondLeg;
    public RightTriangle (double firstLeg, double secondLeg) {
//        boolean res = false;
//        if (firstEdge > secondEdge && firstEdge > thirdEdge) {
//            res = firstEdge*firstEdge == secondEdge*secondEdge + thirdEdge*thirdEdge;
//        } else if (secondEdge > firstEdge && secondEdge > thirdEdge) {
//            res = secondEdge*secondEdge == firstEdge*firstEdge + thirdEdge*thirdEdge;
//        } else if (thirdEdge > firstEdge && thirdEdge > secondEdge) {
//            res = thirdEdge*thirdEdge == secondEdge*secondEdge + firstEdge*firstEdge;
//        }
//        if (!res) {
//            throw new IllegalArgumentException("it is not right triangle");
//        }
        if (firstLeg < 0 || secondLeg < 0) {
            throw new IllegalArgumentException("edge can't be less than 0");
        }
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }


    double perimeter () {
        return firstLeg + secondLeg + Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
    }

    double trniangleSpace () {
            return (firstLeg * secondLeg) / 2;
    }

    boolean isSimilar (RightTriangle triangle) {
        return firstLeg / triangle.firstLeg == secondLeg / triangle.secondLeg
                ||  secondLeg / triangle.firstLeg == firstLeg / triangle.secondLeg;
    }
}
