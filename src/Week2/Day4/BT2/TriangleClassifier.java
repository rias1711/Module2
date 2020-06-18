package Week2.Day4.BT2;

public class TriangleClassifier {
    public static String inputClass(int firstSide, int secondSide, int thirdSide) {
        boolean isSide = (firstSide > 0) && (secondSide > 0) && (thirdSide > 0);
        boolean isTriangle = (firstSide + secondSide > thirdSide) && (secondSide + thirdSide > firstSide) && (firstSide + thirdSide > secondSide);
        boolean isIsoscelesTriangle = (firstSide == secondSide) || (secondSide == thirdSide) || (firstSide == thirdSide);
        boolean isEquilateralTriangle = (firstSide == secondSide) && (secondSide == thirdSide);

        if (isSide) {
            if (isTriangle) {
                if (isIsoscelesTriangle) {
                    if (isEquilateralTriangle) {
                        return "Tam giác đều";
                    } else
                        return "Tam giác cân";
                } else {
                    return "Tam giác thường";
                }
            } else
                return "Không phải là tam giác";
        } else
            return "Không phải là tam giác";
    }
}
