# [Bronze III] 알람 시계 - 2884 

[문제 링크](https://www.acmicpc.net/problem/2884) 

### 성능 요약

메모리: 16116 KB, 시간: 124 ms

### 분류

수학, 사칙연산

### 제출 일자

2026년 3월 10일 22:18:32


## 📖 Learning Notes

### 1. ⏰ 알람 시계 알고리즘 (시간 계산)
- **핵심 로직**: 60분 주기를 고려하여 '분'이 부족할 때 '시'에서 1을 빌려오는 방식.
- **수식 최적화**: `M < 45`일 때, `H = H - 1`을 하고 `M = M + 15`를 하면 `60 - (45 - M)`과 동일한 결과가 나옴.

```java
// 핵심 코드 조각
if (M < 45) {
    H--;        // 1시간 차감
    M += 15;    // 분 계산 (60 - 45 + M)
    if (H < 0) H = 23; // 0시에서 차감 시 23시로 변경
} else {
    M -= 45;    // 45분 이상이면 분만 차감
}
```

### 2. 📥 Java 효율적인 입력 처리 (BufferedReader)

Java의 `Scanner`는 내부 버퍼가 작고 속도가 느려 코딩 테스트 시 **시간 초과**의 원인이 될 수 있습니다. 따라서 상대적으로 속도가 빠른 `BufferedReader` 사용을 생활화합시다!

---

### 💡 공백으로 구분된 데이터 읽기 (Parsing)

`BufferedReader`는 한 줄 단위(`String`)로만 읽어오기 때문에, 공백으로 구분된 데이터를 처리하기 위해 다음 두 가지 방식을 주로 사용합니다.

| 방식 | 특징 | 추천 상황 |
| :--- | :--- | :--- |
| **StringTokenizer** | **가장 빠름**, 메모리 효율적 | **코딩 테스트 필수 (대량 데이터)** |
| **split()** | 코드가 간결함, 배열로 반환 | 데이터 양이 적거나 직관적인 코드가 필요할 때 |

---

### 🛠️ 실전 코드 템플릿

```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException { // ⚠️ 주의: IOException 처리 필수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // [방법 1] StringTokenizer 사용 (권장)
        // 입력: "10 20"
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 10
        int B = Integer.parseInt(st.nextToken()); // 20

        // [방법 2] split() 메서드 사용
        // 입력: "12 45"
        String[] inputs = br.readLine().split(" ");
        int H = Integer.parseInt(inputs[0]); // 12
        int M = Integer.parseInt(inputs[1]); // 45
    }
}
```
