class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        if text1 == text2:
            return len(text1)

        m, n = len(text1), len(text2)
        prev_row = [0] * (n + 1)

        for r in range(m - 1, -1, -1):
            curr_row = [0] * (n + 1)

            for c in range(n - 1, -1, -1):
                if text1[r] == text2[c]:
                    curr_row[c] = 1 + prev_row[c + 1]
                    continue

                curr_row[c] += max(curr_row[c + 1], prev_row[c])
            print(curr_row)
            prev_row = curr_row

        return prev_row[0]