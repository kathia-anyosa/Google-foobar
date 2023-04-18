def solution(l, t):
    for a in range(len(l)):
        for b in range(len(l)):
            if sum(l[a:b+1]) == t:
                return [a, b]
    return [-1, -1]


print(solution([250,0,0], 250))
print(solution([1,2,3,4], 15))
print(solution([4, 3, 10, 2, 8], 12))
print(solution([4, 3, 5, 7, 8], 12))
print(solution([260], 260))
print(solution([], 500))