class Solution {
    public boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        int tamanho = y.length() - 1;
        int cont = y.length();
        int i = 0;

        while (tamanho >= 0 && i < y.length()) {
            if (y.charAt(tamanho) == y.charAt(i)) {
                cont--;
            }
            i++;
            tamanho--;

        }

        if (cont == 0) {
            return true;
        } else {
            return false;
        }

    }
}