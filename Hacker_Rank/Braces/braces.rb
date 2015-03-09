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
