package org.perisic.leetcode.easy;

public class DefangingIpAddress {

    /**
     * https://leetcode.com/problems/defanging-an-ip-address/
     */

    public static void main(String[] args) {

        String address1 = "1.1.1.1";
        String address2 = "255.100.50.0";

        System.out.println("### " + defangIPaddr(address1));
        System.out.println("### " + defangIPaddr(address2));

        System.out.println("### " + defangIPaddrWithStrBuilder(address1));
        System.out.println("### " + defangIPaddrWithStrBuilder(address2));

        System.out.println("### " + defangIPaddrBuildIn(address1));
        System.out.println("### " + defangIPaddrBuildIn(address2));
    }

    private static String defangIPaddr(String address) {
        int counter = 0;
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                counter++;
            }
        }
        counter *= 2;

        char[] chars = new char[address.length() + counter];
        counter = 0;
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                chars[counter++] = '[';
                chars[counter++] = '.';
                chars[counter++] = ']';
            } else {
                chars[counter++] = address.charAt(i);
            }
        }
        return String.valueOf(chars);
    }

    private static String defangIPaddrWithStrBuilder(String address) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                result.append("[.]");
            } else {
                result.append(address.charAt(i));
            }
        }
        return result.toString();
    }

    private static String defangIPaddrBuildIn(String address) {
        return address.replaceAll("\\.", "[.]");
    }


}    
