def hello(nums, target =0,i=0, current=0):
    if current == target:
        return True
    if current>target or i>= len(nums):
        return False
        
    return hello(nums, target,i+1, current+nums[i]) or hello(nums, target, i+1, current)

t=int(input())
for _ in range(t):
    n,c = map(int, input().split())
    nums = list(map(int, input().split()))
    if hello(nums, c):
        print(1)
        
    else:
        print(0)
        
        
