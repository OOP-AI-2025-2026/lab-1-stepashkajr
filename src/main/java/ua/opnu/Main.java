package ua.opnu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // ======== Logical operations ========

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    private boolean isTeen(int n) {
        return n >= 13 && n <= 19;
    }

    // ======== Boolean expressions ========

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        }
        return (a < 0 && b > 0) || (a > 0 && b < 0);
    }

    // ======== Loops and Arrays ========

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        int end = Math.min(nums.length, 4);
        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        int streak = 0;
        for (int i : nums) {
            if (i == 1) {
                streak = 1;
            } else if (streak == 1 && i == 2) {
                streak = 2;
            } else if (streak == 2 && i == 3) {
                return true;
            } else {
                streak = 0;
            }
        }
        return false;
    }

    // ======== Strings ========

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        String start = str.substring(0, str.length() - 2);
        char secondLast = str.charAt(str.length() - 2);
        char last = str.charAt(str.length() - 1);
        return start + last + secondLast;
    }

    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }
}
