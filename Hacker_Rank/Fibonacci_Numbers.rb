###### The Fibonacci Series

# The Fibonacci series begins with 0 and 1 (which are the first and the second terms respectively). After this, every element is the sum of the preceding elements: i.e,

# Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
# Given the starter code, complete the fibonacci function to return the Nth term.

# Please note, that we start counting from Fibonacci(1) = 0. This might differ from some other notations which treat Fibonacci(0) = 0.

# So overall equation is:

#              = 0 , n = 1
# Fibonacci(n) = 1 , n = 2
#                Fibonacci(n-1) + Fibonacci(n-2)  , n > 2

#Sample: 0,1,1,2,3,5,8,13,21,34,55,89,144

##### Input Format
# One integer N. (0 <= N < 40)

##### Output Format
# One integer which is the N-th Fibonacci number.

def fibonacci(n)
  ### 1) Using Recursion - Time: O(2^n); Space: O(n)

  # if n == 1
  #   return 0
  # elsif n == 2
  #   return 1
  # elsif n > 2
  #   return fibonacci(n - 1) + fibonacci(n - 2)
  # else
  #   return "Please enter a positive number!"
  # end


  # 2) Using Iteration - Time: O(n); Space: O(n)

  if n == 1
    return 0
  elsif n == 2
    return 1
  elsif n > 2
    first_num = 1
    second_num = 0
    i = 1

    while i < n
      fib_num = second_num + first_num
      first_num = second_num
      second_num = fib_num
      i += 1
    end
    return fib_num #return the n-1
  else
    return "Please enter a positive number!"
  end
end

##### Test Case
puts fibonacci(2) == 1
puts fibonacci(10) == 34
puts fibonacci(40) == 63245986
puts fibonacci(-1) == 'Please enter a positive number!'
 # == "Please enter a positive number!"
# puts fibonacci(50)