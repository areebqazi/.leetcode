<h2><a href="https://leetcode.com/problems/maximum-product-of-word-lengths/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Bloomberg</div><div class="companyTagsContainer--tagOccurence">2</div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>318. Maximum Product of Word Lengths</a></h2><h3>Medium</h3><hr><div><p>Given a string array <code>words</code>, return <em>the maximum value of</em> <code>length(word[i]) * length(word[j])</code> <em>where the two words do not share common letters</em>. If no such two words exist, return <code>0</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> words = ["abcw","baz","foo","bar","xtfn","abcdef"]
<strong>Output:</strong> 16
<strong>Explanation:</strong> The two words can be "abcw", "xtfn".
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> words = ["a","ab","abc","d","cd","bcd","abcd"]
<strong>Output:</strong> 4
<strong>Explanation:</strong> The two words can be "ab", "cd".
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> words = ["a","aa","aaa","aaaa"]
<strong>Output:</strong> 0
<strong>Explanation:</strong> No such pair of words.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= words.length &lt;= 1000</code></li>
	<li><code>1 &lt;= words[i].length &lt;= 1000</code></li>
	<li><code>words[i]</code> consists only of lowercase English letters.</li>
</ul>
</div>