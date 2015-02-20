def get_fibonacci_sequence(max)
  num1 = 1
  num2 = 2
  list = [num1, num2]

  while num2 <= max 
    latest_num = num1 + num2
    num1 = num2
    num2 = latest_num
    list << latest_num
  end

  list
end

list = get_fibonacci_sequence(4000000).keep_if { |i| i.even? }

sum = 0

list.each { |i| sum += i }

puts sum
