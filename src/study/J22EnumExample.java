package study;

public class J22EnumExample {
    enum ShirtSizes {XS, S, M, L, XL}
    enum ShirtColors {RED, BLUE, GREEN}

    public static void main(String[] args){
        ShirtSizes mySize = ShirtSizes.L;
        System.out.println("My size is: " + mySize);
        ShirtColors favColor = ShirtColors.BLUE;
        System.out.println("My favorite color is: " + favColor);
    }
}
