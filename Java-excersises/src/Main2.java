public class Main2 {
    public static void main(String[] args) {
        //PK[11] == (1101 - (1*PK[1] + 6*PK[2] + 3*PK[3] + 7*PK[4] + 9*PK[5] + 10*PK[6] + 5*PK[7] + 8*PK[8] + 4*PK[9] + 2*PK[10])) mod 11
        String pk = "220990-12009";
        pk = pk.replace("-", "");
        String[] stringArray = pk.split("");//toCharArray();
        int[] constants = {1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        int sum =0;
        for (int i = 0; i < constants.length; i++) {
            sum += constants[i] * Integer.parseInt(stringArray[i]);
        }
        int result = (1101 - sum) % 11;
        if (result == 10) {
            result = 0;
        }
        System.out.println("control number is " + result);
    }
}