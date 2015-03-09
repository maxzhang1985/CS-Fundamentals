def check_anagrams(first_words, second_words)
  counter = 0
  result = []

  first_words.length.times do
    first_words[counter].downcase!
    second_words[counter].downcase!

    if first_words[counter].split(//).sort == second_words[counter].split(//).sort
      result << 1
    else
      result << 0
    end

    counter += 1
  end

  return result
end

# Test Case
first = ["cinema", "host", "aba", "train"]
second = ["iceman", "shot", "bab", "rain"]
puts check_anagrams(first, second) == [1,1,0,0]
