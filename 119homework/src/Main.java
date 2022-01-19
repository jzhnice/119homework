import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/**
 * @author jzh
 * @version 1.0
 * @date 2022/1/19 9:02
 * 小明的作业本上有道思考题：
 * 看下面的算式：
 * (□□□□-□□□□)*□□=900
 * 其中的小方块代表 0 ~ 9 的数字，这 10 个方块刚好包含了 0 ~ 9 中的所有数字。
 * 注意：0 不能作为某个数字的首位。
 * 小明经过几天的努力，终于做出了答案！如下：
 * (5012-4987)*36=900
 * 用计算机搜索后，发现还有另外一个解，本题的任务就是：请你算出这另外的一个解。
 * 注意：输出格式需要与示例严格一致； 括号及运算符号不要用中文输入法； 整个算式中不能包含空格。
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // 千位
            for (int j = 0; j < 10; j++) {// 百位
                for (int k = 0; k < 10; k++) {//十位
                    for (int l = 0; l < 10; l++) {//各位


                        for (int m = 0; m < 10; m++) { // 千位
                            for (int n = 0; n < 10; n++) {//百位
                                for (int o = 0; o < 10; o++) { //十位
                                    for (int p = 0; p < 10; p++) {//个位


                                        for (int q = 0; q < 10; q++) {//十位
                                            for (int r = 0; r < 10; r++) {// 各位

                                                if (i != j && i != k && i != l && i != m && i != n && i != o && i != p && i != q && i != r && i != 0) {
                                                    if (j != k && j != l && j != m && j != n && j != o && j != p && j != q && j != r) {
                                                        if (k != l && k != m && k != n && k != o && k != p && k != q && k != r) {
                                                            if (l != m && l != n && l != o && l != p && l != q && l != r) {
                                                                if (m != n && m != o && m != p && m != q && m != r) {
                                                                    if (n != o && n != p && n != q && n != r) {
                                                                        if (o != p && o != q && o != r) {
                                                                            if (p != q && p != r) {
                                                                                if (q != r && q != 0) {
                                                                                    if (((i * 1000 + j * 100 + k * 10 + l) - (m * 1000 + n * 100 + o * 10 + p)) * (q * 10 + r) == 900) {
                                                                                        System.out.println(" (" + (i * 1000 + j * 100 + k * 10 + l) + " - " + (m * 1000 + n * 100 + o * 10 + p) + " ) * " + (q * 10 + r) + " = " + 900);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }

                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }
}