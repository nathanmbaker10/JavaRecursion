public class Runner {
    public int triangle(int rows) {
        if (rows <= 1) {
            return rows;
        } else {
            return rows + triangle(rows -1);
        }
    }

    public int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public int countHi(String str) {
        if(str.length() < 2) {
            return 0;
        } else if (str.length() == 2) {
            if (str.substring(0, 2).equals("hi")){
                return 1;
            } else {
                return 0;
            }
        } else {
            if (str.substring(0, 2).equals("hi")){
                return 1 + countHi(str.substring(1));
            } else {
                return 0 + countHi(str.substring(1));
            }
        }
    }


    public int sumDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + sumDigits((n/10));
        }
    }

    public int count8(int n) {
        if (n < 1) {
            return 0;
        }
        if (n % 10 == 8 && (n / 10) % 10 == 8) {
            return 2 + count8(n/10);
        }
        else if (n % 10 == 8) {
            return 1 + count8(n/10);
        }
        else{
            return count8(n/10);
        }
    }


    public int countAbc(String str) {
        if(str.length() <= 3) {
            if(str.equals("abc") || str.equals("aba")) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if(str.substring(0, 3).equals("aba") || str.substring(0, 3).equals("abc")) {
                return 1 + countAbc(str.substring(1));
            } else {
                return 0 + countAbc(str.substring(1));
            }
        }


        public int count7(int n) {
            if (n < 10) {
                if(n == 7) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                if(n % 10 == 7) {
                    return 1 + count7(n/10);
                } else {
                    return 0 + count7(n/10);
                }
            }
        }

        public int countX(String str) {
            if(str.length() <= 1) {
                if(str.equals("x")) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                if (str.charAt(0) == 'x') {
                    return 1 + countX(str.substring(1));
                } else {
                    return 0 + countX(str.substring(1));
                }
            }
        }


    }