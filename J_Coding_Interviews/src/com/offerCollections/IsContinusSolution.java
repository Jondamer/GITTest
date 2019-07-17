package com.offerCollections;

import java.util.Arrays;


/**
 * 5张扑克牌，看看能不能组成顺子，其中大王，小王可以看成任意的牌。 输入(I):正整数数组，数组长度为5.
 * 输出(O):布尔型，如果能组成顺子，则输出为true。
 * 
 * @author zhengzhentao
 *
 */
public class IsContinusSolution {

	public IsContinusSolution() {
		// TODO Auto-generated constructor stub
	}

	public static boolean isContinuous(int[] numbers) {

		// 考虑数组为空值等异常情况
		if (numbers.length < 1)
			return false;
//		bubbleSort(numbers);// 第一步：先进行排序
		
        Arrays.sort(numbers); // 调用数组自带的排序方法
		int leng = numbers.length;
		int numbersOfZeros = 0;
		int numberOfGaps = 0;

		// 统计数组中0的个数
		for (int i = 0; i < leng; i++) {
			if (numbers[i] == 0) {
				numbersOfZeros++;
			}
		}

		// 统计数组中空缺的总数
		int front = numbersOfZeros;
		int behind = front + 1;
		while (behind < leng) {
			// 如果前后两个数相等，就是扑克牌中的对，不可能组成顺子，直接返回false
			if (numbers[behind] == numbers[front] && numbers[behind] != 0 && numbers[front] != 0) {
				return false;
			}
			numberOfGaps = numberOfGaps + (numbers[behind] - numbers[front] - 1);
			front = behind;
			behind++;
		}
		System.out.println("0的数字是多少" + numbersOfZeros + "\t" + "空缺的总数是: " + numberOfGaps);
		return (numberOfGaps > numbersOfZeros) ? false : true;
	}

	static void bubbleSort(int[] bubble) {
		int length = bubble.length;
		int sortborder = bubble.length - 1;
		int lastExchageIndex = 0;
		for (int i = 0; i < length; i++) {
			// 冒泡程序改进1：添加一个标志位，如果经过第六轮排序，整个数列已然是有序的了。可是我们的排序算法仍然“兢兢业业”地继续执行第七轮、第八轮。
			// 这种情况下，如果我们能判断出数列已经有序，并且做出标记，剩下的几轮排序就可以不必执行，提早结束工作。
			/**
			 * 冒泡程序改进2：
			 * 按照现有的逻辑，有序区的长度和排序的轮数是相等的。比如第一轮排序过后的有序区长度是1，第二轮排序过后的有序区长度是2 ......
			 * 实际上，数列真正的有序区可能会大于这个长度，比如例子中仅仅第二轮，后面5个元素实际都已经属于有序区。
			 * 因此后面的许多次元素比较是没有意义的。
			 * 如何避免这种情况呢？我们可以在每一轮排序的最后，记录下最后一次元素交换的位置，那个位置也就是无序数列的边界，再往后就是有序区了。
			 */
			boolean isSorted = true;
			for (int j = 0; j < sortborder; j++) {
				if (bubble[j] > bubble[j + 1]) {
					int temp = bubble[j];
					bubble[j] = bubble[j + 1];
					bubble[j + 1] = temp;
					isSorted = false;
					// 把无序数组的边界更新为最后一次数据发生交换的位置
					lastExchageIndex = j;
				}
			}
			sortborder = lastExchageIndex;
			if (isSorted) {
				break;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 测试排序算法
		int numbers[] = { 2, 0, 4, 0, 6 };
		bubbleSort(numbers);
		for (int i : numbers) {
			System.out.println(i);
		}

		boolean b = isContinuous(numbers);
		System.out.println(b);
	}

}
