一维国王问题
N one dimensional kingdoms are represented as intervals of the form [ai , bi] on the real line.
A kingdom of the form [L, R] can be destroyed completely by placing a bomb at a point x on the real line if L
≤ x ≤ R.
Your task is to determine minimum number of bombs required to destroy all the one dimensional kingdoms.
[Input]

First line of the input contains T denoting number of test cases.
For each test case, first line contains N denoting the number of one dimensional kingdoms.
For each next N lines, each line contains two space separated integers ai and bi.
[Output]

For each test case , output an integer denoting the minimum number of bombs required.
Constraints

Subtask 1 (20 points) : 1 ≤ T ≤ 100 , 1 ≤ N ≤ 100 , 0 ≤ ai ≤ bi ≤500
Subtask 2 (30 points) : 1 ≤ T ≤ 100 , 1 ≤ N ≤ 1000 , 0 ≤ ai ≤ bi ≤ 1000
Subtask 3 (50 points) : 1 ≤ T ≤ 20 , 1 ≤ N ≤ 105, 0 ≤ ai ≤ bi ≤ 2000
[Example]

Input:
1
3
1 3
2 5
6 9

Output:
2

links:
http://blog.csdn.net/silence0080/article/details/52585604
