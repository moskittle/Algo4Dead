## Ex 1.4.1
>Formula for <img src="/source/chapter1/section1_4/tex/55a049b8f161ae7cfeb0197d75aff967.svg?invert_in_darkmode&sanitize=true" align=middle width=9.86687624999999pt height=14.15524440000002pt/> choose <img src="/source/chapter1/section1_4/tex/63bb9849783d01d91403bc9a5fea12a2.svg?invert_in_darkmode&sanitize=true" align=middle width=9.075367949999992pt height=22.831056599999986pt/>:  
>
><img src="/source/chapter1/section1_4/tex/c0c35e7ff281602710e4c89b1b8cec0b.svg?invert_in_darkmode&sanitize=true" align=middle width=101.63806455pt height=28.92634470000001pt/>
## [Ex 1.4.2](Ex1_4_02.java)

## [Ex 1.4.3](Ex1_4_03.java)

## Ex 1.4.4
| Statement Block | Time in Seconds | Frequency         | Total time                  |
| --------------- | --------------- | ----------------- | --------------------------- |
| D               | <img src="/source/chapter1/section1_4/tex/6df6ddacc987bd7a5070beafef47fcc1.svg?invert_in_darkmode&sanitize=true" align=middle width=12.48864374999999pt height=20.221802699999984pt/>           | <img src="/source/chapter1/section1_4/tex/332cc365a4987aacce0ead01b8bdcc0b.svg?invert_in_darkmode&sanitize=true" align=middle width=9.39498779999999pt height=14.15524440000002pt/>               | <img src="/source/chapter1/section1_4/tex/c82faa79cd24b5570372761eb4f1f6d9.svg?invert_in_darkmode&sanitize=true" align=middle width=34.577527049999986pt height=20.221802699999984pt/>               |
| C               | <img src="/source/chapter1/section1_4/tex/4ad941990ade99427ec9730e46ddcdd4.svg?invert_in_darkmode&sanitize=true" align=middle width=12.48864374999999pt height=20.221802699999984pt/>           | <img src="/source/chapter1/section1_4/tex/79eebff9832c70b9453b1764b6223e4c.svg?invert_in_darkmode&sanitize=true" align=middle width=39.98193704999999pt height=33.45973289999998pt/> | <img src="/source/chapter1/section1_4/tex/baf87db998a8337ffd3ff46483f844c8.svg?invert_in_darkmode&sanitize=true" align=middle width=67.13707274999999pt height=33.45973289999998pt/> |
| B               | <img src="/source/chapter1/section1_4/tex/fc8a01b432c04ded557b89788ba5f8f4.svg?invert_in_darkmode&sanitize=true" align=middle width=12.48864374999999pt height=20.221802699999984pt/>           | <img src="/source/chapter1/section1_4/tex/f9c4988898e7f532b9f826a75014ed3c.svg?invert_in_darkmode&sanitize=true" align=middle width=14.99998994999999pt height=22.465723500000017pt/>               | <img src="/source/chapter1/section1_4/tex/09c4702bb8411bc2f10b6b896e87f566.svg?invert_in_darkmode&sanitize=true" align=middle width=40.18252919999999pt height=22.465723500000017pt/>               |
| A               | <img src="/source/chapter1/section1_4/tex/f8fe10a14cea5037dee7ea888c1f7308.svg?invert_in_darkmode&sanitize=true" align=middle width=12.48864374999999pt height=20.221802699999984pt/>           | <img src="/source/chapter1/section1_4/tex/034d0a6be0424bffe9a6e7ac9236c0f5.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>               | <img src="/source/chapter1/section1_4/tex/f8fe10a14cea5037dee7ea888c1f7308.svg?invert_in_darkmode&sanitize=true" align=middle width=12.48864374999999pt height=20.221802699999984pt/>                       |

>*Grand Total* <img src="/source/chapter1/section1_4/tex/0f0351d8e474251767d796126a2dccd7.svg?invert_in_darkmode&sanitize=true" align=middle width=263.47189275pt height=27.634635599999985pt/>
>
>*Tilde Approximation:* <img src="/source/chapter1/section1_4/tex/121dd7d85e6eeadcb42fd3be758d138b.svg?invert_in_darkmode&sanitize=true" align=middle width=46.778478449999994pt height=27.634635599999985pt/>
>
>*Order of Growth:* <img src="/source/chapter1/section1_4/tex/4c87ee198ded31321f89b44a38a0ad5a.svg?invert_in_darkmode&sanitize=true" align=middle width=21.552516149999988pt height=26.76175259999998pt/>
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
>a. <img src="/source/chapter1/section1_4/tex/c76425d1dc34a2ab8b28f61580e4c13d.svg?invert_in_darkmode&sanitize=true" align=middle width=32.35152194999999pt height=22.465723500000017pt/>  
>b. <img src="/source/chapter1/section1_4/tex/9aeb89930f6531fd3ead21a7498e4b92.svg?invert_in_darkmode&sanitize=true" align=middle width=25.570741349999988pt height=21.18721440000001pt/>  
>c. <img src="/source/chapter1/section1_4/tex/9aeb89930f6531fd3ead21a7498e4b92.svg?invert_in_darkmode&sanitize=true" align=middle width=25.570741349999988pt height=21.18721440000001pt/>  
>d. <img src="/source/chapter1/section1_4/tex/c49a66db9afcfcdd0de1d2dee5ea48f1.svg?invert_in_darkmode&sanitize=true" align=middle width=47.12325749999999pt height=26.76175259999998pt/>  
>e. <img src="/source/chapter1/section1_4/tex/9aeb89930f6531fd3ead21a7498e4b92.svg?invert_in_darkmode&sanitize=true" align=middle width=25.570741349999988pt height=21.18721440000001pt/>  
>f. <img src="/source/chapter1/section1_4/tex/109e33916c2e478448a90b561e7f8c1b.svg?invert_in_darkmode&sanitize=true" align=middle width=25.570741349999988pt height=21.18721440000001pt/>  
>g. <img src="/source/chapter1/section1_4/tex/9090e4e171f80dc0bf2b3f26718fcf94.svg?invert_in_darkmode&sanitize=true" align=middle width=25.570741349999988pt height=21.18721440000001pt/>

## Ex 1.4.6
>a) <img src="/source/chapter1/section1_4/tex/e7a2f022962441f2be6dc8e70e837b4a.svg?invert_in_darkmode&sanitize=true" align=middle width=40.78082744999999pt height=24.65753399999998pt/>  
>b) <img src="/source/chapter1/section1_4/tex/e7a2f022962441f2be6dc8e70e837b4a.svg?invert_in_darkmode&sanitize=true" align=middle width=40.78082744999999pt height=24.65753399999998pt/>  
>c) <img src="/source/chapter1/section1_4/tex/48902569add793f2cef3ad2d52f212c3.svg?invert_in_darkmode&sanitize=true" align=middle width=94.09691279999998pt height=24.65753399999998pt/>

## Ex 1.4.7
>Cost model of ThreeSum:  
>Suppose the size of input is <img src="/source/chapter1/section1_4/tex/f9c4988898e7f532b9f826a75014ed3c.svg?invert_in_darkmode&sanitize=true" align=middle width=14.99998994999999pt height=22.465723500000017pt/>, the inner loop runs <img src="/source/chapter1/section1_4/tex/9d69c3e37aa32e109273ab4878afaef4.svg?invert_in_darkmode&sanitize=true" align=middle width=190.69607534999997pt height=24.65753399999998pt/>.  
>Each time the inner loop access the array 3 times, does two add operations and on if check.  
>Therefore, we get
>
>*Grand Total* <img src="/source/chapter1/section1_4/tex/5ec88d5bf60ca9ae2b5463755a5c52a9.svg?invert_in_darkmode&sanitize=true" align=middle width=128.55494025pt height=33.20539859999999pt/>  
>&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;<img src="/source/chapter1/section1_4/tex/c1de142e5c08d0364950401a02e74259.svg?invert_in_darkmode&sanitize=true" align=middle width=144.54310529999998pt height=24.65753399999998pt/>  
>&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;<img src="/source/chapter1/section1_4/tex/37d3eeff9bd15cce3a60a1e516e654c5.svg?invert_in_darkmode&sanitize=true" align=middle width=111.34673054999999pt height=26.76175259999998pt/>
>
>*Tilde Approximation:* <img src="/source/chapter1/section1_4/tex/336bdb7ea9a0e67c14bede729f317667.svg?invert_in_darkmode&sanitize=true" align=middle width=38.904048149999994pt height=26.76175259999998pt/>  
>
>*Order of Growth:* <img src="/source/chapter1/section1_4/tex/0e10b94fd93211f59f66cd90dec1abe1.svg?invert_in_darkmode&sanitize=true" align=middle width=48.15528629999999pt height=26.76175259999998pt/>

## [Ex 1.4.8](Ex1_4_08.java)

## Ex 1.4.9
>*Problem size* <img src="/source/chapter1/section1_4/tex/a12460ab93d8d98c389cdbe933bf2652.svg?invert_in_darkmode&sanitize=true" align=middle width=32.35152194999999pt height=22.465723500000017pt/>, *doubling factor* = <img src="/source/chapter1/section1_4/tex/ab81d779781c69c7e07daea9a284fca3.svg?invert_in_darkmode&sanitize=true" align=middle width=14.000047049999989pt height=27.91243950000002pt/>, <img src="/source/chapter1/section1_4/tex/2ed5bd2121424fe921b444e070f5a2f7.svg?invert_in_darkmode&sanitize=true" align=middle width=79.06391624999999pt height=24.65753399999998pt/>.
>
>*Formula:* <img src="/source/chapter1/section1_4/tex/b86aa99619d0d5c81c94b40e20e9e814.svg?invert_in_darkmode&sanitize=true" align=middle width=163.32953669999998pt height=29.190975000000005pt/>

## [Ex 1.4.10](Ex1_4_10.java)

## [Ex 1.4.11](Ex1_4_11.java)

## [Ex 1.4.12](Ex1_4_12.java)