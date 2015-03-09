# Challenge 2: Braces

# Given an array of strings containing three types of braces: round (), square [] and curly {}

# Your task is to write a function that checks whether the braces in each
# string are correctly matched prints 1 to standard output (stdout) if the
# braces in each string are matched and 0 if they're not (one result per line)

# Note that your function will receive the following arguments:
# expressions which is an array of strings containing braces

# Data constraints:
# the length of the array will not exceed 100
# the length of any string will not exceed 5000

# Efficiency constraints:
# your function is expected to print the result in less than 2 seconds

# Example:
# Input:
# expressions: [ ")(){}", "[]({})", "([])", "{()[]}", "([)]" ]

# Output:
# 0
# 1
# 1
# 1
# 0

expressions = [')(){}','[]({})','([])','{()[]}','([)]','(){}[]']

def check_braces(expressions)
  match = {'(' => ')', '[' => ']', '{' => '}'}
  expressions.each do |expression|
    chars = expression.chars.to_a
    loop do
      if match.values.include? chars.first
        puts "0 - close bracket found before open bracket"
        break
      elsif match.keys.include? chars.last
        puts "0 - open bracket found without closed bracket"
      else
        if chars.last == match[chars.first]
          chars.pop
          chars.shift
        elsif chars[1] == match[chars.first]
          chars.shift
          chars.shift
        elsif chars.last == match[chars[-2]]
          chars.pop
          chars.pop
        else
          puts "0 - unmatched brackets"
          break
        end
      end
      if chars.length == 0
        puts "1 - all brackets match"
        break
      end
    end
  end
end

check_braces(expressions)


#TODO:
#solve test case for: ['([])({})', '([])([])']
#approach: delete matches from "inside" out instead of using pop and shift
