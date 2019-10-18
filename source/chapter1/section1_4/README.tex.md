## Ex 1.4.1
>Formula for $n$ choose $k$:  
$$
\binom{n}{k} = \frac{n!}{k!\cdot(n - k)!}
$$

## [Ex 1.4.2](Ex1_4_02.java)

## [Ex 1.4.3](Ex1_4_03.java)

## Ex 1.4.4
| Statement Block | Time in Seconds | Frequency         | Total time                  |
| --------------- | --------------- | ----------------- | --------------------------- |
| D               | $t_0$           | $x$               | $t_0 \cdot x$               |
| C               | $t_1$           | $\frac{N^2-N}{2}$ | $t_1 \cdot \frac{N^2-N}{2}$ |
| B               | $t_2$           | $N$               | $t_2 \cdot N$               |
| A               | $t_3$           | $1$               | $t_3$                       |

>*Grand Total* $=\frac{t_1}{2} \cdot N^2 + (t_2-\frac{t_1}{2}) \cdot N + t_3 + t_0 \cdot x$
>
>*Tilde Approximation:* $~\frac{t_1}{2} \cdot N^2$
>
>*Order of Growth:* $N^2$
>
>```java
>------------------------A
>for(i = 0){-------------B
>    for(j = i + 1){-----C
>        if(){-----------D
>            cnt++;------D
>        }
>    }
>}
>```

## Ex 1.4.5
>a. $\sim N$  
>b. $\sim 1$  
>c. $\sim 1$  
>d. $\sim 2N^3$  
>e. $\sim 1$  
>f. $\sim 2$  
>g. $\sim 0$

## Ex 1.4.6
>a) $O(N)$  
>b) $O(N)$  
>c) $O(N \cdot lg(N))$

## Ex 1.4.7
>Cost model of ThreeSum:  
>Suppose the size of input is $N$, the inner loop runs $N_3 = N(N-1)(N-2)/3!$.  
>Each time the inner loop access the array 3 times, does two add operations and on if check.  
>Therefore, we get
>
>*Grand Total* $= 6 \cdot \frac{N(N-1)(N-2)}{3!}$  
>&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;$= N(N-1)(N-2)$  
>&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;$= N^3 - 3N +3$
>
>*Tilde Approximation:* $\sim N^3$  
>
>*Order of Growth:* $O(N^3)$

## [Ex 1.4.8](Ex1_4_08.java)

## Ex 1.4.9
>*Problem size* $= N$, *doubling factor* = $2^b$, $T(N_0) = T$.
>
>*Formula:* $T(N) = T \cdot 2^{b \cdot lg(N-N_0)}$

## [Ex 1.4.10](Ex1_4_10.java)

## [Ex 1.4.11](Ex1_4_11.java)

## [Ex 1.4.12](Ex1_4_12.java)