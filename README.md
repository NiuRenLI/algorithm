# algorithm
排序
排序问题有多种有趣的解决算法，体现了多种计算机科学思想。
1：基于比较或非比较的策略。
2：递归和迭代的实现。
3：分治思想
4：最优/最差/平均时间复杂度分析。
5：随机算法。

3种基于比较的时间复杂度为O(N^2)的排序算法：冒泡、选择、插入
先比较，然后判断是否需要交换。
简单，但是效果差，时间复杂度O(N^2);

冒泡排序
do
    swapped=false
    for i=1 to indexOfLastUnsortedElement-1
    if leftElement>rightElement
    swap(leftElement,rightElement)
    swapped=true
while swapped   

选择排序
1：Find the position X of the smallest item in the range of [L...N−1]
2：Swap X-th item with the L-th item
3：Increase the lower-bound L by 1 and repeat Step 1 until L = N-2.

插入排序
1:Start with one card in your hand
2:Pick the next card and insert it into its proper sorted order
3:Repeat previous step for all cards

基于D&C的的排序
归并排序（Merge Sort）
时间复杂度为O(N·log^N)

快速排序（Quick Sort）
时间复杂度有两种情况，对非随即版本，为O(N^2)
