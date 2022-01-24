package practice.practice_4;

public class ComplexNumbers {
    double freeIndex, indexI;
    public ComplexNumbers (double freeIndex, double indexI) {
        this.freeIndex = freeIndex;
        this.indexI = indexI;
    }

    double moduleOfComplexNumber () {
        return Math.sqrt(Math.pow(freeIndex, 2) + Math.pow(indexI, 2));
    }

    ComplexNumbers sumOfComplexNumbers (ComplexNumbers cn) {
        double newFreeIndex = freeIndex + cn.freeIndex;
        double newIndexI = indexI + cn.indexI;
        return new ComplexNumbers(newFreeIndex, newIndexI);
    }

    ComplexNumbers mulOfComplexNumbers (ComplexNumbers cn) {
        double newFreeIndex = (freeIndex * cn.freeIndex) - (indexI * cn.indexI);
        double newIndexI = (freeIndex * cn.indexI) + (cn.freeIndex * indexI);
        return new ComplexNumbers(newFreeIndex, newIndexI);
    }

    ComplexNumbers fracOfComplexNumbers (ComplexNumbers cn) {
        double divider = Math.pow(cn.freeIndex, 2) + Math.pow(cn.indexI, 2);
        double newFreeIndex = ((freeIndex * cn.freeIndex) + (indexI * cn.indexI)) / divider;
        double newIndexI = ((freeIndex * cn.indexI) - (cn.freeIndex * indexI)) / divider;
        return new ComplexNumbers(newFreeIndex, newIndexI);
    }

    double moduleOfSum (ComplexNumbers cn) {
        ComplexNumbers res = sumOfComplexNumbers(cn);
        return res.moduleOfComplexNumber();
    }

    void printComplexNumber () {
        if (indexI > 0) {
            System.out.printf("%f + %fi\n", freeIndex, indexI);

        } else {
            System.out.printf("%f - %fi\n", freeIndex, Math.abs(indexI));
        }
    }
}
