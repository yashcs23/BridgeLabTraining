package methodpracticelevel3;


import java.util.Arrays;


class q8 {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOtp();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("Are OTPs unique? " + areOtpsUnique(otps));
    }

    public static int generateOtp() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areOtpsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
