class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i = 0;i<operations.length;i++){
            if(operations[i].equals("+")){
              int a = stack.pop();
              int b = stack.peek();
              int add = a+b;
              stack.push(a);
              stack.push(add);
            }
            else if(operations[i].equals("D")){
              int top = stack.peek();
              int newel = 2*top;
              stack.push(newel);
            }
            else if(operations[i].equals("C")){
              stack.pop();
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        while(!stack.isEmpty()){
            int a = stack.pop();
            sum += a;
        }
        return sum;
    }
}