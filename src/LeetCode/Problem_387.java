package LeetCode;

public class Problem_387 {

//    Problem 387. First Unique Character in a String
//    https://leetcode.com/problem-list/prshgx6i/

        public int firstUniqChar(String s) {
//        String s = "leetcode";
//        String s = "loveleetcode";
//            String s = "aadd";

            char[] chars = s.toCharArray();

//        System.out.println("length = " + chars.length);

            int index = -1;
            for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
                boolean found = true ;
                for(int j = 0; j < chars.length; j++){

                    if (i!=j && chars[i] == chars[j]) {
                        found = false;
                        break;
                    }
//                System.out.println(j + " = j");
                }
                if(found) {
                    index = i;
                    break;
                }
//            System.out.println(i + " = i");
            }
         return index;
        }


    public static void main(String[] args) {

        Problem_387 sc = new Problem_387();
        System.out.println(sc.firstUniqChar("aadd"));


        }


//        char ch = s.charAt(2);
//        System.out.println("index 2: "+ch);

//        if(chars[i] == ch) {
//            System.out.println("match");
//        }
//        else {
//            System.out.println("not match");
//        }





    }

