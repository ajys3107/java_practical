public class less50 {
    public static void main(String[] args) {

        String[] registrationNumber = {"2022BIT034", "2022BCS045", "2022BME067", "2022BCH023", "2022VHE067"};
        int totalValidCount = getValidRegistrationNumberCount(registrationNumber);
        System.out.println("Number of Valid Registration Number: " + totalValidCount);

        int totalValidCountLessThan50 = getValidRegistrationNumberCountLessThan50(registrationNumber);
        System.out.println("Number of Valid Registration Number less than 50: " + totalValidCountLessThan50);
    }

    public static int getValidRegistrationNumberCount(String[] registrationNumber) {
        int count = 0;
        for (int i = 0; i < registrationNumber.length; i++) {
            if (validRegNumber(registrationNumber[i])) {
                count++;
            }
        }
        return count;
    }

    public static int getValidRegistrationNumberCountLessThan50(String[] registrationNumber) {
        int count = 0;
        for (int i = 0; i < registrationNumber.length; i++) {
            if (validRegNumber(registrationNumber[i])) {
                String s = registrationNumber[i].substring(7,10);
                int num = Integer.parseInt(s);
                if (num < 50) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean validRegNumber(String number) {
        String code = number.substring(4, 7);
        return code.equals("BIT") || code.equals("BCS") || code.equals("BME") || code.equals("BCH");
    }
}
