public class Pattern1 {
    public static void main(String[] args) {
        // Star Pattern
        // int n = 4;
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j <= i; j++) {
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }

        // Inverted Star Pattern
        // int n = 4;
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < n - i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Half-Pyramid Pattern
        // int n = 4;
        // // for(int i = 0; i < n; i++) {
        // //     for(int j = 0; j <= i; j++) {
        // //         System.out.print(j+1);
        // //     }
        // //     System.out.println();
        // // }
        // for(int i = 1; i < Math.pow(10, n); i = i * 10 + i % 10 + 1) {
        //     System.out.println(i);
        // }

        // Print Character Pattern
        // int n = 4;
        // char ch = 'A';
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j <= i; j++) {
        //         System.out.print(ch++);
        //     }
        //     System.out.println();
        // }

        // Hollow Rectanle Pattern
        // int h = 4, w = 40;
        // for(int i = 0; i < h; i++) {
        //     for(int j = 0; j < w; j++) {
        //         if(i == 0 || i == h - 1 || j == 0 || j == w - 1) {
        //             System.out.print("* "); // extra spaces are added since it looks good in the output window with the spaces
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Inverted and Rotated Half Pyramid Pattern
        // int n = 10;
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < n; j++) {
        //         if(j > n - 2 - i) {
        //             System.out.print('*');
        //         } else {
        //             System.out.print(' ');
        //         }
        //     }
        //     System.out.println();
        // }

        // Inverted Half Pyramid with Numbers Pattern
        // int n = 5;
        // for(int i = 0; i < n; i++) {
        //     for(int j = 1; j <= n - i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // FLOYD'S Triangle Pattern
        // int n = 5;
        // int c = 1;
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j <= i; j++) {
        //         System.out.print(c++);
        //     }
        //     System.out.println();
        // }

        // 01 Triangle Pattern
        // int n = 5;
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j <= i; j++) {
        //         System.out.print((i + j) % 2 == 0 ? 1 : 0);
        //     }
        //     System.out.println();
        // }

        // Butterfly Pattern
        // int n = 10;
        // for(int i = 0; i < 2 * n; i++) {
        //     for(int j = 0; j < 2 * n; j++) {
        //         if((i/n==0 ? (j <= i || j >= 2*n-1-i) : (j <= 2*n-1-i || j >= i))) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Solid Rhombus Pattern
        // int n = 10;
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < 2*n-i; j++) {
        //         if(j > n - i - 1) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Hollow Rhombus Pattern
        // int n = 10;
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < 2*n-i; j++) {
        //         if(j > n - i - 1 && (i == 0 || i == n - 1 || j == 2*n-i-1 || j == n - i)) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Diamond Pattern
        // int n = 4;
        // for(int i = 0; i < 2 * n; i++) {
        //     for(int j = 0; j < (i/n == 0 ? i + n : 3 * n - i - 1); j++) {
        //         if(j >= (i/n==0 ? (n - i - 1) : i % n) ) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Number Pyramid Pattern
        // int n = 4;
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < n; j++) {
        //         if(j < n-i-1) {
        //             System.out.print(" ");
        //         } else {
        //             System.out.print((i+1) + " ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Palindromic Pattern with Numbers
        int n = 3;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n + i; j++) {
                if(j < n - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print((j/n==0 ? n - j : j % n + 2));
                }
            }
            System.out.println();
        }
    }
}