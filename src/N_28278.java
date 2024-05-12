//스택 2 성공
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//2 초	1024 MB	28592	10396	8684	37.057%
//문제
//정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//
//명령은 총 다섯 가지이다.
//
//1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
//2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
//3: 스택에 들어있는 정수의 개수를 출력한다.
//4: 스택이 비어있으면 1, 아니면 0을 출력한다.
//5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
//입력
//첫째 줄에 명령의 수 N이 주어진다. (1 ≤ N ≤ 1,000,000)
//
//둘째 줄부터 N개 줄에 명령이 하나씩 주어진다.
//
//출력을 요구하는 명령은 하나 이상 주어진다.
//
//출력
//출력을 요구하는 명령이 주어질 때마다 명령의 결과를 한 줄에 하나씩 출력한다.
//
//예제 입력 1
//9
//4
//1 3
//1 5
//3
//2
//5
//2
//2
//5
//예제 출력 1
//1
//2
//5
//3
//3
//-1
//-1

import java.io.*;
import java.util.*;

public class N_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < count; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (input[0] == 1) {
                stack.push(input[1]);
            } else {
                switch (input[0]) {
                    case 2:
                        bw.write((stack.isEmpty() ? -1 : stack.pop()) + "\n");
                        break;
                    case 3:
                        bw.write(stack.size() + "\n");
                        break;
                    case 4:
                        bw.write((stack.isEmpty() ? 1 : 0) + "\n");
                        break;
                    case 5:
                        bw.write((stack.isEmpty() ? -1 : stack.peek()) + "\n");
                        break;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
