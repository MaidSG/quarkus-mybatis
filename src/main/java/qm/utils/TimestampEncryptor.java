package qm.utils;

import java.util.Random;

/*******************************************************************
 * <pre></pre>
 * @文件名称： TimestampEncryptor.java
 * @包 路  径： qm.utils
 * @Copyright：wy (C) 2024 *
 * @Description:
 * @Version: V1.0
 * @Author： wy
 * @Date： 2024/9/6 15:38
 * @Modify：
 */
public class TimestampEncryptor {

    // 加密常量
    private static final int CONSTANT = 15; // constant K
    private static final int a = 3; // 系数 a
    private static final int b = 7; // 偏移量 b

    // 加密函数 f(x) = (a * x + b) % 10
    private static int f(int x) {
        return (a * x + b) % 10;
    }

    // 解密函数 f⁻¹(x) - 找到符合加密规则的原始值
    private static int fInverse(int y) {
        // 寻找符合 (a * x + b) % 10 == y 的 x 值
        for (int x = 0; x < 10; x++) {
            if ((a * x + b) % 10 == y) {
                return x;
            }
        }
        throw new IllegalArgumentException("解密失败，无法找到原始值");
    }

    // 加密后三位数字
    public static String encryptLastThreeDigits(String lastThreeDigits) {
        int a = Character.getNumericValue(lastThreeDigits.charAt(0));
        int b = Character.getNumericValue(lastThreeDigits.charAt(1));
        int c = Character.getNumericValue(lastThreeDigits.charAt(2));

        Random random = new Random();
        // 调整 c 使得 f(a) + f(b) + f(c) == CONSTANT
        while (f(a) + f(b) + f(c) != CONSTANT) {
            c = random.nextInt(10); // 随机选择 c 的值
        }

        // 返回加密后的字符串
        return String.valueOf(f(a)) + f(b) + f(c);
    }

    // 解密后三位数字
    public static String decryptLastThreeDigits(String encryptedLastThree) {
        int a = Character.getNumericValue(encryptedLastThree.charAt(0));
        int b = Character.getNumericValue(encryptedLastThree.charAt(1));
        int c = Character.getNumericValue(encryptedLastThree.charAt(2));

        int originalA = fInverse(a);
        int originalB = fInverse(b);
        int originalC = fInverse(c);

        // 返回解密后的数字
        return String.valueOf(originalA) + originalB + originalC;
    }

    public static void main(String[] args) {
        // 测试用例
        String timestamp = "1693924123456"; // 示例时间戳
        String lastThreeDigits = timestamp.substring(timestamp.length() - 3); // 获取后三位

        // 加密
        String encrypted = encryptLastThreeDigits(lastThreeDigits);
        System.out.println("原始时间戳后三位: " + lastThreeDigits);
        System.out.println("加密后的时间戳后三位: " + encrypted);

        // 解密
        String decrypted = decryptLastThreeDigits(encrypted);
        System.out.println("解密后的时间戳后三位: " + decrypted);
    }





}
