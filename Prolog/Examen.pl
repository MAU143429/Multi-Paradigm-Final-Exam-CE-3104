
fibonacci(0,0).
fibonacci(1,1).
fibonacci(N,R):- N>1,A is N-1,B is N-2,fibonacci(A,T1),fibonacci(B,T2),R is T1+T2.
