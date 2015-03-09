def check_anagrams(first_words, second_words)
  counter = 0

  first_words.length.times do
    first_words[counter].downcase!
    second_words[counter].downcase!

    if first_words[counter].split(//).sort == second_words[icounter].split(//).sort
      puts 1
    else
      puts 0
    end

    counter += 1
  end
end

# Test Case
first = ["cinema", "host", "aba", "train"]
second = ["iceman", "shot", "bab", "rain"]
check_anagrams(first, second) == "1\n1\n0\n0"
