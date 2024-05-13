#include <stdio.h>

int main() {
    int total_cost = 0, p_number = 0;
    int calcul_cost = 0;

    // 총 비용과 제품의 개수를 입력 받음
    scanf_s("%d", &total_cost);
    scanf_s("%d", &p_number);
    

    // 각 제품의 개수와 가격을 입력 받아 계산된 비용을 계산
    for (int i = 0; i < p_number; i++) {
        int p = 0, p_cost = 0;
        scanf_s("%d %d", &p, &p_cost);
        calcul_cost += (p * p_cost);
    }
    // 총 비용과 계산된 비용을 비교하여 결과 출력
    if (calcul_cost == total_cost)
        printf("Yes\n");
    else
        printf("No\n");

    return 0;
}
