class Solution {
    public boolean validPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return check(s, 0, s.length() - 1, false);
    }

    public boolean check(String s, int i, int j, boolean deleted) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (deleted) return false;

                // Try skipping either left or right character
                return check(s, i + 1, j, true) || check(s, i, j - 1, true);
            }
            i++;
            j--;
        }
        return true;
    }
}