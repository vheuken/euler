sum_of_squares = 0
sum = 0

(1..100).each do |i| 
  sum_of_squares += i**2
  sum += i  
end

puts sum**2 - sum_of_squares
