public class strRotation {
    public class StringRotationCheck {
        public static boolean areRotations(String s1, String s2) {
            // Check if lengths are the same
            if (s1.length() != s2.length()) {
                return false;
            }
            // Concatenate s1 with itself and check if s2 is a substring
            String concatenated = s1 + s1;
            return concatenated.contains(s2);
        }
    
        public static void main(String[] args) {
            String s1 = "abcd";
            String s2 = "cdaab";
    
            if (areRotations(s1, s2)) {
                System.out.println(s2 + " is a rotated version of " + s1);
            } else {
                System.out.println(s2 + " is NOT a rotated version of " + s1);
            }
        }
    }
    
}
