def palindrome?(num)
  num.to_s.reverse == num.to_s
end

longest_palindrome_product = 0

999.downto(100) do |n1|
  999.downto(100) do |n2|
    product = n1 * n2
    if palindrome?(product)
        if product > longest_palindrome_product
          longest_palindrome_product = product
        end
    end
  end
end

puts longest_palindrome_product
