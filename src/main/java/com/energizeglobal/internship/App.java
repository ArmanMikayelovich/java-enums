package com.energizeglobal.internship;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Colors in RGB");
        for (Color color : Color.values()) {
            System.out.println(color + ": " + Arrays.toString(color.pickInRGB()));
        }
    }
}

enum Color {
    RED, ORANGE, YELLOW, GREEN,SKY_BLUE, BLUE, PURPLE;

    public int[] pickInRGB() {
        switch (this) {
            case RED:{
                return new int[]{255, 0, 0};
            }
            case ORANGE: {
                return new int[]{255, 153, 0};
            }
            case YELLOW: {
                return new int[]{255, 255, 0};
            }
            case GREEN: {
                return new int[]{51, 204, 51};
            }
            case SKY_BLUE:{
                return new int[]{51, 204, 255};
            }
            case BLUE:{
                return new int[]{0, 102, 255};
            }
            case PURPLE:{
                return new int[]{153, 51, 153};
            }
            default:{
                throw new IllegalStateException();
            }
        }
    }

}
