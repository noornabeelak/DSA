public class binaryadd {
    public class BinaryAddition {

        public static String addBinaryStrings(String s1, String s2) {
            // Remove leading zeros
            s1 = s1.replaceFirst("^0+", "");
            s2 = s2.replaceFirst("^0+", "");
            
            // Handle edge cases where one or both strings are empty
            if (s1.isEmpty()) return s2.isEmpty() ? "0" : s2;
            if (s2.isEmpty()) return s1;
    
            StringBuilder result = new StringBuilder();
            int carry = 0;
            
            // Pointers for the two strings
            int i = s1.length() - 1;
            int j = s2.length() - 1;
    
            // Perform binary addition
            while (i >= 0 || j >= 0 || carry > 0) {
                int bit1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
                int bit2 = (j >= 0) ? s2.charAt(j) - '0' : 0;
                int sum = bit1 + bit2 + carry;
    
                // Append the result bit
                result.append(sum % 2);
                // Update the carry
                carry = sum / 2;
    
                // Move to the next bits
                i--;
                j--;
            }
    
            // Reverse the result to get the correct binary string
            return result.reverse().toString();
        }
    
        public static void main(String[] args) {
            String s1 = "00101";
            String s2 = "011";
    
            String result = addBinaryStrings(s1, s2);
            System.out.println("Result: " + result);  // Output: "1000"
        }
    }
    
    
}
