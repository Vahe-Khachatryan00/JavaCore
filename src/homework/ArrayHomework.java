package homework;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] nums = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6,};
        int n = 6;
        int sum = 0;
        for (int i : nums)
            if (i == n)
                sum++;

        System.out.println("count of 6:" +sum );

        for (int i = 0; i < nums.length / 2; i++) {
            int count = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = count;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }

        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] v = {'ա', 'ե', 'է', 'ը', 'ի', 'ո', 'օ', 'ո', 'ւ'};
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (chars[i] == v[j])
                    count++;
            }
        }
        System.out.println();
        System.out.println(count);

        System.out.println("B3");
        int[] num = {3, 6, 3, 8, 9, 6, 2, 3, 5, 3};
        int mostfrequent = num[0];
        int maxcount = 0;
        for (int i = 0; i < num.length; i++) {
            int total = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j]) {
                    total++;
                }
            }
            if (total > maxcount) {
                maxcount = total;
                mostfrequent = num[i];
            }
        }
        System.out.println(mostfrequent);
        System.out.println(maxcount);

    }
}
