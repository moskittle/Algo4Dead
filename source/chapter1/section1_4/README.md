Ex 1.4.1
Formula for n choose k: n! / (k! * (n - k)!)

Ex 1.4.2
See Ex1_4_02.java

Ex 1.4.3
See Ex1_4_03.java

Ex 1.4.4
statement Block     time in seconds     frequency       total time
    D                   t0                  x             t0 * x
    C                   t1              (N^2-N)/2         t1 * (N^2-N)/2
    B                   t2                  N             t2 * N
    A                   t3                  1             t3

grand total = t1/2 * N^2 + (t2-t1/2) * N + t3 + t0 * x
tilde approximation: ~t1/2 N^2
order of growth N^2

------------------------A
for(i = 0){-------------B
    for(j = i + 1){-----C
        if(){-----------D
            cnt++;------D
        }
    }
}

Ex 1.4.5
a. ~N
b. ~1
c. ~1
d. ~2N^3
e. ~1
f. ~2
g. ~0

Ex 1.4.6
a) O(N)
b) O(N)
c) O(N * lg(N))

Ex 1.4.7
Cost model of ThreeSum: 
Suppose the size of input is N, the inner loop runs (N3) = N(N-1)(N-2)/6.
Each time the inner loop access the array 3 times, does two add operations and on if check.
Therefore, the grand total = 6*N(N-1)(N-2)/6 = N(N-1)(N-2)  = N^3 - 3N +3.
Tilde approximation: ~N^3
Order of growth: O(N^3)

Ex 1.4.8
See Ex1_4_08.java

Ex 1.4.9
Problem size = N, doubling factor = 2^b, T(N0) = T.
Formula: T(N) = T * 2^(b*lg(N-N0))

1.4.10
See Ex1_4_10.java

1.4.11
See Ex1_4_11.java

1.4.12
See Ex1_4_12.java