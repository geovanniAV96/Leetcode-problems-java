class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        Integer pos = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ')')
            {
                pos = (Integer) stack.search('(');
                if(pos == -1)
                    return false;
                if(stack.peek() == '(')
                {
                    stack.pop();
                }
            }
            else if(s.charAt(i) == ']')
            {
                pos = (Integer) stack.search('[');
                if(pos == -1)
                    return false;
                if(stack.peek() == '[')
                {
                    stack.pop();
                }
            }
            else if(s.charAt(i) == '}')
            {
                pos = (Integer) stack.search('{');
                if(pos == -1)
                    return false;
                if(stack.peek() == '{')
                {
                    stack.pop();
                }
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        if(stack.size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}