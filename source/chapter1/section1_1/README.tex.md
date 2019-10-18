## Ex 1.1.1
>a. 7  
>b. 200.0000002  
>c. true

## Ex 1.1.2
>a. double 1.618  
>b. double 10.0  
>c. boolean true  
>d. int 6    correct: String "33"

## [Ex 1.1.3](Ex1_1_03.java)

## Ex 1.1.4
>a. "then" has a syntax error  
>b. missing braces for if condition  
>c. correct  
>d. missing a semicolon

## [Ex 1.1.5](Ex1_1_05.java)

## Ex 1.1.6
>Output:  
>0 1 2 3 5 8 13 21 34 55 89 144 233 377 610

## [Ex 1.1.7](Ex1_1_7.java)
>a. 3.00009155413138  
>b. 499500  
>c. 10000

## Ex 1.1.8
>a. b    implicit conversion from "char" to "String" in println()  
>b. 197  implicit conversion from "char" to "int" in 'b' + 'c'  
>c. e    implicit conversion from "char" to "int" in 'a' + 4, then explicit conversion from "int" to "char"

## [Ex 1.1.9](Ex1_1_09.java)

## Ex 1.1.10
>The size of the array is not specified; It does not allocate memory for array with new.

## [Ex 1.1.11](Ex1_1_11.java)

## Ex 1.1.12
>Output:  
>9 8 7 6 5 4 3 2 1 0

## [Ex 1.1.13](Ex1_1_13.java)

## [Ex 1.1.14](Ex1_1_14.java)

## [Ex 1.1.15](Ex1_1_15.java)

## Ex 1.1.16
>&ensp;&ensp;&ensp;6  
>&ensp;&ensp;&nbsp;/ \  
>&ensp;&nbsp;3&ensp;&nbsp;4  
>&ensp;/&nbsp;\ &ensp;/&nbsp;\  
> 0&ensp;&nbsp;1 1&ensp;2
>
>311361142246

## Ex 1.1.17
>Infinite recursion until StackOuverFlowError occurs.
>The condition should be checked before entering the next layer of recursion.

## Ex 1.1.18
>``mystery(2, 25)`` returns $50$  
>``mystery(3, 11)`` returns $33$  
>``mystery(a, b)`` returns $a \cdot b$
>
>Replace $+$ with $*$ and ``return 0`` with ``return 1``  
>``mystery(2, 25)`` returns $2^{25}$  
>``mystery(3, 11)`` returns $3^{11}$  
>``mystery(a, b)`` returns $a^b$  

## [Ex 1.1.19](Ex1_1_19.java)

## [Ex 1.1.20](Ex1_1_20.java)

## [Ex 1.1.21](Ex1_1_21.java)

## [Ex 1.1.22](Ex1_1_22.java)

## [Ex 1.1.23](Ex1_1_23.java)

## [Ex 1.1.24](Ex1_1_24.java)


## Ex 1.1.25
>Suppose $p$ and $q$ are non-zero integers and the greatest common divisor of $p$ and $q$ is $k$.  
>Then $p$ and $q$ are divided by $k$. We have $p = a \cdot k$ and $q = b \cdot k$, for $a \in\mathbb{Z}$, $b \in\mathbb{Z}$.  
>
>Let $r \equiv p \pmod q$ , then $r = p - n \cdot q$, for $n \in\mathbb{Z}$.  
>We can get,
>
>$
r = a \cdot k - n \cdot (b \cdot k) \\
\,\,\,\,= (a - b \cdot n) \cdot k
$
>
>Therefore, $r$ is also divided by $k$.  
>Thus, the greatest common divisor of $p$ and $q$ is alo the greatest common divisor of $q$ and $r$.
>
>**Base Case**:  
>If $p$ is divided by $q$, the greatest common divisor of $p$ and $q$ is $q$.  
>**Induction Step**:  
>$r \equiv p \pmod q$ . Calculate the greatest common divisor of $q$ and $r$.
>
>External link: [The Euclidean Algorithm](https://www.whitman.edu/mathematics/higher_math_online/section03.03.html)