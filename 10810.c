#include <stdio.h>
#include <stdlib.h>

int main() {
    int total, repeat;

    // 총 바구니와 반복횟수를 입력받음
    scanf("%d %d", &total, &repeat);

    // 배열의 크기는 변수로 정의할 수 없으므로 동적 할당해야 함
    int* n_array = (int*)malloc(total * sizeof(int));

    // 배열 초기화
    for (int i = 0; i < total; i++) {
        n_array[i] = 0;
    }

    // 반복하여 바구니에 숫자를 넣거나 비움
    for (int i = 0; i < repeat; i++) {
        int range_a, range_b, num;
        scanf("%d %d %d", &range_a, &range_b, &num);
        for (int j = range_a - 1; j < range_b; j++) {
            if (n_array[j] != 0) {
                n_array[j] = 0;
            }
            else {
                n_array[j] = num;
            }
        }
    }

    // 결과 출력
    for (int i = 0; i < total; i++) {
        printf("%d ", n_array[i]);
    }

    // 동적 할당된 메모리 해제
    free(n_array);

    return 0;
}
