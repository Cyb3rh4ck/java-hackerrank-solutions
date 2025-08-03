# Java Loops II - HackerRank Problem

# Explicación del Problema de Series en Java

Este problema consiste en **generar una serie numérica** a partir de tres números enteros dados para cada consulta: `a`, `b` y `n`.

---

## 1. Formato de Entrada

1. La **primera línea** contiene un entero `q`, que indica **cuántas consultas** vas a procesar.
2. Luego, cada una de las **q líneas siguientes** contiene tres enteros separados por espacio:  

   - **a**  
   - **b**  
   - **n**  

---

## 2. Qué debes hacer

Para **cada consulta (a, b, n)**:

1. Debes generar una **serie de n números** según la fórmula:

```
t_i = a + (2^0 * b) + (2^1 * b) + ... + (2^i * b)
```

- `2^i` significa **2 elevado a la i**.  
- La serie empieza en `i = 0` y se generan **n términos**.  
- Imprime cada serie en **una sola línea**, con los números separados por espacio.

---

## 3. Ejemplo

### Entrada

```
2
0 2 10
5 3 5
```

Significa:  

- `q = 2` (hay dos consultas)  
- Consulta 1: `a = 0`, `b = 2`, `n = 10`  
- Consulta 2: `a = 5`, `b = 3`, `n = 5`

### Salida Esperada

```
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
```

---

## 4. Explicación Paso a Paso

### Consulta 1: `(0, 2, 10)`

1. `0 + 1*2 = 2`  
2. `2 + 2*2 = 6`  
3. `6 + 4*2 = 14`  
4. `14 + 8*2 = 30`  
5. `30 + 16*2 = 62`  
... hasta 10 términos.

**Resultado:**

```
2 6 14 30 62 126 254 510 1022 2046
```

### Consulta 2: `(5, 3, 5)`

1. `5 + 1*3 = 8`  
2. `8 + 2*3 = 14`  
3. `14 + 4*3 = 26`  
4. `26 + 8*3 = 50`  
5. `50 + 16*3 = 98`  

**Resultado:**

```
8 14 26 50 98
```

---

## 5. Código de Ejemplo en Java

```java
import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(); // número de consultas
        
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
```

Este código:

1. Lee el número de consultas.
2. Calcula e imprime la serie para cada `(a, b, n)`.

---



----------------------------------------------------------------------------
## Problem Statement

We use the integers `a`, `b`, and `n` to create the following series:

S₀ = a + b × 2⁰  
S₁ = a + b × (2⁰ + 2¹)  
S₂ = a + b × (2⁰ + 2¹ + 2²)  
...  
Sᵢ = a + b × Σⱼ₌₀ⁱ 2ʲ

You are given `q` queries in the form of `a`, `b`, and `n`. For each query, print the series corresponding to the given `a`, `b`, and `n` values as a single line of `n` space-separated integers.

## Input Format

- The first line contains an integer, `q`, denoting the number of queries.
- Each line `i` of the `q` subsequent lines contains three space-separated integers describing the respective `a`, `b`, and `n` values for that query.

## Constraints

- 0 ≤ q ≤ 500
- 0 ≤ a, b ≤ 50
- 1 ≤ n ≤ 15

## Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of `n` space-separated integers.

## Sample Input

```
2
0 2 10
5 3 5
```

## Sample Output

```
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
```

## Explanation

We have two queries:

### Query 1: a = 0, b = 2, n = 10

We use `a = 0`, `b = 2`, and `n = 10` to produce the series:

- S₀ = 0 + 2 × 2⁰ = 0 + 2 × 1 = 2
- S₁ = 0 + 2 × (2⁰ + 2¹) = 0 + 2 × (1 + 2) = 0 + 2 × 3 = 6
- S₂ = 0 + 2 × (2⁰ + 2¹ + 2²) = 0 + 2 × (1 + 2 + 4) = 0 + 2 × 7 = 14
- S₃ = 0 + 2 × (2⁰ + 2¹ + 2² + 2³) = 0 + 2 × (1 + 2 + 4 + 8) = 0 + 2 × 15 = 30

... and so on.

Once we calculate the first ten terms, we print them as: `2 6 14 30 62 126 254 510 1022 2046`

### Query 2: a = 5, b = 3, n = 5

We use `a = 5`, `b = 3`, and `n = 5` to produce the series:

- S₀ = 5 + 3 × 2⁰ = 5 + 3 × 1 = 8
- S₁ = 5 + 3 × (2⁰ + 2¹) = 5 + 3 × (1 + 2) = 5 + 3 × 3 = 14
- S₂ = 5 + 3 × (2⁰ + 2¹ + 2²) = 5 + 3 × (1 + 2 + 4) = 5 + 3 × 7 = 26
- S₃ = 5 + 3 × (2⁰ + 2¹ + 2² + 2³) = 5 + 3 × (1 + 2 + 4 + 8) = 5 + 3 × 15 = 50
- S₄ = 5 + 3 × (2⁰ + 2¹ + 2² + 2³ + 2⁴) = 5 + 3 × (1 + 2 + 4 + 8 + 16) = 5 + 3 × 31 = 98

We then print each element of our series as: `8 14 26 50 98`

## Solution Approach

### Mathematical Insight

The key insight is that the sum of powers of 2 from 2⁰ to 2ⁱ equals 2^(i+1) - 1. This can be proven by the geometric series formula:

Σⱼ₌₀ⁱ 2ʲ = (2^(i+1) - 1) / (2 - 1) = 2^(i+1) - 1

### Implementation Strategy

1. **Bit Manipulation**: Use left shift operation `(1 << (j + 1)) - 1` to efficiently calculate 2^(j+1) - 1
2. **Time Complexity**: O(q × n) where q is the number of queries and n is the number of terms per query
3. **Space Complexity**: O(1) as we calculate and print terms on the fly

### Code Structure

The solution uses nested loops:
- Outer loop: Iterate through each query
- Inner loop: Generate n terms for each query using the mathematical formula

The bit manipulation approach avoids the need for expensive power calculations or nested loops to compute the sum of powers of 2.
