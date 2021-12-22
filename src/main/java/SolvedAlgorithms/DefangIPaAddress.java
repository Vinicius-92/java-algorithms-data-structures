package SolvedAlgorithms;
/*
    Given a valid (IPv4) IP address, return a defanged version of that IP address.
    A defanged IP address replaces every period "." with "[.]".
 */
public class DefangIPaAddress {
    static String Defang(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.') sb.append(address.charAt(i));
            else sb.append('[').append(address.charAt(i)).append(']');
        }
        return sb.toString();
    }
}
