def check_anagrams(first_words, second_words)
  counter = 0

  first_words.length.times do
    first_words[i].downcase!
    second_words[i].downcase!

    if first_words[i].split(//).sort == second_words[i].split(//).sort
      puts 1
    else
      puts 0
    end

    counter += 1
  end
end