package academy.learnprogramming;

public class ByteShortIntLong {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Minimum Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1 ));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short .MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_345L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 3276;

        byte myNewByteValue = (byte) (myMinByteValue/2);

        byte MyByteNumber = 110;

        short MyShortNumber = 5673;

        int MyIntNumber = 84929;

        long MyLongNumber = 5000L + ((MyByteNumber + MyShortNumber + MyIntNumber) * 10);

        short shortTotal = (short) (5000 + ((MyByteNumber + MyShortNumber + MyIntNumber) * 10));

        System.out.println("The answer is " + MyLongNumber);
        System.out.println("The short answer is " + shortTotal);
    }
}