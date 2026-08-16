class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int asteroid : asteroids) {
            boolean exploded = false;
            
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int top = stack.peek();
                
                if (Math.abs(asteroid) > Math.abs(top)) {
                    stack.pop();
                } else if (Math.abs(asteroid) < Math.abs(top)) {
                    exploded = true;
                    break;
                } else {
                    stack.pop();
                    exploded = true;
                    break;
                }
            }
            
            // If current asteroid didn't explode, push it
            if (!exploded) {
                stack.push(asteroid);
            }
        }
        
        int[] ans = new int[stack.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}