package offertest;
/**
 * 问题描述：
 *
 * UTF-8 中的一个字符可能的长度为 1 到 4 字节，遵循以下的规则：
 * 1. 对于 1 字节的字符，字节的第一位设为0，后面7位为这个符号的unicode码。
 * 2. 对于 n 字节的字符 (n > 1)，第一个字节的前 n 位都设为1，第 n+1 位设为0，
 * 后面字节的前两位一律设为10。剩下的没有提及的二进制位，全部为这个符号的unicode码。
 * 这个是UTF-8编码的工作方式：
 *    Char. number range  |        UTF-8 octet sequence
 *       (hexadecimal)    |              (binary)
 *    --------------------+---------------------------------------------
 *    0000 0000-0000 007F | 0xxxxxxx
 *    0000 0080-0000 07FF | 110xxxxx 10xxxxxx
 *    0000 0800-0000 FFFF | 1110xxxx 10xxxxxx 10xxxxxx
 *    0001 0000-0010 FFFF | 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
 * 给定一个表示数据的整数数组，返回它是否为有效的 utf-8 编码。
 * 注意：
 * 输入是整数数组。只有每个整数的最低 8 个有效位用来存储数据。
 * 这意味着每个整数只表示 1 字节的数据。
 * 输入描述:
 * 多行字符串，每行字符串包括整数数字以及数字之间分隔符英文逗号（,）。
 * 每个整数只有最低8个有效位来存储数据，这就意味着每个整数只表示一个字节的数据。
 * 输出描述:
 * 对输入的每行数据均进行验证，并输出true或者false。true代表有效的utf-8编码，
 * false则是无效的。
 * 示例1
 * 输入
 * 197,130,1
 * 输出
 * true
 * 说明
 * data = [197, 130, 1], 表示 8 位的序列: 11000101 10000010 00000001.
 * 返回 true 。
 * 这是有效的 utf-8 编码，为一个2字节字符，跟着一个1字节字符。
 * 示例2
 * 输入
 * 235,140,4
 * 输出
 * false
 * 说明
 * data = [235, 140, 4], 表示 8 位的序列: 11101011 10001100 00000100.
 * 返回 false 。
 * 前 3 位都是 1 ，第 4 位为 0 表示它是一个3字节字符。
 * 下一个字节是开头为 10 的延续字节，这是正确的。
 * 但第二个延续字节不以 10 开头，所以是不符合规则的。
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String[] str = sc.next().split(",");
            short[] arr = new short[str.length];
            for (int i = 0; i < str.length; i++) {
                //输入的字符转换为数据
                short n = Short.valueOf(str[i]);
                arr[i] = (short)(n & 0xFF);
            }

            boolean illegal = true;
            for (int i = 0; i < arr.length; i++) {
                short b = arr[i];
                if (b >= 0 && b < 128) {
                    continue;
                } else if (b >= 192 && b < 224) {
                    if (i + 1 >= arr.length) {
                        illegal = false;
                        break;
                    }

                    illegal = arr[i + 1] >= 128 && arr[i + 1] < 192;
                    if (!illegal)
                        break;

                    i += 1;
                } else if (b >= 224 && b < 240) {
                    if (i + 2 >= arr.length) {
                        illegal = false;
                        break;
                    }

                    illegal = arr[i + 1] >= 128 && arr[i + 1] < 192 && arr[i + 2] >= 128 && arr[i + 2] < 192;
                    if (!illegal)
                        break;

                    i += 2;
                } else if (b >= 240 && b < 248) {
                    if (i + 3 >= arr.length) {
                        illegal = false;
                        break;
                    }

                    illegal = arr[i + 1] >= 128 && arr[i + 1] < 192 && arr[i + 2] >= 128 && arr[i + 2] < 192 &&
                            arr[i + 3] >= 128 && arr[i + 3] < 192;

                    if (!illegal)
                        break;

                    i += 3;
                } else {
                    illegal = false;
                    break;
                }
            }

            System.out.println(illegal);
        }
    }
}