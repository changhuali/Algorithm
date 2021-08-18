定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。

示例:

```
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.min();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.min();   --> 返回 -2.
```

提示：

1. 各函数的调用总次数不超过 20000 次

注意：本题与主站 155 题相同：https://leetcode-cn.com/problems/min-stack/

**解法1**

push和pop时间复杂度为O(1)，容易想到直接用栈实现，在一个集合中找到最小值的时间复杂读为O(n)，
如果需要时间复杂度为O(1)，则需要在push的时候对数据进行排序，然而排序的时间复杂度无法满足O(1)，
因此转换思路，在每次push时将值和当前栈顶的值进行比较，如果小于该值，则将值保存下来。

1. 定义一个栈stack2，push时将val和stack2 top比较，`val<=top`，`stack2.push(val)`        
2. pop时将top与stack2栈顶元素进行比较，若相等则执行`stack2.pop()`